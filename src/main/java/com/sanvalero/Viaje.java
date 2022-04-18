package com.sanvalero;

public class Viaje {
    private String destino;
    private String area;
    private String FechaInicioViaje;
    private String FechaFinViaje;
    private int plazasDisponibles;
    private float precio;

    public Viaje(String destino, String area, String fechaInicioViaje, String fechaFinViaje, int plazasDisponibles, float precio) {
        this.area = area;
        this.destino = destino;
        this.FechaInicioViaje = fechaInicioViaje;
        this.FechaFinViaje = fechaFinViaje;
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

    public String getFechaInicioViaje() {
        return FechaInicioViaje;
    }

    public void setFechaInicioViaje(String fechaInicioViaje) {
        this.FechaInicioViaje = fechaInicioViaje;
    }

    public String getFechaFinViaje() {
        return FechaFinViaje;
    }

    public void setFechaFinViaje(String fechaFinViaje) {
        this.FechaInicioViaje = fechaFinViaje;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Viaje viaje = (Viaje) o;
        return plazasDisponibles == viaje.plazasDisponibles && Float.compare(viaje.precio, precio) == 0 && destino.equals(viaje.destino) && area.equals(viaje.area) && FechaInicioViaje.equals(viaje.FechaInicioViaje) && FechaFinViaje.equals(viaje.FechaFinViaje);
    }
}
