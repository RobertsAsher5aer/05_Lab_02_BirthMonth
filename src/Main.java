import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your birth month, range [1-12]: ");
        int birthMonth = in.nextInt();

        if (birthMonth >= 1 && birthMonth <= 12 ) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("Your entered birth month, " + birthMonth + ", is out of the range. Please re-enter. ");
        }



    }

}