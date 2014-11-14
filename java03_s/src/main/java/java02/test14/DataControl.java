package java02.test14;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
 
public class DataControl {
  static Scanner scanner;
  static Connection con;
  static Statement stmt;
  static ResultSet rs;
  public static void main(String[] args) throws Exception{
 
    init();
    
    loop:
    while (true) {
      String[] token = promptCommand();
      
      switch(token[0]){
      case "add" : 
        doAdd();
        break;
      case "list" : 
      rs = stmt.executeQuery("select * from PRODUCTS ");
        while(rs.next()){
          System.out.print(rs.getInt("PNO")+", ");
          System.out.print(rs.getString("PNAME")+", ");
          System.out.print(rs.getInt("QTY")+", ");
          System.out.println(rs.getInt("MKNO"));
        }
        
        break;
      case "delete" : break;
          
      case "update" : break;
      
      case "exit" : break loop;
      default : System.out.println("잘못된 명령입니다.");
      break;
      }
    }
    
    destroy();
 
  }
 
  private static void doAdd() throws SQLException {
    System.out.println("제품명");
      String pname = scanner.nextLine();
    System.out.println("수량");
      int qty = Integer.parseInt(scanner.nextLine());
    System.out.println("제조사명");
      int mkno =Integer.parseInt(scanner.nextLine());
      
    System.out.println("저장하시겠습니까?(Y/N)");
      if(scanner.nextLine().equalsIgnoreCase("Y")){
            stmt.executeUpdate("insert into PRODUCTS(PNAME,QTY,MKNO)"
                + "VALUES(PNAME ="+pname+" ,QTY="+qty+" ,MKNO="+mkno+")");
         System.out.println("저장되었습니다.");
      }
     else 
        System.out.println("저장 취소되었습니다.");
  }
 
  private static void destroy() throws SQLException {
    rs.close();
    stmt.close();
    con.close();
    scanner.close();
  }
 
  private static void init() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("JDBC 드라이버 로딩됨!");
      
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/studydb",
          "study",// 사용자 아이디 
          "study");// 사용자 암호
      System.out.println("DBMS에 연결됬다.");
      
      stmt = con.createStatement();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
        
  }
 
  private static String[] promptCommand() {
    String[] token;
    scanner = new Scanner(System.in);
    System.out.println("명령 >> ");
    return token = scanner.nextLine().split(" ");
  }
}
