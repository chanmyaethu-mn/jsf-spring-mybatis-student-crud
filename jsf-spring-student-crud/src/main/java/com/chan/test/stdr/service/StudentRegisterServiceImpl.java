package com.chan.test.stdr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chan.test.stdr.dao.StudentRegisterDao;
import com.chan.test.stdr.dto.StudentRegisterDto;

@Service(value = "studentRegisterService")
@Transactional
public class StudentRegisterServiceImpl implements StudentRegisterService {

	@Autowired
	private StudentRegisterDao studentRegisterDao;
	
	@Override
	public int insertStudent(StudentRegisterDto studentRegisterDto) {
		return studentRegisterDao.insertStudent(studentRegisterDto);
	}

}
