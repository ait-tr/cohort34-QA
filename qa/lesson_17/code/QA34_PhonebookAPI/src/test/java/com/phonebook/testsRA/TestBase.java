package com.phonebook.testsRA;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public static final String TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoibWFudWVsQGdtLmNvbSIsImlzcyI6IlJlZ3VsYWl0IiwiZXhwIjoxNzE0NjM4Nzc5LCJpYXQiOjE3MTQwMzg3Nzl9.PvdsvrdYsUGkiQeBT6IuHT-wyb4C0fIIdNJuc9dXEM0";
    public static final String AUTH = "Authorization";

    @BeforeMethod
    public void init() {

        RestAssured.baseURI = "https://contactapp-telran-backend.herokuapp.com";
        RestAssured.basePath = "v1";
    }
}
