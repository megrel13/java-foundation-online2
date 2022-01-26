package homework.statics;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("БМВ", "черный");
        Car ziguli = new Car("Жигули", "красная");


        System.out.println("Car.cost = " + Car.cost);
    }
}
