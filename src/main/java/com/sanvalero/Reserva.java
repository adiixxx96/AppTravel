package com.sanvalero;

public class Reserva {
    private String nombreReserva;
    private int numReserva;
    private float precioTotal;
    private float deposito;
    private String fechaReserva;

    public Reserva(String nombreReserva, int numReserva, float precioTotal, float deposito, String fechaReserva) {
        this.nombreReserva = nombreReserva;
        this.numReserva = numReserva;
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

    public int getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(int numReserva) {
        this.numReserva = numReserva;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return numReserva == reserva.numReserva && Float.compare(reserva.precioTotal, precioTotal) == 0 && Float.compare(reserva.deposito, deposito) == 0 && nombreReserva.equals(reserva.nombreReserva) && fechaReserva.equals(reserva.fechaReserva);
    }
}


