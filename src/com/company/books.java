package com.company;


import java.util.ArrayList;

public class books {

    public static String makeBook(String bookName, String description, int rating,ArrayList bookList){
        bookList.add(bookName);
        file.makeBookFile(bookName);
        file.writeBookFile(bookName, bookName+"\n"+Integer.toString(rating)+"\n\n"+description);
        return bookName;
    }

    public static ArrayList bookRating(ArrayList bookList){
        ArrayList ratingList = new ArrayList();
        for (int i = 0; i < bookList.size(); i++) {
            String[] temp=file.bookFileRead(String.valueOf(bookList.get(i)));
        ratingList.add(Integer. parseInt(temp[1]));
        }
        return sort.sortWithNum(ratingList);
    }

}
