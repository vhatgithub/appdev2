

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class HomeFilter
 */
@WebFilter("/HomePage")
public class HomeFilter implements Filter {

    /**
     * Default constructor. 
     */
    public HomeFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		
		PrintWriter out = resp.getWriter();
				
		HttpSession session = req.getSession(false);
		
		
		 if (session == null) {
			 String html = "<html>"
			 		+ "<head>"
			 		+ "<title>Ugly fat woman</title>"
			 		+ "</head>"
			 		+ "<body>"
			 		+ "<h1>IPL Login</h1>"
			 		+ "<p>Invalid username or password</p>"
			 		+ "<form action='Login' method='get'>"
			 		+ "Username <input name='username' type='text'/>"
			 		+ "<br/>"
			 		+ "Password <input name='password' type='password'/>"
			 		+ "<br/>"
			 		+ "<input name='submit' value='Submit' type='submit'/>"
			 		+ "</form>"
			 		+ "</body>"
			 		+ "</html>";
			 out.println(html);
		 }
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
