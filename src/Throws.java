public class Throws {

    static void check()throws ArithmeticException{
        throw new ArithmeticException("my name is bhoomit jain");
    }
    public static void main(String[]args) {
        try{
            check();
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
