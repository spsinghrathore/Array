public class Array {
    public static void print (int[] arr){
         System.out.print("{ ");
        for(int num : arr){
           
            System.out.print(num + " ");

           

        }
         System.out.print(" }");
    }
     public static void main(String[] args){
            int[] array = {1,2,3};
            print(array);
        }
       
    }
