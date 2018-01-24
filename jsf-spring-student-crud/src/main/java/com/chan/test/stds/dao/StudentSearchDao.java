package com.chan.test.stds.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chan.test.stds.dto.StudentDto;

public interface StudentSearchDao {
	/**
	 * Getting all student.
	 * 
	 * @return all student information
	 */
	public List<StudentDto> getStudentDtoList();
	
	/**
	 * Get student information by id.
	 * 
	 * @return a student information
	 */
	public StudentDto getStudentDtoById(@Param("id") int id);
}
