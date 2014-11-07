package java02.ex01;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import java02.ex01.annotation.Component;
import java02.test10.annotation.Command;

import org.reflections.ReflectionUtils;
import org.reflections.Reflections;


@SuppressWarnings({"unchecked","rawtypes"})
public class Ex01 {
  static class CommandInfo{
    public Object instance;
    public Method method;
  }
  
  Scanner scanner;
  ScoreDao scoreDao;
  HashMap<String, CommandInfo> commandMap;

  public static void main(String[] args) throws Exception {
    Ex01 app = new Ex01();
    app.init();
    app.service();
    app.destroy();

  }

  private void destroy() {
    scanner.close();
    
  }

  private void service() {
    CommandInfo commandInfo = null;
    loop:
      while(true){
        try {
          String[] token = promptCommand();
          commandInfo = commandMap.get(token[0]);
          
          if(commandInfo == null){
            System.out.println("해당 명령을 지원하지 않습니다.");
          continue;          
          }
          
          HashMap<String, Object> params=
              new HashMap<String, Object>();
          
          ArrayList<String> options = new ArrayList<String>();
          for(int i =1; i<token.length; i++){
            options.add(token[i]);            
          }
          params.put("options", options);
          
          commandInfo.method.invoke(commandInfo.instance, params);
          
          if(token.equals("exit"))
            break loop;
          
        } catch (Exception e) {
          e.printStackTrace();
          System.out.println("명령어요 처리 중 오류 발생. 다시 시도해 주세");
        }
        
      }//end while
    
  }

  private String[] promptCommand() {
    System.out.println("명령>");
    String[] token = scanner.nextLine().split(" ");
    return token;
  }

  private void init() throws Exception {
    scoreDao = new ScoreDao();
    try {
      scoreDao.load();      
    } catch (Exception e) {
      System.out.println("데이터 로딩중 오류가 발생하였습니다.");
    }
    
    scanner = new Scanner(System.in);
    
    commandMap = new HashMap<>();
    
    Reflections reflections = new Reflections("java02_s.ex01");
    Set<Class<?>> clazzList = 
        reflections.getTypesAnnotatedWith(Component.class);
    
    Object command = null;
    Component component = null;
    Method method = null;
    CommandInfo commandInfo=null;
    Command commandAnno=null;
    
    for(Class clazz : clazzList){
      component = (Component)clazz.getAnnotation(Component.class);
      command = clazz.newInstance();
      
      Set<Method> methods = ReflectionUtils.getMethods(
          clazz, ReflectionUtils.withAnnotation(Command.class));
      
      for(Method m : methods){
        commandAnno = m.getAnnotation(Command.class);
        commandInfo = new CommandInfo();
        commandInfo.instance = command;
        commandInfo.method = m;
        commandMap.put(commandAnno.value(), commandInfo);
        
      }//end for
      
      try {
        method = clazz.getMethod("setScoreDao", ScoreDao.class);
        method.invoke(command, scanner);
      } catch (Exception e) {}//end catch      
    }
    
  }//end init()
  
  

  
  
}
