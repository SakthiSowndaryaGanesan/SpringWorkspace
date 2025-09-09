package SpringDemo;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class ThisServlet extends HttpServlet {
    public void service(HttpServletRequest req , HttpServletRequest res ){
        System.out.println("This is service");
    }
}
