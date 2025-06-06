public class Question3{
  public static void printLargestString(String[] s){
    String largest =  s[0];

   for(int i=1; i<s.length; i++){
       if(s[i].length() > largest.length()){
      largest =s[i];
      }
    }

    System.out.println(largest);
    
  }
  public static void main(String[] args) {
    String[] s = {"aman", "suraj", "raju", "sarvesh"}; 
    printLargestString(s);
  }
  
}
