class Base{
  public void show(){
    System.out.println("Base Class Version");

  }
}

class Derived extends Base{
  //applying the concept of polymorphism overriding
  public void show(){
    System.out.println("Derived Class Version");
  }
}

class DynamicDispatch {
  public static void main(String[] args) {
    //a method of dynamic(runtime) calling to a method

    Base reference;    //base class reference
    Base b = new Base();
    reference = b;
    reference.show();

    reference = new Derived();
    reference.show();
    

    
  }    
}
