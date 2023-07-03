/* Write a Java program to find the largest of three numbers using nested if-else statements.*/
public class LargestNumber{
    public static void main(String args[]){
        int a=10;
        int b=90;
        int c=45;
        if(a==b||b==c||a==c){
            System.out.println("All are Equal");
        }
        if(a>b && a>c){
            System.out.println(a+ " Is Largest");
        }else if(b>c){
            System.out.println(b+" Is Largest");
        }else{
            System.out.println(c+" Is Largest");
        }
    }
}