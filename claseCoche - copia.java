package com.open_bootcamp;

public class claseCoche {
   public static void main(String[] args){
         Coche miCoche = new Coche();
         miCoche.QuitarPuerta();
         System.out.println(miCoche.puertas);
   }
}
class Coche{
    public int puertas = 5;

    public void QuitarPuerta(){
        this.puertas ++;
    }
}
