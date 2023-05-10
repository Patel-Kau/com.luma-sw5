package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MenPage extends Utility {

    // X-path for Mouse Hover on product name Cronus Yoga Pant and click on size 32.

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement hoverOnPantSize;

    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option text'])[1]")
    WebElement clickOnPantSize;

    // X-path for Mouse Hover on product name Cronus Yoga Pant and click on colour Black.

    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
    WebElement pantColour;

    // Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement hoverOnAddToCartButton;

     @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement clickOnAddToCartButton;

    // Verify the text You added Cronus Yoga Pant to your shopping cart.
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyAddedToShoppingCart;

    // Click on ‘shopping cart’ Link into message
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement clickOnShoppingCart;


    public void pantSize() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Mouse hover on Pant Size " + hoverOnPantSize.toString());
        CustomListeners.test.log(Status.PASS, "Mouse hover on Pant Size " + hoverOnPantSize);
        mouseHoverToElement(hoverOnPantSize);

        Reporter.log("Click on Pant Size " + clickOnPantSize.toString());
        CustomListeners.test.log(Status.PASS, "Click on Pant Size " + clickOnPantSize);
        mouseHoverToElementAndClick(clickOnPantSize);
    }

    public void pantColour() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Mouse hover and click on Pant Colour " + pantColour.toString());
        CustomListeners.test.log(Status.PASS, "Mouse hover and click on Pant Colour " + pantColour);
        mouseHoverToElementAndClick(pantColour);
    }

    public void addToCart() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Mouse hover On Add To Cart Button " + hoverOnAddToCartButton.toString());
        CustomListeners.test.log(Status.PASS, "Mouse hover On Add To Cart Button " + hoverOnAddToCartButton);
        mouseHoverToElement(hoverOnAddToCartButton);

        Reporter.log("Click on Add To Cart Button " + clickOnAddToCartButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on Add To Cart Button " + clickOnAddToCartButton);
        mouseHoverToElementAndClick(clickOnAddToCartButton);
    }

    public String verifyAddedItemToTheShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("verify added item to the Shopping Cart " + verifyAddedToShoppingCart.toString());
        CustomListeners.test.log(Status.PASS, "verify added item to the Shopping Cart " + verifyAddedToShoppingCart);
        return getTextFromElement(verifyAddedToShoppingCart);
    }

    public void clickOnShoppingCartInMessage() {
        Reporter.log("Mouse hover and click on Shopping Cart " + clickOnShoppingCart.toString());
        CustomListeners.test.log(Status.PASS, "Mouse hover and click on Shopping Cart " + clickOnShoppingCart);
        mouseHoverToElementAndClick(clickOnShoppingCart);
    }

}
