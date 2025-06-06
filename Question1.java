public class Question1{
  public static int getElement(int[] a){
    int min = a[0];
    int max = a[0];
    for(int x: a){
      if(max < x){
        max = x;
      }
      else if(min > x){
        min = x;
      }
    }
    System.out.println("Minimum Element is: "+min);
    System.out.println("Maximum Element is: "+max);

    return max-min;
  
  }
  public static void main(String[] args) {
    int[] a = {5, 1, 4, 8, 7, 9};
    System.out.println("Difference is: "+getElement(a));
  }
}