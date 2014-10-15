/* 조건문 퀴즈
 * - 프로그램 아규먼트로 나이를 입력 받아 청년,청소년,청년, 등의
 * 여부를 출력하시오.
 * - 참고 문법:
 * 문자열을 숫자로 바꾸는 방법
 * String s="23";
 * int i= Integer.parseInt(s);
 *  
 * 
 * */
package java01;

public class Test20 {

  public static void main(String[] args) {
    
    for(int i=0; i < args.length ;i++){
      int m = Integer.parseInt(args[i]);
      
      if(m < 18){
        System.out.println("청소년 입니다.");
      }else if(m >= 20 && m < 40){
        System.out.println("청년 입니다.");      
      }else if(m >= 40 && m < 50){
        System.out.println("장년 입니다.");      
      }else if(m >= 50 && m < 65){
        System.out.println("중년 입니다.");      
      }else{
        System.out.println("노인 입니다.");
        
      }//end else
   }//end for
    

  }//end main

}//end class
