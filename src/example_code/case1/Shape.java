package example_code.case1;

public class Shape {
    private int hight;
    private int diamtr;

    public Shape() {

    }

    public Shape(int hight, int diamtr) {
        this.hight = hight;
        this.diamtr = diamtr;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getDiamtr() {
        return diamtr;
    }

    public void setDiamtr(int diamtr) {
        this.diamtr = diamtr;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "hight=" + hight +
                ", diamtr=" + diamtr +
                '}';
    }
}
