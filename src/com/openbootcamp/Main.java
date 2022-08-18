package com.openbootcamp;

public class Main {
    public static void main(String[] args){
        System.out.println(precioConIVA(265));
    }
    public static int precioConIVA(int precio){
        return (precio/100) * 121;
    }
}
