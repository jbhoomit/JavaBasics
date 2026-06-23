import java.util.Locale;

public class StringMethods {
    public static void main(String[]args) {

        // length
        String name = "bhoomit jain";

        System.out.println(name.length());

        // uppercase

        System.out.println(name.toUpperCase());

        //lower case

        System.out.println(name.toLowerCase());

        // charAt

        System.out.println(name.charAt(8));

        // equals

            String s1 = "bhoomit";
            String s2 = "bhoomit";

            System.out.println(s1.equals(s2));

            // equalignorecase

        System.out.println(s1.equalsIgnoreCase(s2));

        //contain

        String str= "hello bhoomit";

        System.out.println(str.contains("bhoomit"));

        //substring

        System.out.println(name.substring(2));

        //replace()

        String srt = "rhoomit";

        System.out.println(srt.replace("r","b"));


        //trim()

        System.out.println(str.trim());
    }
}

