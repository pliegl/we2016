package com.ecosio.model;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 * Student domain class
 */
@NamedQuery(name="findAllStudents",
        query="SELECT s FROM Student s")
@Entity
public class Student extends BaseEntity {

    @Column(name = "matrikelNummer", unique = true)
    private String registrationNumber;

    private String name;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "grantedTo")
    private Scholarship scholarship;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private List<ExamResult> examResults = new ArrayList<ExamResult>();

    @ManyToMany(mappedBy = "students")
    private List<Course> courses = new ArrayList<Course>();

    @Transient
    private DateTime loginTime;



    public void addScholarship(Scholarship scholarship) {
        scholarship.setGrantedTo(this);
        this.scholarship = scholarship;
    }


    /**
     * Adds a new exam result and sets the correct student reference
     */
    public void addExamResult(ExamResult result) {
        result.setStudent(this);
        examResults.add(result);
    }

    /**
     * Add a new course and set the correct student reference
     * @param course
     */
    public void addCourse(Course course) {
        course.getStudents().add(this);
        courses.add(course);
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateTime getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(DateTime loginTime) {
        this.loginTime = loginTime;
    }

    public Scholarship getScholarship() {
        return scholarship;
    }

    public void setScholarship(Scholarship scholarship) {
        this.scholarship = scholarship;
    }

    public List<ExamResult> getExamResults() {
        return examResults;
    }

    public void setExamResults(List<ExamResult> examResults) {
        this.examResults = examResults;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
               "registrationNumber='" + registrationNumber + '\'' +
               ", name='" + name +
               '}';
    }
}
