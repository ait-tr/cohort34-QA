package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test(enabled = false)
    public void createNewAccountPositiveTest() {
//        Random random = new Random();
//        int i = random.nextInt(1000)+1000;
        clickOnLoginLink();
        fillLoginRegisterForm(new User().setEmail("manuel@gm.com")
                .setPassword("Manuel1234$"));
        clickOnRegistrationButton();
        Assert.assertTrue(isSignOutButtonPresent());
    }

    @Test
    public void createNewAccountWithExistedEmailNegativeTest() {

        clickOnLoginLink();
        fillLoginRegisterForm(new User().setEmail("manuel@gm.com")
                .setPassword("Manuel1234$"));
        clickOnRegistrationButton();
        Assert.assertTrue(isAlertPresent());
    }

}

// 1. id
// 1.2 className(css .)
// 2. css
// 3. xPath
