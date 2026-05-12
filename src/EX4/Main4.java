package EX4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] numeros = new int[6];

        System.out.println("Preencha 6 espaços de vetores inteiros.");

        for (int i = 0; i < numeros.length; i++) {
            int aux = sc.nextInt();
            numeros[i] = aux;
        }


        System.out.println("");
        System.out.println("Verificando se está em ordem");
        System.out.println("");

        int aux = numeros.length - 1;
        boolean ordenado = false;

        for (int i = 0; i < aux; i++) {
            int prox = i + 1;
            if (numeros[i] < numeros[prox]) {
                ordenado = true;
            } else {
                ordenado = false;
            }
        }

        if (ordenado == false) {
            System.out.println("Não está ordenado.");
        } else {
            System.out.println("");
            System.out.println("Seu vetor ordenado:");
            System.out.println("");

            for (int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i]);
            }
        }


    }
}
