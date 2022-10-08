/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacioniv.poo;

/**
 *
 * @author zamudioluis
 */
public class Persona {
    
    //Atributo
    private String nombre;
    private int edad;
    private String domicilio;
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        //Convertir la cadena recibida en minusculas
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    
    
    
    
}
