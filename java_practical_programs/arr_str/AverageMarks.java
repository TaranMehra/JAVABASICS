import java.util.Scanner;

class AverageMarks {
    public static void main(String[] args) {
        int marks[] = new int[5];
        int total = 0;
        double average = 0;
        int n = marks.length;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter Marks 5 Subjects\n");
            for(int index=0; index<marks.length; index++){
                
                    marks[index] = sc.nextInt();
            }    
                System.out.println("\n MARKS ARE \t");

                for(int index=0; index<marks.length; index++){
                    System.out.println("Marks are: "+marks[index]);
                    total = total + marks[index];
                
                }
                average = total/n;
                System.out.println("Average Marks : "+average);
                System.out.println("Total : "+total);
            
        }
        catch(Exception e){
            System.out.println("You Got the error");
            if(!sc.hasNextInt()){
                System.out.println("You have not entered the Integer");
            }
        }
    }
    
}

