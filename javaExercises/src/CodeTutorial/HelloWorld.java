package CodeTutorial;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class HelloWorld {
    public static void main(String[] args){
        Date now = new Date();
        System.out.println(now);
        Point point1 = new Point(1, 1);
        point1.x = 2;
        System.out.println(point1);



        String message = "Hello World";
        System.out.println(message.replace("World", "Andrew"));


        int[][] numbers = { {4, 5} ,{6,7},{8,8}};
        System.out.println(Arrays.deepToString(numbers));


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("You are: " + name);


        System.out.print("Enter Your Age: ");
        byte age = scanner.nextByte(); //also nextFloat nextDouble nextInt
        System.out.println("You are: " + age);


        double result = (double)10 / (double)3;


        int resultRound = Math.round(1.2F);
        double resultCeil = Math.ceil(1.2);
        int resultMax = Math.max(1, 3);


        int resultRandom = (int)(Math.random()*100);
        System.out.println(resultRandom);


        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String resultCurrency = currency.format(1627836.987);
        System.out.println(resultCurrency);


        String resultPercent = NumberFormat.getPercentInstance().format(.87);
        System.out.println(resultPercent);



        //mortgage calculator

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                *(monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                /(Math.pow(1 + monthlyInterest, numberOfPayments)-1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);


        //comparisons

        int x = 1;
        int y = 1;
            System.out.println(x != y);


    }
}
