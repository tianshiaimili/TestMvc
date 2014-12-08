package com.web.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.web.domain.entity.Role;
import com.web.domain.entity.Student;
import com.web.domain.service.dao.StudentServiceDAO;


@Repository("ETUserDetailService")
public  class ETUserDetailService implements UserDetailsService{

	@Autowired
	private StudentServiceDAO studentDAO;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		System.out.println("_____first________");
		Student etuser = studentDAO.findById(1);
		System.out.println("etuser.name=="+etuser.getuName());
		System.out.println("etuser.username=="+etuser.getuserName());
		UserDetails user = null ;
		if(etuser != null){
			user = new User(etuser.getuserName(), etuser.getpassWord(), true,
					true , 
					true,
					true,findUserAuthorities(etuser));
		}
		return user;
	}

	/**
	 * 获取用户的权限
	 * @param user
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public Collection<GrantedAuthority> findUserAuthorities(Student user){
		System.out.println("___888888_____");
		List<GrantedAuthority> autthorities = new ArrayList<GrantedAuthority>();
		System.out.println("user.getRoles()  ==  "+user.getRoles());
		List<Role> roles =  user.getRoles();
		for (Role etRole : roles) {
			System.out.println("------- = "+etRole.getRoleCode());
			autthorities.add(new GrantedAuthorityImpl(etRole.getRoleCode()));
		}
		
		autthorities.add(new GrantedAuthorityImpl("ROLE_USER"));
		return autthorities ;
	}
	
	
}
