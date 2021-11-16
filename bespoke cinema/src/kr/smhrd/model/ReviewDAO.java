package kr.smhrd.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ReviewDAO {
	
private static SqlSessionFactory sqlSessionFactory;
	
	
	// �ʱ�ȭ ��(Ŭ������ ����Ǹ� ������ ����Ǵ� �޼ҵ�) : DB����
	static {
		try {
			String resource = "kr/smhrd/mybatis/config.xml";
			InputStream inputStream=Resources.getResourceAsStream(resource);
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public void reviewInsert(ReviewVO vo) {
//		SqlSession session=sqlSessionFactory.openSession();
//		session.insert("reviewInsert", vo);
//		session.commit(); //�Ϸ�(����)
//		session.close();  //�ݳ�(Ŀ�ؼ��� �ݳ��ؼ� ��Ȱ���ϱ� ����)
//	}
	
	public  List<ReviewVO> reviewList(MovieVO vo){
		SqlSession session=sqlSessionFactory.openSession();
		List<ReviewVO> list=session.selectList("reviewList", vo);
		session.close();
		return list;
	}
	
//	public void reviewDelete(int review_seq) {
//		SqlSession session=sqlSessionFactory.openSession();
//		session.delete("reviewDelete", review_seq); 
//		session.commit(); 
//		session.close();  
//	}
//	public ReviewVO reviewContent(int review_seq) {
//		SqlSession session=sqlSessionFactory.openSession();
//		ReviewVO vo= session.selectOne("reviewContent", review_seq);
//		session.close();  
//		return vo;
	
	public void reviewInsert(ReviewVO vo) {
	SqlSession session=sqlSessionFactory.openSession();
		session.insert("reviewInsert", vo);
		session.commit(); 
		System.out.println(vo);
		session.close();  
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


		
	}
	
	
	
	
