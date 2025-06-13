public class Question33 {
  public static void getSmallestAndSecSmallest(int[] a){
    int smallest=a[0];
    int secSmallest = Integer.MAX_VALUE;
    for(int x:a){
      if(x<smallest){
        secSmallest = smallest;
        smallest = x;
      }
      else if(secSmallest>x && x!=secSmallest){
        secSmallest=x;
      }
      
    }
    System.out.println("Smallest is: "+smallest);
    System.out.println("Second Smallest is: "+secSmallest);
    
  }
  public static void main(String[] args) {
    int[] a = {80, 80, 43, 50, 38, 63, 58, 80};
    getSmallestAndSecSmallest(a);
  }
  
}
