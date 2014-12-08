package com.web.domain.service.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.web.domain.dao.CourseDAO;
import com.web.domain.entity.Course;
import com.web.domain.service.dao.CourseServiceDAO;

@Transactional
@Service("courseService")
public class CourseServiceImpl implements CourseServiceDAO {

	@Autowired
	private CourseDAO courseDAO;
	
	@Override
	public List<Course> listAll() {
		return courseDAO.listAll(Course.class);
	}

	@Override
	public Course findById(int objectID) {
		return courseDAO.findById(Course.class,objectID);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean Create(Course object) {
		return courseDAO.Create(object);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean Update(Course object) {
		return courseDAO.Update(object);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean Delete(int objectID) {
		return courseDAO.Delete(Course.class,objectID);
	}
}
