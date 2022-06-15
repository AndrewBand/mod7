package lamda.no_lamda2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoLambda2 {

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

        EmailFunction ceckIUaEmail = new EmailFunction() {
            @Override
            public boolean checkEmail(String email) {
                return email.contains("i.ua");
            }
        };
        EmailFunction ceckGmailEmail = new EmailFunction() {
            @Override
            public boolean checkEmail(String email) {
                return email.contains("gmail.com");
            }
        };
        List<String> gmailList = checkEmail(emails, ceckGmailEmail);
        System.out.println("gmailList = " + gmailList);
        List<String> iUalList = checkEmail(emails, ceckIUaEmail);
        System.out.println("iUalList = " + iUalList);
    }
    private static List<String> checkEmail(List<String> emails, EmailFunction function) {
        List<String> result = new ArrayList<>();
        for (String email:emails) {
            if (function.checkEmail(email)) {
                result.add(email);
            }
        }
        return result;
    }
}
