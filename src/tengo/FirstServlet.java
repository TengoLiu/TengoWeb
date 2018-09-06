package tengo;

import java.io.*;

import javax.servlet.*;


public class FirstServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       

    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		OutputStream out=response.getOutputStream();
		out.write("hello world!".getBytes());
	
	}

}
