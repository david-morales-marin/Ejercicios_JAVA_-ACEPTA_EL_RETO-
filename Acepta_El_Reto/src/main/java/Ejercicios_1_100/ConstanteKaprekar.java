package Ejercicios_1_100;

import java.util.Arrays;
import java.util.Scanner;
import java.math.*;

public class ConstanteKaprekar {

    public static void main(String[] args) {

        int numero;
        int cantidadDigitos = 1;
        int numDigitos = 10;
        int numeroRecibe;

        Scanner numeroKaprekar = new Scanner(System.in);

        System.out.println("Ingrese un numero de 4 digitos: ");

        numeroRecibe = numeroKaprekar.nextInt();
        do{
            numero = numeroRecibe/numDigitos;
            if(numero>0){
                cantidadDigitos++;
                numDigitos = numDigitos*10;
            }
        }while(numero!=0);

        int [] myArray = new int [cantidadDigitos];
        int acum=numeroRecibe;

        for(int i=0; i<cantidadDigitos; i++){
             myArray[cantidadDigitos - i - 1] = acum%10;
             acum = acum/10;

        }
        acum = 0;

        for(int i=0; i<myArray.length-1;i++)
            for(int x=0; x<myArray.length-i-1; x++)
                if(myArray[x+1]>myArray[x]){
                    acum = myArray[x];
                    myArray[x]=myArray[x+1];
                    myArray[x+1]=acum;
                }


        int numdesc = 0;

        for(int i = 0; i<cantidadDigitos; i++)
            numdesc = numdesc + myArray[i]*(int)Math.pow(10,cantidadDigitos-1-i);

        System.out.println("EL numero descentente es: " + numdesc);

        do{
            numero = numeroRecibe/numDigitos;
            if(numero>0){
                cantidadDigitos++;
                numDigitos = numDigitos*10;
            }
        }while(numero!=0);

        int [] myArrayasc = new int [cantidadDigitos];
        int acumasc=numeroRecibe;

        for(int i=0; i<cantidadDigitos; i++){
            myArray[cantidadDigitos - i - 1] = acum%10;
            acum = acum/10;

        }
        acum = 0;

        for(int i=0; i<myArray.length-1;i++)
            for(int x=0; x<myArray.length-i-1; x++)
                if(myArray[x+1]>myArray[x]){
                    acum = myArray[x];
                    myArray[x]=myArray[x+1];
                    myArray[x+1]=acum;
                }


        int numdesc = 0;

        for(int i = 0; i<cantidadDigitos; i++)
            numdesc = numdesc + myArray[i]*(int)Math.pow(10,cantidadDigitos-1-i);
        System.out.println("EL numero descentente es: " + numdesc);
      }
    }
}