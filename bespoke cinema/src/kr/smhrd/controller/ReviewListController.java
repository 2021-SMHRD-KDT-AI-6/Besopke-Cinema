package kr.smhrd.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.BoardVO;
import kr.smhrd.model.MovieDAO;
import kr.smhrd.model.MovieVO;
import kr.smhrd.model.ReviewDAO;
import kr.smhrd.model.ReviewVO;
import kr.smhrd.model.UserVO;

public class ReviewListController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		int movie_seq = Integer.parseInt(request.getParameter("movie_seq"));
		MovieDAO dao=new MovieDAO();
		MovieVO vo = new MovieVO();
		vo.setMovie_seq(movie_seq);
		
		MovieVO list2 = dao.movieList(movie_seq);
		request.setAttribute("list2", list2);//�߿�
		//request.setAttribute�� Ű�� ���� �̿��Ͽ� Attrubute�� ��� JSP�� ������ �ȴ�.
		//Controller����-ArrayList-Vo��-JSP��-������-JSP����-�ް�-����ϱ�
		// View�� ��θ� ���� ���ڿ��� �������ִ� ���� 
		
		
		ReviewDAO dao1=new ReviewDAO();
		
		ArrayList<ReviewVO> list=(ArrayList<ReviewVO>) dao1.reviewList(vo);
		request.setAttribute("list", list);//�߿�
		//request.setAttribute�� Ű�� ���� �̿��Ͽ� Attrubute�� ��� JSP�� ������ �ȴ�.
		//Controller����-ArrayList-Vo��-JSP��-������-JSP����-�ް�-����ϱ�
		// View�� ��θ� ���� ���ڿ��� �������ִ� ����
		return "reviewList"; 
	}
	
	

}
