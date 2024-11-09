import java.util.Scanner;
class GrandParent {
    int num1, num2, sum;
    void Sum(int a, int b){
        num1 =  a;
        num2 = b;
        sum = num1 + num2;
    }

    void Display1(){
        System.out.println("\n Grand Parent Class");
        System.out.println("Number-1: " + num1);
        System.out.println("Number-2: " + num2);
        System.out.println("Result After Addition: " + sum);
    }
}
class Parent extends GrandParent{
    int sub;
    void Subtract(int a,int b){
        num1 = a;
        num2 = b;
        sub = num1 - num2;
    }
    void Display2(){
        System.out.println("\n  Parent Class");
        System.out.println("Number-1: " + num1);
        System.out.println("Number-2: " + num2);
        System.out.println("Result After Substraction: " + sub);
    }
}
class Child extends Parent{
    int mul;
    void Multiply(int a,int b){
        num1 = a;
        num2 = b;
        mul = num1 * num2;
    }
    void Display3(){
        System.out.println("\n  Child Class");
        System.out.println("Number-1: " + num1);
        System.out.println("Number-2: " + num2);
        System.out.println("Result After Mulitiplication: " + mul);
    }
}
class Multilevel{
    public static void main(String[] args) {
        int x,y;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter 1st Number ->");
            x = scan.nextInt();

            System.out.println("Enter 2nd Number ->");
            y = scan.nextInt();

            //create object of child class
            Child obj = new Child();
            
            //accessing methods of GrandParent class using Child class obj
            obj.Sum(x,y);
            obj.Display1();
            
            //accessing methods of Parent class using Child class obj
            obj.Subtract(x,y);
            
            //accessing methods of Class
            obj.Multiply(x,y);
            obj.Display3();



            System.out.println("\nYout Entered");
            System.out.println("First Number: "+ x );
            System.out.println("Second Number:" + y);

        }
        catch(Exception e){
         System.out.println("This Error part is Executed");   
        }
        finally{
            scan.close();
        }
    }
}







