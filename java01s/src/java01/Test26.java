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
 * */
package java01;

import java.util.ArrayList;

public class Test26 {

  public static void main(String[] args) {
    int[] scores = new int[]{100,90,80};
    //배열에서 값을 순차적으로 꺼낸다.
    for(int value : scores){
      System.out.println(value);
    }//end for
    System.out.println("--------------");
    
    java.util.ArrayList list = new java.util.ArrayList();
    list.add("홍길동");
    list.add(100);
    list.add(90);
    list.add(80);
    
    System.out.println(list.get(2));
    //collection 객체에 저장된 값을 순차적으로 하나씩 꺼낸다.
    for(Object value : list){
      System.out.println(value);      
    }//end for
    
  }//end main

}//end class
