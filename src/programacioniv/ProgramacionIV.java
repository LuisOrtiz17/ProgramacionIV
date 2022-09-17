/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacioniv;

import programacioniv.poo.Animal;

/**
 *
 * @author zamudioluis
 */
public class ProgramacionIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal perro = new Animal();
        Animal gato = new Animal();
        
        nameFull("Luis", "Zamudio");
        
        String nameFull = nombreCompleto("Angel", "Ortiz");
        
        System.out.println("Metodo de retorno: " + nameFull);
        
        int sumafinal = suma(6, 6) + 10;
        
        System.out.println(sumafinal);
        
        suma2(5, 8);
        
        //System.out.println("Esperanza vida" + perro.esperanzaVida("perro"));
        //System.out.println("Esperanza vida" + gato.esperanzaVida("gato"));
        //System.out.println("Esperanza vida" + gato.esperanzaVida("pato"));
    }
    
    
    public static void nameFull(String name, String firsName){
        
        System.out.println(name + " " + firsName);
    }
    
    public static String nombreCompleto(String name, String firsName){
        String nombre = name + " " + firsName;
        return nombre;
    }
    
    
    public static int suma(int x, int y){
        
        int result = x + y;
        
        return result;
    }
    
    public static void suma2(int x, int y){
        int result = x + y;
    }
    
}
