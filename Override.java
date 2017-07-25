class Override{
 public static void main (String s []) {
 Animal a =new Animal ();
 Animal b =new Dog(); 
a.move();
b.move();}
}
 class Animal {
 public void move (){
 System.out.println(" How are you ?");
}
 }

class Dog extends Animal{
 public void move (){
 System.out.println(" I'm Good" ) ; }
}