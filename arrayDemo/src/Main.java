import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int size = 10;

        int[] arrayData = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a value for grade " + (i+1) + ": ");
            arrayData[i] = input.nextInt();
        }

        System.out.println("The total is " + getTotal(arrayData) +
                          "\nThe average is "  + getAverage(arrayData) +
                            "\nThe highest is " + getHighest(arrayData) +
                            "\nThe lowest is " + getLowest(arrayData));
    }

    public static int getTotal(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int getAverage(int[] array) {
        int sum = 0;
        int average = 0;

        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        average = sum / array.length;
        return average;
    }

    public static int getHighest(int[] array)
    {
        int max = array[0];

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static int getLowest(int[] array)
    {
        int min = array[0];

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

}
