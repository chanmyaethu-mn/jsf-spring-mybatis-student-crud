package com.chan.test.stdr.mapper;

import com.chan.test.stdr.dto.StudentRegisterDto;

public interface StudentRegisterMapper {

	/**
	 * It will insert new student.
	 * 
	 * @param studentDto
	 *            studentDto
	 */
	public int insertStudent(StudentRegisterDto studentRegisterDto);
}
