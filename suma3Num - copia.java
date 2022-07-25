package com.open_bootcamp;

public class TP {
    public static void main(String[] args){
        int param1 = 3;
        int param2 = 5;
        int param3 = 7;

        int resultado = suma(param1, param2, param3);

        System.out.println(resultado);
    }
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}
