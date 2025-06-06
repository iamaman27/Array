public class Question6 {
  public static int[] mergeArray(int[] a, int[] b){
    int[] merge = new int[a.length+b.length];

    for(int i=0; i<a.length; i++){
      merge[i] = a[i];
    }
    for(int i=a.length; i<merge.length; i++){
      merge[i] = b[i-a.length];
    }

    return merge;
  }
  public static void main(String[] args) {
    int[] a = {1, 3, 5};
    int[] b = {2, 4, 6, 8, 10};
    int[] result = mergeArray(a, b);
    for(int i=0; i<result.length; i++){
      System.out.print(result[i]+" ");
    }
  }
  
}
