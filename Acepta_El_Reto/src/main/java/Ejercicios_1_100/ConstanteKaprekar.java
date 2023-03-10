package Ejercicios_1_100;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.math.*;

public class ConstanteKaprekar {

    public static void main(String[] args) {

        int numeroRecibe;
        int iteracion = 1;
        int acumTotal;
        Scanner numeroKaprekar = new Scanner(System.in);
        System.out.println("Elige un número de cuatro dígitos que tenga al menos dos diferentes (es válido colocar el dígito 0 al principio, por lo que el número 0009 es válido): ");
        numeroRecibe = numeroKaprekar.nextInt();

             if(numeroRecibe == 6174){

                 System.out.println(0);

             } else if(numeroRecibe == 0000 | numeroRecibe == 1111 | numeroRecibe == 2222 |
                       numeroRecibe == 3333 | numeroRecibe == 4444 | numeroRecibe == 5555 |
                       numeroRecibe == 6666 | numeroRecibe == 7777 | numeroRecibe == 8888 |
                       numeroRecibe == 9999){
                 System.out.println(8);
             }

             else  if (numeroRecibe != 6174) {

                 while (numeroRecibe != 6174) {
                     numeroRecibe = calcular(numeroRecibe);
                     iteracion++;
                 }
                 System.out.println(iteracion - 1);

             }

    }


    public static int calcular(int numeroRecibe) {
        int numero;
        int cantidadDigitos = 1;
        int numDigitos = 10;
        int valorFinal;

        do {
            numero = numeroRecibe / numDigitos;
            if (numero > 0) {
                cantidadDigitos++;
                numDigitos = numDigitos * 10;
            }
        } while (numero != 0);

        int[] myArray = new int[cantidadDigitos];
        int acum = numeroRecibe;

        for (int i = 0; i < cantidadDigitos; i++) {
            myArray[cantidadDigitos - i - 1] = acum % 10;
            acum = acum / 10;

        }
        acum = 0;

        for (int i = 0; i < myArray.length - 1; i++)
            for (int x = 0; x < myArray.length - i - 1; x++)
                if (myArray[x + 1] > myArray[x]) {
                    acum = myArray[x];
                    myArray[x] = myArray[x + 1];
                    myArray[x + 1] = acum;
                }

        int numdesc = 0;

        for (int i = 0; i < cantidadDigitos; i++)
            numdesc = numdesc + myArray[i] * (int) Math.pow(10, cantidadDigitos - 1 - i);

        int numasc = 0;
        Arrays.sort(myArray);
        for (int i = 0; i < myArray.length; i++)
            numasc = numasc + myArray[i] * (int) Math.pow(10, cantidadDigitos - 1 - i);

        valorFinal = numdesc - numasc;

        return valorFinal;
    }
}