
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperators {
    //BinaryOperator  combina dois argumentos do tipo T e retorna o resultado do mesmo tipo.
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        
        BinaryOperator<Integer> somar = (n1,n2) -> n1+n2;
        
        int resultado = numbers.stream()
                .reduce(0, somar);
                
        
        System.out.println("A soma é: "+resultado);
    }
}
