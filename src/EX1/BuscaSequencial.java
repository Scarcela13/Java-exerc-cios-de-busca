package EX1;

public class BuscaSequencial {
    public static int Buscar(int[] Vetor, int valor) {

        for (int i = 0; i < Vetor.length; i++) {
            if (Vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

}
