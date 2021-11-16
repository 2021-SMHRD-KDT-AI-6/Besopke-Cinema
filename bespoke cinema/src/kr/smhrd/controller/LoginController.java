package kr.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.MovieDAO;
import kr.smhrd.model.MovieVO;
import kr.smhrd.model.UserVO;

public class LoginController implements Controller{

   @Override
   public String requestHandler(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
	   response.setContentType("text/html; charset=UTF-8");

	  PrintWriter writer = response.getWriter();

	   
      String id=request.getParameter("id");
      String pwd=request.getParameter("pwd");
      String mb_mbti=request.getParameter("mbti");
      UserVO vo=new UserVO();
      vo.setMb_id(id);
      vo.setMb_pwd(pwd);
      vo.setMb_mbti(mb_mbti);
      
      // UserDAO -> BoardDAO
      BoardDAO dao=new BoardDAO();
      UserVO succ = dao.isLogin(vo);
      System.out.println(succ);
      
      
//	   int idx =Integer.parseInt(request.getParameter("idx"));
//	   UserVO vo1 = dao.movieContent(idx);
//		
//		
//		System.out.println(vo1);
//		//�󼼺��� ������(����) => View(JSP : boardContent.jsp)
//		request.setAttribute("vo1", vo1);
      
      
      
      
//      	MovieDAO dao1=new MovieDAO();
//		
//		ArrayList<MovieVO> list = (ArrayList<MovieVO>)dao1.allMovieList();
//
//		
//		Random rd = new Random();
//		int suggest[] = new int[4];
//	      
//	      for(int i=0; i<suggest.length; i++) {
//	         suggest[i] = rd.nextInt(list.size())+1;
//	         
//	         for(int j=0; j<i; j++) {
//	            if(suggest[i] == suggest[j]) {
//	               i--;
//	            }
//	         }
//	      }
//	      MovieVO vo1=dao1.movieList1(suggest[0]);
//	      request.setAttribute("vo1", vo1);
//	     
//	      MovieVO vo2=dao1.movieList1(suggest[1]);
//	      request.setAttribute("vo2", vo2);
//	      
//	      
//	      MovieVO vo3=dao1.movieList1(suggest[2]);
//	      request.setAttribute("vo3", vo3);
//	      
//	      MovieVO vo4=dao1.movieList1(suggest[3]);
//	      request.setAttribute("vo4", vo4);
      
      
      
      
      
      
      
      
      if(succ!=null) { // �α��� ���� -> �α��� �����ߴٴ� ǥ�ø� �޸�(����)�� �صξ�� �Ѵ�.
         HttpSession session=request.getSession();
         session.setAttribute("vo", succ);
         
         return "redirect:/moviembti2.do?mb_mbti="+succ.getMb_mbti()+"&mb_id="+succ.getMb_id()+"&mb_pwd="+succ.getMb_pwd(); //redirect���� ���� �Ѱ���
         
         
      }else {
    	  System.out.println("�α��� ����");
    	  writer.println("<script>alert('���̵�� ��й�ȣ�� Ȯ�����ּ���!'); location.href='movieLogin.do' </script>");
    	  writer.close();
    	  return "redirect:/movieLogin.do";
    	  
    	 
    	  
    	  
    	 
      }
      
      
      
     
   }


   
   
}
