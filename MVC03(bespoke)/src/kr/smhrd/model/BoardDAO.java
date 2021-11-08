package kr.smhrd.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// JDBC(Java+SQL) -> MyBatis(Java<-->SQL) -> Spring JPA(Java<-->SQL(X))

// MVC03 : JDBC -> MyBatis Framework(DB Framework)

public class BoardDAO {
				// Session=Connection , Factory=���� =>SqlSessionFactory=Connection�� �̸� ���� �������� ������ �ִ� ��ü
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
	public void boardInsert(BoardVO vo) {
		SqlSession session=sqlSessionFactory.openSession();
		session.insert("boardInsert", vo);
		session.commit(); //�Ϸ�(����)
		session.close();  //�ݳ�(Ŀ�ؼ��� �ݳ��ؼ� ��Ȱ���ϱ� ����)
	}
	public  List<BoardVO> boardList(){
		SqlSession session=sqlSessionFactory.openSession();
		List<BoardVO> list=session.selectList("boardList");
		session.close();
		return list;
	}
	public void boardDelete(int idx) {
		SqlSession session=sqlSessionFactory.openSession();
		session.delete("boardDelete", idx);
		session.commit(); 
		session.close();  
	}
	public BoardVO boardContent(int idx) {
		SqlSession session=sqlSessionFactory.openSession();
		BoardVO vo= session.selectOne("boardContent", idx);
		session.close();  
		return vo;
	}
	public void boardUpdate(BoardVO vo) {
		SqlSession session=sqlSessionFactory.openSession();
		session.update("boardUpdate", vo);
		session.commit(); 
		session.close();  
	}
	public UserVO isLogin(UserVO vo) {
		SqlSession session=sqlSessionFactory.openSession();
		vo=session.selectOne("isLogin",vo);
		session.close();
		return vo;
	}
}










