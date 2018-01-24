package com.chan.test.stdu.actionbean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.chan.test.common.BaseBean;
import com.chan.test.stdu.dto.StudentUpdateDto;
import com.chan.test.stdu.service.StudentUpdateService;

@ManagedBean(name = "studentUpdateActionBean")
@ViewScoped
public class StudentUpdateActionBean extends BaseBean implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6242933272151708046L;
	
	private StudentUpdateDto studentUpdateDto;
	
	@ManagedProperty(value = "#{studentUpdateService}")
	private StudentUpdateService studentUpdateService;
	
	@PostConstruct
	public void init() {
		initializeUpdate(null);
	}
	
	private void initializeUpdate(Integer studentId) {
		if (studentId == null) {
			studentId = (Integer) getFlash().get("studentId");
		}
		getFlash().keep("studentId");
		try {
			this.studentUpdateDto = studentUpdateService.getStudentDtoById(studentId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String update() {
		getFlash().keep("studentId");
		int updateResult = 0;
		String navigationResult = "";
		try {
			updateResult = studentUpdateService.updateStudent(this.studentUpdateDto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(updateResult !=0) {
			navigationResult = "studentList.xhtml?faces-redirect=true";
		} else {
			navigationResult = "editStudent.xhtml?faces-redirect=true";
		}
		
		return navigationResult;
		
	}

	public StudentUpdateDto getStudentUpdateDto() {
		return studentUpdateDto;
	}

	public void setStudentUpdateDto(StudentUpdateDto studentUpdateDto) {
		this.studentUpdateDto = studentUpdateDto;
	}

	public StudentUpdateService getStudentUpdateService() {
		return studentUpdateService;
	}

	public void setStudentUpdateService(StudentUpdateService studentUpdateService) {
		this.studentUpdateService = studentUpdateService;
	}
}
