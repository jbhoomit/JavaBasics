public class MethodOverloding {
    class calculator{
        int multiply(int a , int b){
            return a * b;
        }
        int multiply(int a , int b , int c){
            return a * b * c;
        }

    }
    public  void main(String[]args){
        calculator obj = new calculator();

        System.out.println(obj.multiply(20,50));
        System.out.println(obj.multiply(20,60,80));
    }
}

