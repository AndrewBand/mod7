package enum_lection.case1;

public class User1 {
    private String firstName;
    private String lastName;
    private UserType1 userType;

    public String getFirstName(String aa) {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserType1 getUserType() {
        return userType;
    }

    public void setUserType(UserType1 userType) {
        this.userType = userType;
    }
}
