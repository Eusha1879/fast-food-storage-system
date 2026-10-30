
package com.cct.fastfood.model;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class FoodItem {
    //Private Data
    private String name;
    private double weight;
    private LocalDate bestBeforeDate;
    private LocalDateTime addedTime;
    //constructor - (area)
    public FoodItem(String name, double weight, LocalDate bestBeforeDate,
                    LocalDateTime addedTime){
        this.name = name;
        this.weight=weight;
        this.bestBeforeDate=bestBeforeDate;
        this.addedTime = addedTime;
    }//Getters (No setter needed here now)
    public String getName(){
        return this.name;
    }

    public double getWeight(){
        return this.weight;
    }
    public LocalDate getBestBeforeDate(){
        return this.bestBeforeDate;
    }
    public LocalDateTime getAddedTime(){
        return this.addedTime;
    }


    @Override
    public String toString(){
        return "\n--Name : "
                + name + "\n-- Weight : "
                + weight + "\n--Best Before Date : " +
                bestBeforeDate + "\n--The Added Time :  ; "
                + addedTime;
    }

}
