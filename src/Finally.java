public class Finally {
    public static void main(String[]args){
        try{
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        } catch (ArithmeticException e){
            System.out.println("Exception Caught");
        }finally{
            System.out.println("Finally Block Excuted");
        }
    }
}
