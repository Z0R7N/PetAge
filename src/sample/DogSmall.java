package sample;

public class DogSmall extends AnimalCat {
    @Override
    public void count() {
        double y = 0; //значение для человеческого возраста
        double x = getAge(); // текущее значение возраста кошки
        if (x >= 1.5) {
            y = 0.0078 * (x * x * x) + (-0.2339 * (x * x)) + 6.1112 * x + 10.5000;
        }
        if (x < 1.5 && x != 0) {
            y = (-0.0298 * (x * x * x)) + 0.6507 * (x * x) + -2.6940 * x + 4.1840;
        }
        int humanAge = (int) Math.round(y);
        ControllerCounting.setHumanAge(humanAge);
        runWindowCount();
    }
}