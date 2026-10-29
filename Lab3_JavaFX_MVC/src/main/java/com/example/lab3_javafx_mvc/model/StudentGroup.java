
package com.example.lab3_javafx_mvc.model;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {

    private String groupName;
    private String faculty;
    private int course;
    private String studyForm;
    private List<Student> students;

    public StudentGroup(String groupName, String faculty,
                        int course, String studyForm) {
        this.groupName = groupName;
        this.faculty = faculty;
        this.course = course;
        this.studyForm = studyForm;
        this.students = new ArrayList<>();
    }

    public String getGroupName() {
        return groupName;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getStudyForm() {
        return studyForm;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
