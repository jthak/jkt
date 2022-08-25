package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CorridorDigitalSeason1Page extends Utils{
    public void VerifySortingOptionNewest(){
        ArrayList<String> ActualList = new ArrayList<>();
        List<WebElement> ProductsList = driver.findElements(By.cssSelector("h4.series-view-text-title"));
        System.out.println(ProductsList.size());

        for(WebElement e:ProductsList){
            ActualList.add(e.getText());
            System.out.println(e.getText());
        }
        //Creating Second list for sorting
        ArrayList<String> ExpectedList = new ArrayList<>();
        for(String a:ActualList){
            ExpectedList.add(a);
        }
        Collections.sort(ExpectedList);
        //Changing sorted list in reverse newest to oldest Order
        Collections.reverse(ExpectedList);
        //Verify if videos Actually sorted Newest to oldest
        Assert.assertTrue(ExpectedList.equals(ActualList),"Videos Are Not Sorted To Newest To Oldest");
    }
}
