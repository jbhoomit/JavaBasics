public class Stringbuilders {
    public static void main(String[]args) {

        // append
        StringBuilder sb = new StringBuilder("bhoomit");

        sb.append(" Jain");

        System.out.println(sb);

        // insert
        StringBuilder sr = new StringBuilder("bhomit");

        sb.insert(2,"o");

        System.out.println(sr);

        //delete()

        StringBuilder srt = new StringBuilder("bhoomit");

        sb.delete(1,3);

        System.out.println(srt);


        //reverse


        StringBuilder sbr = new StringBuilder("bhoomit");

        System.out.println(sb.reverse());

    }
}
