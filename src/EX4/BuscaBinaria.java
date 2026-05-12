package EX4;

public class BuscaBinaria {
    public static int Buscar(int[] Vetor, int Valor) {

        int inicio = 0;
        int fim = Vetor.length - 1;

        for (int i = 0; i <= fim; i++) {
            int meio = (inicio + fim) / 2;

            if (Vetor[meio] == Valor) {
                return meio;
            } else if (Vetor[meio] < Valor) {
                inicio = meio + 1;
            } else {
                fim = meio -1;
            }
        }
        return -1;
    }
}
