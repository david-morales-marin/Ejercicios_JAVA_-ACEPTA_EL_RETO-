package org.example;

import java.util.Scanner;

public class Ejercicio101{

    public static void main(String[] args) {

        int n;

        Scanner numeroDiabolico = new Scanner(System.in);
        System.out.println("Ingresa un número para formar el cuadro");
        n = numeroDiabolico.nextInt();

        int i_ant = 0;  // variable i temporal
        int j_ant = 0; // variable j temporal

        int punto_ini = n/2; // para el primer numero.
        // int punto_ini = n*n;

        int[][] matriz_magica = new int [n][n]; // creo la matriz magica

        int temp = 1; // lleva la cuenta de los numeros que se van adicionando a la matriz

        //lleno la matriz de ceros
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matriz_magica[i][j] = 0;
            }
        }

        int i = 0;
        int j = punto_ini; //valor de la mitad donde empieza la matriz

        while (temp != (n*n)+1){
            if(matriz_magica[i][j] == 0) {// valido posicion vacia
                matriz_magica[i][j] = temp;
            }else{
                i = i_ant +1;
                j = j_ant;
                matriz_magica[i][j]=temp;
            }

            i_ant = i;
            j_ant = j;

            temp++;
            j++;
            i--;
            if(i<0 && j==n){ // esquina superior derecha
                i = n -1;
                j = 0;
            }else if( i < 0){ // fila -1
                i = i + n;
            }else if(j==n){ //columna igual a n
                j = 0;
            }
        }

        for(int x=0;x<n;x++){
            //System.out.println(matriz_magica[x][0] + " " +matriz_magica[x][1] + " " +matriz_magica[x][2]+ " " +matriz_magica[x][3] + " " +matriz_magica[x][4]);
            System.out.println(matriz_magica[x][0] + " " +matriz_magica[x][1] + " " +matriz_magica[x][2]+ " " +matriz_magica[x][3] + " " +matriz_magica[x][4]+ " " +matriz_magica[x][5] + " " +matriz_magica[x][6]+ " " +matriz_magica[x][7]+ " " +matriz_magica[x][8]+ " " +matriz_magica[x][9]+ " " +matriz_magica[x][10]);
            //System.out.println(matriz_magica[x][0] + " " +matriz_magica[x][1] + " " +matriz_magica[x][2]);
        }

    }

}

