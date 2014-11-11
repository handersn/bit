/*  UPDATE 실행
 * 
 * executeUpdate(SQL) 호출.
 * 
 * 리눅스에서는 한글 값이 깨질 수 있다.
 * 해결책 => 연결정보에 문자집합을 설정해야 한다.
 * JDBC URL에 설정한다.
 * 예) jdbc:mysql://host:port/schema?useUnicode=true&characterEncoding=utf8
 **/

package java02.test14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class jdbc08 {

  public static void main(String[] args)  {
    Connection con = null;
    Statement stmt = null;
    try{
      //1. java.sql.Driver 구현체 로딩한다.
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("JDBC 드라이버 로딩됨.");

      //2. DriverManager 에게 Connection 객체를 부탁한다.
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/studydb"+
              "?useUnicode=true&characterEncoding=utf8", 
              "study", 
          "study");
      System.out.println("DBMS에 연결됨");

      //3 Statement 객체 얻기
      stmt = con.createStatement();
      System.out.println("Statement 객체 준비 완료");

      //4. SELECT 문 실행하기
      // => 서버에서 결과를 하나씩 가져오는 역할자를 리턴한다.
      // => 즉, java.sql.ResultSet 구현체를 리턴한다.
      stmt.executeUpdate("UPDATE PRODUCTS SET" +
          " PNAME='넥서스9', QTY=1200" +
          " WHERE PNO=9");
      System.out.println("데이터 변경 완료. ");



    }catch(Exception ex){
      ex.printStackTrace();

    }finally{
      try {stmt.close();} catch (Exception e) {}
      System.out.println("Statement 객체의 자원을 해제함");
      try {con.close();} catch (Exception e) {}
      System.out.println("con 객체의 자원을 해제함");
    }

  }

}
