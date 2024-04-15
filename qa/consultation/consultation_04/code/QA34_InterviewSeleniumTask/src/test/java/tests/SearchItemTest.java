package tests;

import org.testng.annotations.Test;

public class SearchItemTest extends TestBase{

    @Test
    public void searchAndVerifyItemTest() {
        
        app.getSelect().selectDepartment();
        app.getSelect().selectSection();
        app.getSelect().selectBrand();
        app.getItem().getSecondItemName("");
        app.getItem().enterItemNameToSearchBar();
        app.getItem().getFirstItemName("");
        
    }
}

/*Get ‘Elektronik’
Select section ‘Handys & Smartphones’
Select ‘Apple’
Remember second element in search results
Enter the memorized value in the search bar
Find and check that the product name matches the stored value*/

