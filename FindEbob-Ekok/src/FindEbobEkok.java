import java.util.Scanner;

public class FindEbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number..:");
        int firstNumber = scanner.nextInt();
        System.out.print("Please enter second number..:");
        int secondNumber = scanner.nextInt();
        System.out.println("EBOB ..: " + calculateEBOB(firstNumber, secondNumber));
        System.out.println("EKOK..:" + ((firstNumber * secondNumber) / calculateEBOB(firstNumber, secondNumber)));


    }

    private static int calculateEBOB(int firstNumber, int secondNumber) {
        int i = 1;
        int firstNumberEBOB = 1;
        while (i <= firstNumber) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                firstNumberEBOB = i;
            }
            i++;
        }
        return firstNumberEBOB;
    }
}
