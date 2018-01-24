package com.chan.test.stds.mapper;

import java.util.List;

import com.chan.test.stds.dto.StudentDto;

public interface StudentSearchMapper {
	/**
	 * Getting all student.
	 * 
	 * @return all student information
	 */
	public List<StudentDto> getStudentDtoList();
}
