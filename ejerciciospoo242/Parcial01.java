package ejerciciospoo242;

import java.util.Scanner;
//yeims Jiliber silva soto

public class Parcial01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ingreso del número de habitaciones
        System.out.println("Ingrese el número de habitaciones: ");
        int Habitaciones = sc.nextInt();

        // Matriz para almacenar el consumo de cada habitación durante 7 días
        double[][] Nhabitaciones = new double[Habitaciones][7];

        // Llenado de la matriz con consumos aleatorios según el día de la semana
        for (int i = 0; i < Habitaciones; i++) {
            // Lunes, Martes y Jueves (consumo entre 30 y 80 kWh)
            Nhabitaciones[i][0] = 30 + Math.random() * 50; // Lunes
            Nhabitaciones[i][1] = 30 + Math.random() * 50; // Martes
            Nhabitaciones[i][3] = 30 + Math.random() * 50; // Jueves

            // Miércoles (consumo entre 40 y 100 kWh)
            Nhabitaciones[i][2] = 40 + Math.random() * 60; // Miércoles

            // Fin de semana (viernes, sábado, domingo) con 20% de incremento respecto al lunes
            Nhabitaciones[i][4] = Nhabitaciones[i][0] * 1.2; // Viernes
            Nhabitaciones[i][5] = Nhabitaciones[i][0] * 1.2; // Sábado
            Nhabitaciones[i][6] = Nhabitaciones[i][0] * 1.2; // Domingo
        }

        // Impresión de los consumos por habitación y día
        for (int i = 0; i < Habitaciones; i++) {
            System.out.println("Consumo para la Habitación " + (i + 1));
            for (int j = 0; j < 7; j++) {
                System.out.println("Día " + j + ": " + Nhabitaciones[i][j] + " kWh");
            }
        }

        // Consulta de una habitación específica
        System.out.println("Ingrese el número de la habitación que desea ver: ");
        int ELNHabitaciones = sc.nextInt() - 1;

        if (ELNHabitaciones >= 0 && ELNHabitaciones < Habitaciones) {
            System.out.println("Reporte de consumo para la Habitación N" + (ELNHabitaciones + 1));
            System.out.println("Consumo Lunes: " + Nhabitaciones[ELNHabitaciones][0] + " kWh");
            System.out.println("Consumo Martes: " + Nhabitaciones[ELNHabitaciones][1] + " kWh");
            System.out.println("Consumo Miércoles: " + Nhabitaciones[ELNHabitaciones][2] + " kWh");
            System.out.println("Consumo Jueves: " + Nhabitaciones[ELNHabitaciones][3] + " kWh");
            System.out.println("Consumo Viernes: " + Nhabitaciones[ELNHabitaciones][4] + " kWh");
            System.out.println("Consumo Sábado: " + Nhabitaciones[ELNHabitaciones][5] + " kWh");
            System.out.println("Consumo Domingo: " + Nhabitaciones[ELNHabitaciones][6] + " kWh");
        } else {
            System.out.println("Número de habitación inválido.");
        }

        // Cálculo del consumo total y promedio por habitación
        for (int i = 0; i < Habitaciones; i++) {
            double totalConsumo = 0;
            for (int j = 0; j < 7; j++) {
                totalConsumo += Nhabitaciones[i][j];
            }
            double promedio = totalConsumo / 7;
            System.out.println("El consumo total de la Habitación " + (i + 1) + " es: " + totalConsumo + " kWh");
            System.out.println("El consumo promedio de la Habitación " + (i + 1) + " es: " + promedio + " kWh");
        }

        // Determinar la habitación que más y menos consume
        double maxConsumo = 0;
        double minConsumo = Double.MAX_VALUE;
        int habitacionMax = -1;
        int habitacionMin = -1;

        for (int i = 0; i < Habitaciones; i++) {
            double totalConsumo = 0;
            for (int j = 0; j < 7; j++) {
                totalConsumo += Nhabitaciones[i][j];
            }
            if (totalConsumo > maxConsumo) {
                maxConsumo = totalConsumo;
                habitacionMax = i + 1;
            }
            if (totalConsumo < minConsumo) {
                minConsumo = totalConsumo;
                habitacionMin = i + 1;
            }
        }

        System.out.println("La habitación que más consume es la " + habitacionMax + " con " + maxConsumo + " kWh.");
        System.out.println("La habitación que menos consume es la " + habitacionMin + " con " + minConsumo + " kWh.");
    }
}