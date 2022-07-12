package streams.exercise1;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class StreamExercise1 {


    public static void main(String[] args) {
          List<String> input = asList("adfd", "dsfd", "daf");
//1 получити все в аперкейс
        List<String> result = input.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("result = " + result);
//2 вибрати всі елементи списку які мають меншу 3-ох елементів
        List<String> result2 = input.stream()
        .filter(w -> w.length() <= 3)
        .collect(Collectors.toList());
        System.out.println("result2 = " + result2);
//3 вивести в один масив з двомірного масиву
        List<List<String>> input3 = asList(asList("adfd", "dsfd", "daf"), asList("2adfd", "2dsfd", "2daf"));
        List<String> result3 = input3.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("result3 = " + result3);
//4 отримати най старшого співробітника з колекції
        Employee pasha = new Employee("Pasha", 35, "ukrain");
        Employee sara = new Employee("Sara", 45, "turok");
        Employee sasha = new Employee("Sasha", 65,"ukrain");
        List<Employee> listEmployee = asList(sara, pasha, sasha);

        Optional<Employee> maxEmployee = listEmployee.stream()
                .max(Comparator.comparing(Employee::getAge));
//        maxEmployee = Optional.ofNullable(null);
        final Employee emmpl = maxEmployee.orElse( new Employee("defName", 0));
        System.out.println("emmpl = " + emmpl);
        System.out.println("Max age = " + emmpl.getAge());
        Integer maxAge = listEmployee.stream()
                .map(Employee::getAge)
                .max(Integer::compare)
                .get();
        System.out.println("maxAge = " + maxAge);
//5 просумувати елементи масива
        List<Integer> number = asList(1, 2, 3, 4, 5);
        Integer summNumber = number.stream()
                .reduce(0, Integer::sum);
        System.out.println("summNumber = " + summNumber);

//6 отримати імена всіх хто молодший 25
        List<String> result6 = listEmployee.stream()
                .filter(e -> e.getAge() <= 35)
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("result6 = " + result6);
//7 отримати статистику по людях середній вік, мінімальний максимальний, кількість учасників
        IntSummaryStatistics intSummaryStatistics = listEmployee.stream()
                .mapToInt(Employee::getAge)
                .summaryStatistics();
        System.out.println("intSummaryStatistics = " + intSummaryStatistics);
//8 Групувати по національності
        Map<String, List<Employee>> gruping = listEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getNationality));
        System.out.println("gruping = " + gruping);

//9 повернути імена розділені комою
        String names9 = listEmployee.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", ", "Names: ", "."));
        System.out.println("names9 = " + names9);
    }
}
