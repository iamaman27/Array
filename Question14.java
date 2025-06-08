import java.util.Scanner;

public class Question14{
  public static boolean isPrime(int n){
    if(n<2){
      return false;
    }
    else if(n==2 || n==3){
      return true;
    }

    else if(n%2==0){
      return false;
    }
    for(int i=3; i*i<=n; i+=2){
      if(n%i==0){
        return false;
      }
    }

    return true;

  }

  public static int[] printNPrimeNumber(int n){
    int[] prime = new int[n];
    int j=0;
    int count=0;
    for(int i=2; ; i++){
      if(isPrime(i)){
        prime[j++] = i;
        count++;
        if(n==count){
          break;
        }

      }

    }

    return prime;
    
  }
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter The Number Of Prime Number: ");
   int n = sc.nextInt();
   int[] result = printNPrimeNumber(n);
   for(int i=0; i<result.length; i++){
    System.out.print(result[i]+" ");
   }

   
  }
  
}
