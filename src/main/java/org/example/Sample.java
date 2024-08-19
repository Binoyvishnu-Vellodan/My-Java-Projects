package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample extends Selenium_Link{
        public void waitForElement (){
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'swiper-wrapper-')and string-length(substring(@id, 16)) = 16]/descendant::a[text()='Explore Now']")));
        }
}