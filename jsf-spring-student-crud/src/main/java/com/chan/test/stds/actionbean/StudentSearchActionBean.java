package com.chan.test.stds.actionbean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.chan.test.common.BaseBean;
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
	
	private List<StudentDto> studentDtoList;
	
	@PostConstruct
	public void init() {
		studentDtoList = studentSearchService.getStudentDtoList();
	}

	/**
	 * @return the studentDtoList
	 */
	public List<StudentDto> getStudentDtoList() {
		return studentDtoList;
	}
}
