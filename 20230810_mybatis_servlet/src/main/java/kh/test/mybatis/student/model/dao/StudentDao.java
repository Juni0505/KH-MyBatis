package kh.test.mybatis.student.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kh.test.mybatis.student.model.vo.StudentVo;

public class StudentDao {
	
	//	sql 명령어 별로 관리
	public List<StudentVo> selectList(SqlSession session){
		List<StudentVo> result = session.selectList("student.selectList");	// 키 포인트 "namespace.id"
//		result = session.selectList("student.selectList");	// 키 포인트 "namespace.id"
		
		return result;
	}
	public StudentVo selectOne(SqlSession session, String studentNo){
		StudentVo result = session.selectOne("student.selectOne", studentNo); // 키 포인트 "namespace.id", parameter
//		result = session.selectOne("student.selectOne");	// 키 포인트 "namespace.id"
		return result;
	}
	public int insert(SqlSession session, StudentVo vo) {
		int result = session.insert("student.insert", vo);
		return result;
	}
}
