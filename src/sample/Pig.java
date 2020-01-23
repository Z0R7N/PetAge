package sample;

public class Pig extends AnimalCat {
    @Override
    public void count() {
        double y = 0; //значение для человеческого возраста
        double x = getAge(); // текущее значение возраста кошки
        if (x >= 1.5) {
            y = 2;
        }
        if (x < 1.5 && x != 0) {
            y = 1;
        }
        int humanAge = (int) Math.round(y);
        ControllerCounting.setHumanAge(humanAge);
        runWindowCount();
    }
}
