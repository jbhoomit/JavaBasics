public class GetterSetter {

    // Private variable
    private String name;

    // Setter
    public void setName(String n) {
        name = n;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Main Method
    public static void main(String[] args) {

        GetterSetter s = new GetterSetter();

        s.setName("Bhoomit Jain");

        System.out.println(s.getName());
    }
}