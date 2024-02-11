import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        System.out.println("Result 1= "+ shouldWakeUp(true, 1));
        System.out.println("Result 2= "+ shouldWakeUp(false, 2));
        System.out.println("Result 3= "+ shouldWakeUp(true, 8));
        System.out.println("Result 4= "+ shouldWakeUp(true, -1));
         */

        /*
        System.out.println("Is it teen?: "+hasTeen(9, 99, 19));
        System.out.println("Is it teen?: "+hasTeen(23, 15, 42));
        System.out.println("Is it teen?: "+hasTeen(22, 23, 24));
         */

        /*
        System.out.println("Is cat playing?: "+ isCatPlaying(true, 10));
        System.out.println("Is cat playing?: "+ isCatPlaying(false, 36));
        System.out.println("Is cat playing?: "+ isCatPlaying(false, 35));
         */

        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height of rectangle: ");
        double height = scanner.nextDouble();
        System.out.println("Area of rectangle: "+area(width, height));
         */

        /*
        System.out.println("Enter the radius of circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of circle: "+ area(radius));
         */
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock){
        if ( clock < 0 || clock > 23 || !isBarking) {
            return false;
        }

        return clock < 8 || clock >= 20;
    }

    public static boolean hasTeen(int age1, int age2, int age3){
        return (age1>=13 && age1 <=19) || (age2>=13 && age2 <=19) || (age3>=13 && age3 <=19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature){
        int limit = isSummer ? 45 : 35;
        return temperature > 25 && temperature <= limit;
    }

    public static double area(double height, double width){
        if(height<0 || width<0){
            System.out.println("width ya da height negatif sayı olamaz!");
            return -1;
        }
        return width*height;
    }

    public static double area(double radius){
        if (radius < 0 ){
            System.out.println("Radius 0'dan küçük olamaz!");
            return -1;
        }
        return Math.PI*Math.pow(radius, 2);
    }
}
