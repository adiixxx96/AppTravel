package com.sanvalero;

public class Viaje {
    private String destino;
    private String area;
    private String fechaViaje;
    private int plazasDisponibles;
    private float precio;

    public Viaje(String destino, String area, String fechaViaje, int plazasDisponibles, float precio) {
        this.area = area;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.plazasDisponibles = plazasDisponibles;
        this.precio = precio;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(String fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public int getPlazasDisponibles() {
        return plazasDisponibles;
    }

    public void setPlazasDisponibles(int plazasDisponibles) {
        this.plazasDisponibles = plazasDisponibles;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
