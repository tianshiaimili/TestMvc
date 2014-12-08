package com.web.domain.service.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.web.domain.dao.RoleDAO;
import com.web.domain.entity.Role;
import com.web.domain.service.dao.RoleServiceDAO;

@Transactional
@Service("roleService")
public class RoleServiceImpl implements RoleServiceDAO {

	@Autowired
	private RoleDAO roleDAO;
	
	@Override
	public List<Role> listAll() {
		return roleDAO.listAll(Role.class);
	}

	@Override
	public Role findById(int objectID) {
		return roleDAO.findById(Role.class,objectID);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean Create(Role object) {
		return roleDAO.Create(object);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean Update(Role object) {
		return roleDAO.Update(object);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean Delete(int objectID) {
		return roleDAO.Delete(Role.class,objectID);
	}
}
