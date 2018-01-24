package com.chan.test.stdd.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chan.test.stdd.mapper.StudentDeleteMapper;

@Repository
public class StudentDeleteDaoImpl implements StudentDeleteDao {

	@Autowired
	private StudentDeleteMapper studentDeleteMapper;
	
	@Override
	public int deleteStudentById(int studentId) {
		return studentDeleteMapper.deleteStudentById(studentId);
	}

}
