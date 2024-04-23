package com.ebay.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchItemTest extends TestBase{

    @Test
    public void searchAndVerifyItemTest() {
        
        app.getSelect().selectDepartment("2");
        app.getSelect().selectSection("1");
        app.getSelect().selectBrand("Apple ");
        String secondItemName = app.getItem().getSecondItemName("2");
        System.out.println(secondItemName);
        app.getItem().enterItemNameToSearchBar(secondItemName);
    //    app.getItem().pause(1000);
        String firstItemName = app.getItem().getFirstItemName("1");
        System.out.println(firstItemName);
    //    app.getItem().pause(1000);
        Assert.assertEquals(firstItemName,secondItemName);
    }
}

