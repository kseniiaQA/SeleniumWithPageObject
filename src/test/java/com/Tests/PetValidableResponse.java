package com.Tests;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.Assert;

public class PetValidableResponse {


    private PetResponse model;
    private Response response;

    public PetValidableResponse(Response response) {
        this.response = response;
        model = response.as(PetResponse.class);
    }

    public PetValidableResponse checkStatusCode(int statusCode) {
        response.then().statusCode(statusCode);
        return this;
    }


    public PetValidableResponse checkIdNotNull() {
        response.then().body("id", Matchers.notNullValue());
        return this;
    }

    public PetValidableResponse checkLastUpdated() {
        response.then().body("lastUpdated", Matchers.notNullValue());
        return this;
    }

    public PetValidableResponse checkPet(Pet expected) {
      Assert.assertEquals(model, expected);
        return this;
    }
}
