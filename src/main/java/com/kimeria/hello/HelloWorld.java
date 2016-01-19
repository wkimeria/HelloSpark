package com.kimeria.hello;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class HelloWorld
{
    public static void main( String[] args )
    {
        get("/hello", (req, res) -> "Is it me you're looking for.. and I wonder..");
    }
}
