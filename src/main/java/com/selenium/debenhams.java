package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class debenhams {

    public static void main(String[] args)
    {

        System.setProperty("webdriver.gecko.driver","/Users/sahasra/Documents/geckodriver 2");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
        driver.get("https://www.debenhams.com");

        driver.findElement(By.xpath("//*[@id=\"dijit__TemplatedMixin_3\"]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        WebElement element = driver.findElement(By.linkText("Home"));
        Actions act = new Actions(driver);
        act.moveToElement(element).click().build().perform();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[7]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[5]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[7]/a[1]")).click();
        driver.findElement(By.cssSelector("#WC_ProductThumbnailDisplayJSPF_304048922997_div_2 > a:nth-child(1) > div:nth-child(1) > div:nth-child(2)")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[2]/div[8]/div[8]/div[3]/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[4]/button")).click();
        driver.findElement(By.cssSelector("#uniqName_2_0 > div:nth-child(6) > a:nth-child(3)")).click();
        driver.findElement(By.linkText("Go to checkout")).click();
        driver.findElement(By.xpath("//*[@id=\"WC_CheckoutLogon_FormInput_logonId\"]")).sendKeys("dchinnu1990@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"label_returning_customer\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"confirm\"]")).sendKeys("Strawberry@1");


    }
}


