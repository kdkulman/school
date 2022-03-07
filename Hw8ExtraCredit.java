import java.util.Random;

/*
*Implement 3 Range algorithms, each of increasing Big Oh time
*3/6/22
* Kevin Kulman
 */
public class Hw8ExtraCredit {

    //size of array to create
    public static int arraySize = 100000;
    public static int intSizes = 1; //scale how large ints are from random function
    public static long startTime = System.currentTimeMillis();
    public static long endTime;

    public static void main(String[] args) {
        Random rand = new Random();

        //create array
        int[] array = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            array[i] = Math.abs(rand.nextInt() / intSizes);
        }

        //Run range algorithms
        slowRange(array);
        getTime();
        mediumRange(array);
        getTime();
        fastRange(array);
        getTime();
    }

    // returns the range of values in the given array;
    //Slowest algorithm
    public static void slowRange(int[] numbers) {
        int maxRange = 0;     // look at each pair of values
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                int diff = Math.abs(numbers[j] - numbers[i]);
                if (diff > maxRange) {
                    maxRange = diff;
                }
            }
        }
        System.out.print("Slow range method: ");
        System.out.print(maxRange);
    }

    //Find range but faster than slowRange method
    public static void mediumRange(int[] numbers) {
        int maxRange = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int diff = Math.abs(numbers[j] - numbers[i]);
                if (diff > maxRange) {
                    maxRange = diff;
                }
            }
        }
        System.out.print("Medium range method: ");
        System.out.print(maxRange);
    }

    //Find range but faster than mediumRange method
    public static void fastRange(int[] numbers) {
        int max = numbers[0];
        int min = max;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            } else if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.print("Fast range method: ");
        System.out.print(max - min);
    }

    //return time duration
    public static void getTime(){
        endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        startTime = endTime;
        System.out.println(" | Runtime: " + duration + " milliseconds");
    }
}
