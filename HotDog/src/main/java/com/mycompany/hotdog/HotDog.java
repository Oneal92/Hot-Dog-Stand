/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hotdog;

/**
 *
 * @author bapti
 */
public class HotDog {
    // Instance variables
    private int id; // The ID of the hot dog stand
    private int hotDogsSold; // Number of hot dogs sold by this and

    // Static variable to track total hot dogs sold by all stands
    private static int totalHotDogsSold = 0;

    // Constructor to initialize the stand ID and hot dogs sold
    public HotDog(int id) {
        this.id = id;
        this.hotDogsSold = 0;
    }

    // Method to increment the number of hot dogs sold
    public void justSold() {
        hotDogsSold++;
        totalHotDogsSold++; // Increment total sold for all stands
    }

    // Method to return the number of hot dogs sold by this stand
    public int getHotDogsSold() {
        return hotDogsSold;
    }

    // Method to return the stand's ID
    public int getId() {
        return id;
    }

    // Static method to return the total number of hot dogs sold by all stands
    public static int getTotalHotDogsSold() {
        return totalHotDogsSold;
    }

    // Main method to test the HotDogStand class
    public static void main(String[] args) {
        // Creating three hot dog stands
        HotDog stand1 = new HotDog(1);
        HotDog stand2 = new HotDog(2);
        HotDog stand3 = new HotDog(3);

        // Simulating sales at the stands
        stand1.justSold(); // Stand 1 sells 1 hot dog
        stand1.justSold(); // Stand 1 sells another hot dog
        stand2.justSold(); // Stand 2 sells 1 hot dog

        // Display the number of hot dogs sold by each stand and the total
        System.out.println("Stand " + stand1.getId() + " sold " + stand1.getHotDogsSold());
        System.out.println("Stand " + stand2.getId() + " sold " + stand2.getHotDogsSold());
        System.out.println("Stand " + stand3.getId() + " sold " + stand3.getHotDogsSold());
        System.out.println("Total sold = " + HotDog.getTotalHotDogsSold());

        // More sales
        stand1.justSold(); // Stand 1 sells another hot dog
        stand3.justSold(); // Stand 3 sells 1 hot dog

        // Display the updated number of hot dogs sold
        System.out.println("Stand " + stand1.getId() + " sold " + stand1.getHotDogsSold());
        System.out.println("Stand " + stand2.getId() + " sold " + stand2.getHotDogsSold());
        System.out.println("Stand " + stand3.getId() + " sold " + stand3.getHotDogsSold());
        System.out.println("Total sold = " + HotDog.getTotalHotDogsSold());
    }
}
