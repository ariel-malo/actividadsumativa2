package com.LlanquihueTour.data;

import com.LlanquihueTour.model.Reserva;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Esta clase ReservaService se encarga de gestionar las reservas
 * almacenadas en un ArrayList. Permite mostrar todas las reservas
 * y realizar búsquedas o filtros sobre ellas.
 */

public class ReservaService {
    public ReservaService(ArrayList<Reserva> reserva) {//crea el constructor del arraylist
        this.reserva = reserva;
    }
    // Lista que almacena todas las reservas cargadas.
    private ArrayList<Reserva> reserva;



    //muestra todas las reservas en consola.
    public void mostrarReserva(){
        for(Reserva r: reserva) {
            if (!reserva.isEmpty()) {
                System.out.println(r);
            }else{
                System.out.println("no existen datos en el archivo");
            }
        }

    }
//metodo que filtra por tipo de tour y muestra el resultado en consola.
    public boolean filtrarTipo(String tipo){
        boolean encontrado= false;
        for(Reserva r: reserva){
            if(r.getTour().getTipo().equalsIgnoreCase(tipo)){
                System.out.println(r);
                encontrado= true;
            }
        }
        if(!encontrado){
            System.out.println("no se encontraron los tipos solicitados." + tipo);
        }
        return encontrado;
    }
    public boolean encotrar(String tipo){
        boolean encontrado=false;
        for(Reserva r :reserva){
            if(r.equals(tipo)){
                System.out.println(r);
                encontrado=true;
            }else{
                System.out.println("no se encontro ningun elemento parecido");
            }
        }
        return encontrado;
    }





}
