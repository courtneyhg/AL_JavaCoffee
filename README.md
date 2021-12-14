# AL_JavaCoffee
Java Coffee: Jason Yang, Yuki Feng, Courtney Huang

### ALTester
 - `sortedChecker` iterates through all of the elements of the array, checking if the value of the index it is at is less than the value of the index after it. If this is true for all the elements, then `true` is returned. Otherwise, `false` is returned.


### OrderedArrayList
 - `OrderedArrayList()` is the default constructor and creates an empty ArrayList named `_data` 
 - `size` returns the size of the array.
 - `add` takes in a number and inserts it to the end of the array. If the array does not have space, `expand` is called in order to make space. The number is then inserted to the array. 
 - `toString` returns the array in String form
 - `remove(int i)` removes the value at index using the `remove(int index)` function which is given by ArrayList.
 - `addLinear` adds by comparing each value linearly with the newValue. If it is less than value at the current index, it adds at that spot.

