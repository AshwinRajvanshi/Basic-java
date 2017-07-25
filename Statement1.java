class Statement1{
  public static void main ( String s  [] )
   {
     int [] numbers = {10,1,3,3,4,5,70};
      for (int x : numbers ){
      if (x==5){
         break;
       }
     System.out.println(x);
     System.out.println("\n");
    }
  }
}