class A {
    int sqr;

    void square(int p) {
        sqr = p * p;
        System.out.println("Square of " + p + " is: " + sqr);
    }
}

class B extends A {
    int cub;

    void cube(int p) {
        cub = p * p * p;
        System.out.println("Cube of " + p + " is: " + cub);
        ;
    }
}

class C extends A {
    double squareRoot;

    void squareRoot(int p) {
        squareRoot = Math.sqrt(p);
        System.out.println("Square Root of " + p + " is: " + squareRoot);
        ;
    }
}

class TreeInherit {
    public static void main(String[] args) {
        // creating object of class B
        B leftChild = new B();
        leftChild.cube(4);
        leftChild.square(4);

        // creating the object of class c
        C rightChild = new C();
        rightChild.squareRoot(25);
        rightChild.square(25);

    }

}
