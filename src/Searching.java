public class Searching {
    public static void main(String[]args) {
        int [] arr = {10,20,30,40,50};
        int value = 20;
        boolean found = false;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] ==value){
                System.out.println("Element found at Index:"+i);
                break;
            }
        }
        if(found) {
           System.out.println("Element not found");
        }
    }
}
