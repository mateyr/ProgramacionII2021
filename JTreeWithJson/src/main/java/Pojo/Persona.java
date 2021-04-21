/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

/**
 *
 * @author MateyR
 */
public class Persona {
    private String name;
    private String lastName;
    private int edad;
    private String city;
    private String ocupacion;

    public Persona() {
    }

   
    public Persona(String name, String lastName, int edad, String city, String ocupacion) {
        this.name = name;
        this.lastName = lastName;
        this.edad = edad;
        this.city = city;
        this.ocupacion = ocupacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", lastName=" + lastName + ", edad=" + edad + ", city=" + city + ", ocupacion=" + ocupacion + '}';
    }
    
    
    
    
    
}
