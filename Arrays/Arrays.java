public class Arrays {
    public static void main(String[] args){
       //ways to declare a array in java first
       int[] arrayName = new int[5];
       //lets make function to print array!
       printArray(arrayName,5);

       //now time to take array in runtime !
       inputArray(arrayName, 5);
       //creating a object for scanner
       Scanner obj = new Sacnner();
    }

    //method to print a array
    public static void printArray(int[] arr, int size){
    System.out.print(" {");
    for(int i=0; i<size;i++){
        System.out.print(" " + arr[i]);
    }
     System.out.print(" }");
}

    //method to take array as a input
    public static void inputArray(int arr[], int size){
        
        System.out.println("Enter " + size + " Elements in Array!");
        for(int i=0;i<size;i++);{
            arr[i]= obj.nextInt();
        }
    }
}

