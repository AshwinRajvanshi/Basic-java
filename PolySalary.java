classs PolySalary extends PolyEmployee  {
   private double salary ; 
   public salary ( String name ,String address, int number){
   super(name,address,number);
	setSalary(salary);
	}
 public void mailCheck (){
System.out.println("With mailcheck of salary class");
 System.out.println("Mailing chek to getName "+getName()+"with salary"+Salary);
	}
 public void getSalary(){ 
 return  salary ;
  }
public void setSalary(double newSalary){
 if (newSalary >=0.0){
  salary=newSalary ; 
	}	
		}
public double computePay(){
 System.out.println("Computing Salary" + getName);
  return salary/52;
	} 
     }