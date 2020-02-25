package com.courses.module.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courses.module.DAO.CourseDAOinterface;
import com.courses.module.DTO.CourseDTO;
import com.courses.module.model.Categories;
import com.courses.module.model.Course;
import com.courses.module.model.Levels;

@Service
public class CourseService {
    @Autowired
	private CourseDAOinterface dao;
	Course course=new Course();
	Levels level=new Levels();
	Categories category=new Categories();
	@Transactional
	public List<Course> view() {
		System.out.print("service called");
		return dao.views();
	}
	@Transactional
	public void insert(CourseDTO c) {
		course.setId(c.getId());
		course.setName(c.getName());
		level.setId(c.getLevel_id());
		category.setId(c.getCategory_id());
		
	    dao.insert(course);
		
	}
	@Transactional
	public void update(Course c) {
		dao.update(c);
	}
	@Transactional
	public String delete(int id) {
		return dao.delete(id);
	}
}
		