/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mateyr.agendacontactos.models;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author MateyR
 */
public class Contacto {

    private  StringProperty firstName;
    private  StringProperty lastName;
    private  StringProperty street;
    private  IntegerProperty postalCode;
    private  StringProperty city;
    private  ObjectProperty<LocalDate> birthday;

    public Contacto() {
    }
   
    public Contacto(String firstName, String lastName, String street, int postalCode, String city, ObjectProperty<LocalDate> birthday) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.street = new SimpleStringProperty(street);
        this.postalCode = new SimpleIntegerProperty(postalCode);
        this.city = new SimpleStringProperty(city);
        this.birthday = birthday;
    }
    
    public StringProperty firstNameProperty() {
		return firstName;
    }
    
    public StringProperty lastNameProperty() {
		return lastName;
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(StringProperty firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(StringProperty lastName) {
        this.lastName = lastName;
    }

    public StringProperty getStreet() {
        return street;
    }
    
    /*public String getStreet(){
        return street.get();
    }*/
    
    

    public void setStreet(StringProperty street) {
        this.street = street;
    }

    public IntegerProperty getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(IntegerProperty postalCode) {
        this.postalCode = postalCode;
    }

    public StringProperty getCity() {
        return city;
    }

    public void setCity(StringProperty city) {
        this.city = city;
    }

    public ObjectProperty<LocalDate> getBirthday() {
        return birthday;
    }

    public void setBirthday(ObjectProperty<LocalDate> birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
      return getFirstName().toString();
    }
    
    
}
