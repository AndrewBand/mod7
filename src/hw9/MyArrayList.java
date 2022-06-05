package hw9;

import java.util.Arrays;

class MyArrayList {

    public static Object array[];

    public static Object[] add(Object value) {
        Object[] oldArray;
        if (array == null) {
            array = new Object[1];
            array[0] = value;
        } else {
            oldArray = array;
            array = new Object[array.length + 1];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = oldArray[i];
            }
            array[array.length - 1] = value;
        }
        return array;
    }

    public static Object[] remove(int index) {

        Object[] newArray = new Object[array.length-1];
        try {newArray[0] = array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index " + index + " out of bounds");
            return null;
        }
        if (index == array.length-1){
            array =  Arrays.copyOf(array, array.length-1);
            return array;
        } else {
            for (int i = 0; i < array.length-1 ; i++) {
                if (i == index || i > index) {
                    newArray[i] = array[i + 1];
                    continue;
                }
                newArray[i] = array[i];
            }
        }
        array = Arrays.copyOf(newArray,array.length-1);
//        System.out.println(Arrays.toString(array));
        return array;
    }
//System.out.println(Arrays.toString(array));
    public static Object[] clear() {
        Object[] newArray = new Object[array.length];
        array  = Arrays.copyOf(newArray, array.length);
        return array;
    }

    public static int size() {
//        System.out.println("array.length = " + array.length);
        return (array.length);
    }
    public static Object get(int index) {
        Object[] newArray = new Object[1];
        try {newArray[0] = array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index " + index + " out of bounds");
            return null;
        }
//        System.out.println("array[index] = " + array[index]);
        return (array[index]);
    }

}
