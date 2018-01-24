package com.chan.test.stdu.dao;

import com.chan.test.stdu.dto.StudentUpdateDto;

public interface StudentUpdateDao {
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
	public StudentUpdateDto getStudentDtoById(int studentId);
}
