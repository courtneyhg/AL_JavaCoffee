/*
Java Coffee: Courtney Huang, Jason Yang, Yuki Feng
Lab02: Well Al B. Sorted
2021 12 10
Time Spent:
*/

/*
DISCO:
QCC:
*/


public class ALTester implements OrderArrayList {
  private int[] _data; //underlying ("encapsulated") container
  private int _size; //number of elements in ALTester


  //default constructor – initializes 23-item array
  public ALTester() {
    _data = new int[23];
    _size = 23;
    for (int i = 0; i < _size; i++) {
      //populates _data with randomized integers ranging from 0 to 23
      _data[i] = (int) (Math.random() * 24);
    }
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String foo = "[";
    for( int i = 0; i < _size; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }

  //returns number of meaningful elements
  public int size()
  {
    return _size;
  }

  //checks if the elements are sorted in ascending order
  public String sortedChecker(){
    for (int i = 0; i < _size; i++) {
      //checks if element at index i is less than the next element
      //if not, continue checking
      if (_data[i] <= _data[i+1]) {
        continue;
      }
      else {
        return "Unsorted";
      }
    }return "Sorted";
  }


  public static void main(String[] args) {
    OrderArrayList slay = new ALTester();
    System.out.println("Printing ALTester slay...");
    System.out.println("\t" + slay);
    System.out.println("Is slay sorted or unsorted? Checking...");
    System.out.println("\tVerdict: " + slay.sortedChecker());

  }
}
