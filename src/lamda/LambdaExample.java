package lamda;

import java.util.*;

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
//LAMDA
//                  параметео(аргумент)-|   lamda oprator     |- тіло ламди
//                                      V          V          V
//      EmailFunction gmailLambda = (String email) ->          {return email.contains("gmail.com");};
// the saim -v
        final EmailFunctionalinterfase gmailLambda = (String email) -> email.contains("gmail.com");
//        System.out.println("gmailLambda = " + Arrays.toString(new EmailFunction[]{gmailLambda}));
        System.out.println("gmailLambda = " + gmailLambda);

//=========================================================================================
// the saim -v
        checkEmail(emails, email -> email.contains("@i.ua"));
        List<String> listIUa = checkEmail(emails, email -> email.contains("@i.ua"));
        System.out.println("listIUa = " + listIUa);




//=========================================================================================

//        Collections.sort(emails, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return (o1.length() - o2.length());
//            }
//        });
// the saim -v
        Collections.sort(emails, (o1, o2) -> (o1.length() - o2.length()));
        System.out.println("emails = " + emails);

    }
    private static List<String> checkEmail(List<String> emails, EmailFunctionalinterfase function) {
        List<String> result = new ArrayList<>();
        for (String email:emails) {
            if (function.checkEmail(email)) {
                result.add(email);
            }
        }
        return result;
    }
}
