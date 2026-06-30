public class thisKeyword {

    class Student{
        int id;

        Student(int id){
            this.id=id;
        }
        void display(){
            System.out.println(id);
        }

    }
    public  void main(String[]args){
        Student s1 =new Student(101);
        s1.display();
    }

}
