package com.web.domain.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name = "role")
@NamedQueries({
    @NamedQuery(name = "Role.findAll", query = "SELECT c FROM Role c")})
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "roleID")
    private Integer roleID;
    @Column(name = "roleCode")
    private String roleCode;
    @Column(name = "despripe")
    private String despripe;
    
    @ManyToMany(mappedBy="roleSet")
	private List<Student> students ;

	/**
	 * @return the roleID
	 */
	public Integer getRoleID() {
		return roleID;
	}

	/**
	 * @param roleID the roleID to set
	 */
	public void setRoleID(Integer roleID) {
		this.roleID = roleID;
	}

	/**
	 * @return the roleCode
	 */
	public String getRoleCode() {
		return roleCode;
	}

	/**
	 * @param roleCode the roleCode to set
	 */
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	/**
	 * @return the despripe
	 */
	public String getDespripe() {
		return despripe;
	}

	/**
	 * @param despripe the despripe to set
	 */
	public void setDespripe(String despripe) {
		this.despripe = despripe;
	}

	public List<Student> getUsers() {
		return students;
	}

	public void setUsers(List<Student> users) {
		this.students = users;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
}
