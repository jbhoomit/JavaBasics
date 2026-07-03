public class CompileTimePolymorphism {
    class Demo{
        void add(int a , int b) {
            System.out.println("Sum : " + (a+b));
        }
        void add (int a, int b , int c){
            System.out.println("Sum :" + (a+b+c));
        }
    }
    public void main(String[]args){
        Demo obj = new Demo();

        obj.add(10,550);
        obj.add(10,50,100);
    }
}
