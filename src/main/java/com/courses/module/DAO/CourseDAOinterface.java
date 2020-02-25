package com.courses.module.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.courses.module.model.Course;
@Repository
public interface CourseDAOinterface {
	
	public List<Course> views();
    public void insert(Course c);
	public boolean isIdExists(int id);
	public void update(Course c);
	public String delete(int id);
}
