// TableAndChairs.java
// Chapter 1
public class TableAndChairs {
    public static void main(String[] args) {
        String chairLeg = "X                      X";
        String tableTop = "X      XXXXXXXXXX      X";
        String tableLegs = "XXXXX  X        X  XXXXX";
        String chairSeat = "X   X  X        X  X   X";
        
        printLine(chairLeg);
        printLine(chairLeg);
        
        printLine(tableTop);
        
        printLine(tableLegs);
        printLine(chairSeat);
        printLine(chairSeat);
    }

    private static void printLine(String line) {
        System.out.println(line);
    }
}
