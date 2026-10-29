
package com.example.lab3_javafx_mvc.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AddressBookModel {

    private final ObservableList<Person> personList =
            FXCollections.observableArrayList();

    public AddressBookModel() {
        Person anna = new Person("Анна", "Иванова");
        anna.setStreet("Ленина, 10");
        anna.setCity("Ростов-на-Дону");
        anna.setPostalCode("344000");
        anna.setBirthday("12.05.2003");

        Person ivan = new Person("Иван", "Петров");
        ivan.setStreet("Садовая, 25");
        ivan.setCity("Москва");
        ivan.setPostalCode("101000");
        ivan.setBirthday("20.08.2002");

        Person maria = new Person("Мария", "Смирнова");
        maria.setStreet("Мира, 7");
        maria.setCity("Санкт-Петербург");
        maria.setPostalCode("190000");
        maria.setBirthday("03.11.2004");

        personList.addAll(anna, ivan, maria);
    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }
}
