/*반복문
 * -while (조건) 명령문;
 * -while (조건) (...);
 * 
 * -do 명령문; while(조건);
 * -do {...} while(조건);
 * 
 * -for(초기화명령문;조건;증가문){....}
 * -for(변수;조건;증가문){....}
 * 
 * 
 * 
 * */
package java01;

public class Test22 {

  public static void main(String[] args) {
    //퀴즈
    //- 1에서 100까지 출력하라! 단, 4의 배수를 출력하라!
    // 다음과 같이 출력하라!!
    // 1,2,3,4, .....,20
    // 단 20의 배수일 때마다 다음 라인으로 가라!
    // 20의 배수이지만 60의 배수인 경우는 새라인 앞에 @를 붙여라
    for(int i=4; i<=100;i +=4){      
      System.out.print(i+ " ");      
      if(i%20 == 0)        
        System.out.println();        
      if(i%60 == 0)
        System.out.print("@");
      
    }//end for
  }//end main

}//end class
