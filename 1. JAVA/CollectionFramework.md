# Contents
1. Introduction
2. List 
3. Set
4. ArrayDeque
5. Map 
6. Collection common algorithms

## 1. Introduction
![java Collection framework hierarchy](./media/Java-collection-java-collection-hierarchy.webp)
- Collection framework provides us built in data structures and algorithms which we as a developer can directly work.
- All classes and interfaces is present in java.util package.

## 2. List interface 
- It is an interface.
- 4 classes implement this interface(ArrayList, LinkedList, Vector, Stack).

### 2.a ArrayList class 
1. ArrayList provides us similar functionalities as of arrays, but it provides an advantage over arrays that is dynamic in nature, means in array, we are not able to add extra items once array is created, But in ArrayList we can add as many items as we want. So, it's size is not fixed.

2. null values can be inserted.

3. Constructors
    ```java 
        // Constructs an empty list with an initial capacity of ten(default).
        ArrayList<T> list = new ArrayList();
                
        // Constructs a list containing the elements of the specified collection.
        ArrayList<T> list = new ArrayList(Collection<T> collection);
    ```

4. Methods to work with 
   ```java 
        // Read element at index i 
        T element = list.get(i);

        // Update the element at index i 
        list.set(i, newElement);

        // get total number of elements 
        int size = list.size();

        // add in the end of list, status returned is true if element added succesfully else return false.
        boolean status = list.add(element);

        // add at at index i 
         list.add(i, element);

        // remove element at index i, also return the removed elements.
        T element = list.remove(i);

        // search for first index and last of an element, return -1 if element not found.
        int firstIndex = list.indexOf(element);
        int lastIndex = list.lastIndexOf(element);

        // search if it contains an element or not, not interested in index only interested in present or not. ans is true if present
        boolean ans = list.contais(ele);

        // sort the entire list 
        list.sort();

        // traverse the arraylist , using typical for-i loop 
        for(int i=0;i=n;i<list.size()){
            int ele = list.get(i);
        }

        // traverse using enhanced for loop 
        for(int ele: arr){
            
        }
    ```
