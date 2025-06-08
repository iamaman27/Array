import java.util.Scanner;

public class Question15{
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

  public static int[] printAndCount(int n){
    
    int[] array = new int[n];
    int j=0;
    int count=0;

    for(int i=1; ; i++){
      if(isPalindrome(i)){
        array[j++] = i;
        count++;
        if(count==n){
          break;
        }

      }
    }
    return array;
    
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Nth terms: ");
    int n = sc.nextInt();
    int[] result = printAndCount(n);
    for(int i=0; i<result.length; i++){
      System.out.print(result[i]+" ");
    }
  }
  
}
