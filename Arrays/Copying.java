//creating a class which copy an array 
public class Copying {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        //method one to copy
        int[] copy = new int[array.length];
        for(int i=0; i<copy.length; i++){
            copy[i] = array[i];
        }
        System.out.print("Original Array :");
        for(int num : array){
            System.out.print(num);
        }
        System.out.println();
        System.out.print("Copy Array :");
        for(int num : copy){
            System.out.print(num);
        }

    }
}