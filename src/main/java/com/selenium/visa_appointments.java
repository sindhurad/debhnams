package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class visa_appointments
{
    public static void main(String[] args){

        System.setProperty("webdriver.gecko.driver","/Users/sahasra/Documents/geckodriver 2");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://visas-immigration.service.gov.uk/resume/4ade3f5e-a4b0-439f-a00a-7fb11a476ca8");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sucess@14");
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        driver.findElement(By.cssSelector(".group > a:nth-child(1)")).click();
        driver.findElement(By.xpath("/html/body/main/section[2]/section/div[1]/form/div/div/fieldset/div/div[4]/label/span")).click();
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

    }
}
