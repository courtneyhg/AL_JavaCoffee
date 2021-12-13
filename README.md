# AL_JavaCoffee
Java Coffee: Jason Yang, Yuki Feng, Courtney Huang

### ALTester
 - `sortedChecker` iterates through all of the elements of the array, checking if the value of the index it is at is less than the value of the index after it. If this is true for all the elements, then `true` is returned. Otherwise, `false` is returned.


### OrderedArrayList
The interface that contains all the abstract methods AlTester implements.
 - `expand` creates a new array with a size 2 times greater than the original array and copies elements from that array into the new array.
 - `size` returns the size of the array.
 - `add` takes in a number and inserts it to the end of the array. If the array does not have space, `expand` is called in order to make space. The number is then inserted to the array.
 - `remove` 
 - `sortedChecker` iterates through all the elements of the array, checking if an element is less than or equal to the element to the right of it. If all the elements are less than or equal to the element to the right, then "Sorted" is returned.
 - `sorter` uses a nested `for` loop to sort the array from smallest value to greatest. If a value is greater than the value to the right, the greater value becomes the smaller value, and the original place of the small value becomes the bigger value.

`sorter` checks if the elements of array type `ArrayList<Integer>` are sorted in ascending
order by seeing if the first index is less than or equal to the next index and so on.
Next, it sorts the array through iteration. We nested a for loop in a for loop. The
first for loop makes sure we go through the array and the second for loop makes sure the
elements are in ascending order. It compares the element at a specific index with the
rest of the elements. If the element at index x is greater than the compared element then the elements are switched.
