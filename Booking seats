import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);  

        System.out.println("Enter the no. of seats");
        int size = data.nextInt(); 
        data.nextLine();

        String[] seats = new String[size]; 
        String[] names = new String[size];

        System.out.println("Enter the seat numbers");
        for (int i = 0; i < size; i++) {
            seats[i] = data.nextLine();  
        }
        
        System.out.println("Enter the name");
        for (int i = 0; i < size; i++) {
            names[i] = data.nextLine();  
        }
        
        System.out.println("Enter a seat number to find the name:");
        String seat = data.nextLine();
        switch (seat) {
            case "A1":
                System.out.println("aaa");
                break;

            case "A2":
                System.out.println("bbb");
                break;

            case "A3":
                System.out.println("ccc");
                break;

            case "B1":
                System.out.println("ddd");
                break;
        }
        
        System.out.println("Enter the seat number to replace name:");
        String seatToReplace = data.nextLine();

        boolean replaced = false;
        for (int i = 0; i < size; i++) {
            if (seats[i].equalsIgnoreCase(seatToReplace)) {
                System.out.println("Current name: " + names[i]);
                System.out.print("Enter new name: ");
                names[i] = data.nextLine();
                System.out.println("Name updated.");
                replaced = true;
                break;
            }
        }
        if (!replaced) {
            System.out.println("eat not found.");
        }        
    }
}
