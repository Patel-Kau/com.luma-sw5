package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    // Mouse Hover on Men Menu
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menMenu;

    // Mouse Hover on Bottoms
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement menBottoms;


    // Click on Pants
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement clickOnPants;

    // Mouse Hover on Gear Menu
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearMenu;

    // Click on Bags
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement clickOnBags;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement womenTops;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement clickOnJackets;


    public void mouseHoverOnWomenMenu() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Mouse hover on Women menu " + womenMenu.toString());
        CustomListeners.test.log(Status.PASS, "Mouse hover on Women menu "+ womenMenu );
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Mouse hover on Women Tops "+ womenTops.toString());
        CustomListeners.test.log(Status.PASS, "Mouse hover on Women Tops " + womenTops);
        mouseHoverToElement(womenTops);
    }

    public void clickOnJackets() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Click on Jackets " + clickOnJackets.toString());
        CustomListeners.test.log(Status.PASS, "Click on Jackets "+ clickOnJackets);
        clickOnElement(clickOnJackets);

    }

    public void mouseHoverOnMenMenu() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Mouse hover on Men menu " + menMenu.toString());
        CustomListeners.test.log(Status.PASS, "Mouse hover on Men menu "+ menMenu);
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottom() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Mouse hover on Men Bottoms " + menBottoms.toString());
        CustomListeners.test.log(Status.PASS, "Mouse hover on Men Bottoms "+ menBottoms);
        mouseHoverToElement(menBottoms);
    }

    public void clickOnPants() throws InterruptedException {
        Thread.sleep(3000);
        Reporter.log("Click on Pants " + clickOnPants.toString());
        CustomListeners.test.log(Status.PASS, "Click on Pants "+ clickOnPants);
        clickOnElement(clickOnPants);
    }

    public void mouseHoverOnGearMenu() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Mouse hover on Gear menu " + gearMenu.toString());
        CustomListeners.test.log(Status.PASS, "Mouse hover on Gear menu "+ gearMenu);
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Click on Bags " + clickOnBags.toString());
        CustomListeners.test.log(Status.PASS, "Click on Bags "+ clickOnBags);
        clickOnElement(clickOnBags);
    }


}

