
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Predicates {
    //Predicate<T>
    //Aceira argumentos e retorna  um valor do T tipo boolean.
    
    public static void main(String[] args) {
        List<String> Linguagens = Arrays.asList("Java","C","Python","C#");
        
        Predicate<String> tamanho = (l) -> l.length()>3;
        
        Linguagens.stream()
                .filter(tamanho) //Filtra as palvras que derem true.
                .forEach(System.out::println);                
    }
}
