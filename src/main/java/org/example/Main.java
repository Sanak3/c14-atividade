package org.example;

import com.google.gson.Gson;
import org.junit.Test;
import org.junit.Assert.*;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("igor" , 20);
        Gson gson1 = new Gson();

        String jsonString = gson1.toJson(pessoa1);
        System.out.println(jsonString);



    }
}