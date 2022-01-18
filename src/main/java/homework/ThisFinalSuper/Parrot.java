package homework.ThisFinalSuper;


public class Parrot extends Bird {

    private final boolean canTalk = true;
    private final boolean flyAbility = true;

    public Parrot(String name, String colour, String size, boolean canTalk, boolean flyAbility) {
        super(name, colour);
    }

    public boolean isCanTalk() {
        return canTalk;
    }

    public void setCanTalk(boolean canTalk) {
        canTalk = canTalk;
    }

    public boolean isFlyAbility() {
        return flyAbility;
    }


}



