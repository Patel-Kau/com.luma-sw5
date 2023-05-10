package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OvernightDuffle extends Utility {

    // Verify the text ‘Overnight Duffle’
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement textOvernightDuffle;


    // X-path for Change Qty 3
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement bagQuantity;


    // X path for 'Add to Cart’ Button.
    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCartButton;

    // Verify the text ‘You added Overnight Duffle to your shopping cart.’
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement youAdded_ProductTextMessage;


    // Click on ‘shopping cart’ Link into message
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;


    // Verify the text ‘Overnight Duffle’
    public String verifyTheTextOvernightDuffle() {
        Reporter.log("Verify the text ‘Overnight Duffle’ " + textOvernightDuffle.toString());
        CustomListeners.test.log(Status.PASS, "Verify the text ‘Overnight Duffle’ " + textOvernightDuffle);
        return getTextFromElement(textOvernightDuffle);
    }

    // Change Qty 3
    public void changeBagQuantity() {
        Reporter.log("Change quantity to 3 " + bagQuantity.toString());
        CustomListeners.test.log(Status.PASS, "Change quantity to 3 " + bagQuantity);
        sendTextToElement(bagQuantity, "3");
    }

    // Click on ‘Add to Cart’ Button.
    public void clickOnAddToCartButton() {
        Reporter.log("Click on add to cart button " + addToCartButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on add to cart button " + addToCartButton);
        mouseHoverToElementAndClick(addToCartButton);
    }

    // Verify the text ‘You added Overnight Duffle to your shopping cart.’
    public String verifyTextYouAdded_ProductNameMessage() {
        Reporter.log("Verify the text ‘You added Overnight Duffle to your shopping cart.’ " + youAdded_ProductTextMessage.toString());
        CustomListeners.test.log(Status.PASS, "Verify the text ‘You added Overnight Duffle to your shopping cart.’" + youAdded_ProductTextMessage);
        return getTextFromElement(youAdded_ProductTextMessage);
    }

    // Click on Product Name ‘Overnight Duffle’
    public void clickOnShoppingCartInToMessage() {
        Reporter.log("Click on shopping cart in to the message " + shoppingCart.toString());
        CustomListeners.test.log(Status.PASS, "Click on shopping cart in to the message " + shoppingCart);
        clickOnElement(shoppingCart);
    }


}
