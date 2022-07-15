package example_code.case2;

public class Class2 {
    public void meth2() {
        Class1.meth1();
        System.out.println("meth2 do");
        (new Class1()).meth3();
    }
}
