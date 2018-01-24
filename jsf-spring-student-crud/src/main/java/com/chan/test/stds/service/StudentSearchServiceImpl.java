package com.chan.test.stds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chan.test.stds.dao.StudentSearchDao;
import com.chan.test.stds.dto.StudentDto;

@Service(value = "studentSearchService")
@Transactional
public class StudentSearchServiceImpl implements StudentSearchService {
	
	@Autowired
	private StudentSearchDao studentSearchDao;

	@Override
	public List<StudentDto> getStudentDtoList() {
		// TODO Auto-generated method stub
		return studentSearchDao.getStudentDtoList();
	}

	@Override
	public StudentDto getStudentDtoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
