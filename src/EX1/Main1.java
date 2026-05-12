package EX1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Numeros = new int[80];

        for (int i = 0; i < Numeros.length; i++) {
            Numeros[i] = i;
        }


        System.out.println("Qual número você quer buscar de 1 a 80?");
        int Search = sc.nextInt();

        int resultado = BuscaSequencial.Buscar(Numeros, Search);

        if (resultado != -1) {
            System.out.println("Número " + Search +" se encontra na posição: " + resultado);
        } else {
            System.out.println("O número " + Search + " não se encontra na lista.");
        }
    }
}
