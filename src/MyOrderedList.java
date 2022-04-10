/*
 *This class
 *@author Kevin Kulman
 *@version 4/10/22
 */

public class MyOrderedList<Type extends Comparable<Type>> {
    private MyArrayList<Type> list;
    public long comparisons;

    public MyOrderedList(){
        list = new MyArrayList<>();
    }

    //add - Adds the item to the position of the list where it belongs. This method should
    //run in O(n) time in the worst case.
    public void add(Type type){
        comparisons++;
        list.insert(type);
        for(int i = size()-1; i > 0; i--) {
            comparisons++;
            if (list.get(i).compareTo(list.get(i-1)) < 0) {
                //swap
                Type temp = list.get(i);
                list.set(i, list.get(i-1));
                list.set(i-1, temp);
            } else {
                break;
            }
        }
    }

    //remove - Removes the item from the list if found. This method should run in O(n)
    //time.
    public Type remove(Type type){
        for(int i = 0; i < size(); i++)
            if(list.get(i).compareTo(type) == 0) return list.remove(i);
        return null; //not found
    }

    //Helper method for remove
    //Returns index if found, otherwise returns -1
    private int removeBinarySearch(Type type, int start, int finish){
        int mid = finish/2;
        Type target = list.get(mid);
        if(target.compareTo(type) == 0) return mid;
        if(start == finish && target.compareTo(type) != 0) return -1;
        if(target.compareTo(type) >= 0) return removeBinarySearch(type, start, mid);
        if(target.compareTo(type) < 0) return removeBinarySearch(type, mid+1, finish);
        return -1;
    }

    //+binarySearch - Uses a binary search to search the list for item and returns true
    //if found, and false, otherwise.
    public boolean binarySearch(Type type){
        if (isEmpty()) return false; //Check if empty list
        //list.sort();
        return binarySearch(type, 0, size()-1);
    }

    //Helper method for recursive binarySearch
    private boolean binarySearch(Type type, int start, int finish){
        int mid = (start+finish)/2;
        Type target = list.get(mid);
        //comparisons++;
        if(target.compareTo(type) == 0) return true;
        //comparisons++;
        if(start == finish && target.compareTo(type) != 0) return false;
        comparisons++;
        if(target.compareTo(type) >= 0) return binarySearch(type, start, mid);
        comparisons++;
        return binarySearch(type, mid+1, finish);
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
