package arraydemo3;

import java.util.Scanner;
// Find the highest and the lowest grades
public class ArrayDemo {

    public static void main (String [] args) {
        final int size = 10;
        int[] grades = new int[size];
        Scanner input = new Scanner(System.in);

        int max, min ;

        // Read grades into an Array
        for (int i = 0; i < size; i++)
        {
            System.out.println("Enter a value for grade " + (i+1) + ": ");
            grades[i] = input.nextInt();
        }

        max = grades[0];
        min = grades[0];


        for (int i = 0; i < size; i++)
        {
            if (grades[i] > max)
                max = grades[i];
        }

        System.out.println("The max is " + max);

        for (int i = 0; i < size; i++)
        {
            if (grades[i] < min)
                min = grades[i];
        }

        System.out.println("The min is " + min);
        //System.out.println("\nThe number of A grades is " + CountAs(grades));

    }
    /*public static int CountAs(int[] array)
    {
        int count;
        count = 0;

        for (int i = 0; i < array.length; i++)
        {
            if(array[i]>=90)
                count++;
        }
        return count;
    }*/
}
