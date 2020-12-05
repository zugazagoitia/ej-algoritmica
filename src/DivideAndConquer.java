public class DivideAndConquer {
    public static int elementoEspecial(int[] vector){
        return elementoEspecial(vector,0,vector.length-1);
    }

    private static int elementoEspecial(int[] vector, int i0, int iN){
        if(iN==i0) return i0 == vector[i0] ? i0 : -1;
        else{
            int k = (iN+i0) /2;
            if (vector[k]<k) return elementoEspecial(vector,k+1,iN);
            else return elementoEspecial(vector,i0,k);
        }
    }

    public static boolean check2pos(int[] vector1, int[] vector2, int v){
        Helpers.mergeSort(vector2);
        boolean exito = false;
        int i = 0;
        while (!exito && i<vector1.length){
            exito = check2pos(vector2,vector1[i],v,0,vector2.length-1);
            i++;
        }
        return exito;
    }

    private static boolean check2pos(int[] vector, int elemento, int v, int i0, int iN){
        if(i0==iN)
            return vector[i0]+elemento == v;
        else {
            int k = (i0+iN)/2;
            if (vector[k]+elemento < v) return check2pos(vector,elemento,v,k+1,iN);
            else return check2pos(vector,elemento,v,i0,k);
        }
    }
}
