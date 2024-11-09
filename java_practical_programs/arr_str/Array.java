public class Array {
    public static void main(String[] args) {

        // int array
        int marks[] = { 10, 20, 30, 40, 50 };

        // accessing element via index
        System.out.println("Marks-3 : \t" + marks[2]);

        // char array
        char name[] = { 'T', 'A', 'R', 'A', 'N' }; // {"T","A","R","A","N"};
        System.out.println("Last Letter : \t" + name[name.length - 1]);

        // string array
        String names[] = { "Taranpreet Singh", "Hasan", "Joi", "Arjun" };
        System.out.println("The name at 3 inex: \t" + names[2]);

    }

}


