package com.zugazagoitia.ejAlgoritmica.Backtracking;

import com.zugazagoitia.ejAlgoritmica.Booleano;

public class RepartoEquitativo {
    public static boolean hayRepartoEquitativo(int[] bienes){
        int[] solucion = new int[bienes.length];
        Booleano exito = new Booleano(false);
        int suma = 0;
        for (int i:bienes) suma+=i;

        if (suma%3 != 0) exito.setValor(false);
        else hayRepartoEquitativo(bienes,suma,solucion,exito,0);

        return exito.getValor();
    }

    private static boolean esSolucion(int[] bienes, int suma, int[] solucion){
        int a=0,b=0,c=0;
        for (int i = 0; i < bienes.length; i++) {
            switch (solucion[i]) {
                case 0 -> a += bienes[i];
                case 1 -> b += bienes[i];
                case 2 -> c += bienes[i];
            }
        }
        return a==b && b==c && (a+b+c)==suma;
    }

    static private void hayRepartoEquitativo(int[] bienes, int suma, int[] solucion, Booleano exito, int nivel){
        if(nivel==bienes.length) exito.setValor(esSolucion(bienes,suma,solucion));
        else {
            int c = 0;
            while (!exito.getValor() && c<3){
                solucion[nivel]=c;
                nivel++;
                hayRepartoEquitativo(bienes,suma,solucion,exito,nivel);
                if(!exito.getValor()){
                    nivel--;
                }
                c++;
            }

        }

    }
}
