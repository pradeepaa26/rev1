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
	@Override
	public List<Course> views(){
		List<Course> list=em.createQuery("from Course",Course.class).getResultList();
		return list;
}
    @Override
	public Course viewbyId(int id){
		/*
		 * Query
		 * query=em.createQuery("from Course c where c.id=:courseid",Course.class);
		 * query.setParameter("courseid",id); List<Course> list=query.getResultList();
		 * return list;
		 */
    	return(em.find(Course.class, id));
}

	@Override
	public void insert(Course c) {
		em.persist(c);
	}
	@Override
	public boolean isIdExists(int id) {
		Course cc=em.find(Course.class, id);
		if(cc==null)
			return false;
		else 
			return true;
	}
	@Override
	public boolean isActive(int id)
	{
		Course course=em.find(Course.class, id);
		if(course.isActive())
			return true;
		else
			return false;
	}

	@Override
	public String update(Course c) {
		System.out.println(c.getId());
		  if( em.merge(c) != null)
			  return "updated successfully";
		  else
			  return "updation failure";
	}

	@Override
	public String delete(int id) {
		//Course c=em.find(Course.class, id);
		if((isActive(id)))
	     {
		Course course=em.find(Course.class, id);
		//em.remove(c);
		course.setActive(false);
		return "deletion succesful";
	      }
	else {
		return "id doesnt exists";
	}
	}
	
}
