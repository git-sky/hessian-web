package cn.com.sky.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.caucho.hessian.server.HessianServlet;

/**
 * <pre>
 * @WebServlet 用于将一个类声明为 Servlet
 * 
 * value:url
 * initParams:初始化参数
 * 
 */
@WebServlet(value = "/hessian/user", initParams = { @WebInitParam(name = "service-class", value = "cn.com.sky.service.UserServiceImpl") })
public class UserHessianServlet extends HessianServlet {
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
		super.init();
	}

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
	}
}