/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacioniv.poo;

/**
 *
 * @author zamudioluis
 */
public class Serpiente extends Animal{
    
    private String especie;
    
    private boolean venenosa;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }
    
    
    
    
    public String arrastrarse(){
        return "Se arrastra";
    }
    
}
