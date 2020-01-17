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
        double age = (getAge() - 2) * 4 + 24;
        int humanAge = (int) Math.round(age);
        ControllerCounting.setHumanAge(humanAge);
        runWindowCount();
    }

    public void runWindowCount() {
        Main.getNavigation().load(ControllerCounting.URL_FXML).Show();
    }
}
