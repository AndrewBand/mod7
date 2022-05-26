package agregation_multy_imitate;

public class RangeRover {
// у java нема мульти наслідування,
// але якщо потрбні приватні методи з інших класів можна застосувати агрегацію
    private BMW bmw;
    private MiniCuper miniCuper;

    public RangeRover(BMW bmw, MiniCuper miniCuper) {
        this.bmw = bmw;
        this.miniCuper = miniCuper;
    }
    public void getIerior() {
        bmw.getInterior();
        miniCuper.getInterior();
        System.out.println("Rover interior");
    }
    public void getInteriorBmw() {
        bmw.getInterior();
    }
    public void getInteriorMiniCuper() {
        miniCuper.getInterior();
    }
}
