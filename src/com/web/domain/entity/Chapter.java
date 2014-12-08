package com.web.domain.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name = "chapter")
@NamedQueries({
    @NamedQuery(name = "Chapter.findAll", query = "SELECT c FROM Chapter c")})
public class Chapter implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "chapterID")
    private Integer chapterID;
    @Column(name = "cName")
    private String cName;
    @Column(name = "cTeacher")
    private String cTeacher;
    @Column(name = "cImg")
    private String cImg;
    @Column(name = "cTurn")
    private Integer cTurn;
    @Column(name = "cClick")
    private Integer cClick;
    @Column(name = "cCount")
    private Integer cCount;
    @Column(name = "cDescript")
    private String cDescript;
    @JoinColumn(name = "courseID", referencedColumnName = "courseID")
    @ManyToOne
    private Course course;
    
    

    public Chapter() {
    }

    public Chapter(Integer chapterID) {
        this.chapterID = chapterID;
    }

    public Integer getchapterID() {
        return chapterID;
    }

    public void setchapterID(Integer chapterID) {
        this.chapterID = chapterID;
    }



    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcTeacher() {
        return cTeacher;
    }

    public void setcTeacher(String cTeacher) {
        this.cTeacher = cTeacher;
    }

    public String getcImg() {
        return cImg;
    }

    public void setcImg(String cImg) {
        this.cImg = cImg;
    }

    public Integer getcTurn() {
        return cTurn;
    }

    public void setcTurn(Integer cTurn) {
        this.cTurn = cTurn;
    }

    public Integer getcClick() {
        return cClick;
    }

    public void setcClick(Integer cClick) {
        this.cClick = cClick;
    }

    public Integer getcCount() {
        return cCount;
    }

    public void setcCount(Integer cCount) {
        this.cCount = cCount;
    }

    public String getcDescript() {
        return cDescript;
    }

    public void setcDescript(String cDescript) {
        this.cDescript = cDescript;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chapterID != null ? chapterID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Chapter)) {
            return false;
        }
        Chapter other = (Chapter) object;
        if ((this.chapterID == null && other.chapterID != null) || (this.chapterID != null && !this.chapterID.equals(other.chapterID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.domain.entity.Chapter[ chapterID=" + chapterID + " ]";
    }

	public Course getCourseID() {
		return course;
	}

	public void setCourseID(Course courseID) {
		this.course = courseID;
	}
    
}
