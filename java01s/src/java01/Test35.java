/* 암시적 형변환(implicit type conversion)
  - 연산을 수행할 때 JVM의 규칙에 따라 자동으로 형변환 되는 것.
  - 규칙
   byte,short,char = > int => long => float => double
    * 연산의 기본은 int 이다!
   - 왜 형변환을 하느냐?
    => 연산을 수행하려면 두 개의 값이 같은 데이터 형이어야 한다.
 
 
 
*/
package java01;

public class Test35 {

  public static void main(String[] args) {
    byte b=10;
    byte b2=10;
    short s=10;
    char c=10;
    int i=10;
    long l=10;
    float f=10.0f;
    double d=10.0;
    
    //byte sum1 = b + s + c + i + l + f + d; //r-value: double
    //byte sum1 = f + b + s + c + i + l; //r-value: double
    //byte sum3 = b + b2; // r-value : int
    // why? bte, short, char 값들을 연산할때 
    //int로 변환한후 연산한다. 따라서 결과는 int 타입이다.
    
    //int 와 int의 연산결과는 int 이다.
    int x =5;
    int y =2;
    //System.out.println(x/y);
    //System.out.println((float)x/(float)y);
    System.out.println((float)x/y);
    

  }//end main

}//end class
