package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class SeleniumTest extends Selenium_Link{

        @Test
        void  setup(){
            System.out.println("I am in side Setup");
                driver= new ChromeDriver();
                driver.get("https://www.kia.ca/en");
                driver.manage().window().maximize();
                WebElement SelectProvince=driver.findElement(By.xpath("//select[@name='lang-modal-province']"));
                SelectProvince.click();
                WebElement Ontario=driver.findElement(By.xpath("//option[@value='ON']"));
                Ontario.click();
                WebElement Update=driver.findElement(By.xpath("//button[text()='Update']"));
                Update.click();
                WebDriverWait wait = new WebDriverWait(driver, 30);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@style,'height') and contains(@id,'swiper-wrapper-')and string-length(substring(@id, 16)) >= 16]/descendant::a[text()='Explore Now']")));
                WebElement ExploreNow=driver.findElement(By.xpath("//*[contains(@style,'height') and contains(@id,'swiper-wrapper-')and string-length(substring(@id, 16)) >= 16]/descendant::a[text()='Explore Now']"));
                ExploreNow.click();
                WebElement scroll = driver.findElement(By.xpath("//*[text()=\"Launch 360 view\"]"));
                Actions actions = new Actions(driver);
                actions.moveToElement(scroll).perform();
                scroll.click();

                driver.close();
//                WebElement draggable = driver.findElement(By.id("//img[contains(@src,'ev9/snow-white-pearl/01.png')]"));
//                Rectangle start = draggable.getRect();
//                Rectangle finish = driver.findElement(By.id("//img[contains(@src,'ev9/snow-white-pearl/01.png')]")).getRect();
//                new Actions(driver).dragAndDropBy(draggable, finish.getX() - start.getX(), finish.getY() - start.getY()).perform();
        }
        @AfterTest
        void TestSteps(){
            System.out.println("I am out side TestSteps");
        }
        @BeforeTest
        void Data(){
            System.out.println("I am Before Test");
        }
}


