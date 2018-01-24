package com.chan.test.stdr.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chan.test.stdr.dto.StudentRegisterDto;
import com.chan.test.stdr.mapper.StudentRegisterMapper;

@Repository
public class StudentRegisterDaoImpl implements StudentRegisterDao {

	@Autowired
	private StudentRegisterMapper studentRegisterMapper;
	
	@Override
	public int insertStudent(StudentRegisterDto studentRegisterDto) {
		return studentRegisterMapper.insertStudent(studentRegisterDto);
	}

}
