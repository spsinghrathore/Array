import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Number to Search: ");
        int x = obj.nextInt();

        //calling binary Search method
        boolean res = binarySearch(array,x);
        if(res){
          System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }
        
    }

    public static boolean binarySearch(int[] arr, int x){
        
        // while(pointer <= arr.length || pointer != 0) {
        //     System.out.println("it's running");
        //     System.out.print(pointer);
        //     pointer++;
        // }
        int pointer = arr.length/2;
        while (pointer <= arr.length && pointer >= 0){
            
            System.out.println(pointer);
            if(x == arr[pointer]){
                return true;
            }
            else if(x > arr[pointer]){
                System.out.println("it runs on right side");
                pointer = pointer + pointer/2 + 1;
            }
            else {
                System.out.println("it runs on left side");
                pointer = pointer - pointer/2 - 1;
            }
        }
        return false;
    }
}