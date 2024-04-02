package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    // define field for entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional
    public void save(Student theStudent) { // no necesita retornarlo y aun asi dse eesta actualizando en la instancia que esta lamando a este metodo the student
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> readStudents() { // All JPQL is based on names of entities and fileds names
                // for JPQL use predicates: LIKE, OR, AND...
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student ORDER BY lastName", Student.class); // Student in the string is the name of the entity
        List<Student> students = theQuery.getResultList();
        return students;
    }

    @Override
    public List<Student> fibdByLastName(String theLastName) {
        // we can use parameters
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName =: theLastName", Student.class); // Student in the string is the name of the entity
        theQuery.setParameter("theLastName", theLastName);

        return theQuery.getResultList();
    }


}










