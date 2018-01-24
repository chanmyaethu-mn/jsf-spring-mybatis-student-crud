package com.chan.test.stds.service;

import java.util.List;

import com.chan.test.stds.dto.StudentDto;

public interface StudentSearchService {

	/**
	 * Getting all student.
	 * 
	 * @return all student information
	 */
	public List<StudentDto> getStudentDtoList();
}
