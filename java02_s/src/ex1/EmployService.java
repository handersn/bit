package ex1;

public class EmployService {
  public EmployService() {
  }
  
  public void add(Employee emp){
    System.out.println("신규 인사정보를 추가하는 기능 테스트");
    System.out.println(emp.getName());
    System.out.println(emp.getSabun());
    System.out.println(emp.getSsn());
    
  }//end add()

  public static void main(String[] args) {
    EmployService service = new EmployService();
    Employee newEmp = new Employee("홍길동",1234,"123123123");
    service.add(newEmp);

  }//end main

}//end class
