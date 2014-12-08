package com.web.domain.service.dao;

import java.util.List;
import com.web.domain.entity.Role;

public interface RoleServiceDAO {
    List<Role> listAll();
    Role findById(int objectID);
    boolean Create(Role object);
    boolean Update(Role object);
    boolean Delete(int objectID);
}
