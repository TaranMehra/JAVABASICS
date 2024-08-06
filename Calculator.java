import java.util.Scanner;

public class Calculator {

    static int i;

   
    public static void main(String args[]){
 try{
         Scanner sc= new Scanner(System.in);
          
      double num1, num2;
         System.out.println("Enter first number--");
         num1=sc.nextDouble();
         System.out.println("Enter Second number--");
         num2=sc.nextDouble();
        
         System.out.println("Select operator--");
         char op= sc.next().charAt(0);
         double r=0;
         

         switch (op) {
             case '+':
                 r = num1 + num2;
                 break;

             case '-':
                 r = num1 - num2;
                 break;

             case '*':
                 r = num1 * num2;
                 break;

             case '/':
                 r = num1 / num2;
                 break;

             default:
                 System.out.println("***Enter a valid operator***");
                 i = 5;

         }
         if (i != 5) {
             System.out.println("The result is:");
             System.out.println(num1 + " " + op + " " + num2 + " = " + r);
         }

    }

            catch(Exception e){
                System.out.println(e.getMessage());
            }
            
}
}



 

    

