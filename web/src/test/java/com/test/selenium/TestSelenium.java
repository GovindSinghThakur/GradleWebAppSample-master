package com.test.selenium;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
@Ignore
public class TestSelenium {
	@Test //This is Junit annotation
    public void testLogin()
	{
		WebDriver driver = new FirefoxDriver();
         driver.get("http://localhost:8080/web");
         //driver.findElement(By.linkText(“REGISTER”)).click();

         driver.findElement(By.name("username")).sendKeys("Govind");

         driver.findElement(By.name("password")).sendKeys("Singh");

         driver.findElement(By.name("submit")).click();

//         Select select = new Select(driver.findElement(By.name(“country”)));
//
//        select.selectByVisibleText(“ANGOLA”);

         driver.close();

        // driver.quit();


	}

}
