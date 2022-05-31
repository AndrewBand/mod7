package generic.extend_number;
/**
 * Например задача создать класс , который работает с int
 * и хотим отсеять на момент компиляции все остальные
 * потому когда мы не знаем какой будет тип добавляем GenericTipe<T extends Number>
 * на класе используем extends
 * на методах используем super
 * */

import generic.GenerikTypeOLd;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
//сужаем наш тип только до интежера
GenericType<Integer> type = new GenericType<>();
type.setType(12); // only int
// росширим наш тип путем до бавления в GenericUtils в методе <? super Number>
        GenericType<Number> typeNum = new GenericType<>();
        //GenericType<Object> typeObj = new GenericType<>();

        System.out.println("GenericUtils.isEquals(typeNum, typeObj) = " + GenericUtils.isEquals(typeNum, typeNum));


    }
}
