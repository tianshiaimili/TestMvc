package com.web.domain.implement;

import org.springframework.stereotype.Repository;
import com.web.domain.dao.StudentDAO;
import com.web.domain.entity.Student;


@Repository("studentDAO")
public class StudentDAOImpl extends BaseDAOImplement<Student> implements StudentDAO{

}
