
package com.cct.fastfood.structure;
import com.cct.fastfood.model.FoodItem;
public class FoodStack {

    private static final int CAPACITY = 8;

    private final FoodItem[] trays;
    private int top;

    public FoodStack() {
        trays = new FoodItem[CAPACITY];
        top = -1;
    }

    // Check whether storage is empty - O(1)
    public boolean isEmpty() {
        return top == -1;
    }

    // Check whether storage is full - O(1)
    public boolean isFull() {
        return top == CAPACITY - 1;
    }

    // PUSH: Add food to the top - O(1)
    public void push(FoodItem food) {

        if (food == null) {
            throw new IllegalArgumentException(
                    "Food item cannot be null."
            );
        }

        if (isFull()) {
            throw new IllegalStateException(
                    "Storage is full! Maximum 8 trays."
            );
        }

        trays[++top] = food;
    }

    // POP: Remove the top food - O(1)
    public FoodItem pop() {

        if (isEmpty()) {
            throw new IllegalStateException(
                    "Storage is empty! Nothing to remove."
            );
        }

        FoodItem removed = trays[top];
        trays[top] = null;
        top--;

        return removed;
    }

    // PEEK: View the top food - O(1)
    public FoodItem peek() {

        if (isEmpty()) {
            throw new IllegalStateException(
                    "Storage is empty! No food to view."
            );
        }

        return trays[top];
    }

    // SEARCH: Find food by name - O(n)
    // Returns array index or -1 if not found
    public int search(String name) {

        if (name == null) {
            return -1;
        }

        for (int i = top; i >= 0; i--) {

            if (trays[i].getName()
                    .equalsIgnoreCase(name.trim())) {
                return i;
            }
        }

        return -1;
    }

    // DISPLAY: Show all stored food - O(n)
    public void display() {

        if (isEmpty()) {
            System.out.println("Storage is empty!");
            return;
        }

        System.out.println("\n=== CURRENT STORAGE ===");

        for (int i = top; i >= 0; i--) {

            System.out.println("\nTray Index: " + i);

            if (i == top) {
                System.out.println("TOP TRAY");
            }

            System.out.println(trays[i]);
            System.out.println("..");
        }
    }

    // Current number of trays - O(1)
    public int size() {
        return top + 1;
    }

    public int getCapacity() {
        return CAPACITY;
    }
}

