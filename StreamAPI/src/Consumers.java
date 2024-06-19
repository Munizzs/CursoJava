
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumers {
    //Consumer<T>
    //Lambda | (Argumento) -> {codigo} |

    private static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {
        Consumer<Integer> parNumber = number -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        };

        numbers.stream().forEach(parNumber);
        //or
        numbers.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}
