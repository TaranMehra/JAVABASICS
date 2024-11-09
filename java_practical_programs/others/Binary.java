import java.util.*;

class Binary {

    Scanner obj = new Scanner(System.in);

    int a = obj.nextInt();

    public int display() {

        int r = a % 2;
        a = a / 2;
        if (a != 0) {
            display();

        }
        System.out.println(r);
        return a;

    }

    public static void main(String[] args) {

        Binary sc = new Binary();
        sc.display();

    }
}
