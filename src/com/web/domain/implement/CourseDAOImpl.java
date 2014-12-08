package com.web.domain.implement;

import org.springframework.stereotype.Repository;
import com.web.domain.dao.CourseDAO;
import com.web.domain.entity.Course;


@Repository("courseDAO")
public class CourseDAOImpl extends BaseDAOImplement<Course> implements CourseDAO{

}
