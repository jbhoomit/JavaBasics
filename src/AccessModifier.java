public class AccessModifier {

    // Public
    public String name = "Bhoomit";

    // Private
    private int age = 22;

    // Protected
    protected String city = "Udaipur";

    // Default
    String college = "Gitanjali College";

    // Public
    public void displayName() {
        System.out.println("Name : " + name);
    }

    public void showAge() {
        System.out.println("Age : " + age);
    }

    protected void displayCity() {
        System.out.println("City : " + city);
    }

    void displayCollege() {
        System.out.println("College : " + college);
    }

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();

        obj.displayName();
        obj.showAge();
        obj.displayCity();
        obj.displayCollege();
    }
}