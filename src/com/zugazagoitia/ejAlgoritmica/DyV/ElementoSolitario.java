package com.zugazagoitia.ejAlgoritmica.DyV;

import java.util.Arrays;

public class ElementoSolitario implements Runnable {


	int elementoSolitario(int[] vector) {
		if (vector.length % 2 == 0) return -1;
		else return elementoSolitario(vector, 0, vector.length - 1);
	}

	private int elementoSolitario(int[] vector, int i0, int iN) {
		if (iN == i0) return vector[i0];
		else {
			int k = (iN + i0) / 2;
			if (vector[k] == vector[k - 1]) {
				if ((i0 + 1 - k - 2) % 2 == 0) return elementoSolitario(vector, k + 1, iN);
				else return elementoSolitario(vector, i0, k - 2);
			} else if (vector[k] == vector[k + 1]) {
				if ((i0 + 1 - k - 1) % 2 == 0) return elementoSolitario(vector, k + 2, iN);
				else return elementoSolitario(vector, i0, k - 1);
			} else return vector[k];
		}
	}

	@Override
	public void run() {
		int[] v = {0, 0, 1, 1, 3, 4, 4, 5, 5, 7, 7, 8, 8, 9, 9, 10, 10};
		System.out.println("El elemento solitario para el vector " + Arrays.toString(v) + " es " + elementoSolitario(v));
	}
}
