package com.chan.test.stdu.mapper;

import org.apache.ibatis.annotations.Param;

import com.chan.test.stdu.dto.StudentUpdateDto;

public interface StudentUpdateMapper {

	/**
	 * It will update a student.
	 * 
	 * @param studentUpdateDto
	 *            studentUpdateDto
	 * @return count of updated.
	 */
	public int updateStudent(StudentUpdateDto studentUpdateDto);
	
	/**
	 * Get student information by id.
	 * 
	 * @return a student information
	 */
	public StudentUpdateDto getStudentDtoById(@Param("studentId") int studentId);
}
