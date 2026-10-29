
package com.example.lab4_observablelist_tableview.tutorial;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty street;
    private final StringProperty postalCode;
    private final StringProperty city;

    public Person() {
        this(null, null, null, null, null);
    }

    public Person(String firstName, String lastName,
                  String street, String postalCode, String city) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.street = new SimpleStringProperty(street);
        this.postalCode = new SimpleStringProperty(postalCode);
        this.city = new SimpleStringProperty(city);
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

    public String getPostalCode() {
        return postalCode.get();
    }

    public void setPostalCode(String value) {
        postalCode.set(value);
    }

    public StringProperty postalCodeProperty() {
        return postalCode;
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
}
