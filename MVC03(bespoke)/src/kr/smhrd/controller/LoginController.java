package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.UserVO;

public class LoginController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		UserVO vo=new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		// UserDAO -> BoardDAO
		BoardDAO dao=new BoardDAO();
		UserVO succ=dao.isLogin(vo);
		if(succ!=null) { // �α��� ���� -> �α��� �����ߴٴ� ǥ�ø� �޸�(����)�� �صξ�� �Ѵ�.
			HttpSession session=request.getSession();
			session.setAttribute("succ", succ);
		}
		
		
		
		return "redirect:/boardList.do";
	}
	
	
}
