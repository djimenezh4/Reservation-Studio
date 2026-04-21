package data;

import model.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

//Open a CSV file
//Read it line by line
//Split each line by commas
//Turn each line into an object (User, Table, Reservation)
//Return a list of those objects

public class DataLoader {

    public static List<User> loadUsers(String filepath){
        List<User> users = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            //next step
            //Write a while loop that:
            //
            //Creates a String variable called line
            //Keeps looping as long as there's a next line to read
            //BufferedReader has a method called readLine() that returns the next line,
            // or null when the file is done
        } catch (IOException e) {
            System.err.println("Error loading users: " + e.getMessage());
        }
        return users;
    }
}
