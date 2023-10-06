package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Result {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer resultId;
	
	private Integer studentId;
	private String subject;
	private Integer totalMarks;
	private Integer obtainedMarks;
	
	public Result() {}

	public Result(Integer resultId, Integer studentId, String subject, Integer totalMarks, Integer obtainedMarks) {
		super();
		this.resultId = resultId;
		this.studentId = studentId;
		this.subject = subject;
		this.totalMarks = totalMarks;
		this.obtainedMarks = obtainedMarks;
	}

	public Integer getResultId() {
		return resultId;
	}

	public void setResultId(Integer resultId) {
		this.resultId = resultId;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}

	public Integer getObtainedMarks() {
		return obtainedMarks;
	}

	public void setObtainedMarks(Integer obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}
}
