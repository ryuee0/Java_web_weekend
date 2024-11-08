package hello.servlet.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;

@WebServlet(name = "memberListServlet", urlPatterns = "/servlet/members")
public class MemberListServlet extends HttpServlet{
	
	private MemberRepository memberRepository = MemberRepository.getInstance();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		
		// 이런식으로 서블릿 안에서 자바 코드 실행하고, 비즈니스 로직 실행하는건 괜찮은데
		// 서블릿 안에서 정적,동적 html 화면을 만드는 작업이 너무 복잡하고, 비효율적임 (유지보수 거의 불가함)
		// 그래서 사용하는 것이 템플릿 엔진임 :: 대표적으로 JSP,Thymeleaf, Freemarker, Velocity 등 이 있음
		
		// 가장 고전적인 템플릿 엔진인 jsp를 해볼텐데 
		// 사실상 현재는 잘 사용되지는 않는 추세라, 앞부분에서만 잠깐 다루고
		// 후에 스프링과 잘 통합되는 Thymeleaf를 사용할 것임
		
		// 지금은 자바코드에 html을 넣는거라면
		// 템플릿 엔진에서는 html에 자바코드를 중간중간 넣는 것 :: html 템플릿 안에서 중간중간 값을 바꾸는 것을 템플릿 엔진이라고 함
		List<Member> members = memberRepository.findAll();
		PrintWriter w = response.getWriter();
			w.write("<html>");
	        w.write("<head>");
	        w.write("    <meta charset=\"UTF-8\">");
	        w.write("    <title>Title</title>");
	        w.write("</head>");
	        w.write("<body>");
	        w.write("<a href=\"/index.html\">메인</a>");
	        w.write("<table>");
	        w.write("    <thead>");
	        w.write("    <th>id</th>");
	        w.write("    <th>username</th>");
	        w.write("    <th>age</th>");
	        w.write("    </thead>");
	        w.write("    <tbody>");
	        
	        for (Member member : members) {
	            w.write("    <tr>");
	            w.write("        <td>" + member.getId() + "</td>");
	            w.write("        <td>" + member.getUsername() + "</td>");
	            w.write("        <td>" + member.getAge() + "</td>");
	            w.write("    </tr>");
	        }
	        w.write("    </tbody>");
	        w.write("</table>");
	        w.write("</body>");
	        w.write("</html>");
		
	}
}
