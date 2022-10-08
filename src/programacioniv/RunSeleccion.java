/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacioniv;

import java.util.ArrayList;
import programacioniv.futejemplo.Entrenador;
import programacioniv.futejemplo.Futbolista;
import programacioniv.futejemplo.Masajista;
import programacioniv.futejemplo.SeleccionFutbol;

/**
 *
 * @author zamudioluis
 */
public class RunSeleccion {

    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<>();

    public static void main(String[] args) {

        Entrenador tata = new Entrenador("28RGY65", 1, "Gerardo", "Martino", 60);
        Futbolista chuky = new Futbolista(11, "Delantero", 2, "Irving", "Lozano", 27);
        Masajista poncho = new Masajista("Fisioterapeuta", 15, 3, "Alfonso", "Lopez", 45);

        integrantes.add(tata);
        integrantes.add(chuky);
        integrantes.add(poncho);

        System.out.println("Todos los integrantes comienzan una concentración. (Todos ejecutan el mismo metodo)");
        for (SeleccionFutbol item : integrantes) {
            System.out.println(item.getNombre() + " - " + item.getApellidos());
            item.concentrarse();
        }

        System.out.println("Todos los integrantes hacen un viaje. (Todos ejecutan el mismo metodo)");
        for (SeleccionFutbol item : integrantes) {
            System.out.println(item.getNombre() + " - " + item.getApellidos());
            item.viajar();
        }

        // ENTRENAMIENTO
        System.out.println("nEntrenamiento: Solamente el entrenador y el futbolista tiene metodos para entrenar:");
        System.out.print(tata.getNombre() + " " + tata.getApellidos() + " -> ");
        tata.dirigirEntreno();
        System.out.print(chuky.getNombre() + " " + chuky.getApellidos() + " -> ");
        chuky.entrenar();

        // MASAJE
        System.out.println("nMasaje: Solo el masajista tiene el método para dar un masaje:");
        System.out.print(poncho.getNombre() + " " + poncho.getApellidos() + " -> ");
        poncho.darMasaje();

// PARTIDO DE FUTBOL
        System.out.println("nPartido de Fútbol: Solamente el entrenador y el futbolista tiene metodos para el partido de fútbol:");
        System.out.print(tata.getNombre() + " " + tata.getApellidos() + " -> ");
        tata.dirigirPartido();
        System.out.print(chuky.getNombre() + " " + chuky.getApellidos() + " -> ");
        chuky.jugarPartido();

    }

}
