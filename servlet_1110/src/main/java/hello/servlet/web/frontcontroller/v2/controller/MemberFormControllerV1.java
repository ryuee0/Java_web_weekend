package hello.servlet.web.frontcontroller.v2.controller;
import hello.servlet.web.frontcontroller.v1.ControllerV1;
 import javax.servlet.RequestDispatcher;
 import javax.servlet.ServletException;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import java.io.IOException;

 // 화면보여주는 컨트롤러
 public class MemberFormControllerV1 implements ControllerV1 {

 @Override
 public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String viewPath = "/WEB-INF/views/new-form.jsp";
	 RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
     dispatcher.forward(request, response);
    }
 }