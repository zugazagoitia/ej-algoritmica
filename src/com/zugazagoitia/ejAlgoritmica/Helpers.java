package com.zugazagoitia.ejAlgoritmica;

import java.util.Random;
import java.util.stream.IntStream;

public class Helpers {
	public static int[] generateIntArray(int size) {
		int[] numeros = new int[size];
		int min = -size / 2;
		for (int i = 0; i < size; i++) {
			numeros[i] = min;
			min++;
		}
		return numeros;
	}

	public static int[] generatePositiveIntArray(int size) {

		int[] numeros = new int[size];
		int min = 5;
		for (int i = 0; i < size; i++) {
			numeros[i] = min;
			min++;
		}
		return numeros;
	}

	public static int[] generateRandomIntArray(int size, int min, int max) {

		int bound = Math.abs(max - min);
		return IntStream.generate(() -> new Random().nextInt(bound) + min).limit(size).toArray();
	}

	public static void shuffleArray(int[] array) {
		int index, temp;
		Random random = new Random();
		for (int i = array.length - 1; i > 0; i--) {
			index = random.nextInt(i + 1);
			temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
	}

	public static void rotateArray(int[] input, int lenght, int rotations) {
		if (rotations >= 0) {
			rotateRight(input, lenght, rotations);
		} else {
			rotateLeft(input, lenght, -rotations);
		}
	}

	private static int[] rotateLeft(int[] input, int length, int numOfRotations) {
		for (int i = 0; i < numOfRotations; i++) {

			// take out the first element
			int temp = input[0];
			for (int j = 0; j < length - 1; j++) {

				// shift array elements towards left by 1 place
				input[j] = input[j + 1];
			}
			input[length - 1] = temp;
		}
		return input;
	}

	private static int[] rotateRight(int[] input, int length, int numOfRotations) {
		for (int i = 0; i < numOfRotations; i++) {

			// take out the last element
			int temp = input[length - 1];
			for (int j = length - 1; j > 0; j--) {

				// shift array elements towards right by one place
				input[j] = input[j - 1];
			}
			input[0] = temp;
		}
		return input;
	}

	public static void mergeSort(int[] vector) {
		mergeSort(vector, 0, vector.length - 1);
	}

	public static void mergeSort(int[] vector, int i0, int iN) {
		if (i0 < iN) {
			int k = (i0 + iN) / 2;
			mergeSort(vector, i0, k);
			mergeSort(vector, k + 1, iN);
			merge(vector, i0, k, iN);
		}
	}

	private static void merge(int[] vector, int i0, int k, int iN) {
		int i = i0;
		int d = k + 1;
		int[] aux = new int[iN - i0 + 1];
		int f = 0;
		while (i <= k && d <= iN) {
			if (vector[i] <= vector[d]) {
				aux[f] = vector[i];
				i++;

			} else {
				aux[f] = vector[d];
				d++;
			}
			f++;
		}
		for (int j = i; j <= k; j++) {
			aux[f] = vector[j];
			f++;
		}
		for (int j = d; j <= iN; j++) {
			aux[f] = vector[j];
			f++;
		}
		for (int a = 0; a < aux.length; a++) {
			vector[i0 + a] = aux[a];
		}
	}

	public static void print2DArray(boolean[][] arr) {
		System.out.print(" \t");
		for (int i = 0; i < arr[0].length; i++) {
			System.out.printf("%d\t", i);
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t", i);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%c\t", arr[i][j] ? 'T' : 'F');
			}
			System.out.println();
		}
	}
	public static void print2DArray(int[][] arr) {
		System.out.print(" \t");
		for (int i = 0; i < arr[0].length; i++) {
			System.out.printf("%d\t", i);
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t", i);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void clearScreen() {
		for (int i = 0; i < 50; ++i) System.out.println();
	}

	public static void pressEnterToContinue() {
		System.out.println("\n Press Enter key to continue...");
		try {
			System.in.read();
		} catch (Exception e) {
		}
	}

}
