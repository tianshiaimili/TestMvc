package com.web.domain.implement;

import org.springframework.stereotype.Repository;

import com.web.domain.dao.RoleDAO;
import com.web.domain.entity.Role;


@Repository("roleDAO")
public class RoleDAOImpl extends BaseDAOImplement<Role> implements RoleDAO{

}
