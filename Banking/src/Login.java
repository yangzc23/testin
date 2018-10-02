import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/Login"})
public class Login
  extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  public void init(ServletConfig config)
    throws ServletException
  {}
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    response.setContentType("text/html");
    response.setCharacterEncoding("utf-8");
    PrintWriter out = response.getWriter();
    out.println("<script type=\"text/javascript\">");
    out.println("alert(\"非法进入，请重新登陆！\")");
    out.println("window.location.href=\"/Banking/index.html\";");
    out.println("</script>");
    out.flush();
    out.close();
  }
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    response.setContentType("text/html");
    response.setCharacterEncoding("utf-8");
    PrintWriter out = response.getWriter();
    String turnPage = "/Main";
    request.setAttribute("turnPage", turnPage);
    request.getRequestDispatcher(turnPage).forward(request, response);
    
    out.flush();
    out.close();
  }
}
