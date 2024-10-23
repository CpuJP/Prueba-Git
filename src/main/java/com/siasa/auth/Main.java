package com.siasa.auth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println(String.format("Su nombre es %s", nombre));
         System.out.println("Prueba fetch remoto");
    }
}
