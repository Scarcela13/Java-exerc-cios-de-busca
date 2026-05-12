package EX6;

public class BuscaSequencial {

    public static int Buscar(int[] Vetor, int Valor) {

        int comparacoes = 0;

        for (int i = 0; i < Vetor.length; i++) {

            comparacoes++;

            if (Valor == Vetor[i]) {
                return comparacoes;
            }
        }

        return comparacoes;
    }
}