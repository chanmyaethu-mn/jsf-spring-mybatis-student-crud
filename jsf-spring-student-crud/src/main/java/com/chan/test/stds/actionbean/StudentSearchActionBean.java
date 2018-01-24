package com.chan.test.stds.actionbean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.chan.test.common.BaseBean;
import com.chan.test.stdd.service.StudentDeleteService;
import com.chan.test.stds.dto.StudentDto;
import com.chan.test.stds.service.StudentSearchService;

@ManagedBean(name = "studentSearchActionBean")
@ViewScoped
public class StudentSearchActionBean extends BaseBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1421878557124226751L;

	@ManagedProperty(value = "#{studentSearchService}")
	private StudentSearchService studentSearchService;

	@ManagedProperty(value = "#{studentDeleteService}")
	private StudentDeleteService studentDeleteService;

	private List<StudentDto> studentDtoList;

	@PostConstruct
	public void init() {
		studentDtoList = studentSearchService.getStudentDtoList();
	}

	/**
	 * It is to edit a student.
	 * 
	 * @param studentId
	 *            studentId
	 * @return navigation route
	 */
	public String edit(int studentId) {
		getFlash().put("studentId", studentId);
		return "editStudent.xhtml?faces-redirect=true";
	}

	/**
	 * It is to delete a student.
	 * 
	 * @param studentId
	 *            studentId
	 * @return navigation route
	 */
	public String delete(int studentId) {
		try {
			studentDeleteService.deleteStudentById(studentId);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "studentList.xhtml?faces-redirect=true";
	}

	/**
	 * @return the studentDtoList
	 */
	public List<StudentDto> getStudentDtoList() {
		return studentDtoList;
	}

	public StudentSearchService getStudentSearchService() {
		return studentSearchService;
	}

	public void setStudentSearchService(StudentSearchService studentSearchService) {
		this.studentSearchService = studentSearchService;
	}

	public void setStudentDtoList(List<StudentDto> studentDtoList) {
		this.studentDtoList = studentDtoList;
	}

	public StudentDeleteService getStudentDeleteService() {
		return studentDeleteService;
	}

	public void setStudentDeleteService(StudentDeleteService studentDeleteService) {
		this.studentDeleteService = studentDeleteService;
	}
}
