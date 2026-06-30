public class Enum {

    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}

class Test {

    public static void main(String[] args) {

        Enum.Day d = Enum.Day.SUNDAY;

        System.out.println(d);
    }
}