/* SELECT 문 실행하기
 * 
 * executeQuery(SELECT)문;
 * executeUpdate(INSERT/DELETE/UPDATE문);
 * execute
 **/

package java02.test14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class jdbc04 {

  public static void main(String[] args)  {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    try{
    //1. java.sql.Driver 구현체 로딩한다.
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("JDBC 드라이버 로딩됨.");
    
    //2. DriverManager 에게 Connection 객체를 부탁한다.
   con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb", /* jdbc 접속을 위한 URL 정보. DBMS 마다 조금씩 다르다! */
        "study", /* 사용자 아이디 */
        "study"/* 사용자 암호 */);
   System.out.println("DBMS에 연결됨");
   
   //3 Statement 객체 얻기
   stmt = con.createStatement();
   System.out.println("Statement 객체 준비 완료");
   
   //4. SELECT 문 실행하기
   // => 서버에서 결과를 하나씩 가져오는 역할자를 리턴한다.
   // => 즉, java.sql.ResultSet 구현체를 리턴한다.
   rs = stmt.executeQuery("SELECT * FROM PRODUCTS");
   System.out.println("서버에 질의 완료. ResultSet 준비완료");
   
    }catch(Exception ex){
      ex.printStackTrace();
      
    }finally{
      try {rs.close();} catch (Exception e) {}
      System.out.println("Statement 객체의 자원을 해제함");
      try {stmt.close();} catch (Exception e) {}
      System.out.println("Statement 객체의 자원을 해제함");
      try {con.close();} catch (Exception e) {}
      System.out.println("con 객체의 자원을 해제함");
    }
       
  }

}
