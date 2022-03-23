package com.sanvalero;

import java.util.Date;

public class Reserva {
    private String id;
    private int viajesReservados;
    private float precioTotal;
    private float deposito;
    private Date fechaReserva;

    public Reserva(String id, int viajesReservados, float precioTotal, float deposito, Date fechaReserva) {
        this.id = id;
        this.viajesReservados = viajesReservados;
        this.precioTotal = precioTotal;
        this.deposito = deposito;
        this.fechaReserva = fechaReserva;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getViajesReservados() {
        return viajesReservados;
    }

    public void setViajesReservados(int viajesReservados) {
        this.viajesReservados = viajesReservados;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
}
