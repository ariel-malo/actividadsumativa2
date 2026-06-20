package com.LlanquihueTour.model;

/**
 * Esta clase representa la clase tour donde estan los parametros de los tours.
 *
 */
public class Tour {
    private String nombre;
    private String tipo;
    private int personas;
    private double precio;

    public Tour() {
    }

    /**
     * @param nombre representa el nombre del Tour o el lugar.
     * @param tipo representa el tipo de tour.
     * @param personas representa cuantas personas participan en el tour.
     * @param precio representa el precio total del tour.
     */

    public Tour(String nombre, String tipo, int personas, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.personas = personas;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", personas=" + personas +
                ", precio=" + precio +
                '}';
    }
}
