package com.chan.test.stdr.dao;

import com.chan.test.stdr.dto.StudentRegisterDto;

public interface StudentRegisterDao {

	/**
	 * It will insert new student.
	 * 
	 * @param studentDto
	 *            studentDto
	 */
	public int insertStudent(StudentRegisterDto studentRegisterDto);
}
