package tests;

import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test(dataProvider = "Ciudades")
    public void openGoogleComTest(String text) throws InterruptedException {

        steps.executeSearchByKeyword(text)
                .verifyThatTopResultContainsCorrectText("Bogotá - Wikipedia")
                .verifyThatTopResultContainsProperAttributeText("LC20lb MBeuO DKV0Md");


    }
}
