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

//        /*
//         * ARRAYLIST TEST CODE
//         * ADD THE HELPER TEST METHOD TO MAIN CLASS
//         */
//        MyArrayList<Integer> list = new MyArrayList<>();
//        for(int i=0; i < 5; i++){
//            list.insert(i, i);
//        }
//
//        //TEST 1
//        test(list.toString(), "[0, 1, 2, 3, 4]");
//
//        //TEST 2
//        test("" + list.size(), "5");
//
//        //TEST 3
//        list.insert(7, 6);
//        test(list.toString(),"[0, 1, 2, 3, 4]");
//
//        //TEST 4
//        list.insert(7, 0);
//        test(list.toString(),"[7, 0, 1, 2, 3, 4]");
//
//        //TEST 5
//        list.insert(12, -5);  //No error should occur
//        test(list.toString(),"[7, 0, 1, 2, 3, 4]");
//
//        //TEST 6
//        list.insert(69, list.size()+11); //Out of bounds check
//        test(list.toString(),"[7, 0, 1, 2, 3, 4]");
//
//        //TEST 7
//        list.remove(-1);
//        test(list.toString(),"[7, 0, 1, 2, 3, 4]");
//
//        //TEST 8
//        list.remove(list.size());
//        test(list.toString(),"[7, 0, 1, 2, 3, 4]");
//
//        //TEST 9
//        list.remove(list.size()-1);
//        test(list.toString(),"[7, 0, 1, 2, 3]");
//
//        //TEST 10
//        test("" + list.contains(-1),"false");
//
//        //TEST 11
//        test("" + list.contains(1),"true");
//
//        //TEST 12
//        test("" + list.contains(3),"true");
//
//        //TEST 13
//        test("" + list.indexOf(7), "0");
//
//        //TEST 14
//        test("" + list.indexOf(55), "-1");
//
//        //TEST 15
//        test("" + list.get(100), "null"); //out of bounds check
//
//        //TEST 16
//        test("" + list.get(-1), "null"); //out of bounds check
//
//        //TEST 17
//        MyArrayList<String> list2 = new MyArrayList<>();
//        test("" + list2.get(0), "null");
//
//        //TEST 18
//        list2.insert("Ronald", 0);
//        list2.insert("Mcdonald", 0);
//        list2.insert("Donald", 0);
//        test(list2.toString(), "[Donald, Mcdonald, Ronald]");
//
//        //TEST 19
//        list2.set(-1, "DOOM"); //out of bounds check
//        test(list2.toString(), "[Donald, Mcdonald, Ronald]");
//
//        //TEST 20
//        list2.set(900, "DOOM"); //out of bounds check
//        test(list2.toString(), "[Donald, Mcdonald, Ronald]");
//
//        //TEST 21
//        test("" + list2.size(), "3");
//
//        //TEST 22
//        test("" + list2.isEmpty(), "false");
//
//        //TEST 23
//        list2.remove(0);
//        list2.remove(0);
//        list2.remove(0);
//        list2.remove(0);
//        test("" + list2.isEmpty(), "true");
//
//        //RESULT
//        System.out.println("----------------------------");
//        System.out.println("Passed " + passed + "/" + testCount + " tests!");






















//        MyArrayList<String> list = new MyArrayList<>();
//        list.insert("banana", 0);
//        list.insert("ascbkjas", 0);
//        list.insert("aoso", 0);
//        list.insert("9e0c", 0);
//        list.insert("WEEEENIEEEEEEEEEE", 0);
//        System.out.println(list.toString());
//        System.out.println(list.toString());







          //RESULT
//        System.out.println("----------------------------");
//        System.out.println("Passed " + passed + "/" + testCount + " tests!");

    }
}
