package com.datageeks.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.datageeks.dao.EmployeeBean;
import com.datageeks.service.EmployeeService;
import com.datageeks.service.ServicesException;

@WebServlet(urlPatterns = { "/search", "/delete", "/editPage", "/update","/addPage","/add" })


public class FrontController extends HttpServlet {
	EmployeeService employeeService = new EmployeeService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		String reqPath = request.getServletPath();	

		if (reqPath.endsWith("search")) {
			String employeeName = request.getParameter("EmployeeName");

			if (employeeName == null || employeeName.trim().length() == 0) {
				request.setAttribute("empNameReq", " please specify employee name");
				request.getRequestDispatcher("/search.jsp").forward(request, response);

			} else {
				try {
					List<EmployeeBean> empList = employeeService.search(employeeName.trim());
					if (empList == null || empList.size() == 0) {
						request.setAttribute("invalidName", " employee Details not found with the given name");
						request.getRequestDispatcher("/search.jsp").forward(request, response);
					} else {
						request.setAttribute("empList", empList);
						request.getRequestDispatcher("/success.jsp").forward(request, response);
					}
				} catch (ServicesException e) {
					response.sendRedirect("./error.jsp");
				}
			}
		} 

	
	else if (reqPath.endsWith("delete")) {
		Integer employeetId = Integer.valueOf(request.getParameter("employeeId"));
		try {
			employeeService.delete(employeetId);
			List<EmployeeBean> empList = employeeService.getAll();
			if (empList == null || empList.size() == 0) {
				request.setAttribute("noData", " No Products avialable");
				request.getRequestDispatcher("/search.jsp").forward(request, response);
			} else {
				request.setAttribute("empList", empList);
				request.getRequestDispatcher("/success.jsp").forward(request, response);
			}

		} catch (ServicesException e) {
			response.sendRedirect("./error.jsp");
		}
	} else if (reqPath.endsWith("editPage")) {
		Integer employeeId = Integer.valueOf(request.getParameter("employeeId"));
		try {
			EmployeeBean employee = employeeService.get(employeeId);
			request.setAttribute("employee", employee);
			request.getRequestDispatcher("/edit.jsp").forward(request, response);

		} catch (ServicesException e) {
			response.sendRedirect("./error.jsp");
		}
	} else if (reqPath.endsWith("update")) {
		Integer employeeId = Integer.valueOf(request.getParameter("employeeId"));
		String employeeName = request.getParameter("employeeName");
		Float employeeSal = Float.valueOf(request.getParameter("employeeSal"));

		EmployeeBean employee = new EmployeeBean(employeeId, employeeName, employeeSal);

		try {
			employeeService.saveOrUpdate(employee);
			List<EmployeeBean> empList = employeeService.getAll();
			request.setAttribute("empList", empList);
			request.getRequestDispatcher("/success.jsp").forward(request, response);

		} catch (ServicesException e) {
			response.sendRedirect("./error.jsp");
		}
	} else if (reqPath.endsWith("addPage")) {
		request.getRequestDispatcher("/add.jsp").forward(request, response);
	} else if (reqPath.endsWith("add")) {
		Integer employeeId = Integer.valueOf(request.getParameter("employeeId"));
		String employeeName = request.getParameter("employeeName");
		Float employeeSal = Float.valueOf(request.getParameter("employeeSal"));

		EmployeeBean employee = new EmployeeBean (employeeId, employeeName, employeeSal);

		try {
			EmployeeBean e = employeeService.get(employeeId);
			if (e == null) {
				employeeService.saveOrUpdate(employee);
				List<EmployeeBean> empList = employeeService.getAll();
				request.setAttribute("empList", empList);
				request.getRequestDispatcher("/success.jsp").forward(request, response);
			} else {
				request.setAttribute("idExits", "Product Id already exists");
				request.setAttribute("employee", employee);
				request.getRequestDispatcher("/add.jsp").forward(request, response);
			}

		} catch (ServicesException e) {
			response.sendRedirect("./error.jsp");
		}
	}

}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
