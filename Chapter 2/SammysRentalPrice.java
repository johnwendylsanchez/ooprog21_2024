import java.util.Scanner;

public class SammysRentalPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printHeader();
        int costPerHour = 40; 
        int costPerMinute = 1; 
        int totalMinutes = getRentalMinutes(scanner);
        int hours = calculateHours(totalMinutes);
        int minutes = calculateMinutes(totalMinutes);
        int totalCost = calculateTotalCost(hours, minutes, costPerHour, costPerMinute);
        displayRentalDetails(hours, minutes, totalCost);
    }

    public static void printHeader() {
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println(" ");
    }

    public static int getRentalMinutes(Scanner scanner) {
        System.out.print("Enter the number of minutes rented: ");
        return scanner.nextInt();
    }

    public static int calculateHours(int totalMinutes) {
        return totalMinutes / 60;
    }

    public static int calculateMinutes(int totalMinutes) {
        return totalMinutes % 60;
    }

    public static int calculateTotalCost(int hours, int minutes, int costPerHour, int costPerMinute) {
        return (hours * costPerHour) + (minutes * costPerMinute);
    }

    public static void displayRentalDetails(int hours, int minutes, int totalCost) {
        System.out.println("Sammy's Seashore Supplies: Your beach adventure starts here!");
        System.out.println("Hours rented: " + hours);
        System.out.println("Minutes rented: " + minutes);
        System.out.println("Total cost: $" + totalCost);
    }
}