package java02.test13;

public class Test03 {
  public static void main(String[] args) {
    //인터페이스를 구현한 익명 이너 클래스 만들기
    //일반 문법
    class MyClass2 /* extends object */ implements MyInterface{
      @Override
      public void m2() {
        System.out.println("하하하");
        
      }
    }
    
   /* //스냅샷 1: 클래스명 + 클래스 키워 제거
    extends object implements MyInterface{
      @Override
      public void m2() {
        System.out.println("하하하");
        
      }
    }
    */
 /* //스냅샷 2: 클래스명 제거
    //object를 상속받지 않으면 자동으로 상속받기 때문에 object 생
    class MyClass2 implements MyInterface{
      @Override
      public void m2() {
        System.out.println("하하하");
        
      }
    }
   
    */
    
  }

}
