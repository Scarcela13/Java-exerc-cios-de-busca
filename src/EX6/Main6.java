package EX6;

public class Main6 {

    public static void main(String[] args) {

        int[] numeros = new int[1000];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }

        int valorBusca = 500;

        int resultadoS = BuscaSequencial.Buscar(numeros, valorBusca);
        int resultadoB = BuscaBinaria.Buscar(numeros, valorBusca);

        System.out.println("Busca Sequencial: " + resultadoS + " comparações");
        System.out.println("Busca Binária: " + resultadoB + " comparações");
    }
}