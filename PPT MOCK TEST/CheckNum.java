/*Write a Java program to check whether a given number is positive, negative, or zero 
using an if-else statement*/
import java.util.*;
public class CheckNum{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num=sc.nextInt();
        if(num>0){
            System.out.println(num+" Is Positive");
        }else if(num<0){
            System.out.println(num+" Is Negative");
        }else{
            System.out.println(num+ " Is Zero");
        }

    }
}