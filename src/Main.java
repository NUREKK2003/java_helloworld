import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        byte age =30;
//        long viewsCount = 3_123_456_789L;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isElifile = false;

//        byte age =30;
          // reference types
//        // trzeba alokować pamięc ale jest garbage collector
//        Date now = new Date();
//        // "sout"
//        System.out.println(now);

//        Point point1 = new Point(1,1);
//        Point point2 = point1; // referencja
//        point1.y = 5;
//        System.out.println(point2);

//        //Strings
//        String message = "     Hello World" +"!"; // skrót
//
//        System.out.println(message);
//        System.out.println(message.endsWith("!"));
//        System.out.println(message.length());
//        System.out.println(message.indexOf("el"));
//        // zwraca nowy string - stringów nie da się modyfikować
//        System.out.println(message.replace("!","!!!"));
//        // pozbycie się białych znaków na poczatku i na końcu
//        System.out.println(message.trim());

//        String message = "Hello \"Nurek\"";
//        message = "H\nel\tlo\\ \"Nurek\"";
//        System.out.println(message);

        // Arrays

//        int[] numbers = {2,3,3,44,23,3};
//        System.out.println(numbers.length);
//        System.out.println(numbers);
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

        // Multidimentional Array

//        int[][] numbers = new int[5][3];
//        int[][] numbers2 = {{1,23,3},{4,5,6}};
//        numbers[0][0] = 1;
//        System.out.println(Arrays.deepToString(numbers));

//        // Constants
//
//        final float PI =3.14F;
//
//        //PI =1;

        // Aritmetinc expressions

//        // casting
//        double result= (double)1/(double)3;
//        System.out.println(result);
//
//        int x=1;
//        int y =x++;
//        System.out.println(x);
//        System.out.println(y);
//
//        x += 2;

        // kolejność wykonywania działań

//        int x = 10 + 3 *2;
//        System.out.println(x);

        // Casting

//        // Implicit casting
//        // byte > short > int > long > float > double
//        short x = 1;
//        int y = x+2;
//        String xx = "1";
//
//        byte z = (byte) ((byte)Integer.parseInt(xx) +2);
//        System.out.println(y);

        // Math class
//        //int result = Math.round(1.1F);
//        //result = Math.ceil(1.1F);
//        //result = Math.floor(1.1F);
//
//        //int result = Math.max(1,2);
//        int result = (int)(Math.random()*100);
//        System.out.println(result);

        // Formatting numbers

        // Factory method
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891);
//        System.out.println(result);


//        String result = NumberFormat.getPercentInstance().format(0.1);
//        System.out.println(result);

        // Reading Input

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        //String age  = scanner.next();
//        String age  = scanner.nextLine().trim();
//        System.out.println("You are "+age);

        // Calculator
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal:");
        int principal  = scanner.nextInt();
        System.out.print("Annual Interest Rate:");
        float air  = scanner.nextFloat()/PERCENT/MONTHS_IN_YEAR;
        System.out.print("Peroid (Years):");
        int peroid = scanner.nextInt();
        System.out.print("Mortage:");
        double mortage = principal*(air*(Math.pow(1+air,peroid))/(Math.pow(1+air,peroid)-1));
        String result = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.print(result);

    }
}