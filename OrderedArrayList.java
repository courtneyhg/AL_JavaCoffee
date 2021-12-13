import java.util.ArrayList;
public class OrderedArrayList {
/*
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
*/

// instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;
	
  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
    _data = new ArrayList<Integer>();
  }

  public String toString()
  {
	return _data.toString();
  }

  public Integer remove( int i )
  {
	return _data.remove(i);
  }

  public int size()
  {
	return _data.size();
  }

  public Integer get( int i )
  {
	return _data.get(i);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {	if (_data.size() == 0){
  		_data.add(newVal);
  		}
  		else {
       for (int x = 0; x < _data.size(); x++) {
         if (_data.get(x) <= newVal) {
         }
         else{
         _data.add(x, newVal);
         break;
         }
         
       }
       }
  }
/*
  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {

  }	
*/
  // main method solely for testing purposes
  public static void main( String[] args )
  {
    
    OrderedArrayList Franz = new OrderedArrayList();
    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    /*-----v-------move-me-down-----------------v--------
    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ ) 
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
      =====^====================================^=========*/

  }//end main()


}
