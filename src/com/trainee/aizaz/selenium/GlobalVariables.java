package com.trainee.aizaz.selenium;

/**
 * The purpose of this class is to declare global variables which are
 * reusable and we can use these variable as our parameters in regular
 * programs which can be used as parameters for common methods
 *
 * WHY DECLARE VARIABLES AS STATIC???
 *---->Because if i declare it as static i don't need to create a object
 *     i can directly call it by the class name.
 *---->Another main reason is in my script i want both common methods
 *     as well as GlobalVariables if i declare it as non static then
 *     i have to use extends and u can extend only one class in java
 *
 */
public class GlobalVariables {
    public static String browserChrome = "chrome";
    public static String url = "http://automationpractice.com/index.php";
    public static String xpath = "xpath";
    public static String className = "className";
    public static String id = "id";
    public static String name = "name";
}