public class arrayTaskday8 {
    public static void main (String[]args) {

        // addition matrix
        int[][] a ={ {10,20}, {30,40}};
        int[][] b = { {50,60},{70,80}};


        for (int i = 0; i < 2; i++) {
            for (int j =0; j< 2; j++){


                    System.out.println(a[i][j]+ b [i] [j]+" ");
                }
            System.out.println();
            }

        //array search

        int[] arr = {10,20,30,40,50};
        int value = 40;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==value){
                System.out.println("find element in Index:" + i);
            }

        }


        // second largest element

        int[] arry ={25,40,86,100,56,};
        int largest = arry[0];
        int second = arry[0];

        for (int i = 0; i < arry.length ; i++) {
            if(arry[i]>largest) {
                second=largest;
                largest=arry[i];
            }else if (arry[i]>second){
                second=arry[i];
            }
        }
        System.out.println("second largest= "+second);


        //duplicate

        int[] ara = {29,20,26,29,40,26 };
        System.out.println("dulicate value");

        for (int i = 0; i < ara.length ; i++) {
            for (int j =i +1; j < ara.length ; j++) {

                if(ara[i] == ara[j]){
                    System.out.println(ara[i]);
                }
                
            }
            
        }
        }
    }

