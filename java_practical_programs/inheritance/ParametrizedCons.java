class BaseConstructor {
    int x;

    BaseConstructor(int p) { // base class constructor
        System.out.println("Base Class Constructor Invoked!");
        x = p;
        System.out.println("Value of X is Initialized");
    }

    void display() {
        System.out.println("Value of X = " + x);
    }
}

class DerivedConstructor extends BaseConstructor {
    int newone;

    // Constructor with parameter for base class
    public DerivedConstructor(int any) {
        super(any); // Call to base class constructor with parameter
        System.out.println("Derived class constructor invoked!");
    }

    void declared(int some) {
        newone = some;
    }
}

class ParametrizedCons {
    public static void main(String[] args) {
        // Creating object of derived class with value for base constructor
        DerivedConstructor dc = new DerivedConstructor(10);
        dc.declared(43);
        dc.display();
    }
}
