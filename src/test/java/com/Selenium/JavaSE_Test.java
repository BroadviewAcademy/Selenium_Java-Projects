package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaSE_Test {

    @Test
    public void Login() {

        System.setProperty("webdriver.chrome.driver","/Users/memetiminabliz/webdriver/chromedriver");
        WebDriver driver = new ChromeDriver();


        //Creating the JavascriptExecutor interface object by Type casting
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Launching the Site.
        driver.get("http://demo.guru99.com/V4/");

        WebElement button = driver.findElement(By.name("btnLogin"));

        //Login to Guru99
        driver.findElement(By.name("uid")).sendKeys("mngr303128");
        driver.findElement(By.name("password")).sendKeys("edErume");

        //Perform Click on LOGIN button using JavascriptExecutor
        js.executeScript("arguments[0].click;", button);

        //To generate Alert window using JavascriptExecutor. Display the alert message
        js.executeScript("alert('Welcome to Guru99');");


    }
}