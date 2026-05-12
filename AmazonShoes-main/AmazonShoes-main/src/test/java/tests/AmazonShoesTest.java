package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import driver.DriverManager;
import pages.AmazonPage;

public class AmazonShoesTest {

    AmazonPage amazon = new AmazonPage();

    @Test

    public void verifyNikeShoesCount() throws Exception {

        amazon.openAmazon();

        amazon.searchShoes();

        amazon.applyNikeFilter();

        amazon.applyPriceFilter();

        int count =
                amazon.getProductCount();

        System.out.println(
                "Total Nike Shoes between ₹2000 and ₹10000 = "
                        + count);

        Assert.assertTrue(count > 0);
    }

    @AfterTest

    public void tearDown() {

        DriverManager.quitDriver();
    }
}