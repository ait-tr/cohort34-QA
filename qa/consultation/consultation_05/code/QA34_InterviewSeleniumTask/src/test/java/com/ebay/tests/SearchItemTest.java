package com.ebay.tests;

import org.testng.annotations.Test;

public class SearchItemTest extends TestBase{

    @Test
    public void searchAndVerifyItemTest() {

        app.getSelect().selectDepartment("2");
        app.getSelect().selectSection("1");
        app.getSelect().selectBrand("Apple ");
        String secondItemName = app.getItem().getSecondItemName("2");
        System.out.println(secondItemName);
//        app.getItem().enterItemNameToSearchBar();
//        app.getItem().getFirstItemName("");

    }
}

/*Remember second element in search results
Enter the memorized value in the search bar
Find and check that the product name matches the stored value*/

