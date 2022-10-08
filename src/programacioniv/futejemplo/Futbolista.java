/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacioniv.futejemplo;

/**
 *
 * @author zamudioluis
 */
public class Futbolista extends SeleccionFutbol{
    
    private int dorsal;
    private String demarcacion;
    
    public void jugarPartido(){
        System.out.println("Futbolista => juega un partido");
    }
    
    public void entrenar(){
        System.out.println("Futbolista => mejora su tecnica durante los entrenamientos");
    }

    public Futbolista() {
        super();
    }

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    
    
}
