package com.zugazagoitia.ejAlgoritmica;

import com.zugazagoitia.ejAlgoritmica.Backtracking.RepartoEquitativo;
import com.zugazagoitia.ejAlgoritmica.Dinamica.HaySuma;
import com.zugazagoitia.ejAlgoritmica.Dinamica.MaxBeneficio;
import com.zugazagoitia.ejAlgoritmica.DyV.ElementoEspecial;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Helpers.clearScreen();

        int num = 25;
        int[] numeros = Helpers.generateIntArray(num);

        System.out.println("Original");
        System.out.println(Arrays.toString(numeros));
        Helpers.shuffleArray(numeros);
        System.out.println("Shuffled");
        System.out.println(Arrays.toString(numeros));
        Helpers.mergeSort(numeros, 0, num - 1);
        System.out.println("Sorted");
        System.out.println(Arrays.toString(numeros));
        System.out.println("Shifted");
        Helpers.rotateArray(numeros,num,8);
        System.out.println(Arrays.toString(numeros));

        System.out.println();
        int[] vector = {10,10,10,7,3,8,2,9,1,2,2,2};
        System.out.println("Hay reparto equitativo en "+ Arrays.toString(vector) + " ? : "+ RepartoEquitativo.hayRepartoEquitativo(vector));


        System.out.println();
        int[] vector2 = {-10,-2,0,3,7,9,19,28,30,42,55};
        System.out.println("Elemento especial de "+Arrays.toString(vector2)+" en "+ ElementoEspecial.elementoEspecial(vector2));

        System.out.println();

        int[] a1 = {-5,-2,-9,-4,1,5,7,0,-3};
        int[] a2 = {8,-1,2,4,2,-2,1,0,1};
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(ElementoEspecial.check2pos(a1,a2,16));

        System.out.println();
        int[] set = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;

        System.out.println(Arrays.toString(set));
        System.out.println("Suma = "+sum);
        System.out.println("Memoria O(N\u0032)");
        System.out.println(HaySuma.haySuma(set,sum));

        System.out.println("\n");

        System.out.println(Arrays.toString(set));
        System.out.println("Suma = "+sum);
        System.out.println("Memoria O(N)");
        System.out.println(HaySuma.haySumaMemOpt(set,sum));

        System.out.println("\n");

        int p = Integer.MIN_VALUE;
        int[][] tablero = {
                {0,0,p,0,0,0,0},
                {6,2,p,p,p,p,0},
                {-9,0,p,0,0,p,0},
                {3,0,-3,0,0,p,0},
                {0,2,6,0,1,0,0},
                {p,p,p,0,2,0,0},
                {0,0,p,0,0,0,0}
        };
        Helpers.print2DArray(tablero);
        System.out.println(MaxBeneficio.maxBeneficio(tablero));

    }


}
