package com.LlanquihueTour.ui;


import com.LlanquihueTour.data.ReservaService;
import com.LlanquihueTour.model.Reserva;
import com.LlanquihueTour.model.Tour;
import com.LlanquihueTour.util.LectorDatos;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        String archivo= "datos.txt";
        LectorDatos lector= new LectorDatos();
        ArrayList<Reserva> lista= lector.cargar(archivo);
        ReservaService reservaService=new ReservaService(lista);

        reservaService.mostrarReserva();


        //reservaService.filtrarTipo("aventura");

        //Tour tour=new Tour("calama", "cultural", 3, 60000);
        //Reserva reserva=new Reserva("mariana perez", tour);

        //lector.agregarReserva("datos.txt", reserva);




            }










        }



