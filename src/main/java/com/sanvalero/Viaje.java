package com.sanvalero;

import java.util.Date;

public class Viaje {
    private String id;
    private String destino;
    private Date fechaViaje;
    private int plazasDisponibles;
    private float precio;

    public Viaje(String id, String destino, Date fechaViaje, int plazasDisponibles, float precio) {
        this.id = id;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.plazasDisponibles = plazasDisponibles;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(Date fechaViaje) {
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
