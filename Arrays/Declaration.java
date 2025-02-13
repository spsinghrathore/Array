public class Declaration {
    public static void main(String[] args) {
        //First way is Declare and initialize later!
        int[] array;
        array = new int[3];

        //second : Declare and initialize in single line
        int[] array2 = new int[5];

        //third :
        int[] array3 = {1,2,3};
       findMax(array3);

    
    }


    //creating a method using for each to just print arrays (for each dont modify)
    public static void printArray(int[] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
    }

    //program to find the maximum in array
    public static void findMax(int[] arr){
       //lets first is the largest
       int max=0;
       arr[0] = max;
       //now we check for whole array that the first is largest if not we assign new
       for(int i=0; i<arr.length;i++){
        if(arr[i]>max){
            max= arr[i];
        }
       }
       System.out.println("Maximum: " + max);

    }
}