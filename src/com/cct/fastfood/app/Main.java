
package com.cct.fastfood.app;

import com.cct.fastfood.service.StorageService;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StorageService service = new StorageService();

        boolean running = true;

        while (running) {

            System.out.println(
                    "\n=============================="
            );
            System.out.println(
                    "  FAST FOOD STORAGE SYSTEM"
            );
            System.out.println(
                    "=============================="
            );

            System.out.println("1. Add Food");
            System.out.println("2. Remove Food");
            System.out.println("3. Peek Top Food");
            System.out.println("4. Search Food");
            System.out.println("5. Display All Food");
            System.out.println("6. Storage Status");
            System.out.println("0. Exit");

            System.out.print("Choose an option: ");

            String input = scanner.nextLine();

            try {

                int choice = Integer.parseInt(input.trim());

                switch (choice) {

                    case 1:
                        System.out.print(
                                "Enter food name: "
                        );
                        String name = scanner.nextLine();

                        System.out.print(
                                "Enter weight (grams): "
                        );
                        double weight = Double.parseDouble(
                                scanner.nextLine().trim()
                        );

                        System.out.print(
                                "Enter best-before date "
                                        + "(YYYY-MM-DD): "
                        );

                        LocalDate date = LocalDate.parse(
                                scanner.nextLine().trim()
                        );

                        service.addFood(name, weight, date);
                        break;

                    case 2:
                        service.removeFood();
                        break;

                    case 3:
                        service.peekFood();
                        break;

                    case 4:
                        System.out.print(
                                "Enter food name to search: "
                        );

                        String searchName = scanner.nextLine();
                        service.searchFood(searchName);
                        break;

                    case 5:
                        service.displayFood();
                        break;

                    case 6:
                        service.showStatus();
                        break;

                    case 0:
                        System.out.println(
                                "Thank you! Application closed."
                        );
                        running = false;
                        break;

                    default:
                        System.out.println(
                                "Invalid choice! Try again."
                        );
                }

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid number! Please enter "
                                + "a valid numeric value. eg.1,2,3,4,5"
                );

            } catch (DateTimeParseException e) {

                System.out.println(
                        "Invalid date! Follow :  YYYY-MM-DD."
                );

            } catch (IllegalArgumentException
                    | IllegalStateException e) {

                System.out.println(
                        "Error: " + e.getMessage()
                );
            }
        }

        scanner.close();
    }
}
