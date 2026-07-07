public class Throw {
    public static void main(String[]args){
        int age = 22;
        if(age<18){
            throw new ArithmeticException(" bhoomit is not Eligible for vote");
        }
        System.out.println("bhoomit is Eligible for vote");
    }
}
