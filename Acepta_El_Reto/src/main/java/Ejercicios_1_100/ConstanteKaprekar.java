package Ejercicios_1_100;

import java.util.Arrays;
import java.util.Scanner;
import java.math.*;

public class ConstanteKaprekar {

    public static void main(String[] args) {

        int numero = 0;
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

        //   Arrays.sort(myArray);
       // int valorFinal = myArray[myArray.length - 1];
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


        int sum = 0;
        for(int i = 0; i<cantidadDigitos; i++)
            sum = sum + myArray[i]*(int)Math.pow(10,cantidadDigitos-1-i);
       // return sum;
        System.out.println("EL numero es: " + sum);
    }


}