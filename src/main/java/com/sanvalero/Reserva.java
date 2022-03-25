package com.sanvalero;

public class Reserva {
    private String nombreReserva;
    private int viajesReservados;
    private float precioTotal;
    private float deposito;
    private String fechaReserva;

    public Reserva(String nombreReserva, int viajesReservados, float precioTotal, float deposito, String fechaReserva) {
        this.nombreReserva = nombreReserva;
        this.viajesReservados = viajesReservados;
        this.precioTotal = precioTotal;
        this.deposito = deposito;
        this.fechaReserva = fechaReserva;
    }

    public String getNombreReserva() {
        return nombreReserva;
    }

    public void setNombreReserva(String nombreReserva) {
        this.nombreReserva = nombreReserva;
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

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public boolean reservasDuplicadas(Reserva reserva1, Reserva reserva2) {
        if ((reserva1.getNombreReserva()).equals(reserva2.getNombreReserva())) {
            return true;
        } else return false;
    }
}


