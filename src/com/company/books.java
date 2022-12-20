package com.company;

public class books {
    String bookName;
    String description;
    String[] genre;
    int rating;

    books(String bookName, String description, String[] genre){
        bookName=bookName;
        description=description;
        genre=genre;


    void changeRating(int newRating){

        rating=newRating;
        }
    }
}
