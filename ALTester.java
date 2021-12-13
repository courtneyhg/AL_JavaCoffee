/*
Java Coffee: Courtney Huang, Jason Yang, Yuki Feng
Lab02: Well Al B. Sorted
2021 12 10
Time Spent: 1.5 hr
*/


public class ALTester implements OrderArrayList {
  // private int[] _data; //underlying ("encapsulated") container
  // private int _size; //number of elements in ALTester
  //
  //
  // //default constructor – initializes 23-item array
  // public ALTester() {
  //   _data = new int[23];
  //   _size = 0;
  // }
  //
  //
  // //output SuperArray in [a,b,c] format
  // public String toString()
  // {
  //   String foo = "[";
  //   for( int i = 0; i < _size; i++ ) {
  //     foo += _data[i] + ",";
  //   }
  //   if ( foo.length() > 1 )
  //     //shave off trailing comma
  //     foo = foo.substring( 0, foo.length()-1 );
  //   foo += "]";
  //   return foo;
  // }
  //
  // //returns number of meaningful elements
  // public int size()
  // {
  //   return _size;
  // }
  //
  //
  // //double capacity of SuperArray
  // public void expand()
  // {
  //   int[] temp = new int[ _data.length * 2 ];
  //   for( int i = 0; i < _data.length; i++ )
  //     temp[i] = _data[i];
  //   _data = temp;
  // }
  //
  // //adds an item after the last item
  // public boolean add( int newVal )
  // {
  //   if ( _size >= _data.length )
  //     expand();
  //   _data[_size] = newVal;
  //   _size ++;
  //   return true;
  // }

  //checks if the elements are sorted in ascending order
  public String sortedChecker(){
    for (int i = 0; i < _size-1; i++) {
      //checks if element at index i is less than the next element
      //if not, continue checking
      if (_data[i] <= _data[i+1]) {
        _data[i] = _data[i];
      }
      else {
        return "Unsorted";
      }
    }return "Sorted";
  }

  // //sorts through array by iterating.
  // public void sorter(){
  //   for (int i = 0; i < _size; i++) {
  //     for (int x = 0; x < (_size - 1 - i); x++) {
  //       if (_data[x] > _data[x+1]) {
  //         int big = _data[x]; //sets x to temporary var big; ex: {2,1} -> _data[x] = 2 = big
  //         _data[x] = _data[x+1]; //since _data[x+1] is the smaller element, it moves to _data[x]; ex: {2,1} -> {1,1}
  //         _data[x+1] = big; //sets _data[x+1] to the temp var, the bigger element; ex: {1,1} -> {1,2}
  //       }
  //     }
  //   }
  // }


  public static void main(String[] args) {
    ALTester slay = new ALTester();
    for (int i = 0; i < 23; i++) {
      //populates _data with randomized integers ranging from 0 to 23
      slay.add((int) (Math.random() * 24));
    }
    System.out.println("Printing ALTester slay...");
    System.out.println("\t" + slay);
    System.out.println("Is slay sorted or unsorted? Checking...");
    System.out.println("\tVerdict: " + slay.sortedChecker());
    // slay.sorter();
    System.out.println("Yasss!! Printing sorted slay...");
    System.out.println("\t" + slay);
  }
}
