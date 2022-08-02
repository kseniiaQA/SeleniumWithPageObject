//package com.Tests;
//
//import io.restassured.response.ValidatableResponse;
//import io.restassured.specification.RequestSpecification;
//import lombok.AllArgsConstructor;
//import org.hamcrest.Matchers;
//
//import static io.restassured.RestAssured.given;
//
//@AllArgsConstructor
//public class TestClient {
//
//    private String baseUri;
//    private String basePath;
//
//
//    public TestClient() {
//        this(TestConfig.Uri.vlaue, TestConfig.Path.value);
//
//    }
//
//    public RequestSpecification getRequestSpec() {
//        return given().baseUri(baseUri).
//                contentType("application/json");
//
//    }
//
//    public RequestSpecification getRequestSpec(Object pet){
//        return getRequestSpec().body(pet);
//
//}
//public ValidatableResponse create(Pet pet){
//        ValidatableResponse response = getRequestSpec(pet).when().post("pets").then().log().all();
//
//        return response;
//}
//}
//
//
