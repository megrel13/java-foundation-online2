package homework.interfacesDefault;

public class Main {
    public static void main(String[] args) {
        Plant plant = new Plant();
        Cow cow = new Cow();
        Man man = new Man();

        plant.eat();
        plant.talk();
        cow.eat();
        cow.talk();
        man.eat();
        man.talk();
    }
}
