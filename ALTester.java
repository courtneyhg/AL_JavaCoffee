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
  private int[] _data;
  private int _size;

  //default constructor – initializes 23-item array
  public ALTester() {
    _data = new int[23];
    _size = 0;
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


  public int size()
  {
    return _size;
  }



  public static void main(String[] args) {
    OrderArrayList slay = new ALTester();
    System.out.println("Printing empty ALTester slay...");
    System.out.println(slay);
  }
}
