package EX7;

public class Main7 {
    public static void main(String[] args) {

        String[] Nomes = {"John Lennon",
                          "Paul McCartney",
                          "Michael Jackson",
                          "George harrison",
                           "Ringo Starr"};

        String Search = "Michael Jackson";

        String resultado = BuscaSequencial.Buscar(Nomes, Search);

        if (resultado != null) {
            System.out.println("O nome " + resultado + " Foi encontrado.");
        } else {
            System.out.println("O nome " + Search + " nao encontrado");
        }

    }
}
