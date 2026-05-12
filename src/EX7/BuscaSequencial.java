package EX7;

public class BuscaSequencial {
    public static String Buscar (String[] Vetor, String Valor){

        for (int i = 0; i < Vetor.length; i++){
            if (Valor.equalsIgnoreCase(Vetor[i])){
                return Vetor[i];
            }
        }
        return null;
    }
}
