package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.*;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {

    HomePage homePage;
   MenPage menPage;
    ShoppingCartPage shoppingcartPage;


    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        menPage = new MenPage();
        shoppingcartPage = new ShoppingCartPage();
    }


//        HomePage homepage = new HomePage();
//    MenPage menpage = new MenPage();
//    ShoppingCartPage shoppingCart = new ShoppingCartPage();


        @Test(groups = {"sanity", "regression"})
        public void userShouldAddProductSuccessFullyToShoppingCart () throws InterruptedException {
            homePage.mouseHoverOnMenMenu();
            homePage.mouseHoverOnBottom();
            homePage.clickOnPants();

            // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
            menPage.pantSize();

            // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
            menPage.pantColour();
            menPage.addToCart();
            Assert.assertEquals(menPage.verifyAddedItemToTheShoppingCart(), "You added Cronus Yoga Pant to your shopping cart.");
            menPage.clickOnShoppingCartInMessage();
            Assert.assertEquals(shoppingcartPage.verifyTextShoppingCart(), "Shopping Cart");
            Assert.assertEquals(shoppingcartPage.verifyTheProductName(), "Cronus Yoga Pant");
            Assert.assertEquals(shoppingcartPage.verifyTheProductSize(), "32");
            Assert.assertEquals(shoppingcartPage.verifyTheProductNameColour(), "Black");


        }


    }
