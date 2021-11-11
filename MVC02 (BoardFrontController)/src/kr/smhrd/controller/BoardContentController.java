package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.BoardVO;

public class BoardContentController implements Controller{
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	int idx = Integer.parseInt(request.getParameter("idx"));
	//idx�� dao������ �Ѱܼ� idx�� �ش��ϴ� �Խñ� �� �Ѱ��� ������ �Ѱ��ָ� ��
	BoardDAO dao = new BoardDAO();
	BoardVO vo=dao.boardContent(idx);
	//�� ���� ������(����) = View�� ����ؾ���(JSP)
	//��ü ���ε�
    request.setAttribute("vo", vo);
    
    return "boardContent";

	}
}