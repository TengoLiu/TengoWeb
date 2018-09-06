package tengo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstHttpServlet
 */
@WebServlet("/FirstHttpServlet")
public class FirstHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FirstHttpServlet() {
        super();
    }

    /**
     * 如果是get调用，就会调用这个方法
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
     * 如果是post调用，就会调用这个方法
     */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
