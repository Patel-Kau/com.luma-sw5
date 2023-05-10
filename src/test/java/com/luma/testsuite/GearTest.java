package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.pages.OvernightDuffle;
import com.luma.pages.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {
    HomePage homePage;
    GearPage gearPage;
    ShoppingCartPage shoppingcartPage;
    OvernightDuffle overnightDuffle;

    @BeforeMethod(alwaysRun = true)
    public void init(){
        homePage = new HomePage();
        gearPage = new GearPage();
        shoppingcartPage = new ShoppingCartPage();
        overnightDuffle = new OvernightDuffle();
    }


    @Test(groups = {"sanity", "regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homePage.mouseHoverOnGearMenu();
        homePage.clickOnBags();
        // Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnBagProductName();
        // Verify the text ‘Overnight Duffle’
        Assert.assertEquals(overnightDuffle.verifyTheTextOvernightDuffle(), "Overnight Duffle");
        // Change Qty 3
       overnightDuffle.changeBagQuantity();
        // Click on ‘Add to Cart’ Button.
        overnightDuffle.clickOnAddToCartButton();
        // Verify the text ‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(overnightDuffle.verifyTextYouAdded_ProductNameMessage(), "You added Overnight Duffle to your shopping cart.");
        // Click on Product Name ‘Overnight Duffle’
        overnightDuffle.clickOnShoppingCartInToMessage();
        // Verify the product name ‘Overnight Duffle’
        Assert.assertEquals(shoppingcartPage.verifyTheBagProductName(), "Overnight Duffle");
        //Verify the Qty is ‘3’
        Assert.assertEquals(shoppingcartPage.verifyTheProductQuantity(), "3");

        // Verify the product price ‘$135.00’
        Assert.assertEquals(shoppingcartPage.verifyTheProductPrice(), "$135.00");
        // Change Qty to ‘5’
        shoppingcartPage.changeShoppingCartQuantity();
        // Click on ‘Update Shopping Cart’ button
        shoppingcartPage.updateShoppingCartButton();
        // Verify the product price ‘$225.00’
        Assert.assertEquals(shoppingcartPage.verifyTheFinalProductPrice(), "$225.00");





    }


}
