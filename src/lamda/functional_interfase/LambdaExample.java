package lamda.functional_interfase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExample {

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
// Predicate functional interfase
         Predicate<String> gmailLambda = email ->
             email.contains("gmail.com") &&
             email.contains("i.ua");

        System.out.println("gmailLambda = " + gmailLambda);

// Function functional interfase
        Function<Integer, Double> func = value -> {
            System.out.println("Inside function");
            return value*0.2;
        };
        System.out.println("Before call apply");
        final Double apply = func.apply(100);
        System.out.println("apply = " + apply);
//==========================================================================================


    }
    private static List<String> checkEmail(List<String> emails, Predicate<String> function) {
        List<String> result = new ArrayList<>();
        for (String email:emails) {
            if (function.test(email)) {
                result.add(email);
            }
        }
        return result;
    }
}
