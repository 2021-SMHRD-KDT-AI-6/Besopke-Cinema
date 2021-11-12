package kr.smhrd.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.UserDAO;
import kr.smhrd.model.UserVO;

public class MemberInsertController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		
		
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String mbti=request.getParameter("mbti");
		
		String admin=request.getParameter("admin");
		
		//date�������� �޴°� �ƴ϶� �Է¹������� �˾Ƽ� ��¥�� intŸ������ 001004 �̷������� ������ ������Ѵ�
		//�׸��� getParameter�� �����ö� ������ string���� �������ϱ� parseInt�� ����ȯ�� ���ش�
		
		
		
		//jsp�� password name pwd�� �����ϱ�, username name name���� ����
		//mbti�� email �޴°� input���ܾ���
		
		
		//DAO ��ü����
		UserDAO dao = new UserDAO();
		
		UserVO vo = new UserVO();
		vo.setMb_id(id);
		vo.setMb_email(email);
		vo.setMb_name(name);
		vo.setMb_pwd(pwd);
		vo.setMb_mbti(mbti);
	
		vo.setAdmin_yn(admin);
		
	
		int cnt = dao.memberInsert(vo);
	
		String nextPage = null;
		String cpath = request.getContextPath();
		if(cnt>0) {
			nextPage = "redirect:"+"/boardList.do";
		} else {
			throw new ServletException("error");
		}
		return nextPage;
	}

}
