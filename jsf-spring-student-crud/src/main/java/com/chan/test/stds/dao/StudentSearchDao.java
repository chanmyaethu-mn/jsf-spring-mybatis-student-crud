package com.chan.test.stds.dao;

import java.util.List;

import com.chan.test.stds.dto.StudentDto;

public interface StudentSearchDao {
	/**
	 * Getting all student.
	 * 
	 * @return all student information
	 */
	public List<StudentDto> getStudentDtoList();
}
