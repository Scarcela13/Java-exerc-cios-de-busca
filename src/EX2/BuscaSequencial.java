package EX2;

public class BuscaSequencial {

    public static String Buscar(int[] Vetor, int Valor) {

        String respostinha = "";
        boolean encontrado = false;

        for (int i = 0; i < Vetor.length; i++) {

            if (Vetor[i] == Valor) {
                respostinha += "Valor " + Valor + " encontrado na posição " + i + "\n";
                encontrado = true;
            }
        }

        if (!encontrado) {
            respostinha = "Número não encontrado!";
        }

        return respostinha;
    }
}