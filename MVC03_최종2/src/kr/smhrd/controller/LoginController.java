package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.UserDAO;
import kr.smhrd.model.UserVO;

public class LoginController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");

		
		
		UserVO vo=new UserVO();
		vo.setMb_id(id);
		vo.setMb_pwd(pwd);
		
		// UserDAO -> BoardDAO
		UserDAO dao=new UserDAO();
		UserVO succ=dao.isLogin(vo);
		if(succ!=null) { // �α��� ���� -> �α��� �����ߴٴ� ǥ�ø� �޸�(����)�� �صξ�� �Ѵ�.
			HttpSession session=request.getSession();
			session.setAttribute("succ", succ);
		}
		
		
		
		return "redirect:/boardList.do";
	}
	
	
}
