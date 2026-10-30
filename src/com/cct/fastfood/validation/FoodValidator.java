
package com.cct.fastfood.validation;

import java.time.LocalDate;
import java.util.Set;

public class FoodValidator {

    private static final Set<String> ALLOWED_FOODS =
            Set.of("Burger", "Pizza", "Fries",
                    "Sandwich", "Beef Biriyani");

    // Check valid food name
    public static void validateName(String name) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Food name cannot be empty."
            );
        }

        boolean valid = ALLOWED_FOODS.stream()
                .anyMatch(food ->
                        food.equalsIgnoreCase(name.trim()));

        if (!valid) {
            throw new IllegalArgumentException(
                    "Only Burger, Pizza, Fries, "
                            + "Sandwich and Beef Biriyani  are allowed."
            );
        }
    }

    // Check weight
    public static void validateWeight(double weight) {

        if (!Double.isFinite(weight) || weight <= 0) {
            throw new IllegalArgumentException(
                    "Weight must be a positive number eg 100,250,300, can't be : -100,-250."
            );
        }
    }

    // Best-before must be within 14 days
    public static void validateBestBefore(
            LocalDate bestBeforeDate) {

        if (bestBeforeDate == null) {
            throw new IllegalArgumentException(
                    "Best-before date is needed ."
            );
        }

        LocalDate today = LocalDate.now();
        LocalDate maximumDate = today.plusDays(14);

        if (bestBeforeDate.isBefore(today)) {
            throw new IllegalArgumentException(
                    "Best-before date cannot be in the Previous Dates."
            );
        }

        if (bestBeforeDate.isAfter(maximumDate)) {
            throw new IllegalArgumentException(
                    "Best-before date cannot exceed 14 days."
            );
        }
    }

    // Validate all food information
    public static void validateFood(
            String name,
            double weight,
            LocalDate bestBeforeDate) {

        validateName(name);
        validateWeight(weight);
        validateBestBefore(bestBeforeDate);
    }
}
