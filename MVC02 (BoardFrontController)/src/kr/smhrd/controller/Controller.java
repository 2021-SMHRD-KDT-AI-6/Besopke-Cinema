package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	
	//Method �̸� ����
	//Why?? >> �ϴ� ���� �� ����ϴϱ� ȿ���� ����. �ʼ����� �۾��� �ƴ�.
	//How?? >> interface�� �����. requestHandler�� �����. �߻�޼ҵ�� implements�Ѵ�.
	//���� Ŭ������ implement�� �����Ѵ�. 
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) 
	//���� ListController �������� ���� ���񽺸޼ҵ尡 ����� ��ſ� �Ű������μ��� ��ɸ� ������. 
			throws ServletException, IOException;
	
}
