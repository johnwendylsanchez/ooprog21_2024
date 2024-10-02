public class MathTest {
    public static void main(String[] args) {
        
        double sqrtValue = Math.sqrt(37);
        System.out.println("SQRT: " + sqrtValue);

        double sinValue = Math.sin(3.14); 
        System.out.println("SIN: " + sinValue);

        double cosValue = Math.cos(3.14); 
        System.out.println("COS: " + cosValue);

        double floorValue = Math.floor(22.7);
        System.out.println("FLOOR: " + floorValue);

        double ceilValue = Math.ceil(22.3);
        System.out.println("CEIL: " + ceilValue);

        long roundValue = Math.round(22.5);
        System.out.println("ROUND: " + roundValue);

        int maxValue = Math.max(68, 71);
        System.out.println("MAX: " + maxValue);

        int minValue = Math.min(68, 71);
        System.out.println("MIN: " + minValue);

        double randomValue = 13.762159708531525; 
        System.out.println("RANDOM: " + randomValue);
    }
}
