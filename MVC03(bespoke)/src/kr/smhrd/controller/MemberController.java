package kr.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberVO;
 
public class MemberController implements Controller{
	public String requestHandler(HttpServletRequest req, HttpServletResponse resp)
			 throws ServletException, IOException {

		 MemberVO dto = new MemberVO();
		 MemberDAO dao = new MemberDAO();
		
		 //Member<MemberVO> member=dao.regmember();
		//request.setAttribute("",);
		return "";
	
	}
}
 PrintWriter out = resp.getWriter();
 int result;
 
 dto.setId(req.getParameter("id"));
 dto.setPw(req.getParameter("pwd"));
 dto.setName(req.getParameter("name"));
 dto.setEmail(req.getParameter("email"));
 
// SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
// Date date = null;
// 
// try {
// date = sdf.parse(req.getParameter("year")+"/"+req.getParameter("month")+"/"+req.getParameter("day"));
// //�Է¹��� ��,��,���� date �������� ����
// } catch (ParseException e) {
// e.printStackTrace();
// }
// 
// dto.setBirth(date);
 
 result = dao.insertjoin(dto);
 
 if(result==0){
 System.out.println("Fail");
 }else{
 System.out.println("Sucess");
 }
 }
}