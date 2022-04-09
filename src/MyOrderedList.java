/*
 *This class
 *@author Kevin Kulman
 *@version 4/9/22
 */

public class MyOrderedList<Type extends Comparable<Type>> {
    private MyArrayList<Type> list;
    public long comparisons;

    //add - Adds the item to the position of the list where it belongs. This method should
    //run in O(n) time in the worst case.
    public void add(Type type){

    }

    //remove - Removes the item from the list if found. This method should run in O(n)
    //time.
    public Type remove(Type type){
        return null; //PLACEHOLDER
    }

    //+binarySearch - Uses a binary search to search the list for item and returns true
    //if found, and false, otherwise.
    public boolean binarySearch(Type type){
        return binarySearch(type, 0, size()-1);
    }

    //Helper method for recursive binarySearch
    private boolean binarySearch(Type type, int start, int finish){

        if()
        return false; //PLACEHOLDER
    }

    //size - return size of the list
    public int size(){
        return list.size();
    }

    //isEmpty - Returns true if the size is 0 and false otherwise
    public boolean isEmpty(){
        return list.isEmpty();
    }

    //Returns a string that has the contents of the list separated by commas
    //and spaces and enclosed in square brackets.
    public String toString(){
        return list.toString();
    }

}
