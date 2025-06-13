public class Question20 {
  public static void swappingArray(int[] arr, int start, int end){
   
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

    
  }

  public static int[] swappedArray(int[] arr){
      swappingArray(arr, 1, 4);
      return arr;
  }
  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50, 60, 70};
    arr=swappedArray(arr);
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    
    
  }
  
}
