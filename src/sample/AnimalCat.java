package sample;

public class AnimalCat {
    public static double getAge() {
        return age;
    }

    public static void setAge(double age) {
        AnimalCat.age = age;
    }

    private static double age = 0;

    public void count() {
        double y; //значение для человеческого возраста
        double x = getAge(); // текущее значение возраста кошки
        if (x >= 1.5) {
            y = (x - 2) * 4 + 24;
        } else {
            y = (-2.5921 * (x * x * x) + 4.0353 * (x * x) + 13.3309 * x + 0.1953);
        }
        int humanAge = (int) Math.round(y);
        ControllerCounting.setHumanAge(humanAge);
        runWindowCount();
    }

    public void runWindowCount() {
        Main.getNavigation().load(ControllerCounting.URL_FXML).Show();
    }
}