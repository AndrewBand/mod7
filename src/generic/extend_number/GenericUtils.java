package generic.extend_number;

public class GenericUtils {

//                                                   !---?-для-любого значення          !-super-прироботі-з-collection
    public static <T>  boolean isEquals (GenericType<? super Number> o1, GenericType<? super Number> o2) {
        return o1.getType().equals(o2.getType());
    }
}
