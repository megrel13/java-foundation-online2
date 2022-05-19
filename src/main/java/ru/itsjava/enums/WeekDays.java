package ru.itsjava.enums;

public enum WeekDays {
    MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"),
    FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресенье");

    private final String translate;
    WeekDays (String translate){
        this.translate = translate;
    }
    public String getTranslate() {
        return translate;
    }

    @Override
    public String toString() {
        return "WeekDays{" + this.name() +
                "translate = " + translate + ")}\n";
    }
}
