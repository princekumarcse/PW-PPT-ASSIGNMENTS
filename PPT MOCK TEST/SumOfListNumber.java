/*Write a Java program to calculate the average of a list of numbers using a do-while loop.*/
import java.util.*;
public class SumOfListNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number and Type -1 to stop");
        int input;
        int sum = 0;
        int count = 0;

        while ((input = sc.nextInt()) != -1) {
            sum += input;
            count++;
        }

        double average = (double) sum / count;

        System.out.println("Average: " + average);
    }
}