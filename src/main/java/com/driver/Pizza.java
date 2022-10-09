package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        extraCheese=false;
        extraToppings=false;
        takeAway=false;
        // your code goes here
        if(isVeg){
            price=300;
        }
        else{
            price=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese){
        price+=80;
        extraCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppings){
        if(isVeg){
            price+=70;
        }
        else{
            price+=120;
        }
        extraToppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway){
        price+=20;
        takeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        String Bill="";
        if(isVeg){
            Bill+="Base Price Of The Pizza: "+300+"\n";
        }
        else{
            Bill+="Base Price Of The Pizza: "+400+"\n";
        }
        if(extraCheese){
            Bill+="Extra Cheese Added: "+80+"\n";
        }
        if(extraToppings){
            if(isVeg){
            Bill+="Extra Toppings Added: "+70+"\n";
            }
            else{
                Bill+="Extra Toppings Added: "+120+"\n";
            }
        }
        if(takeAway){
            Bill+="Paperbag Added: "+20+"\n";
        }
        Bill+="Total Price: "+price+"\n";
        bill=Bill;
        return this.bill;
    }
}
