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

    public static void main(String[] args) throws IOException {
        MyHashTable<Integer, String> hash = new MyHashTable<>(32768);
        MyHashTable<Integer, Integer> hashT = new MyHashTable<>(32768);
//

//        for(int i = 0; i < 32768; i++){
//            hash.put(i, "kevin");
//        }
//        hash.put("Kevin", 25);
//        hash.put("Eevee", 23);
//        hash.put("Sophie", 1);
//        hash.put("Sophie", 1);
//        hash.put("Sophie", 14);
//        System.out.println(hash.toString());
//
//        System.out.println(hash.get("Kevin"));
//        System.out.println(hash.get("Eeve"));
//        System.out.println(hash.get("Eevee"));
//        System.out.println(hash.get("Sophie"));
//        int array[] = { 5, 3, 7, 1, 4, 6, 8, 2, 0, 9 };
//        for (int index = 0; index < array.length; index++)
//            hashT.put(index, index * 10);
////
//        System.out.println("Comparisons: " + hashT.comparisons);
//        UniqueWords w = new UniqueWords();




        //RESULT
        System.out.println("----------------------------");
        System.out.println("Passed " + passed + "/" + testCount + " tests!");


    }
}
