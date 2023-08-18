package kh.test.mybatis.student.model.service;

import java.sql.Connection;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kh.test.mybatis.common.MyBatisTemplate;
import kh.test.mybatis.student.model.dao.StudentDao;
import kh.test.mybatis.student.model.vo.StudentVo;

public class StudentService {
	private StudentDao dao = new StudentDao();
	
	public StudentService() {
		dao = new StudentDao();
	}
	
	// connection 관리함. transaction 관리
	public List<StudentVo> selectList() {
		List<StudentVo> result = null;
		SqlSession session = MyBatisTemplate.getSqlSession();
		result = dao.selectList(session);
		
		session.close();
		return result;
	}
	public StudentVo selectOne(String studentNo) {
		StudentVo result = null;
		SqlSession session = MyBatisTemplate.getSqlSession();
		result = dao.selectOne(session, studentNo);
		
		session.close();
		return result;
	}
}
