package hw11;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Modul11 {
    //        Задание 1#
// Метод принимает на вход список имен. Вернуть строку в виде: "1. Ivan, 3. Peter ...", с именами из списка,
//стоящими под нечетным индексом (1, 3 и т.д.).
    public List<String> tasck1(List<String> list) {
        return IntStream.range(0, list.size())
                .filter(e ->e%2 !=0)
                .mapToObj(e -> e + ". " + list.get(e))
                .collect(Collectors.toList());
    }
//    Задание 2#
//Метод принимает на вход список из строк (можно список из Задания 1).
// Возвращает список этих строк в верхнем регистре и отсортированные по убыванию (от Z до А).
public List<String> tasck2(List<String> list) {
    return list.stream()
            .map(String::toUpperCase)
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
}

//    Задание 3#
//    Дан массив:            ["1, 2, 0", "4, 5"]
//    Получить из массива все числа, вернуть в отсортированном виде, разделенные запятой, то есть
//"0, 1, 2, 4, 5"
String tasck3(String[] list) {
    return Arrays.stream(list)
            .flatMap(e -> Stream.of(e.split(", " )))
            .map(Integer::valueOf)
            .sorted(Integer::compareTo)
            .map(String::valueOf)
            .collect(Collectors.joining(", " ));
}

//    Задание 4#
//    Используя Stream.iterate сделайте бесконечный стрим рандомных чисел, но не используя Math.random.
//    Реализуйте свой "линейный конгруэнтный генератор". Для этого начните с x[0] = seed и затем каждый следующий
//    элемент x[n + 1] = 1 (a x[n] + c) % m, для корректных значений a, c, и m. Необходимо имплементировать метод,
//    который принимает на вход параметрыa, c, m и seed и возвращает Stream<Long>. Для теста используйте данные
//    a = 25214903917, c = 11 и m = 2^48 (2 в степени 48).
    Stream<Long> infinityDijitCycle(long a, long c , long m, long seed) {
        if(m!=0){
            return Stream.iterate(seed,n -> (a * n + c) % m);
        }
        return null;
    }

//    Задание 5#
//    Напишите метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) который "перемешивает" элементы
//    из стримов first и second, останавливается тогда, когда у одного из стримов закончатся элементы.

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstElements = first.iterator();
        Iterator<T> secondElements = second.iterator();
        Stream<T> result = Stream.empty();
        while (firstElements.hasNext() && secondElements.hasNext()){
            result = Stream.concat(result, Stream.of(firstElements.next(),secondElements.next()));
        }
        List<T> tempResult = result.collect(Collectors.toList());
        Collections.shuffle(tempResult);
        result = tempResult.stream();
        return result;
    }
}
