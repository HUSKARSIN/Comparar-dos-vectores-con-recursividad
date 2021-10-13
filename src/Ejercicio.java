public class Ejercicio {
    //invertircadena de texto "recursivo = dadivisrucer"
    private static String invertirCadena(String cadena, int indice){
        String inversa;
        if (indice == 0 ) {//caso base
            inversa = String.valueOf(cadena.charAt(indice));
        }else { //llamada recursiva
           inversa = String.valueOf(cadena.charAt(indice)) + invertirCadena(cadena,indice-1);
        }
        return inversa;
    }
    //metodo auxiliar que llama al metodo recursivo
    public static String invertirCadena(String cadena){
        return invertirCadena(cadena, cadena.length() -1);
    }
    /*
    metodo recurvo para comparar 2 vectores elemto por elemento
    vec1 = {5,6,2}
    vec2 = {2,9,2}
    diferen = 3 + 3 + 0 = 6
     */
    private static int compararVectores(int[] vector1, int[]  vector2, int indice){
        int sumaDiferencias;
        if (indice == vector1.length - 1){//caso base
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]);
        }else {//llamada recurciva
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]) + compararVectores(vector1, vector2, indice + 1);
        }
        return sumaDiferencias;
    }
    /*
    metodo auxliar al metodo recursivo
     */
    public static boolean compararVectores(int[] vector1, int[]  vector2){
        return compararVectores(vector1,vector2,0) == 0;
    }
}
