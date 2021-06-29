package com.zugazagoitia.ejAlgoritmica;

import com.zugazagoitia.ejAlgoritmica.Backtracking.RepartoEquitativo;
import com.zugazagoitia.ejAlgoritmica.Dinamica.HaySuma;
import com.zugazagoitia.ejAlgoritmica.Dinamica.MaxBeneficio;
import com.zugazagoitia.ejAlgoritmica.DyV.Check2Pos;
import com.zugazagoitia.ejAlgoritmica.DyV.ElementoEspecial;
import com.zugazagoitia.ejAlgoritmica.DyV.ElementoSolitario;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int eleccion;
		Scanner scanner = new Scanner(System.in);
		do {
			Helpers.clearScreen();
			printMenu();
			eleccion = scanner.nextInt();
			Helpers.clearScreen();
			switch (eleccion) {
				case 0:
					break;
				case 1:
					runner(RepartoEquitativo.class);
					Helpers.pressEnterToContinue();
					break;
				case 5:
					runner(ElementoEspecial.class);
					Helpers.pressEnterToContinue();
					break;
				case 6:
					runner(ElementoSolitario.class);
					Helpers.pressEnterToContinue();
					break;
				case 7:
					runner(Check2Pos.class);
					Helpers.pressEnterToContinue();
					break;
				case 13:
					runner(HaySuma.class);
					Helpers.pressEnterToContinue();
					break;
				case 14:
					runner(MaxBeneficio.class);
					Helpers.pressEnterToContinue();
					break;
				default:
					System.out.println("Opción desconocida");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException interruptedException) {
						interruptedException.printStackTrace();
					}


			}
		} while (eleccion != 0);

	}

	private static void printMenu() {

		System.out.println("Escoge el ejercicio:\n");
		System.out.println("Backtracking");
		System.out.println("\t1. Reparto Equitativo");
		System.out.println("\t2. ");
		//System.out.println("\t3. ");
		//System.out.println("\t4. ");
		System.out.println("Divide y Vencerás");
		System.out.println("\t5. Elemento Especial");
		System.out.println("\t6. Elemento Solitario");
		System.out.println("\t7. Check2Pos");
		//System.out.println("\t8. ");
		System.out.println("Voraces");
		System.out.println("\t9. ");
//        System.out.println("\t10. ");
//        System.out.println("\t11. ");
//        System.out.println("\t12. ");
		System.out.println("Programación Dinámica");
		System.out.println("\t13. Hay Suma");
		System.out.println("\t14. Máximo Beneficio");
//        System.out.println("\t15. ");
//        System.out.println("\t16. ");

		System.out.println("\n 0. Salir");

	}

	public static void runner(Class c) {
		try {
			Object ob = c.getDeclaredConstructor().newInstance();
			((Runnable) ob).run();
		} catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException ex) {
			ex.printStackTrace();
		}
	}
}

