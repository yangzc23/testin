import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/Main"})
public class Main
  extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  protected void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    PrintWriter out = response.getWriter();
    String turnPage = (String)request.getAttribute("turnPage");
    
    String user = request.getParameter("user");
    String pass = request.getParameter("pass");
    Verifying vf = new Verifying();
    vf.setPass(pass);
    vf.setUser(user);
    request.setAttribute("Verifying", Boolean.valueOf(vf.isVerifiying()));
    if (vf.isVerifiying())
    {
      if (("/Main".equals(turnPage)) && 
        (vf.isVerifiying())) {
        request.getRequestDispatcher("/main.jsp").forward(request, response);
      }
    }
    else
    {
      out.println("<script type=\"text/javascript\">");
      out.println("alert(\"用户名或密码错误，请重新登陆！\")");
      out.println("window.location.href=\"/Banking/index.html\";");
      out.println("</script>");
    }
    out.flush();
    out.close();
  }
}
