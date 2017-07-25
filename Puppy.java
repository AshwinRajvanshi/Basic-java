public class Puppy { 
int puppyAge;
   public static void main (String s[]){
    Puppy myPuppy = new Puppy("tommy"); // Declaration,Instantiation,Initialization
    myPuppy.setAge(2);
    myPuppy.getAge( );
    System.out.println ("VAlue"+myPuppy.puppyAge);
    }
      public Puppy (String name ){
      System.out.println( "Nmae is " +name );
       }
        public void setAge ( int age){
        puppyAge = age;
         }
          public int getAge ( ) {
          System.out.println( " age is " +puppyAge);
          return puppyAge; 
           }
  } 
