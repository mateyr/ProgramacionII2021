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
    private String ocupacion;  // Pendiente de hacer un cmb

    public Persona() {
    }

   
    public Persona(int edad, String name, String lastName, String ocupacion) {
        this.edad = edad;
        this.name = name;
        this.lastName = lastName;
        this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    public Object[] asArray()
    {
        Object[] obj = new Object[4];
        
        obj[0] = name;
        obj[1] = lastName;
        obj[2] = edad;
        obj[3] = ocupacion;
     
        return obj;
    }
    
    
    
    
    
}
