/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacioniv.poo;

/**
 *
 * @author zamudioluis
 */
public class Leon extends Animal {
    
    private boolean melena;
    
    private String zona;

    public boolean isMelena() {
        return melena;
    }

    public void setMelena(boolean melena) {
        this.melena = melena;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    
    
    public String rugir(){
        
        return "León ruge...";
    }
    
}
