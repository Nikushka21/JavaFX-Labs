
package com.example.lab3_javafx_mvc.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    private final StringProperty firstName = new SimpleStringProperty("");
    private final StringProperty lastName = new SimpleStringProperty("");
    private final StringProperty street = new SimpleStringProperty("");
    private final StringProperty city = new SimpleStringProperty("");
    private final StringProperty postalCode = new SimpleStringProperty("");
    private final StringProperty birthday = new SimpleStringProperty("");

    public Person() {
    }

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String value) {
        firstName.set(value);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String value) {
        lastName.set(value);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public String getStreet() {
        return street.get();
    }

    public void setStreet(String value) {
        street.set(value);
    }

    public StringProperty streetProperty() {
        return street;
    }

    public String getCity() {
        return city.get();
    }

    public void setCity(String value) {
        city.set(value);
    }

    public StringProperty cityProperty() {
        return city;
    }

    public String getPostalCode() {
        return postalCode.get();
    }

    public void setPostalCode(String value) {
        postalCode.set(value);
    }

    public StringProperty postalCodeProperty() {
        return postalCode;
    }

    public String getBirthday() {
        return birthday.get();
    }

    public void setBirthday(String value) {
        birthday.set(value);
    }

    public StringProperty birthdayProperty() {
        return birthday;
    }
}
