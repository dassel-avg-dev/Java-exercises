import java.util.Scanner;
public class ActivityNested3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for(int i=0; i<n; i++) {
            for(int space=0; space<i*2; space++) {
                System.out.print(" ");
            }
            for(int j=0; j<n-i; j++) {
                System.out.print("* ");    
            }
            System.out.println();
            
        }
        

        scanner.close();
    }
}
