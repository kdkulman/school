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

        /*
         * ARRAYLIST SORTING TEST CODE
         * ADD THE HELPER TEST METHOD TO MAIN CLASS
         */
        MyArrayList<Integer> list = new MyArrayList<>();
        Random rand = new Random();
        list.insert(38);
        list.insert(80);
        list.insert(53);
        list.insert(72);
        list.insert(2);
        list.insert(50);
        list.insert(111);
        list.insert(23);

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.addToEnd(45);
        linkedList.addToEnd(90);
        linkedList.addToEnd(12);
        linkedList.addToEnd(3);
        linkedList.addToEnd(78);
        linkedList.addToEnd(1);
        linkedList.addToEnd(-9);
        linkedList.addToEnd(50);

        //TEST 1
        test(list.toString(), "[38, 80, 53, 72, 2, 50, 111, 23]");

        //TEST 2
        list.sort();
        test(list.toString(), "[2, 23, 38, 50, 53, 72, 80, 111]");

        //TEST 3
        test(linkedList.toString(), "[45, 90, 12, 3, 78, 1, -9, 50]");

        //TEST 4
        linkedList.sort();
        test(linkedList.toString(), "[-9, 1, 3, 12, 45, 50, 78, 90]");

        //RESULT
        System.out.println("----------------------------");
        System.out.println("Passed " + passed + "/" + testCount + " tests!");


    }
}
