/*package java01;

public class report01 {

}

주1)같은 종류의 데이터를 여러 개 저장할 때 (배열)을 사용 하고,
     (배열)을 선언하는 방법은 " new 데이터형[개수];" 이다. 
     
주2)Java의 가비지 컬렉터(Garbage Collector)는
 그 동작 방식에 따라 매우 다양한 종류가 있지만 
 공통적으로 크게 다음 2가지 작업을 수행한다고 볼 수 있습니다.
(Heap) 내의 객체 중에서 가비지(garbage)를 찾아낸다.
찾아낸 가비지를 처리해서 (Heap)의 메모리를 회수한다.

주3) 다음 코드의 실행 결과는?  답)0 2 4
int i;
for (i=0; i =<4; i += 2) {
    System.out.print(i + ““);
}




1. 다음 설명중 틀린것을 모두 고르시오. 2,4
1)unicode 의 변형 된 형태는 UTF-8 이다.
2)unicode 는 모든 글자를 2byte 로 표현한다.
3)JAVA는 유니코드에 정의된 값을 사용한다.
4)UTF-8 은 한글을 2byte로 표현한다.
5)ASKII 는 영문 알파벳을 사용하는 대표적인 문자 인코딩이다. 

2. 다음 배열의 관련설명중 맞는것을 모두 고르시오. 1,2,3
 1) 배열을 생성하면 4바이트 메모리를 연속해서 준비한다.
 2) 준비된 메모리의 첫 바이트 주소를 변수에 저장해야 한다.
 3) 이렇게 주소를 저장하는 변수를 reference(참조 변수)라 한다.
 4) JAVA 에서는 Pointer 라고도 한다.
 5) 배열은 다른 데이터형 들도 한꺼번에 담을수 있다.
   
3. 다음 코드의 결과값은?   1
package java01;
public class Test14 {
  public static void main(String[] args) {
    int [] p = new int[5]; //예) 배열의 주소가 100번지 라고 하자!
    int [] p2 = new int[3]; //예) 200번지
    int [] p3 = p; 
    
    p[0]=1;
    p2[1]=90;
    p3[2]=100;
    p3[3]=200;
    System.out.println(p[2]);
    
    p2=p; 
    System.out.println(p2[0]);
    
  }
}
1)100,1   2)100,90   3)90,100   4)1,100    5)100,200

4. 다음 변수의 선언중 틀린것을 모두 고르시오. 3,5
 1) int num=10;
 2) long num =10L;
 3) boolean true=true;
 4) short num = 200;
 5) char num = "a";

5. 다음 변수의 선언중 틀린것을 모두 고르시오 2.5
  1) byte abc;
  2) byte '1';
  3) byte _;
  4) byte $;
  5) byte 20;  //오류!
    
6. 다음 중 배열 선언 및 초기화가 잘못된 것은? (2개) 4,5
1) int[] arr[];
2) int[] arr = {1,2,3,}; 
3) int[] arr = new int[5];
4) int[] arr = new int[5]{1,2,3,4,5}; 
5) int arr[5]; 

7. 다음 중 실수형 데이터타입 은? 1,3
1) float
2) Byte
3) double
4) boolean 
5) char

8. 다음 단어의 줄임말중 맞는것은?  1,3
1) JVM(Java Virtual Machine)
2) JDK(Java Development Kit)
3) JRE(Java Runtime Environment)
4) JRE(Java Runtime Engeeneer)
5) JDK(Java Development Kip)

9. 다음 변수의 선언중 결과값이 다른 두개는? 2,3
1) int i=13;
2) int i2=014;
3) int i3=0xe;
4) int i4=0Xd;
5) int i5=0xD;

10. 다음 문장중 틀린부분을 모두 고르시오. 4,5
public static void main(String[] args) {
    byte i;
    
  1)  i=20;
    
  2)  byte b1,b2,b3;
  3)  byte b4=20, b5=30, b6=50;
    
  4)   console.log(b4);
  5)  byte b7="20";
       
    
   System.out.println(b1);   

    
  }//end main


*/
