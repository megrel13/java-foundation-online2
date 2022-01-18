package homework.ThisFinalSuper;

public class Raven extends Bird {
    private final boolean canTalk = false;
    private final boolean flyAbility = true;


    public Raven(String name, String colour, String size, boolean canTalk, boolean flyAbility) {
        super(name, colour);
    }


    public boolean isCanTalk() {
        return this.canTalk;
    }


    public boolean isFlyAbility() {
        return this.flyAbility;
    }
}

