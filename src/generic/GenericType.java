package generic;

public class GenericType<T> {
    // T - type , this will be method whith be wokr whos it (this type)

    private T type;

    public T getType() {
        return this.type;
    }
/*

    public T getType() {
        return type; // <<< ???
    }
*/

    public void setType(T type) {
        this.type = type;
    }
}
