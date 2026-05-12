package EX5;

import EX3.BuscaBinaria;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {

        int[] numeros = { 10, 20, 2, 395, 11, 50, 34};

        System.out.println("Array desordenado");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println(" ");

        Arrays.sort(numeros);

        System.out.println("Array ordenado");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(" ");

        int resultado = BuscaBinaria.Buscar(numeros, 20);

        if (resultado != -1) {
            System.out.println("Elemento encontrado no índice " + resultado);
        } else {
            System.out.println("Não encontrado.");
        }
    }
}
