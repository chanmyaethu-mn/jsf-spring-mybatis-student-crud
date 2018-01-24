package com.chan.test.stdd.service;

public interface StudentDeleteService {
	/**
	 * It is to delete a student.
	 * 
	 * @param studentId
	 *            studentId
	 * @return count of deleted
	 */
	public int deleteStudentById(int studentId);
}
