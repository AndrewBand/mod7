package lamda.old_stile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoLambdas1 {

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

        List<String> gmailEmails = getGmailEmails(emails);
        System.out.println("gmailEmails = " + gmailEmails);

        List<String> iUaEmails = getIUaEmails(emails);
        System.out.println("iUaEmails = " + iUaEmails);


//іде повторення коду методів getGmailEmails, getIUaEmails
    }
    private static List<String> getGmailEmails(List<String> emails) {
        List<String> result = new ArrayList<>();
        for (String email:emails) {
            if (email.contains("gmail.com")) {
                result.add(email);
            }
        }
        return result;
    }   private static List<String> getIUaEmails(List<String> emails) {
        List<String> result = new ArrayList<>();
        for (String email:emails) {
            if (email.contains("@i.ua")) {
                result.add(email);
            }
        }
        return result;
    }
}
