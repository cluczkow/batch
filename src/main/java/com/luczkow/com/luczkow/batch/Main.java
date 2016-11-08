package com.luczkow.com.luczkow.batch;

import org.springframework.boot.SpringApplication;

/**
 * Created by chris luczkow on 11/7/2016.
 */
public class Main {
    public static void main(String [] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(
                BatchConfiguration.class, args)));
    }
}
