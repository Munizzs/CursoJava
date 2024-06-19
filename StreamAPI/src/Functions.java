
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class Functions {
    //Function<T,S>
    //É utilizado para tranformar ou mapear outros elementos do Stream em outros valores ou tipos.
    
    private static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {

        Function<Integer, Double> decimais = (numbers) -> numbers*2.5;
        //Or
        List<Double> ListasDecimais = numbers.stream()
                .map((n) -> n*1.5)
                .toList();

        //Usando Method Reference
        ListasDecimais.forEach(System.out::println);

    }
}
