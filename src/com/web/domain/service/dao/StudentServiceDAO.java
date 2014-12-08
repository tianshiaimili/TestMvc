package com.web.domain.service.dao;

import java.util.List;
import com.web.domain.entity.Student;

public interface StudentServiceDAO {
    List<Student> listAll();
    Student findById(int objectID);
    boolean Create(Student object);
    boolean Update(Student object);
    boolean Delete(int objectID);
}
