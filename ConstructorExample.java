class ConstructorExample{ //this example
    int num = 10;
    public static void main ( String s []){
    ConstructorExample obj1 = new ConstructorExample();
    obj1.print();
    ConstructorExample obj2=new ConstructorExample();
    obj2.print();
     }  

        ConstructorExample(){
        System.out.println("Hi Ashwin");
           }
        ConstructorExample( int num ){
        this ();
        this.num=num;
         }
         public void greet () {
         System.out.println(" Hello Ashwin");
           }
   
     public void print () {
        int num=200 ; 
         System.out.println (" local variable " +num);
         System.out.println ( "instance variable " +this.num);
         this.greet() ;
          }
}