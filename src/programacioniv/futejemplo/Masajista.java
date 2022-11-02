/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacioniv.futejemplo;

/**
 *
 * @author zamudioluis
 */
public class Masajista extends SeleccionFutbol{
    
    private String titulacion;
    private int aniosExperiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    
    

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    
    
    
    public void darMasaje(){
        System.out.println("Masajista => dar masaje");
    }

	@Override
	public void entrenamiento() {
		// TODO Auto-generated method stub
		System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
	}
	
    
    
}
