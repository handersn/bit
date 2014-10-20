/* 서브 클래스의 인스턴스 생성과정
 * - 수퍼 클래스의 명령어에 따라 먼저 인스턴스를 변수를 생성한 다음에
 * - 서브 클래스의 명령어에 따라 인스턴스 변수를 생성한다.
 * 
 * 
 * */
package java01.test40;

public class test40 {

  public static void main(String[] args) {
    Car c1 = new Car("현다이","마구타",1997);
    Car c2 = new Car("가이아","M5",2500);
    
    Truck t1 = new Truck(); // 기본 생성자 호출(default constructor)
    /* 인스턴스 변수 준비 과정
    *  1) Car 클래스에 선언된 대로 인스턴스 변수를 준비한다.
    *  : maker, model, cc, diesel, releaseDate, capacity
    *  2) Truck 클래스에 선언된 인스턴스 변수 준비
    *       :weight
    *       3) 각 인스턴스 변수는 0으로 초기화 한다.
    *       -byte,short,int,long => 0   모든 비트 0
    *       - float,doubble => 0.0      모든 비트 0
    *       - char    => '\u0000' => 0  모든 비트 0
    *       - boolean => false =>       모든비트 0
    *       - 레퍼런스     =>  null =>       모든비트 0
     *    3) 초기화 문장 수행(super 클래스의 명령어부터 실행)
     *    4) 생성자 호출(Truck() -> Car() 호출)
     * 
     * 
     * */
  //1) 인스턴스 변수 준비    
 //[maker][model][cc][dies][relea][capa][weight][auto..]
//2) 인스턴스 변수를 0으로 초기화
    //[0    ][0    ][0 ][0   ][null(0)][0 ][0.0   ][false(0)]
//3)
    //[0    ][0    ][800][0  ][null(0)][5 ][0.0   ][false]
//4) [0    ][0    ][800][0  ][null(0)][5 ][1000.0][false]
    

    
  }//end main

}//end class
