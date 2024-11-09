import java.util.Scanner;
class Factorial{

     public static void main(String args[])
  {
                  Scanner sc = new Scanner(System.in);

                  System.out.println("****Enter a number to find its factorial****");
         try{
                int i = 1;
                int f= sc.nextInt();
                for(int j=f; f>=1 ; f--   )
                {

                   i = i * f;
                  }

              System.out.println("the factorial is " + i);

         }
         catch(Exception e){
               System.out.println("You have an exception");


         }



}
}