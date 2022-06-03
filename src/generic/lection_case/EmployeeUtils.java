package generic.lection_case;

public class EmployeeUtils {
//    public String print(Developer developer) {
//        return developer.toString();
//    }
//    public String print(Manager manager) {
//        return manager.toString();
//    }

    public <T> String print(T emploee) {
        return emploee.toString();
    }
}
