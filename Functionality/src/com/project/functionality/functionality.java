package com.project.functionality;

import java.net.http.HttpClient;

public class functionality {
    public void function1() {
        System.out.println("Inside function1");
        HttpClient httpClient = HttpClient.newHttpClient();
        System.out.println(httpClient.version());
    }
}
