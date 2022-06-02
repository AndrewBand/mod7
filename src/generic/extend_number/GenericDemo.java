package generic.extend_number;
/**
 * Например задача создать класс , который работает с int
 * и хотим отсеять на момент компиляции все остальные добавим в клас GenericType <T extends Number>
 * потому когда мы не знаем какой будет тип добавляем в утилитній клас GenericUtils
 * котрій работает с collection  <? super Number GenericTipe>
 * на класе используем extends
 * на методах используем super
 * */

import generic.GenerikTypeOLd;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericDemo {
    public static void main(String[] args) {
//сужаем наш тип только до интежера
GenericType<Integer> type = new GenericType<>();
type.setType(12); // only int
// росширим наш тип путем добавления в GenericUtils в методе  static <T>  boolean isEquals
        GenericType<Number> typeNum = new GenericType<>();
        typeNum.setType(125);
        GenericType<Number> typeNum2 = new GenericType<>();
        typeNum2.setType(12);

        System.out.println("GenericUtils.isEquals(typeNum, typeObj) = " + GenericUtils.isEquals(typeNum2, typeNum));


    }
}
