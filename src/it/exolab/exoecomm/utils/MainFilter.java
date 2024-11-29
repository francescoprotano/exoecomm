package it.exolab.exoecomm.utils;

import java.io.IOException;
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

import it.exolab.exoecomm.model.Utente;

public class MainFilter implements Filter {

	
	
    /**
     * Default constructor. 
     */
    public MainFilter() {
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

		HttpServletRequest req = (HttpServletRequest ) request;
		HttpServletResponse res = (HttpServletResponse ) response;
		HttpSession session = req.getSession();
		
		
		
		if(req.getRequestURL().toString().endsWith(".jsp")) {
			res.sendRedirect("main?action=404");
			return;
		}
		
		if(req.getRequestURL().toString().contains("staff.")) {
			
			Utente utente = (Utente)session.getAttribute("utente");
			if(utente==null || !utente.isStaff()) {
				res.sendRedirect("main?action=login");
				return;
			}
			
			
		}
		if(req.getRequestURL().toString().contains("utente.")) {
			Utente utente = (Utente)session.getAttribute("utente");
			if(utente==null) {
				res.sendRedirect("main?action=login");
				return;
			}
		}
		
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
