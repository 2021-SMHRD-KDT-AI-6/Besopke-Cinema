package kr.smhrd.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.BoardVO;


//POJO
public class BoardListController implements Controller{
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) 
		//���� ListController �������� ���� ���񽺸޼ҵ尡 ����� ��ſ� �Ű������μ��� ��ɸ� ������. 
			throws ServletException, IOException {
		BoardDAO dao = new BoardDAO(); //DB����
		ArrayList<BoardVO> list = dao.boardList();
		request.setAttribute("list", list); //IMPORTANT
		//boardDAO�ҷ����� �ҷ��� ������(=�Խ��� ����Ʈ)�� arraylist�� list�� �־����
		//��δ� string�� �����̴�. ��θ� ���� �������� ��θ� ����°��� �ƴ� ��û��ü pojo���� ����������(forwarding�� url)�� �޾Ƽ�
		//�Ѱ��ְ� view�� ��θ� ���� ���ڿ��� �����ϰ� �������ָ� ���� ���������� pojo�� �Ǵ°��̴�.
		//���⼭ ���, ����Ÿ�� ����(���⼭�� String) �ʼ�!
		return "boardList";
		
		//ó���� ���ö� ��Ḧ req, res�Ű������� �ް� ���ͼ� DB������ 
		//ArrayList������ �� String view�� ���߿� ������� ������ ��η� ������ ���ִ°�.
	}
}
