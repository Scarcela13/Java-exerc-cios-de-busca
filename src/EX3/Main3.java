package EX3;

public class Main3 {
    public static void main(String[] args) {

        int[] Vetorzao = { 10, 20, 33, 35, 36, 38, 40, 50, 56};

        int resultado = BuscaBinaria.Buscar(Vetorzao, 780);

        if (resultado != -1) {
            System.out.println("Elemento encontrado no índice " + resultado);
        } else {
            System.out.println("Não tem");
        }
    }
}
