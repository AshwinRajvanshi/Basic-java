//import java.util.Date;
//class Dateyear {

  // public static void main(String args[]) {
      // Instantiate a Date object
     // Date date = new Date();
  
      // display time and date
    //  System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
 //  }
//}



import java.util.Date;
class DateDemo {

   public static void main(String args[]) {
      // Instantiate a Date object
      Date date = new Date();

      // display time and date
      String str = String.format("Current Date/Time : %tc", date );

      System.out.printf(str);
   }
}