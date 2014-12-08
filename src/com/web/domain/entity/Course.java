package com.web.domain.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "course")
@NamedQueries({
    @NamedQuery(name = "Course.findAll", query = "SELECT c FROM Course c")})
public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "courseID")
    private Integer courseID;
    @Column(name = "courseName")
    private String courseName;
    @Column(name = "courseDescript")
    private String courseDescript;
    @Column(name = "cClick")
    private Integer cClick;
    @OneToMany(mappedBy = "course")
    private List<Chapter> chapters;
    
    
    
    public Course() {
    }

    public Course(Integer courseID) {
        this.courseID = courseID;
    }

    public Integer getcourseID() {
        return courseID;
    }

    public void setcourseID(Integer courseID) {
        this.courseID = courseID;
    }

    public String getcourseName() {
        return courseName;
    }

    public void setcourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getcourseDescript() {
        return courseDescript;
    }

    public void setcourseDescript(String courseDescript) {
        this.courseDescript = courseDescript;
    }

    public Integer getcClick() {
        return cClick;
    }

    public void setcClick(Integer cClick) {
        this.cClick = cClick;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (courseID != null ? courseID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Course)) {
            return false;
        }
        Course other = (Course) object;
        if ((this.courseID == null && other.courseID != null) || (this.courseID != null && !this.courseID.equals(other.courseID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.domain.entity.Course[ courseID=" + courseID + " ]";
    }

	public List<Chapter> getChapterSets() {
		return chapters;
	}

	public void setChapterSets(List<Chapter> chapterSets) {
		this.chapters = chapterSets;
	}
    
}
