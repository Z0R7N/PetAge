package sample;

public class Pig extends AnimalCat {
    @Override
    public void count() {
        double y = 0; //значение для человеческого возраста
        double x = getAge(); // текущее значение возраста кошки
        if (x >= 1.5) {
            y = 0.0003 * (x * x) + 0.0610 * x + 0.9351;
        }
        if (x < 1.5 && x != 0) {
            y = (-0.0021 * (x * x)) + 1.5980 * x + (-17.4975);
        }
        System.out.println("pig");
        int humanAge = (int) Math.round(y);
        ControllerCounting.setHumanAge(humanAge);
        runWindowCount();
    }
}
