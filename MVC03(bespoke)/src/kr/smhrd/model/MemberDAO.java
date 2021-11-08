package kr.smhrd.model;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


public class MemberDAO {

	
	SqlSessionFactory sessionf = kr.smhrd.mybatis.SqlMapConfig.getSqlMapInstance();
	SqlSession sqlsession; 
	
	public MemberDAO() {
		
		sqlsession = sessionf.openSession(true); //true �� �ҽ� �ڵ� commit
		
	}
	
	public int insertjoin(MemberVO dto) {
		int result;
		result = sqlsession.insert("insertjoin",dto);
		
		return result;
	}

}