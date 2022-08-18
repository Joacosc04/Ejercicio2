package com.openbootcamp;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcular el IVA de un precio");
        int precio = scanner.nextInt();
        System.out.println(precioConIVA(precio));
    }
    public static double precioConIVA(int precio){
        return (precio/100) * 121;
    }
}
