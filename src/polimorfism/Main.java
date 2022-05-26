package polimorfism;

public class Main {
    public static void main(String[] args) {
        Doter doter = new Doter("Nastia", "B", "GG");
        doter.liteOn();
        System.out.println("doter.getName() = " + doter.getName());
        doter.printNamr();
        doter.printGrendMotherSername();

        doter.setGrendMotherSerneme("HHH");
        System.out.println("doter.getGrendMotherSerneme() = " + doter.getGrendMotherSerneme());
    }
}
