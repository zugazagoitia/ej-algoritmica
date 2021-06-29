package com.zugazagoitia.ejAlgoritmica.Dinamica;

import com.zugazagoitia.ejAlgoritmica.Helpers;

import java.util.Arrays;

public class HaySuma implements Runnable {

  /*  Diseñar e implementar el método public boolean haySuma(int[] valores, int v) en Java
      basado en el esquema de programación dinámica, que permita determinar si, dado
      un conjunto de números enteros positivos mayores que 0, existe un subconjunto que
      sume el valor V. Por ejemplo, dado el vector valores = {5, 8, 7, 1, 3, 1} y el valor v=10,
      el algoritmo debería devolver true; dado el vector valores = {5, 8, 7, 2, 3} y el valor
      v=21, el algoritmo debería devolver false.
  */


	public static boolean haySuma(int[] valores, int v) {
		int n = valores.length;

		boolean[][] dp = new boolean[n + 1][v + 1];

		for (int i = 0; i < n + 1; i++) {
			dp[i][0] = true;
		}
		for (int i = 1; i < v + 1; i++) {
			dp[0][i] = false;
		}

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < v + 1; j++) {
				dp[i][j] = dp[i - 1][j];
				if (j >= valores[i - 1])
					dp[i][j] = dp[i][j] || dp[i - 1][j - valores[i - 1]];
			}
		}
		Helpers.print2DArray(dp);
		return dp[n][v];
	}

	public static boolean haySumaMemOpt(int[] valores, int v) {
		int n = valores.length;

		boolean[][] dp = new boolean[2][v + 1];

		for (int i = 0; i < 2; i++) {
			dp[i][0] = true;
		}
		for (int i = 1; i < v + 1; i++) {
			dp[0][i] = false;
		}

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < v + 1; j++) {
				dp[i % 2][j] = dp[(i - 1) % 2][j];
				if (j >= valores[i - 1])
					dp[i % 2][j] = dp[i % 2][j] || dp[(i - 1) % 2][j - valores[i - 1]];
			}
		}
		Helpers.print2DArray(dp);
		return dp[1][v];
	}

	@Override
	public void run() {

		int[] set = {3, 34, 4, 12, 5, 2};
		int sum = 9;

		System.out.println(Arrays.toString(set));
		System.out.println("Suma = " + sum);
		System.out.println("Memoria O(N\u0032)");
		System.out.println(HaySuma.haySuma(set, sum));

		System.out.println("\n");

		System.out.println(Arrays.toString(set));
		System.out.println("Suma = " + sum);
		System.out.println("Memoria O(N)");
		System.out.println(HaySuma.haySumaMemOpt(set, sum));

	}
}
