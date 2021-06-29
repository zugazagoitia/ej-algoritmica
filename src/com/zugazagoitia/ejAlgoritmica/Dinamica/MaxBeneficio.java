package com.zugazagoitia.ejAlgoritmica.Dinamica;

import com.zugazagoitia.ejAlgoritmica.Helpers;

public class MaxBeneficio implements Runnable {

	/*
		Consideremos el siguiente juego: disponemos de un tablero representado por una matriz de
		tamaño NxN. Inicialmente nos encontramos en la casilla de
		coordenadas (0,0), y nuestro objetivo es alcanzar la de coordenadas (N-1, N-1). Tenemos la
		opción de movernos a la casilla adyacente de la derecha o a la de abajo, pero nunca a la de la
		izquierda o a la de arriba. Algunas casillas están marcadas con un importe monetario que
		percibimos por transitar por ellas (un valor positivo si cobramos una recompensa o un valor
		negativo si tenemos que pagar un peaje). Además, algunas casillas del tablero son paredes por
		las que no es posible pasar. Deseamos conocer el beneficio máximo que nos reporta el mejor
		camino que transita desde la casilla de coordenadas (0,0) a la de coordenadas (N-1, N-1).
	 */

	public static int maxBeneficio(int[][] tablero) {
		//TODO

		return -1;
	}

	@Override
	public void run() {
		int p = Integer.MIN_VALUE;
		int[][] tablero = {
				{0, 0, p, 0, 0, 0, 0},
				{6, 2, p, p, p, p, 0},
				{-9, 0, p, 0, 0, p, 0},
				{3, 0, -3, 0, 0, p, 0},
				{0, 2, 6, 0, 1, 0, 0},
				{p, p, p, 0, 2, 0, 0},
				{0, 0, p, 0, 0, 0, 0}
		};
		Helpers.print2DArray(tablero);
		System.out.println(MaxBeneficio.maxBeneficio(tablero));
	}
}
