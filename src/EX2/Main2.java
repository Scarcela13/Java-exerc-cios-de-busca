package EX2;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] Vetorzao = {
                10, 20, 30, 40, 50, 20, 60, 70, 80, 90,
                15, 25, 35, 45, 55, 25, 65, 75, 85, 95,
                10, 20, 30, 40, 50, 20, 60, 70, 80, 90,
                15, 25, 35, 45, 55, 25, 65, 75, 85, 95,
                10, 20, 30, 40, 50, 20, 60, 70, 80, 90,
                15, 25, 35, 45, 55, 25, 65, 75, 85, 95,
                10, 20, 30, 40, 50, 20, 60, 70, 80, 90,
                15, 25, 35, 45, 55, 25, 65, 75, 85, 95
        };

        System.out.println("Qual número você quer procurar?");
        int Search = sc.nextInt();

        String resultado = BuscaSequencial.Buscar(Vetorzao, Search);

        System.out.println(resultado);

        sc.close();
    }
}