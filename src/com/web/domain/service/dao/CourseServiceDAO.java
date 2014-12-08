package com.web.domain.service.dao;

import java.util.List;
import com.web.domain.entity.Course;

public interface CourseServiceDAO {
    List<Course> listAll();
    Course findById(int objectID);
    boolean Create(Course object);
    boolean Update(Course object);
    boolean Delete(int objectID);
}
