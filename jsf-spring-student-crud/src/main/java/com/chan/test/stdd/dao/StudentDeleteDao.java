package com.chan.test.stdd.dao;

public interface StudentDeleteDao {

	/**
	 * It is to delete a student.
	 * 
	 * @param studentId
	 *            studentId
	 * @return count of deleted
	 */
	public int deleteStudentById(int studentId);
}
