class Animal{


    void sound(){
        System.out.println("make a sound");
    }
}


class Cat extends Animal{

void sound(){
     System.out.println("meow maano");

}

}

class Dog extends Animal{

void sound(){
     System.out.println("bhau bhau");

}

}

class Overriding{
    public static void main (String args[]){
        Cat c1= new Cat();
         Animal d1= new Dog();

         c1.sound();
         d1.sound();


}
}