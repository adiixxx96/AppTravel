package com.sanvalero;

public class Viajero {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private String ciudad;
    private float score;

    public Viajero(String nombre, int edad, String nacionalidad, String ciudad) {
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        score = 5.0f;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Viajero viajero = (Viajero) o;
        return edad == viajero.edad && nombre.equals(viajero.nombre) && nacionalidad.equals(viajero.nacionalidad) && ciudad.equals(viajero.ciudad);
    }
}
