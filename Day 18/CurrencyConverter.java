//Make a console based currency converter application with support for at least 5 currencies.
//Requirements:
//    1. Must be a menu-driven program.
//    2. All currencies to be displayed correct up to 2 decimal places.
//    3. Each interaction of the user with the program must be logged in a log.txt file
//    `log.txt` example contents -
//    Program started.
//    User selected INR
//    User selected USD
//    User entered amount 1400
//    Program stopped.
//    4. Add exception handling for when user enters invalid amount or chooses invalid option


package Converter;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) throws IOException {
        converter();
    }

    public static void converter() throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("log.txt");
//        PrintStream stream = new PrintStream(file);
        FileWriter writer = new FileWriter(file, true);
        BufferedWriter writeFile = new BufferedWriter(writer);
        writeFile.write("\nProgram started\n");
//        System.setOut(stream);
//        stream.println("Program started");
        try {
            while (true) {
                System.out.println("Welcome to AK Currency Converter");
                System.out.println("\nSelect the currency you want to convert to other currencies");
                System.out.println("\n*****************\n");
                System.out.println("1 --> INR (Indian Rupees)");
                System.out.println("2 --> USD (United States Dollars)");
                System.out.println("3 --> CAD (Canadian Dollars)");
                System.out.println("4 --> SGD (Singapore Dollars)");
                System.out.println("5 --> GBP (British Pound Sterling)");
                System.out.println("6 --> EUR (Euros)");
                System.out.println("0 --> Exit");
                System.out.println("\n*****************\n");
                System.out.println("Ex: Enter 1 if you want to convert INR to other currencies");
                System.out.print("Enter your choice : ");
                int choice = scanner.nextInt();
                System.out.println();
                double amount;
                switch (choice) {
                    case 1:
                        writeFile.write("User selected INR\n");
                        System.out.print("Enter the amount in INR: ");
                        amount = scanner.nextDouble();
                        writeFile.write("User entered amount : "+ amount+" in INR\n");
                        inrToOtherCurrencies(amount);
                        break;
                    case 2:
                        writeFile.write("User selected USD\n");
                        System.out.print("Enter the amount in USD: ");
                        amount = scanner.nextDouble();
                        writeFile.write("User entered amount : "+ amount+" in USD\n");
                        usdToOtherCurrencies(amount);
                        break;
                    case 3:
                        writeFile.write("User selected CAD\n");
                        System.out.print("Enter the amount in CAD: ");
                        amount = scanner.nextDouble();
                        writeFile.write("User entered amount : "+ amount+" in CAD\n");
                        cadToOtherCurrencies(amount);
                        break;
                    case 4:
                        writeFile.write("User selected SGD\n");
                        System.out.print("Enter the amount in SGD: ");
                        amount = scanner.nextDouble();
                        writeFile.write("User entered amount : "+ amount+" in SGD\n");
                        sgdToOtherCurrencies(amount);
                        break;
                    case 5:
                        writeFile.write("User selected GBP\n");
                        System.out.print("Enter the amount in GBP: ");
                        amount = scanner.nextDouble();
                        writeFile.write("User entered amount : "+ amount+" in GBP\n");
                        gbpToOtherCurrencies(amount);
                        break;
                    case 6:
                        writeFile.write("User selected EUR\n");
                        System.out.print("Enter the amount in EUR: ");
                        amount = scanner.nextDouble();
                        writeFile.write("User entered amount : "+ amount+" in EUR\n");
                        eurToOtherCurrencies(amount);
                        break;
                    case 0:
                        System.out.println("Exiting....");
                        System.out.println("Have a great day..! Thank you..!");
                        return;
                    default:
                        throw new InputInvalidException("Please enter the valid input");
                }
                System.out.println();
                System.out.println("If you want to continue the conversion press 1 otherwise press 0");
                if (scanner.nextInt() != 1) {
                    System.out.println("Exiting....");
                    System.out.println("Have a great day..! Thank you..!");
                    break;
                }
            }
        } catch (InputInvalidException ie) {
            writeFile.write("InputInvalidException thrown for Invalid input\n");
            System.out.println("Process terminated..Invalid input...");
        }
        catch(InputMismatchException e){
            writeFile.write("InputMismatchException thrown for Invalid input\n");
            System.out.println("Process terminated..Invalid input");
        }
        writeFile.write("Program stopped\n\n");
        writeFile.close();
    }


    public static void inrToOtherCurrencies(double amount) {
        System.out.printf("\nINR TO USD  -->  %.2f \n", amount * 0.013);
        System.out.printf("INR TO CAD  -->  %.2f \n", amount * 0.017);
        System.out.printf("INR TO SGD  -->  %.2f \n", amount * 0.018);
        System.out.printf("INR TO GBP  -->  %.2f \n", amount * 0.0099);
        System.out.printf("INR TO EUR  -->  %.2f \n", amount * 0.012);
    }

    public static void usdToOtherCurrencies(double amount) {
        System.out.printf("\nUSD TO INR  -->  %.2f \n", amount * 76.05);
        System.out.printf("USD TO CAD  -->  %.2f \n", amount * 1.29);
        System.out.printf("USD TO SGD  -->  %.2f \n", amount * 1.37);
        System.out.printf("USD TO GBP  -->  %.2f \n", amount * 0.75);
        System.out.printf("USD TO EUR  -->  %.2f \n", amount * 0.89);
    }

    public static void cadToOtherCurrencies(double amount) {
        System.out.printf("\nCAD TO INR  -->  %.2f \n", amount * 59.13);
        System.out.printf("CAD TO USD  -->  %.2f \n", amount * 0.78);
        System.out.printf("CAD TO SGD  -->  %.2f \n", amount * 1.06);
        System.out.printf("CAD TO GBP  -->  %.2f \n", amount * 0.59);
        System.out.printf("CAD TO EUR  -->  %.2f \n", amount * 0.69);
    }

    public static void sgdToOtherCurrencies(double amount) {
        System.out.printf("\nSGD TO INR  -->  %.2f \n", amount * 55.65);
        System.out.printf("SGD TO USD  -->  %.2f \n", amount * 0.73);
        System.out.printf("SGD TO CAD  -->  %.2f \n", amount * 0.94);
        System.out.printf("SGD TO GBP  -->  %.2f \n", amount * 0.55);
        System.out.printf("SGD TO EUR  -->  %.2f \n", amount * 0.65);
    }

    public static void gbpToOtherCurrencies(double amount) {
        System.out.printf("\nGBP TO INR  -->  %.2f \n", amount * 100.97);
        System.out.printf("GBP TO USD  -->  %.2f \n", amount * 1.33);
        System.out.printf("GBP TO CAD  -->  %.2f \n", amount * 1.71);
        System.out.printf("GBP TO SGD  -->  %.2f \n", amount * 1.82);
        System.out.printf("GBP TO EUR  -->  %.2f \n", amount * 1.18);
    }

    public static void eurToOtherCurrencies(double amount) {
        System.out.printf("\nEUR TO INR  -->  %.2f \n", amount * 85.74);
        System.out.printf("EUR TO USD  -->  %.2f \n", amount * 1.13);
        System.out.printf("EUR TO CAD  -->  %.2f \n", amount * 1.45);
        System.out.printf("EUR TO SGD  -->  %.2f \n", amount * 1.54);
        System.out.printf("EUR TO GBP  -->  %.2f \n", amount * 0.85);
    }
}

class InputInvalidException extends Exception {
    public InputInvalidException(String message) {
        super(message);
    }
}
