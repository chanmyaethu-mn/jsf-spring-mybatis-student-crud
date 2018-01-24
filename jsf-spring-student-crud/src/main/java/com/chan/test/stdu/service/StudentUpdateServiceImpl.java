package com.chan.test.stdu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chan.test.stdu.dao.StudentUpdateDao;
import com.chan.test.stdu.dto.StudentUpdateDto;

@Service(value = "studentUpdateService")
@Transactional
public class StudentUpdateServiceImpl implements StudentUpdateService {

	@Autowired
	private StudentUpdateDao studentUpdateDao;
	
	@Override
	public int updateStudent(StudentUpdateDto studentUpdateDto) {
		return studentUpdateDao.updateStudent(studentUpdateDto);
	}
	
	@Override
	public StudentUpdateDto getStudentDtoById(int studentId) {
		return studentUpdateDao.getStudentDtoById(studentId);
	}

}
