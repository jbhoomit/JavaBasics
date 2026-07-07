public class CalculatorTask {
    class Calculator{
        int add (int a, int b, int c){
            return a + b + c;
        }
        int mul (int a , int b){
            return a * b;
        }
        int sub(int a , int b , int c){
            return a - b - c;
        }
        int div(int a , int b){
            return a / b;
        }
    }
    public void main(String[]args){
        Calculator c = new Calculator();
        System.out.print(c.add(10,20,60));

        System.out.println(c.mul(18,26));
        System.out.println(c.sub(10,50,90));
        System.out.println(c.div(89,116));
    }
}
