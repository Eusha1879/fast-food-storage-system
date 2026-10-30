
package com.cct.fastfood.service;
import com.cct.fastfood.model.FoodItem;
import com.cct.fastfood.structure.FoodStack;
import com.cct.fastfood.validation.FoodValidator;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class StorageService {

    private final FoodStack storage;

    public StorageService() {
        storage = new FoodStack();
    }

    // Add food after validation
    public void addFood(
            String name,
            double weight,
            LocalDate bestBeforeDate) {

        if (storage.isFull()) {
            throw new IllegalStateException(
                    "Storage full! Cannot add more food. Maximum 8 Trays. "
            );
        }

        FoodValidator.validateFood(
                name, weight, bestBeforeDate
        );

        FoodItem food = new FoodItem(
                name.trim(),
                weight,
                bestBeforeDate,
                LocalDateTime.now()
        );

        storage.push(food);

        System.out.println(
                food.getName() + " added successfully!"
        );
    }

    // Remove top food
    public void removeFood() {

        FoodItem removed = storage.pop();

        System.out.println(
                "Removed: " + removed.getName()
        );
    }

    // View top food
    public void peekFood() {

        FoodItem food = storage.peek();

        System.out.println("\n=== TOP FOOD ===");
        System.out.println(food);
    }

    // Search by food name
    public void searchFood(String name) {

        int index = storage.search(name);

        if (index == -1) {
            System.out.println("Food not found!");
        } else {
            System.out.println(
                    "Food found at index: " + index
            );
        }
    }

    // Show all food
    public void displayFood() {
        storage.display();
    }

    // Display storage status
    public void showStatus() {

        System.out.println(
                "Stored Trays: " + storage.size()
        );

        System.out.println(
                "Maximum Capacity: "
                        + storage.getCapacity()
        );

        System.out.println(
                "Storage Full: " + storage.isFull()
        );

        System.out.println(
                "Storage Empty: " + storage.isEmpty()
        );
    }
}
