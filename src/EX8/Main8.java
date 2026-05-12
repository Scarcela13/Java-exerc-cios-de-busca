package EX8;

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {

            System.out.println("Digite o nome do aluno:");
            String nome = sc.nextLine();

            System.out.println("Digite a matrícula:");
            int matricula = sc.nextInt();
            sc.nextLine();

            alunos[i] = new Aluno(nome, matricula);
        }


        Arrays.sort(alunos, (a, b) -> Integer.compare(a.matricula, b.matricula));

        System.out.println("\nAlunos ordenados:");

        for (Aluno a : alunos) {
            System.out.println(a.matricula + " - " + a.nome);
        }


        System.out.println("\nDigite a matrícula que deseja buscar:");
        int busca = sc.nextInt();

        int inicio = 0;
        int fim = alunos.length - 1;

        boolean encontrado = false;

        while (inicio <= fim) {

            int meio = (inicio + fim) / 2;

            if (alunos[meio].matricula == busca) {

                System.out.println("\nAluno encontrado:");
                System.out.println("Nome: " + alunos[meio].nome);
                System.out.println("Matrícula: " + alunos[meio].matricula);

                encontrado = true;
                break;
            }

            if (busca < alunos[meio].matricula) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        if (!encontrado) {
            System.out.println("Aluno não encontrado.");
        }

        sc.close();
    }
}