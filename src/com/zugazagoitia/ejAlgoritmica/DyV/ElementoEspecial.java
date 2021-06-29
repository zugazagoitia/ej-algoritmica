package com.zugazagoitia.ejAlgoritmica.DyV;

import com.zugazagoitia.ejAlgoritmica.Helpers;

import java.util.Arrays;

public class ElementoEspecial implements Runnable {
    public static int elementoEspecial(int[] vector) {
        return elementoEspecial(vector, 0, vector.length - 1);
    }

    private static int elementoEspecial(int[] vector, int i0, int iN) {
        if (iN == i0) return i0 == vector[i0] ? i0 : -1;
        else {
            int k = (iN + i0) / 2;
            if (vector[k] < k) return elementoEspecial(vector, k + 1, iN);
            else return elementoEspecial(vector, i0, k);
        }
    }


    @Override
    public void run() {
        int[] vector2 = {-10, -2, 0, 3, 7, 9, 19, 28, 30, 42, 55};
        System.out.println("Elemento especial de " + Arrays.toString(vector2) + " en " + ElementoEspecial.elementoEspecial(vector2));
    }
}
