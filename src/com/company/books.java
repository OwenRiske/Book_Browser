package com.company;
import java.io.File;  // Import the File class


public class books {
    String bookName;
    String description;
    String[] genre;
    int rating;

    books(String bookName, String description, String[] genre){
        bookName=bookName;
        description=description;
        genre=genre;

    }
    void changeRating(int newRating){
        rating=newRating;
    }
    void makeBook(String bookName){
        File myObj = new File(bookName);
    }
    void saveInfo( String description, String[] genre, int rating){

    }
}
