package kr.smhrd.web;

import java.util.HashMap;

import kr.smhrd.controller.*;

public class HandlerMapping {
	//�ѤѤѤ�KEY�ѤѤѤѤѤѤ�VALUE
	// /boardList.do -> ??
	// /boardInsert.do -> ??
	// /boardDelete.do -> ??
	// /boardForm.do -> ??
	// /boardUpdate.do -> ??
	// /boardContent.do -> ??
	
	//Hash�� ���� ���� �˻�, Ž���ӵ��� �䱸�Ѵ�. �ڷᱸ���� ���õ� API�� key�� valuee ���ÿ� ���� �ڷᱸ�� HashMap �� �����.
	
	private HashMap<String, Controller> mappings; 
	//key���� controller�� �ִ� ���� : ���� �ڽĸ��� ������ �޶����� ������ �θ��� controller�� Ÿ���� �����ش�. 
	public HandlerMapping() {
		mappings=new HashMap<String, Controller>();
		mappings.put("/boardList.do", new BoardListController());
		mappings.put("/boardForm.do", new BoardFormController());
		mappings.put("/boardInsert.do", new BoardInsertController());
		mappings.put("/boardUpdate.do", new BoardUpdateController());
		mappings.put("/boardContent.do", new BoardContentController());
		mappings.put("/boardDelete.do", new BoardDeleteController());
		//���� login.do �� ����� ġ�� new LoginController();�� ������ ���ָ� ��.
		
	}

	//����Ʈ��Ʈ�ѷ��� HandlerMapping�� ���� Ű���� �����ָ� � controller(����Ÿ��)�� �����ϵ��� return���ִ� �޼ҵ�
	public Controller getConroller(String key) {
		return mappings.get(key);
	}
}
