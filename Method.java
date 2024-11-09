class Method{



     void display(int a){


        System.out.println("FIRST");
     }


     void display(int a,int b){


        System.out.println("SECOND");
     }

        void display(int a,int b,int c){


        System.out.println("THIRD");

     }

     public static void main (String args[]){
		 Method m1=new Method();

        m1.display(5);
        m1.display(5,6);
        m1.display(5,6,9);






}
}