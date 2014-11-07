package ex1;

import java.util.Scanner;

public class EmployeeUI {
  Scanner scanner = new Scanner(System.in);
  EmployService service = new EmployService();
  
  public void regist(){
    System.out.println("이름을 입력하세요");
    String name = scanner.nextLine();
    System.out.println("사번을 입력하세요");
    String sabun = scanner.nextLine();
    System.out.println("주민 번호를 입력하세요");
    int ssn = Integer.parseInt(scanner.nextLine());
    System.out.println(name + ":" +sabun+":"+ssn);
    Employee emp = new Employee(name,sabun,ssn);
    boolean addResult = service.add(emp);
    System.out.println("서비스에서 처리된 결과:" +addResult);
    
  }
  

  public static void main(String[] args) {
    EmployeeUI ui = new EmployeeUI();
    ui.regist();

  }

}
