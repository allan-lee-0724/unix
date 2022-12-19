package com.unix;

import io.javalin.Javalin;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Javalin app = Javalin.create();

        app.get("/hello", ctx -> ctx.result("Hello world!"));

        app.start();
    }
}
