/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacioniv.futejemplo;

/**
 *
 * @author zamudioluis
 */
public class Entrenador extends SeleccionFutbol {

    private String idFederacion;

    public Entrenador() {
        super();
    }

    public Entrenador(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println("Entrenador => dirige un partido");

    }

    public void dirigirEntreno() {
        System.out.println("Entrenador => dirige un entrenamiento");
    }

}
