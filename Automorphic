import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Enter the starting number:");
        int start = data.nextInt();

        System.out.println("Enter the ending number:");
        int end = data.nextInt();

        System.out.println("\nAutomorphic numbers in the given range:");

        for (int i = start; i <= end; i++) {
            int square = i * i;
            if (isAutomorphic(i, square)) {
                System.out.println(i + " * " + i + " = " + square);
            }
        }
    }

    // Method to check if number is Automorphic
    public static boolean isAutomorphic(int num, int square) {
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }
}
