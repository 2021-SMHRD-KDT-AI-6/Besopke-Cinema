package kr.smhrd.web;

public class ViewResolver {
	
	private ViewResolver() { 
		//����Ʈ ������ �޼ҵ��� ���������ڰ� private�϶� static �޼ҵ尡 ������ ��ü������ �����ϴ�. >> �ڹ� ��ü ������ �����ؼ� �ٽ� ����

		//Math m = new Math(); = X //private Math(){  } = O >> �� ���·� �����ڸ޼ҵ忡 �����Ǿ��ִٴ� ��
		//System sys = new System(); = X //private System(){  } = O >> �� ���·� ������ �޼ҵ忡 �����Ǿ��ִٴ� ��
		
	}
	
	//boardList >> /WEB-INF/board/boardList.jsp �� ���λ�� ���̻縦 �ٿ��ִ� Ŭ����
	public static String makeViewUrl(String view) {
		
		
		return "/WEB-INF/board/"+view+".jsp";
		//�ѤѤѤѤ����λ�ѤѤѤѤѤѤѤѤѤѤѤѤѤ����̻�
	}

}
