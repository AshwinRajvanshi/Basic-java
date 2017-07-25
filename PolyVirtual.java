public class PolyVirtual{
  public static void main (String s []){
 PolySalary s  = new PolySalary ("Ashish","Rampur",3,23000.00);
  PolyEmployee e = new POlyEmployee( " John ","Boaton,MA",2,23454353.00);
  System.out.println("call mailcheck using Salary referencs -- ");
s.mailchek();
 System.out.println("\n call mailcheck -- ");
e.mailcheck();
 }
}