package lamda.functional_interfase;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaseDemo {
    private static List<String> emails = Arrays.asList(
            "987-123-4567@mail.ru",
            "987-123@gmail.com",
            "123 456 7890@mail.ru",
            "1234567890@google.com",
            "(123) 456-7890@mail.ru",
            "(123) 222-@gmail.com",
            "(123)-456-7890@i.ua",
            "123)-456-7890@i.ua",
            "(123-456-7890@google.com",
            "123 456-7890@gmail.com",
            "sdfsadfQQ123 456-7890@google.com"
    );

    public static void main(String[] args) {
// Function EXAMPLE
//        Function<String, Integer> leterCalc = emeil -> emeil.length();
        final Map<String, Integer> r = calckEmailLength(emails, emeil -> emeil.length());
        System.out.println("r = " + r);

//   Consumer EXAMPLE
        Consumer<Map<String, Integer>> consumer = mapz -> {
            for (Map.Entry<String, Integer> entry:mapz.entrySet()) {
                System.out.println("Email " + entry.getKey() + " have " + entry.getValue());
            }
        };
        consumer.accept(r);


//        Supplier EXAMPLE
        Supplier<Integer> random = () -> new Random().nextInt(100)*50;
        System.out.println(random.get());
        System.out.println(random.get());
        System.out.println(random.get());
        System.out.println(random.get());
        System.out.println(random.get());

//        BinaryOperator EXAMPLE
        BinaryOperator<Integer> multiply = (x, y)-> x*y;
        final Integer multRez = multiply.apply(10,4);
        System.out.println("multRez = " + multRez);

//        UnaryOperator EXAMPLE
        UnaryOperator<Integer> multpleUnar = x -> x *x;
        System.out.println("multpleUnar.apply(9) = " + multpleUnar.apply(9));


    }

    private static Map<String, Integer> calckEmailLength(List<String> emails, Function<String, Integer> f) {
        Map<String, Integer> result = new HashMap<>();
        for (String emeil : emails) {
            result.put(emeil, f.apply(emeil));
        }
        return result;
    }
}
