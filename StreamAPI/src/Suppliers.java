
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Suppliers {
    //Supplier<T>
    //Supplier não recebe nenhum argumento e retorna um valor <T>

    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, bem vindo!";
        //Or
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, bem vindo!")
                .limit(5)
                .toList();
        
        //Usando Method Reference
        listaSaudacoes.forEach(System.out::println);
    }

}
