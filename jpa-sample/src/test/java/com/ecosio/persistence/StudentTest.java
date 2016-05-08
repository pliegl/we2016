package com.ecosio.persistence;

import com.ecosio.Application;
import com.ecosio.model.Student;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Simple test for student repo
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class StudentTest {


  private static final Logger LOG = LoggerFactory.getLogger(StudentTest.class.getName());

  @Autowired
  StudentRepository studentRepository;


  @Test
  public void testStudentPersistence() {

    Student s = new Student();
    s.setName("John Doe");
    s.setRegistrationNumber("e0000471");

    studentRepository.save(s);

    List<Student> students = studentRepository.findAll();


    assertEquals(1, students.size());

  }



}
