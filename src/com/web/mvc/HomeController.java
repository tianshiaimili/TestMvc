package com.web.mvc;

import java.util.ArrayList;
import java.util.List;

import com.web.domain.entity.Role;
import com.web.domain.entity.Student;
import com.web.domain.service.dao.CourseServiceDAO;
import com.web.domain.service.dao.StudentServiceDAO;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;



@Controller
public class HomeController {
	@Autowired
	private CourseServiceDAO courseDAO;
	
	@Autowired
	private StudentServiceDAO studentDAO;	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
		System.out.println("********************");
		String studentRight="";
		model.addAttribute("listCourse",courseDAO.listAll());
		Student currentStudent=studentDAO.findById(1);
		for (Role etRole : currentStudent.getRoles()) {
			studentRight=studentRight+etRole.getRoleCode();
		}
		
		model.addAttribute("UserName",currentStudent.getuserName());
		model.addAttribute("UserRole",studentRight);
		return "index";
    }


	@RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        return "list";
    }
}
