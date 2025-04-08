abstract class Animal {
     public abstract void animalSound();
     public void sleep(){
          System.out.println("Zzz");
     }
} //Define una plantilla de animales

class Pig extends Animal {
   public void animalSound() {
        System.out.println("The pig says: onk onk");
   }
} //Aquí se crea una clase a partir de la clase abstracta, y se completa los métodos no definido.
//
class Dog extends Animal {
   public void animalSound() {
        System.out.println("The dog says: bark bark");
   }
} //Aquí se crea una clase a partir de la clase abstracta, y se completa los métodos no definido.

public class Main{
  public static void main(String args[]){
    Pig p1 = new Pig();
    Dog a = new Dog();
    p1.sleep();
    p1.animalSound();
    a.sleep();
    a.animalSound();
  }
}
