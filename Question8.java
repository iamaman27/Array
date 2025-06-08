public class Question8{
  public static int[] mergedArray(int[] a, int[] b){
    int[] merged = new int[a.length+b.length];

    int index1=0, index2=0, i=0;

    while(index1<a.length && index2<b.length){
      if(a[index1]< b[index2]){
        merged[i++] = a[index1++];
      }
      else{
        merged[i++] = b[index2++];
      }
    }

    while(index1<a.length){
      merged[i++] = a[index1++];
    }

    while(index2<b.length){
      merged[i++] = b[index2++];
    }

    return merged;
  }
  public static void main(String[] args) {
    int[] a = {20, 30, 50, 60};
    int[] b = {2, 28, 32, 35, 42};
    int[] result = mergedArray(a, b);
    for(int i=0; i<result.length; i++){
      System.out.print(result[i]+" ");
    }
  }
}