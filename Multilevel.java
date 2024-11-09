class Grandparents
{
    void display()
    {

        System.out.println("my children are");
    }
}
class Parents extends Grandparents
{
    void display1()
    {
      System.out.println("mand me bdfvn 7i6");
    }
}
class Child extends Grandparents
{
    void display2()
    
    {
        System.out.println("chup kr be kutte");
    }
}
class Multilevel
{
    public static void main(String args[])
    {
        Child c1=new Child();
       // c1.display();
        c1.display();
        c1.display();
    }
}