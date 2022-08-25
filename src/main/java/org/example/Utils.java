package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Utils extends BasePage{
    public static void TypeText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    public static void ClickElement(By by)
    {
        driver.findElement(by).click();
    }
    public static void verifyCurrentURL(String url){
        Assert.assertEquals(driver.getCurrentUrl(),url);
    }
}
