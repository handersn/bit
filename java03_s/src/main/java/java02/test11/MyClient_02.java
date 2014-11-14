package java02.test11;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class MyClient_02 {
  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    System.out.println("서버와 연결 중...");
    
    // 서버와 연결할 소켓 생성
    // 서버와의 연결이 이루어지면 리턴한다.
    Socket socket = new Socket("192.168.0.144", 8888);
    System.out.println("서버와 연결 성공!");
    
    // 소켓을 통해 읽고 쓰기 위한 입/출력 스트림 얻기
    Scanner in = new Scanner(socket.getInputStream());
    PrintStream out = new PrintStream(socket.getOutputStream());
    
    String message = null, line = null;
    
    while(true){
      message = prompt();
      out.println(message);     
      line = in.nextLine(); // 서버가 문자열 한 줄을 보낼때 까지 리턴안함.
      System.out.println(line);
      
    if(line.equalsIgnoreCase("goodbye")){
      System.out.println("서버와 연결을 끊었습니다.");
      break;
    }
    
    }//end while
    
    
    in.close();
    out.close();
    socket.close();
    keyboard.close();
  }
  
  private static String prompt() {
    System.out.print(">");   
    String message = keyboard.nextLine();    
    return message;
  }

}
















