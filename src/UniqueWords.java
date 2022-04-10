import java.io.IOException;

/*
 * This class will calculate the number of unique words in a given text file
 * @author Kevin Kulman
 * @version 4/10/22
 *
 */
public class UniqueWords {

    private BookReader book = new BookReader("C:\\Java\\jdk-17.0.1\\bin\\corejava\\v1ch02\\DataStructures\\src\\WarAndPeace.txt");

    //UniqueWords - Calls each of the addUniqueWords methods one at a time.
    public UniqueWords() throws IOException {
        //addUniqueWordsToLinkedList();
        //addUniqueWordsToArrayList();
        addUniqueWordsToOrderedList();
    }

    //Adds the unique words to a MyLinkedList.
    //a. Add only the unique words to the list
    //b. Sort the list of unique words.
    //This method should time both steps and output each runtime to the console.
    public void addUniqueWordsToLinkedList() {
        MyLinkedList<String> list = new MyLinkedList<String>();
        int uniqueWords = 0;
        String word = book.words.first();
        System.out.println();
        System.out.print("Adding unique words to LinkedList...");

        long startTime = System.currentTimeMillis(); //START TIMING METHOD
        while(word != null) {
            if(!list.contains(word)) {
                uniqueWords++;
                list.addToEnd(word);
            }
            word = book.words.next();
        }
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime)/1000; //in seconds
        System.out.println("" + uniqueWords + " unique words found in " + duration + " seconds");
        System.out.print("Sorting LinkedList...");
        startTime = System.currentTimeMillis(); //START TIMING METHOD
        //book.words.sort();
        list.sort();
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime)/1000; //in seconds
        System.out.println("in " + duration + " seconds");
        System.out.println("" + list.comparisons + " comparisons made");

    }

    public void addUniqueWordsToArrayList() {
        MyArrayList<String> list = new MyArrayList<String>();
        int uniqueWords = 0;
        //Check if word is already included
        String word = book.words.first();
        System.out.println();
        System.out.print("Adding unique words to ArrayList...");
        long startTime = System.currentTimeMillis(); //START TIMING METHOD
        while(word != null) {
            if(!list.contains(word)) {
                uniqueWords++;
                list.insert(word);
            }
            word = book.words.next();
        }
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime)/1000; //in seconds
        System.out.println("" + uniqueWords + " unique words found in " + duration + " seconds");
        System.out.print("Sorting ArrayList...");
        startTime = System.currentTimeMillis(); //START TIMING METHOD
        list.sort();
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime); //in milliseconds
        System.out.println("in " + duration + " milliseconds");
        System.out.println("" + list.comparisons + " comparisons made");

    }

    public void addUniqueWordsToOrderedList() {
        MyOrderedList<String> list = new MyOrderedList<String>();
        int uniqueWords = 0;
        //Check if word is already included
        String word = book.words.first();
        System.out.println();
        System.out.print("Adding unique words to OrderedList...");
        long startTime = System.currentTimeMillis(); //START TIMING METHOD
        while(word != null) {
            if(!list.binarySearch(word)) {
                uniqueWords++;
                list.add(word);
            }
            word = book.words.next();
        }
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime)/1000; //in seconds
        System.out.println("" + uniqueWords + " unique words found in " + duration + " seconds");
        System.out.println("" + list.comparisons + " comparisons made");

    }

}
