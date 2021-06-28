package com.csculb;

public class MovieShop {

    Movie[] movies = new Movie[100];
    BorrowList[] borrowLists = new BorrowList[100];

    void borrow(Movie movie, Customer customer) {
        new BorrowList(customer, movie);
    }

}
