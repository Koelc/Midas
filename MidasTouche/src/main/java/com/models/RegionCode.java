package com.models;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.models.Course;


@Entity
public class RegionCode implements Serializable
{
	@Id
	String RgCd;
	String CentreName;
	String CourseCd;
	
/*	@OneToMany(targetEntity=Course.class, fetch=FetchType.EAGER,mappedBy="RegionCode")
	private Set<Course> course = new HashSet<Course>(0);
	

	public Set<Course> getCourse() {
		return course;
	}
	public void setCourse(Set<Course> course) {
		this.course = course;
	}*/
	public String getRgCd() {
		return RgCd;
	}
	public void setRgCd(String rgCd) {
		RgCd = rgCd;
	}
	public String getCentreName() {
		return CentreName;
	}
	public void setCentreName(String centreName) {
		CentreName = centreName;
	}
	public String getCourseCd() {
		return CourseCd;
	}
	public void setCourseCd(String courseCd) {
		CourseCd = courseCd;
	}
	
	

}
