import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/*
 * Main method to test
 *
 */
public class main {

    public static int testCount = 0;
    public static int passed = 0;
    //Helper class to test
    public static void test(String actual, String expected){
        int tempTestCount = testCount+1;
        if(actual.equals(expected)) {
            System.out.println("Test " + tempTestCount + " passed!");
            passed++;
        } else{
            System.out.println("Test " + tempTestCount + " failed.");
        }
        System.out.println("Actual: " + actual + " | Expected: " + expected);
        System.out.println();
        testCount++;
    }

    public static void main(String[] args) {

        try {
            UniqueWords uniqueWords = new UniqueWords();
//            BookReader b = new BookReader("C:\\Java\\jdk-17.0.1\\bin\\corejava\\v1ch02\\DataStructures\\src\\WarAndPeace.txt");
        } catch (IOException e){
            System.out.println("File not found.");
        }
        //Test 1

//        MyLinkedList list = new MyLinkedList<>();
//        LinkedList<Integer> list2 = new LinkedList<>();
//        Random rand = new Random();
//        for(int i = 0; i < 100000; i++){
//            list.addToEnd(rand.nextInt(40000));
//            list2.add(rand.nextInt(50000));
//        }
//        Collections.sort(list2);
//        //list.sort();
//        System.out.println(list.toString());
//        System.out.println("Sorted with " + list.comparisons + " comparisons");


        //RESULT
        System.out.println("----------------------------");
        System.out.println("Passed " + passed + "/" + testCount + " tests!");

    }
}
