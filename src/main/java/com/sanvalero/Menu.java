package com.sanvalero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<Viaje> listadoViajes;
    private List<Viajero> listadoViajeros;
    private List<Reserva> listadoReservas;
    private Scanner teclado;

    public Menu() {
        teclado = new Scanner(System.in);
        listadoViajes = new ArrayList<>();
        listadoViajeros = new ArrayList<>();
        listadoReservas = new ArrayList<>();
    }

    public void mostrarMenu() {
        String opcion;
        rellenarListados();


        //Bucle hasta que el usuario pulse Salir
        do {
        //Imprimir el menú por pantalla
        System.out.println("*****Gestor de viajes*****");
        System.out.println("1) Añadir un viaje");
        System.out.println("2) Consultar todos los viajes");
        System.out.println("3) Registrar un viajero");
        System.out.println("4) Consultar todos los viajeros");
        System.out.println("5) Registrar reserva");
        System.out.println("6) Consultar todas las reservas");
        System.out.println("7) Salir del gestor");
        System.out.println();
        System.out.println("Elige la acción a realizar (1-7): ");

        //Preguntamos al usuario la acción y llamamos al método correspondiente
        do{opcion = teclado.nextLine();

            //controlamos que el usuario introduce un número válido y sino preguntamos otra vez
            if (!opcion.matches("[1-7]")) {
                System.out.println("El valor introducido no es correcto. Introduce un número entre 1-7");
            }
        } while (!opcion.matches("[1-7]"));

        switch (opcion) {
            case "1":
                anadirViaje();
                break;
            case "2":
                consultarViajes();
                break;
            case "3":
                anadirViajero();
                break;
            case "4":
                consultarViajero();
                break;
            case "5":
                anadirReserva();
                break;
            case "6":
                consultarReserva();
                break;
        }

    } while (!opcion.equals("7"));
}

    public void anadirViaje(){
        System.out.println("*****Añadir un viaje*****");
        System.out.println("Destino:");
        String destino = teclado.nextLine();
        System.out.println("Área:");
        String area = teclado.nextLine();
        System.out.println("Fecha del viaje (DD/MM/YYYY):");
        String fecha = teclado.nextLine();
        System.out.println("Plazas disponibles:");
        int plazas = teclado.nextInt();
        System.out.println("Precio:");
        float precio = teclado.nextFloat();

        Viaje viaje = new Viaje(destino.trim(), area.trim(), fecha.trim(), plazas, precio);
        listadoViajes.add(viaje);
    }

    public void anadirViajero(){
        System.out.println("*****Registrar un viajero*****");
        System.out.println("Nombre y apellidos:");
        String nombre = teclado.nextLine();
        System.out.println("Edad:");
        int edad = teclado.nextInt();
        System.out.println("Nacionalidad");
        String nacionalidad = teclado.nextLine();
        System.out.println("Ciudad:");
        String ciudad = teclado.nextLine();

        Viajero viajero = new Viajero(nombre.trim(), edad, nacionalidad.trim(), ciudad.trim());
        listadoViajeros.add(viajero);
    }

    public void anadirReserva(){
        System.out.println("*****Registrar reserva*****");
        System.out.println("Nombre reserva:");
        String nombre = teclado.nextLine();
        System.out.println("Nº viajes reservados:");
        int viajes = teclado.nextInt();
        System.out.println("Precio total de la reserva:");
        float precio = teclado.nextFloat();
        System.out.println("Cantidad depositada:");
        float deposito = teclado.nextFloat();
        System.out.println("Fecha de la reserva:");
        String fecha = teclado.nextLine();

        Reserva reserva = new Reserva(nombre.trim(), viajes, precio, deposito, fecha);
        listadoReservas.add(reserva);
    }

    public void consultarViajes(){

    }

    public void consultarViajero(){

    }

    public void consultarReserva(){

    }

    public void rellenarListados() {
        listadoViajes.add(new Viaje("Tailandia", "Asia", "01/05/2022", 15, 1100));
        listadoViajes.add(new Viaje("Nueva York", "Norteamérica", "15/05/2022", 15, 800));
        listadoViajeros.add(new Viajero("Ana García", 25, "Española", "Zaragoza"));
        listadoViajeros.add(new Viajero("Juan Castillo", 23, "Argentina", "Buenos Aires"));
        listadoReservas.add(new Reserva("Ada Piedrafita", 2, 1600, 200, "23/03/2022"));
        listadoReservas.add(new Reserva("Marcos Serrano", 3, 3300, 600, "24/03/2022"));
    }
}
