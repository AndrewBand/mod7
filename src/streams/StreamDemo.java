package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    private static List<Employee> employees = new ArrayList<>(Arrays.asList(

            new Employee(2, "Andre", UserStatus.ACTIVE),
            new Employee(3, "Taras", UserStatus.NOT_ACTIVE),
            new Employee(23, "Sasa", UserStatus.NOT_ACTIVE),
            new Employee(12, "Max", UserStatus.NOT_ACTIVE),
            new Employee(52, "Nikola", UserStatus.NOT_ACTIVE),
            new Employee(255, "Petro", UserStatus.ACTIVE),
            new Employee(23, "Anna", UserStatus.ACTIVE),
            new Employee(122, "Ane", UserStatus.ACTIVE),
            new Employee(2, "An", UserStatus.ACTIVE)
            ));

    public static void main(String[] args) {
//        System.out.println("employees.get(0) = " + employees.get(0).getStatus().name());
        List<String> employeeResult = employees.stream()
                .filter(e -> e.getStatus().name().equals(UserStatus.ACTIVE.name()))
                .sorted(Comparator.comparing(Employee::getId))
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println("employeeResult = " + employeeResult);
    }
}
