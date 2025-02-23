import java.util.Scanner;
public class Largest {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int[] array = new int[5];
        //lets take input from user
        System.out.println("Enter " + array.length + "  Number in array");
        for(int i=0; i<array.length; i++){
            array[i] = obj.nextInt();
        }
        System.out.println("now finding largest element...");
        System.out.println("just a second......");

        int large = getLargest(array);
        System.out.println("Largest Number is : " + large);
        Array.print(array);
    }

    public static int getLargest(int[] array){
        int max = array[0]; //supposing that first is the largest
        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}