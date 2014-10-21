/* 상수 문자열
 * - "문자열" 식으로 표현.
 * 
 * Method Area 영역에 클래스가 로딩되면
 * 각 클래스 별로 상수 문자열의 String 인스턴스가 준비된다.
 * 
 * Method Area 영역에서 각  클래스 별로 상수 문자열을 준비하는 메모리 영역을
 * 상수풀(Constant Pool)이라고 부른다.
 * 
 * 즉, Method Area 안에 클래스가 로딩되고,로딩된  클래스안에 상수 문자열이 준비된다.
 * 
 * 
 * */

package java01.test50;


class A{
  static String str1 = "hello";
  static String str2 = "hello";
  
  
}
class B{
  static String str1 = "hello";
  static String str2 = "hello";
  
}


public class StringTest02 {
  //특정 클래스 안에서만 사용할 클래스라면, 그 클래스 내부에 선언하라!
  //-> 중첩 클래스(inner class) 부른다.
  static String str1 = "hello";
  static String str2 = "hello";

  
  public static void main01(String[] args) {
    if(str1 == str2)System.out.println("str1 == str2");
    if(A.str1 == A.str2)System.out.println("A.str1 == A.str2");
    if(B.str1 == B.str2)System.out.println("B.str1 == B.str2");
    
    if(str1 == A.str1)System.out.println("str1 == A.str1");
    if(A.str1 == B.str1)System.out.println("A.str1 == B.str1");
    
  }
  
  
  
  

  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = new String("Hello");
    
    if(str1 == str2) System.out.println("str1 == str2");
    if(str1 == str3) System.out.println("str1 == str3");
    
    //자바는 문자열을 객체로 다룬다.
    //문자열을 비교할 때는 equals()를 사용하라!
    // 객체이기 때문에 == 연산자는 문자열이 아닌 주소를 비교하므로
    // 문자열 비교를 할 수 없다.
    if(str1.equals(str3))System.out.println("str1.equals(str3)");

  }

}
