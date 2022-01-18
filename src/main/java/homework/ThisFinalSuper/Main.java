package homework.ThisFinalSuper;

public class Main {
    public static void main(String[] args) {

        Bird parrot = new Parrot("Какаду", "Красный", "Средний", true, true);
        Bird parrot2 = new Parrot("Какаду", "Красный", "Средний", true, true);
        Bird parrot3 = new Parrot("Бибиду", "Красный", "Средний", true, true);
        Bird raven = new Raven("Мунин", "Черный", "Средний", false, true);
        Bird raven2 = new Raven("Мунин", "Черный", "Средний", false, true);

        System.out.println("parrot2.equals(parrot) = " + parrot2.equals(parrot));
        System.out.println("parrot2.equals(parrot3) = " + parrot2.equals(parrot3));
        System.out.println("parrot.equals(raven) = " + parrot.equals(raven));
        System.out.println("raven.equals(raven2) = " + raven.equals(raven2));


        System.out.println(parrot.getColour());
        System.out.println(((Parrot) parrot).isFlyAbility());
        System.out.println(((Raven) raven).isCanTalk());

        //raven.setCanTalk(true);
      //  System.out.println(raven.isCanTalk());


    }
}
