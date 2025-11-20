import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class homeWorkApiTest {

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "https://demowebshop.tricentis.com";
    }

    @Test
    void addToCardTest() {
        String cookieValue = "713F27E05A748D91DAD7F8C6FDCDB7BBC0103BD532EE365012094EC2A0A6A8287AE98BF86AC7" +
                "F26E6516597608B0D51DD9042F8659CF33A4EE5FAE09AE1922181CFEBFDF857F080EB0F9B54AF5F36E08D90BEEE06D43B61C21F823" +
                "C935779E637569CD186576CBEA1C2E502C91472C8924BD11CA934C6D5A75E0A430233F883722DB491CF2B658C3F1BDEF363EE45E47D" +
                "4574D333622A462C86E324A90680141";

        given()
                .contentType("application/json; charset=utf-8")
                .cookie("NOPCOMMERCE.AUTH", cookieValue)
                .when()
                .post("/addproducttocart/catalog/31/1/1")
                .then()
                .log().all()
                .statusCode(200)
                .body("success", is (true))
                .body("message", is ("The product has been added to your <a href=\"/cart\">shopping cart</a>"));
    }
}
