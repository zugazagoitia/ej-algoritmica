import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        clearScreen();

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
        System.out.println("Elemento especial de "+Arrays.toString(vector2)+" en "+ DivideAndConquer.elementoEspecial(vector2));

        System.out.println();
/*        int[] a1 = Helpers.generateRandomIntArray(15,-5,20);
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
        }
        int[] a2 = Helpers.generateRandomIntArray(15,-5,20);*/

        int[] a1 = {-5,-2,-9,-4,1,5,7,0,-3};
        int[] a2 = {8,-1,2,4,2,-2,1,0,1};
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(DivideAndConquer.check2pos(a1,a2,16));



    }


    public static void clearScreen() {
        for (int i = 0; i < 50; ++i) System.out.println();
    }


}
