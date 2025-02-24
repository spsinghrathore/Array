public class Smallest{
public static void main(String[] args){
  //finding a smallest in an array
  int[] array = {1,2,3,-9,5,6,7};
  int min = array[0];
  for(int i=0; i<array.length; i++){
    if(min > array[i]){
        min = array[i];
    }
  }
  System.out.println("Minimum number in array is :" + min);
}
}