classs PolyEmployee{
   private String name ;
   private String address;
   private int number;

 public PolyEmployee (String name,String address; int number) {
    System.out.println("Constructing an Employee");
    this.name=name;
    this.address=address;
    this.number=number;
      }

   public void mailcheck(){
   System.out.println("Mailing a check to" +this.name+"" +this.address+""+this.number);
    }
   public String toString(){ 
     return name +"" +address +""+number;}
   public String getName(){
     return name ;
 	}
   public String getAddress(){
    return address;
    }
  public void setAddress(){
   address=newAddress();
    }
  public int getNumber(){
  retuen number;
   }

}