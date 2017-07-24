package com.itheima.ajax02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AjaxServlet2() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 在ajax中，post请求可以不设置这个，中文也不会乱码
		// get请求还是需要对获取的每个参数进行解码
		request.setCharacterEncoding("UTF-8");
		
		//获得参数
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		System.out.println(name + "   " + age);
		
		response.setContentType("text/html;charset=UTF-8");
		// java代码只能返回一个json格式的字符串
		response.getWriter().write("{\"name\":\"汤姆\",\"age\":21}");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}
}
