package org.example;

import org.apache.commons.compress.utils.OsgiUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Scanner;

public class Sample extends Selenium_Link{
        public static void main(String args[]){
            System.out.println("Enter the season of the year: ");
            Scanner scanner= new Scanner(System.in);
            String Season= scanner.next();
            System.out.println("Enter the whole number: ");
            double number= scanner.nextFloat();
            System.out.println("Enter the adjective: ");
            String adjective= scanner.next();
            scanner.close();

            System.out.println("On a "+adjective+" "+Season+" day, I drink a minimum of "+number+" cups of coffee");



//            WebDriverWait wait = new WebDriverWait(driver, 30);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'swiper-wrapper-')and string-length(substring(@id, 16)) = 16]/descendant::a[text()='Explore Now']")));
        }
}