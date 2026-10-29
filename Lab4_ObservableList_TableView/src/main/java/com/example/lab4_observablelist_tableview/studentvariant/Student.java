
package com.example.lab4_observablelist_tableview.studentvariant;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Student {

    private final StringProperty lastName;
    private final StringProperty firstName;
    private final StringProperty middleName;
    private final StringProperty specialty;

    public Student(String lastName, String firstName,
                   String middleName, String specialty) {
        this.lastName = new SimpleStringProperty(lastName);
        this.firstName = new SimpleStringProperty(firstName);
        this.middleName = new SimpleStringProperty(middleName);
        this.specialty = new SimpleStringProperty(specialty);
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName.get();
    }

    public StringProperty middleNameProperty() {
        return middleName;
    }

    public String getSpecialty() {
        return specialty.get();
    }

    public StringProperty specialtyProperty() {
        return specialty;
    }
}
