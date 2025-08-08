import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data =new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a =data.nextInt();

        System.out.print("Enter second number: ");
        int b =data.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subt");
        System.out.println("3. Mult");
        System.out.println("4. Div");

        int option = data.nextInt();
        double result = 0;

         switch (option) {
             case 1:
                result = add(a,b);
                break;
             case 2:
                result = sub(a,b);
                break;
             case 3:
                result = mult(a,b);
                break;
             case 4:
                result = div(a,b);
                break;
        }

    System.out.println("Result: "+result);
    }

    public static int add(int x, int y) {
        return x+y;
    }
    public static int sub(int x, int y) {
        return x-y;
    }
    public static int mult(int x, int y) {
        return x*y;
    }
    public static double div(int x, int y) {
        return x%y;
    }
}
