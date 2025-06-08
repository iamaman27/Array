public class Question12{
  public static boolean isPrime(int n){
    if(n<2){
      return false;
    }
    if(n==2 || n==3){
      return true;
    }

    if(n%2==0){
      return false;
    }
    for(int i=3; i*i<n; i+=2){
      if(n%i==0){
        return false;
      }
    }

    return true;

  }

  public static void printAndCount(int[] a){
    int sum=0;

    for(int i=0; i<a.length; i++){
      if(isPrime(a[i])){
        System.out.print(a[i]+" ");
        sum += a[i];
      }
    }
    System.out.println("\nTotal Sum is:"+sum);
  }
  public static void main(String[] args) {
    int[] a= {12, 17, 51, 53, 23, 76, 57};
    printAndCount(a);
  }
  
}
