import java.util.Scanner;
class Bike {
    Scanner sc=new Scanner(System.in);
 static int x;
 
           void hello1(){

         System.out.println("The price of Bike is ");
         x=sc.nextInt();
}
}
class Aftercost extends Bike {
    static int y;
    void hello2(){

        System.out.println("Total extra cost  over the Bike is");
        y=sc.nextInt();
    }
}
class Total extends Aftercost {

    void totalcost(){
		
       int a=x+y;
        System.out.println("Total money wasted on Bike "+a);

    }
}
class Costinheritance{
    public static void main(String args[]){
       
        Total t1=new Total();
        t1.hello1();
        t1.hello2();
        t1.totalcost();
    }
}