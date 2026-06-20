package com.LlanquihueTour.model;

/**
 * Esta clase representa la reserva del tour del cliente compuesta por la
 * clase tour
 */
public class Reserva {
    private String cliente;
    private Tour tour;

    public Reserva() {
    }

    /**
     * @param cliente es el nombre del cliente.
     * @param tour es su composicion o relacion de la clase Tour
     */
    public Reserva(String cliente, Tour tour) {
        this.cliente = cliente;
        this.tour = tour;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "cliente='" + cliente + '\'' +
                ", tour=" + tour +
                '}';
    }
}
