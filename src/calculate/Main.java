package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char answer;
        do {
            System.out.println("Enter first number:");
            int a = sc.nextInt();
            System.out.println("Enter second number:");
            int b = sc.nextInt();
            System.out.println("Enetr the symbol for the operation you want to execute:");
            char c = sc.next().charAt(0);
            Calculator obj = new Calculator();
            obj.calculateResult(a, b, c);
            System.out.println("Would you like to do more calculation Please enter “Y” or “N” :”");
            answer = sc.next().charAt(0);
        }
        while (answer == 'Y' || answer== 'y');

    }

}


