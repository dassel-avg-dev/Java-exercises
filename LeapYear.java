import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting year: ");
        int start = scanner.nextInt();

        System.out.print("Enter end year: ");
        int end = scanner.nextInt();

        if(start > end) {
            System.out.println("Invalid starting year.");
            System.exit(1);
        }

        int leapCount=0;
        int notLeapCount=0;

        System.out.println("Leap years from " + start + " to " + end);
        while(start <= end) {
            if((start % 4 == 0 && start % 100 != 0) || (start % 400 == 0)) {
                leapCount++;
                System.out.println(start);
            }
            else {
                notLeapCount++;
            }
            start++;
        }

        System.out.println("Number of leap years: " + leapCount);
        System.out.println("Number of not leap years: " + notLeapCount);


        scanner.close();
    }
}