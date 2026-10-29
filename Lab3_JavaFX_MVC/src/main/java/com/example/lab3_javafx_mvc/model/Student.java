
package com.example.lab3_javafx_mvc.model;

public class Student {

    private String lastName;
    private String firstName;
    private String middleName;
    private String birthDate;
    private String phone;
    private String email;

    public Student(String lastName, String firstName,
                   String middleName, String birthDate,
                   String phone, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
