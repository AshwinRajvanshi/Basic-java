class OverloadingExample {
 public static void main (String s []) {
   int a =11,b=23;
   double c =2.3,d=1.2;
   int result1 = minFunction(a,b);

   double result2=minFunction(c,d);

   System.out.println("For interger the min fun " +result1);
   System.out.println("For Double the min fun " +result2);
  }
       public static int minFunction( int n1 , int n2 ) {
        int min ;
          if (n1 > n2)
        min =n2; 
           else 
        min =n1; 
         return  min;    
         }
   
            public static  double minFunction( double n1, double n2) {
    		 double min ;
    		if(n1>n2)
    		min = n2;
    		  else 
      		min = n1;
     		return min ;   
   		}
}