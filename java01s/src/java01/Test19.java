/* switch
 * - 특정 값에 따라 명령어의 실행을 분기할 때 사용
 * - 문법
 * switch(4바이트 이하 정수값. byte, short, int ,char)
 *   case 값:
 *      명령어.....
 *      break;
 *   default: // else 를 의미
 *   명령어...
 * }
 * - JDK 8부터는 switch 문에 문자열을 넣을 수 있다.
 * 
 * */
package java01;

import java.util.Scanner;

public class Test19 {

  public static void main(String[] args) {
    System.out.println("당신의 나이가 어떻게 되는지 다음 보기에서 고르시오!");
    System.out.println("1)10\n2)20대\n3)30대\n4)40대\n5)50대\n6)기타\n번호?");
    
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String input = scanner.nextLine();
    
    int age = Integer.parseInt(input);
    
    
      
      switch (age) {
      case 1: System.out.println("10대 입니다.");
                   break;
      case 2: System.out.println("20대 입니다."); 
                   break;
      case 3: System.out.println("30대 입니다.");
                   break;
      case 4: System.out.println("40대 입니다.");
                   break;
      case 5: System.out.println("50대 입니다.");
                   break;
      default: System.out.println("기타 입니다.");
                   break;
    }//end switch    

  }//end main

}//end class
