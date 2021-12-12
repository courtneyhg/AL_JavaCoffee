public interface OrderArrayList {
  void expand(); //doubles capacity array
  int size(); //returns number meaningful elements
  boolean add (int newVal); //adds element at end of array
  String sortedChecker(); //checks if array sorted
  void sorter(); //sorts array
}
