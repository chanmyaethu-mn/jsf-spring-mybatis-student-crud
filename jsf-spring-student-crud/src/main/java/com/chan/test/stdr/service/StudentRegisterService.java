package com.chan.test.stdr.service;

import com.chan.test.stdr.dto.StudentRegisterDto;

public interface StudentRegisterService {

	/**
	 * It will insert new student.
	 * 
	 * @param studentDto
	 *            studentDto
	 */
	public int insertStudent(StudentRegisterDto studentRegisterDto);
}
