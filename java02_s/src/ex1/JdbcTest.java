package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest {

  public static void main(String[] args)throws Exception {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("JDBC 드라이버 로딩됨.");

      con=DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/studydb"+
              "?useUnicode=true&characterEncoding=utf8" ,
              "study",
          "study");
      System.out.println("DBMS에 연결됨");

      stmt = con.createStatement();
      System.out.println("Statement 객체 준비 완료");

      stmt.executeUpdate("INSERT INTO PRODUCTS(PNAME,QTY,MKNO)"+
      "VALUES('넥서스100',100,5)");
      System.out.println("데이터 입력 완료");


    } catch (Exception e) {
      e.printStackTrace();
    }finally{
      try {rs.close();} catch (Exception e2) {}
      System.out.println("Statement 객체의 자원을 해제함");

      try {stmt.close();} catch (Exception e2) {}
      System.out.println("DBMS와 연결 끊음");

      try {con.close();} catch (Exception e2) {}
      System.out.println("DBMS와 연결 끊음");
    }


  }

}
