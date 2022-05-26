package agregation_multy_imitate;

public class Main {
    public static void main(String[] args) {

        RangeRover rr = new RangeRover( new BMW(),  new MiniCuper());

        rr.getIerior();
        System.out.println("---------------------------");
        rr.getInteriorBmw();
        System.out.println("---------------------------");
        rr.getInteriorMiniCuper();
    }
}
