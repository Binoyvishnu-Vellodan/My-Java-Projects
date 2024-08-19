package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;

public class Verify_Selenium {

    public static  void main(String args[]){

        WebDriver driver= new ChromeDriver();
        WebDriverWait wait= new WebDriverWait(driver, 10);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchbox=driver.findElement(By.xpath("//*[@name='q']"));
        searchbox.sendKeys("Selenium webdriver");
        WebElement Google=driver.findElement(By.xpath("//*[@alt='Google']"));
        Google.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='FPdoLc lJ9FBc']/descendant::input[@name='btnK']")));
        WebElement Googlesearch=driver.findElement(By.xpath("//*[@class='FPdoLc lJ9FBc']/descendant::input[@name='btnK']"));
        Googlesearch.click();
        WebElement condition= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text,'selenium')]")));
        if (condition !=null){
            System.out.println("Element visible");
        }
    }
}
