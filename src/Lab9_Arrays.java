import java.util.Random;
import java.util.Scanner;

public class Lab9_Arrays
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        // Task 1
        int[] dataPoints = new int[100];

        // Task 2
        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 3
        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.println();

        // Task 4
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("\nThe sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        // Task 5
        int userVal = SafeInput.getRangedInt(in, "Enter a value to search for", 1, 100);

        // Task 6
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == userVal)
            {
                count++;
            }
        }
        System.out.println("\nThe value " + userVal + " was found " + count + " time(s) in the array.");

        // Task 7
        userVal = SafeInput.getRangedInt(in, "Enter another value to search for", 1, 100);
        boolean found = false;
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == userVal)
            {
                found = true;
                position = i;
                break;
            }
        }
        if (found)
        {
            System.out.println("\nThe value " + userVal + " was found at array index " + position);
        }
        else
        {
            System.out.println("\nThe value " + userVal + " was not found in the array.");
        }

        // Task 8
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++)
        {
            if (dataPoints[i] < min)
            {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }
        System.out.println("\nThe minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        // Task 9 (call)
        System.out.println("\nAverage of dataPoints is: " + getAverage(dataPoints));
    }

    // Task 9 (method goes right after main)
    public static double getAverage(int values[])
    {
        int total = 0;
        for (int i = 0; i < values.length; i++)
        {
            total += values[i];
        }
        return (double) total / values.length;
    }
}