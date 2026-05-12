package EX5;

public class BuscaBinaria {
    public static int Buscar(int[]Vetor, int Valor) {

        int inicio = 0;
        int fim = Vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (Vetor[meio] == Valor) {
                return meio;
            } else if (Vetor[meio] < Valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}
