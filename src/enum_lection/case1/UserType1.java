package enum_lection.case1;

public enum UserType1 {
    //    public static final String DEFAULT_USER = "default user";
//    public static final String ADMIN = "admin";
//    public static final String GUEST = "guest";
    // в enum нема констант
//*це клас тому внього може бути каонструктор
    //вигляд без конструктора:
//    DEFAULT_USER,
//    ADMIN,
//    GUEST;




    //whith constructor:
    DEFAULT_USER("def"),
    ADMIN("admin"),
    GUEST("guest");

    private String name;
    UserType1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UserType1 getUsertype(String name) {
        for (UserType1 userType:UserType1.values()) {
            if (userType.name.equals(name)) {
                return userType;
            }
        }
        return UserType1.DEFAULT_USER;
    }
}
