package kr.smhrd.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.UserVO;

public class MemberInsertController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		String email=request.getParameter("email");
		String admin=request.getParameter("admin");
		String mbti=request.getParameter("mbti");
		
		
		//date�������� �޴°� �ƴ϶� �Է¹������� �˾Ƽ� ��¥�� intŸ������ 001004 �̷������� ������ ������Ѵ�
		//�׸��� getParameter�� �����ö� ������ string���� �������ϱ� parseInt�� ����ȯ�� ���ش�
		
		
		
		//jsp�� password name pwd�� �����ϱ�, username name name���� ����
		//mbti�� email �޴°� input���ܾ���
		
		
		//DAO ��ü����
		BoardDAO dao = new BoardDAO();
		
		UserVO vo = new UserVO();
		vo.setMb_id(id);
		vo.setMb_name(name);
		vo.setMb_pwd(pwd);
		vo.setMb_email(email);
		vo.setAdmin_yn(admin);
		vo.setMb_mbti(mbti);
		System.out.println(mbti);

		
		int cnt = dao.memberInsert(vo);
	
		String nextPage = null;
		String cpath = request.getContextPath();
		System.out.println();
		if(cnt>0) {
			nextPage = "redirect:/movieLogin.do";
		} else {
			throw new ServletException("error");
		}
		return nextPage;
	}

}
