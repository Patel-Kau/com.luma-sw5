package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    // Verify the text ‘Shopping Cart'.
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement verifyTextShoppingCart;

    // Verify the product name ‘Cronus Yoga Pant’
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productName;

    // Verify the product size ‘32’
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement productSize;

    // Verify the product colour ‘Black’
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement productColour;

    // Verify the product name ‘Overnight Duffle’
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement verifyProductName;

    //Verify the Qty is ‘3’
       By verifyProductQuantity = By.xpath("//input[@title='Qty']");

    // Verify the product price ‘$135.00’
    @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement verifyProductPrice;

    // Change Qty to ‘5’
    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement changeQuantity;

    // Click on ‘Update Shopping Cart’ button
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement shoppingCartButton;

    // Verify the product price ‘$225.00’
    @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement newProductPrice;

    public String verifyTextShoppingCart() {
        Reporter.log("verify the text shopping cart " + verifyTextShoppingCart.toString());
        CustomListeners.test.log(Status.PASS,"verify the text shopping cart "+ verifyTextShoppingCart);
        return getTextFromElement(verifyTextShoppingCart);
    }

    public String verifyTheProductName() {
        Reporter.log("Verify the product name " + productName.toString());
        CustomListeners.test.log(Status.PASS,"Verify the product name" + productName);
        return getTextFromElement(productName);
    }
    public String verifyTheProductSize() {
        Reporter.log("Verify the product size " + productSize.toString());
        CustomListeners.test.log(Status.PASS,"Verify the product size" + productSize);
        return getTextFromElement(productSize);
    }

    public String verifyTheProductNameColour() {
        Reporter.log("Verify the product colour " + productColour.toString());
        CustomListeners.test.log(Status.PASS,"Verify the product colour" + productColour);
        return getTextFromElement(productColour);
    }

    // Verify the product name ‘Overnight Duffle’
    public String verifyTheBagProductName() {
        Reporter.log("Verify the Bag name ‘Overnight Duffle’ " + verifyProductName.toString());
        CustomListeners.test.log(Status.PASS,"Verify the Bag name ‘Overnight Duffle’ " + verifyProductName);
        return getTextFromElement(verifyProductName);
    }
    //Verify the Qty is ‘3’
    public String verifyTheProductQuantity() throws InterruptedException {
        Thread.sleep(3000);
        Reporter.log("Verify the Bag Quantity '3' " + verifyProductQuantity.toString());
        CustomListeners.test.log(Status.PASS,"Verify the Bag Quantity '3' " + verifyProductQuantity);
        return getAttributeValueFromElement(verifyProductQuantity);
    }
    // Verify the product price ‘$135.00’
    public String verifyTheProductPrice() {
        Reporter.log("Verify the Bag price ‘$135.00’ " + verifyProductPrice.toString());
        CustomListeners.test.log(Status.PASS,"Verify the Bag price ‘$135.00’ " + verifyProductPrice);

        return getTextFromElement(verifyProductPrice);
    }
    // Change Qty to ‘5’
    public void changeShoppingCartQuantity(){
        Reporter.log("Change shopping cart quantity to 5 " + changeQuantity.toString());
        CustomListeners.test.log(Status.PASS,"Change shopping cart quantity to 5 " + changeQuantity);
        sendTextToElement(changeQuantity, "5");
    }
    // Click on ‘Update Shopping Cart’ button
    public void updateShoppingCartButton(){
        Reporter.log("Click on ‘Update Shopping Cart’ button " + shoppingCartButton.toString());
        CustomListeners.test.log(Status.PASS,"Click on ‘Update Shopping Cart’ button " + shoppingCartButton);
        clickOnElement(shoppingCartButton);
    }
    // Verify the product price ‘$225.00’
    public String verifyTheFinalProductPrice() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Verify the product price ‘$225.00’ " + newProductPrice.toString());
        CustomListeners.test.log(Status.PASS,"Verify the product price ‘$225.00’ " + newProductPrice);
        return getTextFromElement(newProductPrice);
    }






}
