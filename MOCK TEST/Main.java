/*Create a superclass called Animal with a method makeSound() that
 prints the sound made by the animal. Implement subclasses Dog, Cat, 
 and Cow that inherit from the Animal class. Implement the makeSound() 
 method in each subclass to print the sound made by a dog, cat, and cow, respectively.*/
class Animal{
    public void MakeSound(){

    }
 }
 class Dog extends Animal{
    public void MakeSound(){
      System.out.println("woof");
    }
 }
  class Cat extends Animal{
     public void MakeSound(){
        System.out.println("Meuw!");
     }
  }
  class Cow extends Animal{
    public void MakeSound(){
        System.out.println("Moo");
    }
  }
  public class Main{
   public static void main(String args[]){
      Dog dg=new Dog();
      dg.MakeSound();

      Cat ct=new Cat();
      ct.MakeSound();

      Cow cw= new Cow();
      cw.MakeSound();
   }
  }