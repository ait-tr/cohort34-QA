package com.phonebook.testsRA;

import com.phonebook.dto.ContactDto;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DeleteContactByIdTests extends TestBase{

    String id;

    @BeforeMethod
    public void precondition() {
        ContactDto contactDto = ContactDto.builder()
                .name("Oliver")
                .lastName("Kan")
                .email("kan@gm.com")
                .phone("1234567890")
                .address("Berlin")
                .description("goalkeeper")
                .build();

        String message = given()
                .header(AUTH, TOKEN)
                .body(contactDto)
                .contentType(ContentType.JSON)
                .post("contacts")
                .then()
                .assertThat().statusCode(200)
                .extract().path("message");
       // System.out.println(message); Contact was added! ID: 89578f8a-f3fe-425d-8bc9-3ddf5808a084

        String[] split = message.split(": ");
        id = split[1];
    }

    @Test
    public void deleteContactByIdSuccessTest() {

        given()
                .header(AUTH, TOKEN)
                .delete("contacts/" + id)
                .then()
                .assertThat().statusCode(200)
                //.extract().path("message");
                        .assertThat().body("message",equalTo("Contact was deleted!"));

      //  System.out.println(message);
    }
}
