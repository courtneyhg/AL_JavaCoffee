/*
Java Coffee: Courtney Huang, Jason Yang, Yuki Feng
Lab02: Well Al B. Sorted
2021 12 10
Time Spent: 1.5 hr
*/

import java.util.ArrayList;
public class ALTester{

  //checks if the elements are sorted in ascending order
  public static boolean sortedChecker(ArrayList<Integer> slay){
    for (int i = 0; i < slay.size()-1; i++) {
      //checks if element at index i is less than the next element
      //if not, continue checking
      if (slay.get(i) <= slay.get(i+1)) {
      }
      else {
        return false;
      }
    }return true;
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
    System.out.println("\tVerdict: " + sortedChecker(slay));
  }
}
