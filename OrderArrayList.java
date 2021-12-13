import java.util.ArrayList;
public class OrderArrayList {
   //sorts through array by iterating.
   public static ArrayList<Integer> sorter(ArrayList<Integer> slay){
     for (int i = 0; i < slay.size(); i++) {
       for (int x = 0; x < (slay.size() - 1 - i); x++) {
         if (slay.get(x) > slay.get(x+1)) {
           int big = slay.get(x); 
           slay.set(x, slay.get(x+1)); 
           slay.set(x+1, big); 
         }
       }
     }
     return slay;
   }
   
   public static void main(String[] args) {
    ArrayList<Integer> slay = new ArrayList<>();
    for (int i = 0; i < 23; i++) {
      //populates _data with randomized integers ranging from 0 to 23
      slay.add((int) (Math.random() * 24));
    }
    System.out.println("Printing ALTester slay...");
    System.out.println("\t" + slay);
    System.out.println("Is slay sorted or unsorted? Checking...");
    System.out.println("\tVerdict: " + sorter(slay));
  }

}
