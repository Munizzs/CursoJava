
import java.util.HashMap;
import java.util.Map;


public class Maps {
    private static Map<Integer, Integer> numeros = new HashMap<>();
    
    private static void adicionar(int codigo, int numero) {
        numeros.put(codigo, numero);
    }

    private static void remover(int codigo) {
        numeros.remove(codigo);
    }

    private static void mostrar() {
        if (!numeros.isEmpty()) {
            
                System.out.println(numeros);

        }
    }

    public static void main(String[] args) {
        adicionar(10,1);
        adicionar(99,5);
        adicionar(2,20);
        adicionar(55,11);
        
        mostrar();
        
        remover(10);
        
        mostrar();
    }
}
