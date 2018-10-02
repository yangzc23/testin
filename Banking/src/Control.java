import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/Control"})
public class Control
  extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
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
    String user = request.getParameter("user");
    String pass = request.getParameter("pass");
    String page = request.getParameter("page");
    Verifying vf = new Verifying();
    vf.setPass(pass);
    vf.setUser(user);
    request.setAttribute("Verifying", Boolean.valueOf(vf.isVerifiying()));
    if ("exit".equals(page))
    {
      request.removeAttribute("Verifying");
      out.println("<script type=\"text/javascript\">");
      out.println("alert(\"成功退出！\")");
      out.println("window.location.href=\"/Banking/index.html\";");
      out.println("</script>");
    }
    else if ("return".equals(page))
    {
      String turnPage = "/Main";
      request.setAttribute("turnPage", turnPage);
      request.getRequestDispatcher(turnPage).forward(request, response);
    }
    else if ("creates".equals(page))
    {
      DBService db = new DBService();
      if (db.addUser(request.getParameter("zhh"), "test")) {
        request.getRequestDispatcher(page + ".jsp").forward(request, response);
      } else {
        request.getRequestDispatcher("create.jsp").forward(request, response);
      }
    }
    else
    {
      request.getRequestDispatcher(page + ".jsp").forward(request, response);
    }
    out.flush();
    out.close();
  }
}
