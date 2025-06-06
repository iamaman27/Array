public class Question5{
  public static int[] getArray(int[] a){
    int[] merge = new int[a.length];
    int products = 1;

    for(int x: a){
      products *= x;
    }

    for(int i=0; i<a.length; i++){
      merge[i] = products/a[i];
    }

    return merge;
  }
  public static void main(String[] args) {
    int[] a = {2, 5, 4, 3, 6};
    int[] result = getArray(a);
    for(int i=0; i<result.length; i++){
      System.out.print(result[i]+" ");
    }
  }
  
}
