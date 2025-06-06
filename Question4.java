public class Question4 {
  public static int[] getArray(int[] a){
    // int[] merge = new int[a.length];
    int sum = 0;

    for(int x: a){
      sum += x;
    }

    for(int i=0; i<a.length; i++){
      a[i] = sum - a[i];
    }

    return a;
  }
  public static void main(String[] args) {
    int[] a = {2, 5, 4, 3, 6};
    int[] result = getArray(a);
    for(int i=0; i<result.length; i++){
      System.out.print(result[i]+" ");
    }
  }
  
}
