import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0, odd = 0;
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("Please enter integers only.");
                sc.next();
                i--;
                continue;
            }
            int num = sc.nextInt();
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
        sc.close();
    }
}
