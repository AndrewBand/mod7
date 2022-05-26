package enum_lection.case_before_igsisting;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Aa");
        user.setLastName("BB");
        user.setUserType(UserType.DEFAULT_USER);

        System.out.println("ifUserType(user.getUserType()) = " + ifUserType(user.getUserType()));
    }

    // проверка валидности юзера
    private static boolean ifUserType (String userTyp) {
        switch (userTyp) {
            case UserType.DEFAULT_USER:
            case UserType.ADMIN:
            case UserType.GUEST:
                return true;
            default:
                return false;
        }
    }
    // без енум ми б працювали з типом юзера як з String!
    //enum зявився в 5 java
}
