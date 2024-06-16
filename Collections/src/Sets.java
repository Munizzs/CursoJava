
import java.util.HashSet;
import java.util.Set;

public class Sets {

    private static Set<Integer> numeros = new HashSet<>();

    private static void adicionar(int numero) {
        numeros.add(numero);
    }

    private static void remover(int posicao) {
        numeros.remove(posicao);
    }

    private static void mostrar() {
        if (!numeros.isEmpty()) {
            System.out.print("|");
            for (int mostrar : numeros) {
                System.out.printf(" %d ", mostrar);
            }
            System.out.print("|");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        adicionar(10);
        adicionar(99);
        adicionar(2);
        adicionar(55);
        
        mostrar();
        
        remover(10);
        
        mostrar();
    }
}
