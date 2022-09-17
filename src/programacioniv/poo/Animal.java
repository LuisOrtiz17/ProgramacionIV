/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacioniv.poo;

/**
 *
 * @author zamudioluis
 */
public class Animal {
    
    private int edad;
    private String nombre;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String esperanzaVida(String animal){
        if(animal.equals("perro")){
            return "12 años";
        }else if(animal.equals("gato")){
            return "8 años";
        }else {
            return "No existe informción";
        }
    }
    
}
