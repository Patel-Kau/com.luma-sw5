package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class GearPage extends Utility {
    // Bag Product Name ‘Overnight Duffle’
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement bagProductName;


    // Click on Product Name ‘Overnight Duffle’
    public void clickOnBagProductName() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log(" Click on Product Name ‘Overnight Duffle’" + bagProductName.toString());
        CustomListeners.test.log(Status.PASS, "Click on Product Name ‘Overnight Duffle’" + bagProductName);
        clickOnElement(bagProductName);
    }


}
