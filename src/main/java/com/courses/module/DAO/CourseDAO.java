package com.courses.module.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.courses.module.model.Course;

@Repository
public class CourseDAO implements CourseDAOinterface{
	@Autowired
	 EntityManager em;
	
	public List<Course> views(){
		List<Course> list=em.createQuery("from Course",Course.class).getResultList();
		return list;
}

	@Override
	public void insert(Course c) {
		em.persist(c);
	}
	@Override
	public boolean isIdExists(int id) {
		Course cc=em.find(Course.class, id);
		System.out.println(cc);
		if(cc==null)
			return false;
		else 
			return true;
	}

	@Override
	public void update(Course c) {
		 em.merge(c);
	}

	@Override
	public String delete(int id) {
	if(isIdExists(id))
	{
		Course cc=em.find(Course.class, id);
		em.remove(cc);
		return "deletion succesful";
	}
	else {
		return "id doesnt exists";
	}
	}
	
}
