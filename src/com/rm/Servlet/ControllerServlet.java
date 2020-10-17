package com.rm.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rm.DAO.ProjectDAO;
import com.rm.model.Project;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/Welcome")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()        
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		String title=request.getParameter("title");
		String description=request.getParameter("description");
		String domain=request.getParameter("domain");
		Project p=new Project(id,title,description,domain);
		ProjectDAO pdao=new ProjectDAO();
		boolean b=pdao.insertProject(p);
		if(b==true)
			request.getRequestDispatcher("success.jsp").include(request, response);
	}

}
