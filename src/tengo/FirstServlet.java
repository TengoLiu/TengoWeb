package tengo;

import java.io.*;

import javax.servlet.*;

public class FirstServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	int count = 1;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		OutputStream out = response.getOutputStream();
		out.write("hello world!".getBytes());
		out.write(("the count is£º" + count).getBytes());
	}
}
