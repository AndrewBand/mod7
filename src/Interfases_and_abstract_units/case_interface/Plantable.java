package Interfases_and_abstract_units.case_interface;

interface Plantable {
    void plant();
}

class Apple implements Plantable {
    @Override
    public void plant() {
        System.out.println("Plant apple");
    }
}

class Garden {
    public void addPlant(Plantable plant) {
        plant.plant();
    }
}

class GardenTest {
    public static void main(String[] args) {
        System.out.println();
        new Garden().addPlant(new Apple());
    }
}

