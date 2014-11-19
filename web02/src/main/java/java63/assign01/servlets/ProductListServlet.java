package java63.assign01.servlets;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.List;

import java63.assign01.dao.ProductDao;
import java63.assign01.domain.Product;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

@WebServlet("/product/list")
public class ProductListServlet extends GenericServlet {

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    
    ProductDao productDao = new ProductDao();
    
    res.setContentType("text/html;charset=UTF-8");   
    PrintWriter out = res.getWriter();
    
    int pageNo = 0;
    int pageSize = 0;
    
    if (req.getParameter("pageNo") != null) {
      pageNo = Integer.parseInt((String)req.getParameter("pageNo"));
      pageSize = 3;
    }
    
    if (req.getParameter("pageSize") != null) {
      pageSize = Integer.parseInt((String)req.getParameter("pageSize"));
    }
    
    out.println("<html>");
    out.println("<body>");
    
    for (Product product : productDao.selectList(pageNo, pageSize)) {
      out.printf("NO : " + "%-3d " +
                    "제품명 : " + "%-20s" +
                   "제품수량 : " + "%7d "+ 
                    "제품번호 : " + "%-3d", 
          product.getNo(), 
          product.getName(), 
          product.getQuantity(), 
          product.getMakerNo()+"<br>");
    }
    
    out.println("</body>");
    out.println("</html>");
    

    
   
    
  }


}
