package com.example;

import io.javalin.Javalin;

/**
 * Hello world!
 *
 * ALl maven prjs have their code dtored inside src.main.java directory. it will have
 * a directory with your prjs name in it, that is where you will find your app.java file 
 * 
 * keeping the id and base packet stucture the same 
 */
public class App 
{
    public static void main( String[] args ){
        Javalin app = Javalin.create();

        app.get("/hello", ctx -> ctx.result ("Hello World"));

        app.start();

    }
}
