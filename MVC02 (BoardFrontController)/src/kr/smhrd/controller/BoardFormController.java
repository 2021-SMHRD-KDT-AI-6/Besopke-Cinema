package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardFormController implements Controller {
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) 
	//���� ListController �������� ���� ���񽺸޼ҵ尡 ����� ��ſ� �Ű������μ��� ��ɸ� ������. 
			throws ServletException, IOException {
		return "boardForm";
	}
}
