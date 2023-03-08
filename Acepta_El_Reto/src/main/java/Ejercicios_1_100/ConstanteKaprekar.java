package Ejercicios_1_100;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.math.*;

public class ConstanteKaprekar {

    public static void main(String[] args) {

        int numero;
        int cantidadDigitos = 1;
        int numDigitos = 10;
        int numeroRecibe;
        int valorFinal;
        Scanner numeroKaprekar = new Scanner(System.in);

        System.out.println("Ingrese un numero de 4 digitos: ");

        numeroRecibe = numeroKaprekar.nextInt();
       // if(  valorFinal = 6174){
         //   System.out.println();
       // }
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

            //   System.out.println("EL número descentente es: " + numdesc);
            //  System.out.println("EL número ascendente es: " + numasc);

                 valorFinal = numdesc - numasc;
              //   valorFinal++;
             System.out.println( numdesc + " - " + numasc + " = " + valorFinal);


      }
    }
