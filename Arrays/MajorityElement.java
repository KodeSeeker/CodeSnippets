public class MajorityElement {
  
  public static void main(String[] args) {
    int[] list = new int[] {1, 2, 3, 4, 2, 3, 4, 2, 3, 2, 1, 2, 3, 4, 2, 2, 2};
    int count = 1;
    int majorityElement = list[0];
    for(int index = 1; index < list.length; index++) {
       if(majorityElement != list[index]) {
          if(count == 0) {
             majorityElement = list[index];
             count++;
          } 
          else 
             count--;
       } 
        else 
          count++;
   }
   
  System.out.println("Majority Element: " + majorityElement);
 }
 
}