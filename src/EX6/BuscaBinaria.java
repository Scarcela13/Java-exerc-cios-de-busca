package EX6;

public class BuscaBinaria {

    public static int Buscar(int[] Vetor, int Valor) {

        int inicio = 0;
        int fim = Vetor.length - 1;

        int comparacoes = 0;

        while (inicio <= fim) {

            comparacoes++;

            int meio = (inicio + fim) / 2;

            if (Vetor[meio] == Valor) {
                return comparacoes;
            }

            if (Vetor[meio] > Valor) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        return comparacoes;
    }
}