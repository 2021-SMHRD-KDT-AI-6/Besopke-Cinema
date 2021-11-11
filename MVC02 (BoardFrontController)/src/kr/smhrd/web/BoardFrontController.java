package kr.smhrd.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.controller.BoardContentController;
import kr.smhrd.controller.BoardDeleteController;
import kr.smhrd.controller.BoardFormController;
import kr.smhrd.controller.BoardInsertController;
import kr.smhrd.controller.BoardListController;
import kr.smhrd.controller.BoardUpdateController;
import kr.smhrd.controller.Controller;
import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.BoardVO;


@SuppressWarnings("serial")
@WebServlet("*.do")
public class BoardFrontController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 6���� ��û�� ��� �޾Ƽ� ó���ϴ� ����Ʈ ��Ʈ�ѷ�.
		//(FrontController)
		//1���� ���ϳ� Controller�� ���ſ���. ���������� ���� �ڱⰡ ȥ���ϱ� ������.
		//if����ü�� ���ſ���. >> ������Ű���� controller�� controller���� �ڵ���ü�� ���ֹ�������. 
		
		//���ڵ�
		request.setCharacterEncoding("utf-8");
		
		
		//boardList.do,boardForm.do,boardInsert.do,boardDelete.do,boardUpdate.do,boardContent.do
		//Ŭ���̾�Ʈ���Լ� �� ��û�� �ڱⰡ �Ҽ��ִ� 6���� .do�� ��������� �Ǻ��ؾ��Ѵ�.
		//req��ü�� �̿��ϸ� ��û url�� ������ �ȴ�. 
		//req���� ���� querystring�� ���� �� �ִ�. board���� ������ If-else���� �̿��� �����ؾ��Ѵ�.
		
		//1.Ŭ���̾�Ʈ�� ��û�� Ȯ��
		String reqURL = request.getRequestURI();
		//System.out.println(reqURL); //Ȯ��
		
		//2.context path ��������
		String cpath=request.getContextPath();
		//System.out.println(cpath);	//Ȯ��
		
		//3.�Ǻ��� command ��������	
		String command = reqURL.substring(cpath.length());
		//System.out.println(command);	//Ȯ��
		//��ü ��ο��� context path��ŭ�� ���ڼ��� �� ���� .do�� �����´�.
		
		//4.if-else������ command�� ���� �ؾ��ϴ� �ϵ��� �б��� �����
		
		
		//4-1.������ �ٱ����� ���� ���������� ������ �ڵ� ����ȭ ��Ű��
		Controller controller = null;
		String view = null;
		//4-2.Handler Mapping : ��û�� � ������ ��Ʈ�ѷ����� ��������(�����ϴ���), �� ����� �����ִ� Ŭ����
		//Spring���� �ڵ鷯 ������ Dispatcher Servlet�̶� ��.
		
		//��� A ) Handler Mapping Ŭ���� ���� >> ���������� ���� 	
		//��ü������ �� command�� get controller method�� key�� �Ѱ��ָ� 
		//�ش��ϴ� ��Ʈ�ѷ��� return���ְ� ����Ʈ ��Ʈ�ѷ����� �ش��ϴ� ��Ʈ�ѷ��� ��Ű�� ��.
		 
		HandlerMapping mapping = new HandlerMapping();
		controller=mapping.getConroller(command);
		view=controller.requestHandler(request, response);
		
		
		//��� B ) if-else�� �̿� ~2021/10/27���� �ڵ鷯 ����
//		if(command.equals("/boardList.do")) {
//			//�ٸ� ��Ű���� �ִ� controller�� Ȱ���ϱ� ���� ��ü�� ������. 
//			controller = new BoardListController();
//			view = controller.requestHandler(request, response);	
//			//�Ű������� �Ѱ��༭ boardlistcontroller���� pojo�� ������ �ϴ� ���� ����ϰ� �ϴ� ��.
//		
//		}else if(command.equals("/boardForm.do")){
//			//�ٸ� ��Ű���� �ִ� controller�� Ȱ���ϱ� ���� ��ü�� ������. 
//			controller = new BoardFormController();
//			view = controller.requestHandler(request, response);
//			//�۾���ȭ��(JSP)���� forward���� boardFormController�� ������ �ؾ���.
//		
//		}else if(command.equals("/boardInsert.do")){
//			//parameter�������� Ŭ���̾�Ʈ �������� ������ ���� ������ �� �� ����ó�� �����ϸ� ȿ���� ������
//			controller = new BoardInsertController();
//			view = controller.requestHandler(request, response);
//			request.setCharacterEncoding("utf-8"); //post���
//		
//		}else if(command.equals("/boardContent.do")){
//			//idx�� �ش��ϴ� ��ü�� ������ �ͼ� ��ü ���ε��ϴ� BoardContentController
//			controller = new BoardContentController();
//			view = controller.requestHandler(request, response);
//		
//		}else if(command.equals("/boardDelete.do")){
//			controller = new BoardDeleteController();
//			view = controller.requestHandler(request, response);
//			
//		}else if(command.equals("/boardUpdate.do")){
//			//���ڵ�
//			//request.setCharacterEncoding("utf-8"); //utf-8 -> post���
//			controller = new BoardUpdateController();
//			view = controller.requestHandler(request, response);
//		}
//		
		//4-3.�б��۾��� ������ ������ �ѹ��� �ϱ�
		//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
		//���� �з� : 1. /WEB-INF/board/boardList.jsp
		//		   2. redirect:/boardList.do
		//4-4. ���¿� ���� view���� ������ ���� �б��� ����
		if(view!=null) {
			if(view.indexOf("redirect:")!=-1) { 
				//indexOf�� ���� : �ڿ� ���� ���ڰ� �ִ��� ������ ã�´�. ���ڰ� ������ -1�� �Ѱ��ش�.
				//���ϰ��� redirect�� ���� sendRedirect�� �ؾ��ϴ� ���
				
				response.sendRedirect(cpath+view.split(":")[1]);
				//cpath : view�� split���� �������� [0]��° 
				//view�� ���� ��θ� :�� �������� �߶� [0]��°�� �ƴ� [1]��°�� �ִ� /boardList.do�� �����´�.
			}else {
				//���ϰ��� redirect�� ��� forwarding�� �ؾ��ϴ� ���			
			RequestDispatcher rd=request.getRequestDispatcher(ViewResolver.makeViewUrl(view)); 
			//<< view���� ������ �̸��� ���� �ɰ���.�ѤѤѤѤѤѤѤѤѤѤѤѤѤ�ViewResolver = view�� ���� ������ �̸��� �����ִ� Ŭ����
			
			rd.forward(request, response);
			//View(JSP)	
			//"/WEB-INF/board/boardContent.jsp"
			//�������ΰ��------/view�ǳ������̸�/jsp
			//���λ�(prefix)--/------------/���̻�(suffix)
			
			}
		}
	}

	
}
