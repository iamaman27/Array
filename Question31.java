public class Question31 {
  public static void getBiggestAndSecBiggest(int[] a){
    int biggest=a[0];
    int secBiggest=Integer.MIN_VALUE;
    for(int x:a){
      if(x>biggest){
        secBiggest=biggest;
        biggest=x;
      }
      else if(x>secBiggest && x!=biggest){
        secBiggest=x;
      }
    }
    System.out.println("Biggest Element is: "+biggest);
    System.out.println("Second Biggest Element is: "+secBiggest);
  }
  public static void main(String[] args) {
    int[] a = {80, 80, 43, 50, 38, 63, 58, 80};
    getBiggestAndSecBiggest(a);
  }
  
}
