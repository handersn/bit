package java63.servlets.test01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/* 해결책:
 * ServiletResponse로 부터 출력 스트림을 얻기 전에,
 * 출력할 내용의 타입과 문자집합을 설정한다.
 * => response.setContentType("text/plain;charset=UTF-8")
 * => response.setCharacterEncoding("UTF-8");
 * 
 * MIME => 콘텐츠의 타입을 표현
 * */

@WebServlet("/test01/Test03")
public class Test03 extends GenericServlet {

  @Override
  public void service(ServletRequest request, ServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("<html>");
    out.println("<html>");
    out.println("<body>");
    out.println("<h1>안녕하세요</h1>");
    out.println("</body>");
    out.println("</html>");
        
    
  }

}
