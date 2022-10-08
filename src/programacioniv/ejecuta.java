/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacioniv;

import programacioniv.poo.Leon;
import programacioniv.poo.Serpiente;

/**
 *
 * @author zamudioluis
 */
public class ejecuta {
    
    public static void main(String[] args) {
        
        Serpiente serpiente = new Serpiente();
        Serpiente serpiente2 = new Serpiente();
        
        Leon leon = new Leon();
        
        serpiente.setNombre("Tiofila");
        serpiente.setEdad(2);
        serpiente.setEspecie("Anaconda");
        serpiente.setVenenosa(false);
        
        serpiente2.setNombre("Pancha");
        serpiente2.setEdad(5);
        serpiente2.setEspecie("Cascabel");
        serpiente2.setVenenosa(true);
        
        leon.setNombre("Juan");
        leon.setEdad(19);
        leon.setMelena(true);
        leon.setZona("Africa");
        
        System.out.println(serpiente.getNombre());
        System.out.println(serpiente.getEdad());
        System.out.println(serpiente.getEspecie());
        System.out.println(serpiente.isVenenosa());
        
        System.out.println(serpiente.arrastrarse());
        
        System.out.println(leon.getNombre());
        System.out.println(leon.getEdad());
        System.out.println(leon.getZona());
        System.out.println(leon.isMelena());
        
        System.out.println(leon.rugir());
    }
    
}
