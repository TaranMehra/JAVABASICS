import java.util.Scanner;
class Doswitch{
                      public static void main (String args[]){
                   
                Scanner sc = new Scanner(System.in);
                 
                

             
                   try{
                
                      do{
                          System.out.println("****Enter a number****");
                          System.out.println("Press 1 for area of circle");
                          System.out.println("Press 2 for area of rectangle");
                          System.out.println("Press 3 to exit");
                          int i= sc.nextInt();
                         


                      } while(i!=3);
                      
                      switch(i)
                      {

                           case 1: 
                           int pie= 3;
                           int radius;
                           int result2;
                           int radius= sc.nextInt();
                           int result2= pie*(radius*radius);
                            System.out.println("The area of circle is " + result2);
                            break;



                            case 2: 
                            int l,b,h,result;
                           
                           int l= sc.nextInt();
                           int b= sc.nextInt();
                           int h= sc.nextInt();
                           int result=l*b*h;
                           
                            System.out.println("The area of rectangle is " + result);
                            break;



                            case 3:
                                System.out.println("You have entered 3");
                                break;

                            default: 
                                      System.out.println("You have entered wrong value");
                                      break;





                      }
                      


                }
                      catch(Exception e){

                         System.out.println("You have an exception");

                      }



                








                }


}