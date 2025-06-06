public class Question2 {
  public static void printAndCount(String[] s){
    int count=0;

    for(String x: s){
      if(x.length()%2==0){
        System.out.println(x);
        count++;
      }
    }
    System.out.println("Total Number of Even String is: "+count);
  }
  public static void main(String[] args) {
    String[] s = {"aman", "suraj", "raju", "sarvesh"}; 
    printAndCount(s);
  }
  
}
