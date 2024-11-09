class Instance2 {

    String fullname;

    public Instance2(String firstName) {
        this.fullname = firstName + "Singh";
    }

    void display() {
        System.out.println("The value of fullname : " + fullname);
    }

}

class Instance extends Instance2 {
    String instanceVariable;

    Instance(String value) {
        super(value);
        tellName(value);

    }

    void tellName(String name) {

        this.instanceVariable = name;
    }

    void display() {
        System.out.println("\n The value of instanceVariable : " + instanceVariable);
        super.display();
    }

    public static void main(String[] args) {
        Instance ins;
        ins = new Instance("Taranpreet ");
        ins.display();
    }

}
