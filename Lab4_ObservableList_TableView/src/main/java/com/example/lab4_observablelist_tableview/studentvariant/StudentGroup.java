
package com.example.lab4_observablelist_tableview.studentvariant;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class StudentGroup {

    private final StringProperty groupName;
    private final StringProperty faculty;
    private final StringProperty course;

    private final ObservableList<Student> students =
            FXCollections.observableArrayList();

    public StudentGroup(String groupName, String faculty, String course) {
        this.groupName = new SimpleStringProperty(groupName);
        this.faculty = new SimpleStringProperty(faculty);
        this.course = new SimpleStringProperty(course);

        students.addAll(
                new Student("Иванова", "Анна", "Сергеевна",
                        "Информационные технологии"),
                new Student("Петров", "Иван", "Алексеевич",
                        "Информационные технологии"),
                new Student("Смирнова", "Мария", "Дмитриевна",
                        "Информационные технологии"),
                new Student("Соколов", "Алексей", "Игоревич",
                        "Информационные технологии")
        );
    }

    public String getGroupName() {
        return groupName.get();
    }

    public StringProperty groupNameProperty() {
        return groupName;
    }

    public String getFaculty() {
        return faculty.get();
    }

    public StringProperty facultyProperty() {
        return faculty;
    }

    public String getCourse() {
        return course.get();
    }

    public StringProperty courseProperty() {
        return course;
    }

    public ObservableList<Student> getStudents() {
        return students;
    }
}
