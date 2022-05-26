package enum_lection.case1;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        User1 user = new User1();
        user.setFirstName("Aa");
        user.setLastName("BB");
        user.setUserType(UserType1.DEFAULT_USER);

        // проверка валидности юзера
        UserType1.valueOf("ADMIN");
        final UserType1 admin = UserType1.valueOf("ADMIN");
//
        System.out.println("admin = " + admin);
        System.out.println("admin.name() = " + admin.name());
        System.out.println("admin.toString() = " + admin.toString());
        System.out.println("admin.ordinal() = " + admin.ordinal());
        System.out.println("Arrays.toString(UserType1.valueOf()) = " + Arrays.toString(UserType1.values()));


        UserType1 uTyp = UserType1.GUEST;
        System.out.println("uTyp.getName() = " + uTyp.getName());

        System.out.println("admin.getName() = " + admin.getName());
//        if(admin==null) {
//            System.out.println("Wrong enum");
//        } else {
//            System.out.println(admin.name());
//        }

    }

    // проверка валидности юзера
//    private static boolean ifUserType (String userTyp) {
//        switch (userTyp) {
//            case UserType1.DEFAULT_USER:
//            case UserType1.ADMIN:
//            case UserType1.GUEST:
//                return true;
//            default:
//                return false;
//        }
//    }
    // без енум ми б працювали з типом юзера як з String!
    //enum зявився в 5 java
}
