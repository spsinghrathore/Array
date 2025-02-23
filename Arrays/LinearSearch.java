import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
    //Taking input from user for element to search
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter a number to search in java");
    int x = obj.nextInt();

    //calling the linear search method
    boolean  res = linearSearch(array,x);
   System.out.println(res);


    }
    public static boolean linearSearch(int[] arr, int x){
        for(int num : arr){
            if(num == x){
                return true;
            }
        }
        return false;
    }
}