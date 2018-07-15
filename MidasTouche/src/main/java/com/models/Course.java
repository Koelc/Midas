package com.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course 
{
	@Id
	String CourseCd;
	String CourseNm;
	
	/*@OneToMany(targetEntity=BatchLaunchFitness.class, fetch=FetchType.EAGER,mappedBy="Course")
	private Set<BatchLaunchFitness> batchlaunchfitness = new HashSet<BatchLaunchFitness>(0);
	
	public Set<BatchLaunchFitness> getBatchlaunchfitness() {
		return batchlaunchfitness;
	}
	public void setBatchlaunchfitness(Set<BatchLaunchFitness> batchlaunchfitness) {
		this.batchlaunchfitness = batchlaunchfitness;
	}*/
	public String getCourseCd() {
		return CourseCd;
	}
	public void setCourseCd(String courseCd) {
		CourseCd = courseCd;
	}
	public String getCourseNm() {
		return CourseNm;
	}
	public void setCourseNm(String courseNm) {
		CourseNm = courseNm;
	}

}
