class SubSupper{
 public static void main (String s[]) {
      SubSupper ss = new SubSupper();
      ss.method();

      }
 public void method (){
 	
         Sub sub=new Sub ();
 	 sub.display();
	System.out.println("This is practice  Session ");
	
         } 

     
class Super{
        int num = 20;

        public void display(){

        System.out.println("How are you ? ");
		}
        }
 class Sub extends Super {
        int num=10 ; 
        public void display ( ){
         System.out.println("I'm Fine ");
super.display();
         } 
    
}
     	} 
   