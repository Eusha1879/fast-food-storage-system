package com.cct.fastfood.app;
import com.cct.fastfood.model.Fooditem;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args){
        // Create a FoodItem Object
        Fooditem burger = new Fooditem("Burger",250.0,
                LocalDate.now().plusDays(7),LocalDateTime.now());
        // testing Getters
        System.out.println("Name: "+burger.getName());
        System.out.println("Total weight : " +burger.getWeight());
        System.out.println("Eat before please : "+burger.getBestBeforeDate());
        System.out.println("Storage product added time : "+burger.getAddedTime());
        //to String test
        System.out.println("\n -- Food Details");
        System.out.println(burger);



    }
}
