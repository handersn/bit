/* DAO(Data Access Object)
 - 데이터의 퍼시스턴스(Persistence) 담당
   => 데이터의 보관(등록,조회,변경,삭제) 
 * 
 */
package java02.test15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
  public ProductDao() {}
   
  public Product selectOne(int no) {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    try{
    Class.forName("com.mysql.jdbc.Driver");
    
   con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb", /* jdbc 접속을 위한 URL 정보. DBMS 마다 조금씩 다르다! */
        "study", /* 사용자 아이디 */
        "study"/* 사용자 암호 */);
   
   stmt = con.createStatement();
   
   rs = stmt.executeQuery(
       "SELECT PNO,PNAME,QTY,MKNO FROM PRODUCTS"
       + " WHERE PNO=" + no);   
   
   if(rs.next()){
     Product product = new Product();
     product.setNo(rs.getInt("PNO"));
     product.setName(rs.getString("PNAME"));
     product.setQuantity(rs.getInt("QTY"));
     product.setMakerNO(rs.getInt("MKNO"));
     return product;     
   }else{
     return null;
   }
   
    }catch(Exception ex){
      throw new RuntimeException(ex);
      
    }finally{
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }//end finally
  }//end selectOne()
  
  public void update(Product product) {
    Connection con = null;
    Statement stmt = null;
    try{
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("JDBC 드라이버 로딩됨.");

      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/studydb"+
              "?useUnicode=true&characterEncoding=utf8", 
              "study", 
          "study");

      stmt = con.createStatement();

      stmt.executeUpdate("UPDATE PRODUCTS SET" 
      + " PNAME='" + product.getName() 
      + "', QTY=" + product.getQuantity() 
      + " WHERE PNO="+ product.getNo());
      
    }catch(Exception ex){
      throw new RuntimeException(ex);

    }finally{
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }//UPDATE
  
  public void delete(int no) {
    Connection con = null;
    Statement stmt = null;
    try{
      Class.forName("com.mysql.jdbc.Driver");

      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/studydb"+
              "?useUnicode=true&characterEncoding=utf8", 
              "study", 
          "study");

      stmt = con.createStatement();

      stmt.executeUpdate("DELETE FROM PRODUCTS " 
      + " WHERE PNO=" + no);

    }catch(Exception ex){
      throw new RuntimeException(ex);

    }finally{
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
  
  public List<Product> selectList() {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    try{
    Class.forName("com.mysql.jdbc.Driver");
    
   con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb", /* jdbc 접속을 위한 URL 정보. DBMS 마다 조금씩 다르다! */
        "study", /* 사용자 아이디 */
        "study"/* 사용자 암호 */);
   
   stmt = con.createStatement();
   
   rs = stmt.executeQuery(
       "SELECT PNO,PNAME,QTY,MKNO FROM PRODUCTS");   
   
   
   ArrayList<Product> list = new ArrayList<Product>();
   Product product = null;
   while(rs.next()){
     product = new Product();
     product.setNo(rs.getInt("PNO"));
     product.setName(rs.getString("PNAME"));
     product.setQuantity(rs.getInt("QTY"));
     product.setMakerNO(rs.getInt("MKNO"));
     list.add(product);
   }
   return list;     
   
    }catch(Exception ex){
      throw new RuntimeException(ex);
      
    }finally{
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }//end finally
  }
  
  public void insert(Product product) {   
    Connection con = null;
    Statement stmt = null;
    try{
      Class.forName("com.mysql.jdbc.Driver");

      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/studydb"+
              "?useUnicode=true&characterEncoding=utf8", 
              "study", 
          "study");

      stmt = con.createStatement();
      stmt.executeUpdate("INSERT INTO PRODUCTS(PNAME,QTY,MKNO)"+
          " VALUES('"+ product.getName()
          + "'," + product.getQuantity()
          + "," + product.getMakerNO()+ ")");
      System.out.println("데이터 입력 완료.");



    }catch(Exception ex){
      ex.printStackTrace();

    }finally{
      try {stmt.close();} catch (Exception e) {}
      System.out.println("Statement 객체의 자원을 해제함");
      try {con.close();} catch (Exception e) {}
      System.out.println("con 객체의 자원을 해제함");
    }
    
  }//insert
  
 /*public static void main(String[] args) {
   ProductDao dao = new ProductDao();
   
   dao.delete(13);
   
   List<Product> list = dao.selectList();
   for(Product pro : list){
     System.out.println(pro);     
   }
    
  }//end main
*/
  }
    


















