import java .io.*;
public class EmployeeTest{
   public static void main (String s[])
   {
     Employee empOne=new Employee ("Ashwin ");
     Employee empTwo=new Employee ("RAjvanshi");

     empOne.empAge(30);
     empOne.empDesignation("Software Dveloper");
     empOne.empSalary(40000000);
     empOne.printEmployee();

     empTwo.empAge(30);
     empTwo.empDesignation("Sr.Software Dveloper");
     empTwo.empSalary(400);
     empTwo.printEmployee();
    }
}