package java01.test48;

public class Test48 {

  //hashcode()테스트
  public static void main(String[] args) {
    Student s1 = new Student("홍길동",10);
    Student s2 = new Student("홍길동",10);
    
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    
  }
  
  public static void main01(String[] args) {
    Student s1 = new Student("홍길동",10);
    Student s2 = new Student("임꺽정",10);
    
//    System.out.println(s1.toString());
  //  System.out.println(s2.toString());

    
    //println()은 인스턴스의 toString()을 호출하여 그 리턴 값을 출력한다.
    System.out.println(s1);
    System.out.println(s2);
    
    
  }

}
