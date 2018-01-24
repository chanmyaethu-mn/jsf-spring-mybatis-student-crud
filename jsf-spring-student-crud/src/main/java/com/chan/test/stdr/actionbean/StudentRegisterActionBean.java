package com.chan.test.stdr.actionbean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.chan.test.common.BaseBean;
import com.chan.test.stdr.dto.StudentRegisterDto;
import com.chan.test.stdr.service.StudentRegisterService;

@ManagedBean(name = "studentRegisterActionBean")
@ViewScoped
public class StudentRegisterActionBean extends BaseBean implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5545411888383105814L;

	private StudentRegisterDto studentRegisterDto;
	
	@ManagedProperty(value = "#{studentRegisterService}")
	private StudentRegisterService studentRegisterService;
	
	@PostConstruct
	public void init() {
		studentRegisterDto = new StudentRegisterDto();
	}
	
	/**
	 * It is to insert a student.
	 */
	public String register() {
		int saveResult = 0;
		String navigationResult = "";
		try {
			saveResult = studentRegisterService.insertStudent(studentRegisterDto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(saveResult !=0) {
			navigationResult = "studentList.xhtml?faces-redirect=true";
		} else {
			navigationResult = "createStudent.xhtml?faces-redirect=true";
		}
		
		return navigationResult;
	}

	public StudentRegisterDto getStudentRegisterDto() {
		return studentRegisterDto;
	}

	public void setStudentRegisterDto(StudentRegisterDto studentRegisterDto) {
		this.studentRegisterDto = studentRegisterDto;
	}

	public StudentRegisterService getStudentRegisterService() {
		return studentRegisterService;
	}

	public void setStudentRegisterService(StudentRegisterService studentRegisterService) {
		this.studentRegisterService = studentRegisterService;
	}
	
}
