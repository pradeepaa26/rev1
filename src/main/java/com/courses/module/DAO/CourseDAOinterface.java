package com.courses.module.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.courses.module.model.Course;
@Repository
public interface CourseDAOinterface {
	
	public List<Course> views();
	public Course viewbyId(int id);
    public void insert(Course c);
	public boolean isIdExists(int id);
	public boolean isActive(int id);
	public String update(Course c);
	public String delete(int id);
}
