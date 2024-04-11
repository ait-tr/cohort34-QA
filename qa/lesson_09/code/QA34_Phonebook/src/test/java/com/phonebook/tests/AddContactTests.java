package com.phonebook.tests;

import com.phonebook.models.Contact;
import com.phonebook.models.User;
import com.phonebook.utils.DataProviders;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnSignOutButton();
        }

        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginRegisterForm(new User().setEmail("manuel@gm.com")
                .setPassword("Manuel1234$"));
        app.getUser().clickOnLoginButton();
    }

    @Test
    public void addContactPositiveTest() {

        app.getContact().clickOnAddLink();
        app.getContact().fillAddContactForm(new Contact()
                .setName("Karl")
                .setLastName("Adam")
                .setPhone("1234567890")
                .setEmail("adam@gm.com")
                .setAddress("Berlin")
                .setDescription("goalkeeper"));
        app.getContact().clickOnSaveButton();
        Assert.assertTrue(app.getContact().isContactCreated("Karl"));
    }

    @AfterMethod
    public void postCondition() {
        app.getContact().removeContact();
    }

    @Test(dataProvider = "addNewContact", dataProviderClass = DataProviders.class)
    public void addContactPositiveTestFromDataProvider(String name, String lastname, String phone,
                                                       String email, String address, String description) {
        app.getContact().clickOnAddLink();
        app.getContact().fillAddContactForm(new Contact()
                .setName(name)
                .setLastName(lastname)
                .setPhone(phone)
                .setEmail(email)
                .setAddress(address)
                .setDescription(description));
        app.getContact().clickOnSaveButton();
        Assert.assertTrue(app.getContact().isContactCreated(name));
    }


    @Test(dataProvider = "addNewContactFromCsvFile", dataProviderClass = DataProviders.class)
    public void addContactPositiveTestFromDataProviderWithCsvFile(Contact contact) {

        app.getContact().clickOnAddLink();
        app.getContact().fillAddContactForm(contact);
        app.getContact().clickOnSaveButton();

        Assert.assertTrue(app.getContact().isContactCreated(contact.getName()));
    }

    }
