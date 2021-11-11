package kr.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// �Խù�(Object)-->��ȣ, ����, ����, �ۼ���, �ۼ���, ��ȸ��........
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
    
    private String mb_name;
    private String mb_pwd;
    private String mb_nickname;
	
}
