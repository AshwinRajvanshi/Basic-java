class ArrayExample{
  public static void main (String s []) 
    {
      double [] list = {1.3,2.4,9.0,4.2,3.6};

       for(int i =0 ; i<list.length;i++){

       System.out.println(list[i]+ "" );

       }

       double total = 0;

       for(int i =0;i<list.length;i++)

       {
        total += list[i];
       }

      System.out.println("Total is " +total ) ;

      double max = list[0];

      for(int i =1;i<list.length;i++){

        if (list [i]>max ) max =list[i];

         }

      System.out.println("Max is " +max);

       }
}
 