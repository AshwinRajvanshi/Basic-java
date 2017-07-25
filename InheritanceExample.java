class Example {
int z ;
  public static void main ( String s  [] ) {
   int a =10,b=20; 
  InheritanceExample cal = new InheritanceExample();
   cal.add (a,b);
   cal.sub(a,b);
   cal.div(a,b);
   cal.multi(a,b);
   }
   public void add (int x, int y ){
     z=x+y;
   System.out.println("Addition" +z);  
   }
   public void sub ( int x , int y  ){
   z=x-y;   
   System.out.println (" subtraction " +z);  }
   public void div ( int x , int y ){
   z=x/y;
   System.out.println("Divide "  +z);} }
   public class  InheritanceExample extends Example{
      public void multi ( int x , int y){
       z=x*y;
      System.out.println("Value" +z);}
      }
