package com.company;


public class books {
    String bookName;
    String description;
    String[] genre;
    int rating;

    books(String bookName, String description, String[] genre){
        bookName=bookName;
        file.makeBookFile(bookName);
        description=description;
        file.writeBookFile(bookName,description);
        genre=genre;

    }
    void changeRating(int newRating){
        rating=newRating;
    }

}
