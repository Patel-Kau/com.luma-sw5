package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.*;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class WomenTest extends BaseTest {

    HomePage homePage;
    WomenPage womenPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        womenPage = new WomenPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        // Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();

        // Mouse Hover on Tops
        homePage.mouseHoverOnTops();

        //Click on Jackets
        homePage.clickOnJackets();

        // Verify the products name display in alphabetical order
        Assert.assertEquals(womenPage.productListAfterSorting(), womenPage.productListBeforeSorting());

    }


    @Test(groups = {"smoke", "regression"})
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        // Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();

        // Mouse Hover on Tops
        homePage.mouseHoverOnTops();

        //Click on Jackets
        homePage.clickOnJackets();

        // Verify the products price display in Low to High
        Assert.assertEquals(womenPage.priceListAfterSorting(), womenPage.priceListBeforeSorting());


    }


}



