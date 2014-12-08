package com.web.test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.web.domain.dao.BaseDAO;
import com.web.domain.entity.Course;
import com.web.domain.implement.BaseDAOImplement;


public class UserTest {
	protected static EntityManagerFactory emf;
    protected EntityManager em;
	
	
//    private final String drivername = "sun.jdbc.odbc.JdbcOdbcDriver";
//    private final String url = "jdbc:odbc:conn";
//    private final String username = "";
//    private final String password = "";
//    private Connection conn = null;
    
    private final String drivername = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/vodAdmin";
    private final String username = "root";
    private final String password = "123456";
    private Connection conn = null;

    
    @BeforeClass
    public static void createEntityManagerFactory() {
        emf = Persistence.createEntityManagerFactory("JPAUNIT");
    }

    @AfterClass
    public static void closeEntityManagerFactory() {
        emf.close();
    }

    @Before
    public void beginTransaction() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }

    @After
    public void rollbackTransaction() {

        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback();
        }

        if (em.isOpen()) {
            em.close();
        }
    }


	
	
	

	
	@Test
	public void entityTest(){
		
		createEntityManagerFactory();
		
		beginTransaction();
		
		  Query query=em.createNamedQuery("Student.findAll");
		  System.out.println("==== "+query.getFirstResult());
	}

	
	
}
