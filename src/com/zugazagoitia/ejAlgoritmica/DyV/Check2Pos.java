package com.zugazagoitia.ejAlgoritmica.DyV;

import com.zugazagoitia.ejAlgoritmica.Helpers;

import java.util.Arrays;

public class Check2Pos implements Runnable {

	public static boolean check2pos(int[] vector1, int[] vector2, int v) {
		Helpers.mergeSort(vector2);
		boolean exito = false;
		int i = 0;
		while (!exito && i < vector1.length) {
			exito = check2pos(vector2, vector1[i], v, 0, vector2.length - 1);
			i++;
		}
		return exito;
	}

	private static boolean check2pos(int[] vector, int elemento, int v, int i0, int iN) {
		if (i0 == iN)
			return vector[i0] + elemento == v;
		else {
			int k = (i0 + iN) / 2;
			if (vector[k] + elemento < v) return check2pos(vector, elemento, v, k + 1, iN);
			else return check2pos(vector, elemento, v, i0, k);
		}
	}

	@Override
	public void run() {
		int[] a1 = {-5, -2, -9, -4, 1, 5, 7, 0, -3};
		int[] a2 = {8, -1, 2, 4, 2, -2, 1, 0, 1};
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));

		System.out.println("Para v=-1\t " + check2pos(a1, a2, -1));
		System.out.println("Para v=10\t " + check2pos(a1, a2, 10));


	}
}
