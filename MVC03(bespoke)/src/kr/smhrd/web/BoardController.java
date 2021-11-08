package kr.smhrd.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.controller.BoardContentController;
import kr.smhrd.controller.BoardDeleteController;
import kr.smhrd.controller.BoardFormController;
import kr.smhrd.controller.BoardInsertController;
import kr.smhrd.controller.BoardListController;
import kr.smhrd.controller.BoardUpdateController;
import kr.smhrd.controller.Controller;
import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.BoardVO;
@WebServlet("*.do")
public class BoardController extends HttpServlet {	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // utf-8 ->post���		
		// 1. Ŭ���̾�Ʈ�� ��û�� Ȯ��
		String reqURL=request.getRequestURI();
		String cpath=request.getContextPath(); // /m02
		String command=reqURL.substring(cpath.length());
		System.out.println(command);
		// 2. command�� ���� �б��۾�(if~ else if ~)
		Controller controller=null;
		String view=null;
		// 2. HandlerMapping(�ڵ鷯����)
		HandlerMapping mapping=new HandlerMapping();
		controller=mapping.getController(command);
		view=controller.requestHandler(request, response);
		// 3. �б��۾��� �ѹ��� �ϱ�.... if
		if(view!=null) {
			if(view.indexOf("redirect:")!=-1) {
			   //                    "/m02/boardList.do"	
			   response.sendRedirect(cpath+view.split(":")[1]); // redirect:/boardList.do
			}else {
			   //                           "boardList"->"/WEB-INF/board/boardList.jsp"	
			   RequestDispatcher rd=request.getRequestDispatcher(ViewResolver.makeViewUrl(view));
			   rd.forward(request, response); // View(JSP)
			}//
		}//
	}
}
