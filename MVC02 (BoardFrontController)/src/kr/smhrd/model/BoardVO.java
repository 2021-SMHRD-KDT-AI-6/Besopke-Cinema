package kr.smhrd.model;
// �Խù�(Object)-->��ȣ, ����, ����, �ۼ���, �ۼ���, ��ȸ��........

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//STS�� lombok�� ������Ѿ� �Ѵ�. ����� import�� �� �����̴�. 
//lombok�� ���� : getter�� setter ��������
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardVO {
	// ��������
	private int idx; //��ȣ
	private String title; //����
    private String contents; // ����
    private String writer; //�ۼ���
    private String indate; //�ۼ���
    private int count; //��ȸ��	
    
	
}
