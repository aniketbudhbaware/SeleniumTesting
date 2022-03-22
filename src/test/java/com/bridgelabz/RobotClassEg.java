package com.bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
public class RobotClassEg {

    @Test
    public void keyboardOperationTest() throws InterruptedException, AWTException{
        System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Robot robot = new Robot();
        Thread.sleep(3000);
        //robot.mouseMove(x: 400, y: 500);


        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SHIFT);

        robot.keyPress(KeyEvent.VK_I);
        Thread.sleep(3000);
        robot.keyRelease(KeyEvent.VK_I);

        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(3000);

        driver.close();
    }


}
