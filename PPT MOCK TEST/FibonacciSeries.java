/*Write a Java program to print the Fibonacci series up to a given number using a for loop.*/
public class FibonacciSeries{
    public static void main(String args[]){
        int n=10;
        int a=-1,b=1,c=0;
        for(int i=0;i<=n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}