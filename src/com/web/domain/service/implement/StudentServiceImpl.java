package com.web.domain.service.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.web.domain.dao.StudentDAO;
import com.web.domain.entity.Student;
import com.web.domain.service.dao.StudentServiceDAO;

@Transactional
@Service("studentService")
public class StudentServiceImpl implements StudentServiceDAO {

	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	public List<Student> listAll() {
		return studentDAO.listAll(Student.class);
	}

	@Override
	public Student findById(int objectID) {
		return studentDAO.findById(Student.class,objectID);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean Create(Student object) {
		return studentDAO.Create(object);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean Update(Student object) {
		return studentDAO.Update(object);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean Delete(int objectID) {
		return studentDAO.Delete(Student.class,objectID);
	}
}
