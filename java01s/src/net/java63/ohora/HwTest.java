package net.java63.ohora;

import java.util.ArrayList;
import java.util.Scanner;

public class HwTest {

  public static void main(String[] args) {    
    
    System.out.println("성적 입력 프로그램입니다.");
    System.out.println("해당 과목에 맞게 점수를 입력해주세요");
    
    System.out.print("국어점수?");
    Scanner scanner=new Scanner(System.in);
    int num1 = Integer.parseInt(scanner.nextLine());
    
    System.out.print("수학점수?");
    int num2 = Integer.parseInt(scanner.nextLine());
    
    System.out.print("영어점수?");
    int num3 = Integer.parseInt(scanner.nextLine());    
    
    ArrayList list = new ArrayList();
    
    list.add(num1);
    list.add(num2);
    list.add(num3);
    list.add((num1+num2+num3));
    list.add((num1+num2+num3)/3);
    
    System.out.println("----------------------------");
    System.out.println("국어점수"+ list.get(0));
    System.out.println("수학점수"+list.get(1));
    System.out.println("영어점수"+list.get(2));
    System.out.println("합 계 :"+list.get(3));
    System.out.println("평균 :"+list.get(4));    

  }//end main
}//end class
