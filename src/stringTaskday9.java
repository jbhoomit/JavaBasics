public class stringTaskday9 {
    public static void main(String[]args) {

        //reverse

                String str = "Hello bhoomit";
                String rev = "";

                for (int i = str.length() - 1; i >= 0; i--) {
                    rev = rev + str.charAt(i);
                }

                System.out.println("Original String: " + str);
                System.out.println("Reversed String: " + rev);

                //count int


                String srt = "bhoomit";

                String[] words = srt.split(" ");

                System.out.println("Number of Words: " + words.length);


                //count char

        String srtr = "Java";

        System.out.println("Number of Characters: " + srtr.length());


        //comparing
        String str1 = "bhoomit";
        String str2 = "bhoomit";

        if (str1.equals(str2)) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are Not Equal");
        }
    }
}
