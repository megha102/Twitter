import io.restassured.RestAssured;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TwitterTry {


    String consumerKey = "KIIFlpnIfngqkYE77B0lwYdfO";
    String consumerSecret = "gY4vlhzAUF9EUdF1fPMYylklGUku7QDfTWcnxC6br2IuWwMCbj";
    String accessToken = "838674865020416000-plouZffPQ41FC2ZPaUuX7lng6CQ1Cy9";
    String secretToken = "Cv6ph0TvnW6pcgtc7yaAkwAZptlzpmRPNp1sIsoS88igS";



    @BeforeClass
    public void setup()
    {
        RestAssured.baseURI = "https://apps.twitter.com";
        RestAssured.basePath = "/1.1/statuses";
    }


    @Test
    public void checkStatus()
    {

        given().
                auth().
                oauth(consumerKey,consumerSecret,accessToken,secretToken).
        when().
               post("/update.json").
        then().
                statusCode(200);        //getting 403!!!!!


    }
}
