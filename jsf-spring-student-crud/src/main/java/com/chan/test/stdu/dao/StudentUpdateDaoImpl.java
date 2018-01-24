package com.chan.test.stdu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chan.test.stdu.dto.StudentUpdateDto;
import com.chan.test.stdu.mapper.StudentUpdateMapper;

@Repository
public class StudentUpdateDaoImpl implements StudentUpdateDao {

	@Autowired
	private StudentUpdateMapper studentUpdateMapper;
	
	@Override
	public int updateStudent(StudentUpdateDto studentUpdateDto) {
		return studentUpdateMapper.updateStudent(studentUpdateDto);
	}
	
	@Override
	public StudentUpdateDto getStudentDtoById(int studentId) {
		return studentUpdateMapper.getStudentDtoById(studentId);
	}

}
