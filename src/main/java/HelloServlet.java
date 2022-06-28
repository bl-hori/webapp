import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
  public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    PrintWriter out;

    res.setContentType("text/html; charset=utf-8");
    out = res.getWriter();
    out.println("<html><body>");
    out.println("<h1>Hello World!</h1>");
    out.println("<p>Servletのサンプル（HelloServlet.java）</p>");
    out.println("</body></html>");
  }
}
