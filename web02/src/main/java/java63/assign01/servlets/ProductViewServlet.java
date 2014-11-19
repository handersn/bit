package java63.assign01.servlets;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import java63.assign01.dao.ProductDao;
import java63.assign01.domain.Product;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/product/view")
public class ProductViewServlet extends GenericServlet{

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    ProductDao productDao = new ProductDao();
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
int no = Integer.parseInt((String)req.getParameter("no"));
    
    Product product = productDao.selectOne(no);    
    
    if (product == null) {
      out.println("해당 번호의 제품 정보를 찾을 수 없습니다.");
      out.println();
      return;
    }
    
    out.println("제품번호: " + no);
    out.println("제품명: " + product.getName());
    out.println("수량: " + product.getQuantity());
    out.println("제조사 번호: " + product.getMakerNo());
    out.println();
    
  }

}
