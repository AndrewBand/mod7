package generic;

public class GenericUtils {

//                 !-------обобщили метод---------------!------------------!
    public static <T>  boolean isEquals (GenericType<T> o1, GenericType<T> o2) {
        return o1.getType().equals(o2.getType());
    }
    public static <T,V>  boolean isEqualsDifType (GenericType<T> o1, GenericType<V> o2) {
        return o1.getType().equals(o2.getType());
    }
}
