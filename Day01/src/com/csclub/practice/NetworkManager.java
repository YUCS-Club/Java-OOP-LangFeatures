package com.csclub.practice;

public class NetworkManager {

    public void fetchUserNames() {
        String url = Constants.BASE_URL;
        String username = Constants.USERNAME;
        String password = Constants.PASSWORD;

        System.out.println("Fetch user from " + url +
                " with username: " + username +
                " and password: " + password);
    }
}
