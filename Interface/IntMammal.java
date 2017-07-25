public class IntMammal implements InterfaceAnimal{
 public void eat(){
 System.out.println("Mammals eats");
  }
public void travel(){
 System.out.println("Mammals travels");
  }
public void noOfLegs(){
return 0;
  }
 
public static void main (String s [] ){
 IntMammal m =new IntMammal();
 m.eat();
 m.travel(); 
 }
  }