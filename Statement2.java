class Statement2{ // continue Statement
 public static void main (String s [])
 {
  int [] numbers = { 10,23,34,45,56,100,2,26,};
   for ( int x : numbers){
   if (x==100) {
   continue ; 
    }
   System.out.println( x );
   System.out.println("\n");
  }
 }
}