package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 *  Project-5- ProjectName : com-utimateqa
 *  BaseUrl = https://courses.ultimateqa.com/
 *  1. Setup Chrome browser.
 *  2. Open URL.
 *  3. Print the title of the page.
 *  4. Print the current url.
 *  5. Print the page source.
 *  6. Click on ‘Sign In’ link
 *  7. Print the current url
 *  8. Enter the email to email field.
 *  9. Enter the password to password field.
 *  10. Click on Login Button.
 *  11. Navigate to baseUrl.
 *  12. Navigate forward to Homepage.
 *  13. Navigate back to baseUrl.
 *  14. Refresh the page.
 *  15. Close the browser
 */
public class ComUtimateQa {
    //1. Setup Chrome Browser
    static String browser = "Chrome";
    static String baseUrl = "https://courses.ultimateqa.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }

        // 2. Open URL.
        driver.get(baseUrl);

        // 3. Print the title of the page.
        System.out.println("Page Title: " + driver.getTitle());

        // 4. Print the current url.
        System.out.println("Current url: " + driver.getCurrentUrl());

        // 5. Print the page source.
        System.out.println("Page Source: " + driver.getPageSource());

        // 6. Click on ‘Sign In’ link
        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
        signInLink.click();

        // 7. Print the current url.
        System.out.println("Current url: " + driver.getCurrentUrl());

        // 8. Enter the email to email field.
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("dharapatel123@gmail.com");

        // 9. Enter the password to password field.
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("password321");

        // 10. Click on the login button.
        WebElement signInButton = driver.findElement(By.linkText("Sign In"));
        signInButton.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 11. Navigate back to baseurl.
        driver.navigate().to(baseUrl);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //12.Navigate forward to homepage
        driver.navigate().forward();

        //13.Navigate back to baseUrl
        driver.navigate().back();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //14.Refresh the page
        driver.navigate().refresh();

        //15.Close the browser
        driver.quit();

    }

    }
