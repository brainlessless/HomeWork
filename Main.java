import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        //      System.out.print("Distance between cityA and cityB : ");
        //      int distance = scanner.nextInt();
        //      System.out.print("Time to get there in hours : ");
        //      int time = scanner.nextInt();
        //      int speed = distance * time;
        //
        //      System.out.print("You need to go at speed " + speed + "Km/h");

//     System.out.print("Enter the amount in EUR : ");
//     double amount = scanner.nextDouble();
//     double currency = 1.06F;
//     double dollar = amount * currency;
//     System.out.print(amount + "EUR = " + dollar + " USD");


 //    System.out.println("Enter flash drive size : ");
 //    double driveSize = scanner.nextDouble();
 //    double fileSize = 0.82F;
 //    double numberOfFiles = driveSize / fileSize;

 //    System.out.println("Numer of files : " + numberOfFiles);

        System.out.print("Введите сумму денег : ");
        int money = scanner.nextInt();
        int chocolate = 45;
        int amountOfChocolate = money / chocolate;
        int shortCash = money - (amountOfChocolate * chocolate);

        System.out.print("Количество шоколадок: " + amountOfChocolate + ", ваша сдача: " + shortCash);


    }






    }