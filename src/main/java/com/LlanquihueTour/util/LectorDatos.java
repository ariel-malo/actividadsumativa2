package com.LlanquihueTour.util;

/**
 * esta clase representa el lector de datos donde se obtendran los datos del
 * archivo txt o csv para transformarlos en atributos de una clase.
 *
 */


import com.LlanquihueTour.model.Reserva;
import com.LlanquihueTour.model.Tour;
import java.io.*;
import java.util.ArrayList;


public class LectorDatos {
    //metodo creado para leer el archivo txt.
public ArrayList<Reserva> cargar(String archivo){
    ArrayList<Reserva>  lista= new ArrayList<>();
    try{
        BufferedReader reader=new BufferedReader(new FileReader(archivo));
        String linea;
        while((linea=reader.readLine())!=null){
            String datos []= linea.split(";");
            if(datos.length==5){

                String cliente= datos[0];
                String nombre= datos[1];
                String tipo= datos[2];
                int personas= Integer.parseInt(datos[3]);
                double precio= Double.parseDouble(datos[4]);
                Tour tour=new Tour(nombre, tipo, personas, precio);
                Reserva reserva=new Reserva(cliente, tour);
                lista.add(reserva);
            }
        }



    }catch(IOException e){
        System.out.println("error al leer el archivo" + e.getMessage());

    }
    return lista;
}

//metodo creado para agregar un nuevo dato al texto.
public void agregarReserva(String archivo, Reserva reserva){
    try{
        BufferedWriter wr=new BufferedWriter(new FileWriter(archivo, true));
        wr.write("\n"+reserva.getCliente()+ ";" + reserva.getTour().getNombre() + ";" + reserva.getTour().getTipo()
        + ";" + reserva.getTour().getPersonas() + ";" + reserva.getTour().getPrecio());

        wr.newLine();
        wr.close();
    }catch(IOException e){
        System.out.println("error al intentar agregar una reserva");
    }
}
}
