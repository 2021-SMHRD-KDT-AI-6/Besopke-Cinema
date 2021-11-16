package kr.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ReviewVO {
   
   private int movie_seq; //��ȭ ��ȣ
   private int review_seq; //���� ��ȣ
   private int star_score; //����
   private String document; //���� ����
   private int label; //����, ����

}
