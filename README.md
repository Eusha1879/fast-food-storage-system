# fast-food-storage-system
CCT Algorithms and Constructs CA1 — Java-based Fast Food Storage System using OOP, Stack/Queue data structures, validation, testing, time complexity analysis, and GitHub version control.
# 🍔 Fast Food Storage System

## 📘 CCT College Dublin — Algorithms and Constructs CA1

This project is developed for the **Algorithms and Constructs CA1** module at CCT College Dublin.

The aim of the project is to design and develop a Java application that models a fast-food storage system using an appropriate data structure and Object-Oriented Programming principles.

---

## 🎯 Project Scenario

A fast-food restaurant stores different food items such as:

- Burger
- Pizza
- Fries
- Sandwich
- Hotdog

The storage unit can hold a maximum of **8 trays**.

Each food item stores:

- Food name
- Weight in grams
- Best-before date
- Time the item was added to storage

The system must support adding, removing, displaying, peeking, searching and exiting the application.

---

# 🧠 Main Concepts Covered

## Java
- Classes and Objects
- Constructors
- Encapsulation
- Interfaces
- Inheritance
- Exception Handling
- LocalDate
- LocalDateTime
- Methods
- Input Validation

## Data Structures and Algorithms
- Stack
- Queue concepts
- Push
- Pop
- Peek
- Search
- Display
- Big-O Time Complexity
- Linear Search

---

# 🏗️ Planned Project Structure

```text
FastFoodStorageSystem
│
└── src
    │
    └── com.cct.fastfood
        │
        ├── model
        │   └── FoodItem.java
        │
        ├── structure
        │   └── FoodStack.java
        │
        ├── service
        │   └── StorageService.java
        │
        ├── validation
        │   └── FoodValidator.java
        │
        └── app
            └── Main.java
