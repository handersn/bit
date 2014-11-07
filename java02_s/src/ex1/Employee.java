package ex1;

public class Employee {
  String name;
  int sabun;
  String ssn;
  
  
  
  
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSabun() {
    return sabun;
  }

  public void setSabun(int sabun) {
    this.sabun = sabun;
  }

  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public Employee() {
  }
  
  public Employee(String name,int sabun,String ssn){
    this.name=name;
    this.sabun=sabun;
    this.ssn=ssn;
    
  }

}
