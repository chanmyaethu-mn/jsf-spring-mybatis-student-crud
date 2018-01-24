package com.chan.test.stds.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chan.test.stds.dto.StudentDto;
import com.chan.test.stds.mapper.StudentSearchMapper;

@Repository
public class StudentSearchDaoImpl implements StudentSearchDao {
	
	@Autowired
	private StudentSearchMapper studentSearchMapper;

	@Override
	public List<StudentDto> getStudentDtoList() {
		// TODO Auto-generated method stub
		return studentSearchMapper.getStudentDtoList();
	}

	@Override
	public StudentDto getStudentDtoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
