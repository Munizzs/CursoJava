
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class Lists implements Comparator {
    
    private static List<Integer> numeros =new ArrayList<>();
    
    private static void adicionar(int numero){
        numeros.add(numero);
    }
    
    private static void remover(int posicao){
        numeros.remove(posicao);
    }
    
    private static void mostrar(){
        System.out.print("|");
        for(int mostrar:numeros){
            System.out.printf(" %d ",mostrar);
        }
        System.out.print("|");
        System.out.println("");
    }
    
    private static void alterar(int posicao, int numero){
        numeros.set(posicao, numero);
    }
    
    public static void main(String[] args) {   
        adicionar(5);
        adicionar(10);
        adicionar(1);
        adicionar(55);
        adicionar(12);
        adicionar(15);
        
        mostrar();
        
        remover(0);
        
        mostrar();
        
        alterar(0,90);
        
        mostrar();     
        
        Collections.sort(numeros);
        
        mostrar(); 
    }

    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
