class Base
{
    int a,b,sum;
    void Add(int x, int y){
        a = x;
        b = y;
        sum = a+b;
    }
    void display(){
        System.out.println("\nIn Base Class");
        System.out.println("A ="+a);
        System.out.println("B ="+b);
        System.out.println("Sum ="+sum);
    }
}

class Derived extends Base
{
    int subt;
    void Subtract(int x, int y){
        a = x;
        b = y;
        subt = a-b;
    }
    void show(){
        System.out.println("\nIn Derived Class");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("Subt = "+subt);
    }

}

class SingleIn
{
    public static void main(String[] args) {
        Derived obj = new Derived();

        obj.Add(10,20);
        obj.display();

        obj.Subtract(45, 12);
        obj.show();
    }
}






