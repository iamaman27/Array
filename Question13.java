public class Question13{
  public static boolean isPalindrome(int n){
    int original = n;
    int reverse =0;

    while(n>0){
      int rem = n%10;
      reverse = reverse*10+rem;

      n/=10;
    }
    return reverse == original;
  }

  public static void printAndCount(int[] a){
    int count=0;

    for(int i=0; i<a.length; i++){
      if(isPalindrome(a[i])){
        System.out.print(a[i]+" ");
        count++;
      }
    }
    System.out.println("\nTotal Count is:"+count);
  }
  public static void main(String[] args) {
    int[] a= {121, 17, 51, 53, 23, 76, 57};
    printAndCount(a);
  }
  
}
