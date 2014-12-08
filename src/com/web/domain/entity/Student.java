package com.web.domain.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//hibernateµÄ×¢½â
@Entity
@Table(name = "student")
//@NamedQueries({
//    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s")})
@NamedQueries({@NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s")})
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "uID")
    private Integer uID;
    @Column(name = "userName")
    private String userName;
    @Column(name = "passWord")
    private String passWord;
    @Column(name = "studyTime")
    private Integer studyTime;
    @Basic(optional = false)
    @Column(name = "logcheck")
    private boolean logcheck;
    @Column(name = "uName")
    private String uName;
    @Column(name = "uPingYing")
    private String uPingYing;
    @Column(name = "uDepartment")
    private String uDepartment;
    @Column(name = "uSpecialty")
    private String uSpecialty;
    @Column(name = "uClass")
    private String uClass;
    
    
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="student_role",joinColumns = {@JoinColumn(name="uID")},inverseJoinColumns = {@JoinColumn(name="roleID")})
	private List<Role> roleSet ;
    
    
    
    

	public Student() {
    }

    public Student(Integer uID) {
        this.uID = uID;
    }

    public Student(Integer uID, boolean logcheck) {
        this.uID = uID;
        this.logcheck = logcheck;
    }

    public Integer getuID() {
        return uID;
    }

    public void setuID(Integer uID) {
        this.uID = uID;
    }

    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getpassWord() {
        return passWord;
    }

    public void setpassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getstudyTime() {
        return studyTime;
    }

    public void setstudyTime(Integer studyTime) {
        this.studyTime = studyTime;
    }

    public boolean getlogcheck() {
        return logcheck;
    }

    public void setlogcheck(boolean logcheck) {
        this.logcheck = logcheck;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPingYing() {
        return uPingYing;
    }

    public void setuPingYing(String uPingYing) {
        this.uPingYing = uPingYing;
    }

    public String getuDepartment() {
        return uDepartment;
    }

    public void setuDepartment(String uDepartment) {
        this.uDepartment = uDepartment;
    }

    public String getuSpecialty() {
        return uSpecialty;
    }

    public void setuSpecialty(String uSpecialty) {
        this.uSpecialty = uSpecialty;
    }

    public String getuClass() {
        return uClass;
    }

    public void setuClass(String uClass) {
        this.uClass = uClass;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uID != null ? uID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.uID == null && other.uID != null) || (this.uID != null && !this.uID.equals(other.uID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.domain.entity.Student[ uID=" + uID + " ]";
    }

	public List<Role> getRoles() {
		return roleSet;
	}

	public void setRoles(List<Role> roles) {
		this.roleSet = roles;
	}
    
}
