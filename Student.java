import java.util.Scanner;
class Student{

		 static int total=500;
		 
		  Scanner sc = new Scanner(System.in);

      void display(){
		               int obt;

		              obt= sc.nextInt();

		              System.out.println("the obtained marks are "+obt+ " out of "+total);


        //  System.out.println("your percentage is "+p);

}

public static void main (String args[]){


	      Student s1 = new Student();
	              s1.display();
	    Student s2 = new Student();
	              s2.display();



}
}