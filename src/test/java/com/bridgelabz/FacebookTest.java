package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {

    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create New Account")).click();

        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Aniket");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Budhbaware");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("aniketbudhbaware111@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("aniketbudhbaware111@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("Aniket@123");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_day")).sendKeys("10");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_month")).sendKeys("Octomber");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_year")).sendKeys("1997");
        Thread.sleep(2000);
        driver.findElement(By.name("sex")).sendKeys("Male");
        Thread.sleep(2000);
        //List<WebElement> gender;
        //gender = driver.findElements(By.name("sex"));
        //gender.get(1).click();

        driver.findElements(By.name("sex")).get(1).click();

        Thread.sleep(3000);

        //driver.close();

    }
}
