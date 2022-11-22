package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.InstructorFor_Instructor;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_39 {

    /*
    the functions of the payment page should work correctly
-The pay with stripe button should be visible after clicking the stripe logo
-When the pay with stripe button is clicked, it should redirect to checkout.stripe.com
-When the close button is clicked, it should redirect to the shopping cart page.
-E-mail, card information, country information should be filled in appropriately on checkout.stripe.com page
-When the pay button is pressed, it should be checked that the necessary information has been filled.
-If the required information is filled when the pay button is clicked, a tick should appear on the pay button and then it should redirect to my_courses page.
-course purchased after payment should be displayed on my_courses page
     */
    InstructorFor_Instructor instructorFor_Instructor=new InstructorFor_Instructor();
    Actions actions=new Actions(Driver.getDriver());


    @BeforeClass
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        instructorFor_Instructor.acceptCookies.click();
        instructorFor_Instructor.loginLink.click();
        instructorFor_Instructor.emailBox.sendKeys(ConfigReader.getProperty("myStudentEmail3"));
        instructorFor_Instructor.passwordBox.sendKeys(ConfigReader.getProperty("myStudentPassword3"));
        instructorFor_Instructor.loginButton.click();
    }

    @Test
    public void stripeLogoTest(){

        //-The pay with stripe button should be visible after clicking the stripe logo


        actions.moveToElement(instructorFor_Instructor.categories).perform();
        actions.moveToElement(instructorFor_Instructor.categoriWebDesing).perform();
        actions.moveToElement(instructorFor_Instructor.webDevelopers).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.wait(3);

        instructorFor_Instructor.wordpresslink.click();
        instructorFor_Instructor.wordpressBuyNow.click();

        instructorFor_Instructor.checkoutButton.click();
        instructorFor_Instructor.stripeButoon.click();

        Assert.assertTrue(instructorFor_Instructor.payWithStripe.isDisplayed());

    }

    @Test
    public void stripeButtonTest(){

        // -When the pay with stripe button is clicked, it should redirect to checkout.stripe.com

        actions.moveToElement(instructorFor_Instructor.categories).perform();
        actions.moveToElement(instructorFor_Instructor.categoriWebDesing).perform();
        actions.moveToElement(instructorFor_Instructor.webDevelopers).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.wait(3);

        instructorFor_Instructor.wordpresslink.click();
        instructorFor_Instructor.wordpressBuyNow.click();

        instructorFor_Instructor.checkoutButton.click();
        instructorFor_Instructor.stripeButoon.click();
        instructorFor_Instructor.payWithStripe.click();

        ReusableMethods.wait(5);

        String expectedUrl="checkout.stripe";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));


    }
    @Test
    public void shoppingCardPageTest(){

        //-When the close button is clicked, it should redirect to the shopping cart page.

        actions.moveToElement(instructorFor_Instructor.categories).perform();
        actions.moveToElement(instructorFor_Instructor.categoriWebDesing).perform();
        actions.moveToElement(instructorFor_Instructor.webDevelopers).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.wait(3);

        instructorFor_Instructor.wordpresslink.click();
        instructorFor_Instructor.wordpressBuyNow.click();

        instructorFor_Instructor.checkoutButton.click();
        instructorFor_Instructor.stripeButoon.click();
        instructorFor_Instructor.closeButton.click();
        Assert.assertTrue(instructorFor_Instructor.shoppingCardPage.isDisplayed());
    }
    @Test
    public void StripecheckoutTest(){

        //-E-mail, card information, country information should be filled in appropriately on checkout.stripe.com page


        actions.moveToElement(instructorFor_Instructor.categories).perform();
        actions.moveToElement(instructorFor_Instructor.categoriWebDesing).perform();
        actions.moveToElement(instructorFor_Instructor.webDevelopers).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.wait(3);

        instructorFor_Instructor.wordpresslink.click();
        instructorFor_Instructor.wordpressBuyNow.click();

        instructorFor_Instructor.checkoutButton.click();
        instructorFor_Instructor.stripeButoon.click();
        instructorFor_Instructor.payWithStripe.click();

        instructorFor_Instructor.checkoutEmail.sendKeys("user_1106335@login.com" + Keys.ENTER);
        ReusableMethods.wait(2);
        instructorFor_Instructor.cardNummer.sendKeys("4242424242424242" +Keys.ENTER);
        ReusableMethods.wait(2);
        instructorFor_Instructor.expDatum.sendKeys("1225" +Keys.ENTER);
        ReusableMethods.wait(2);
        instructorFor_Instructor.cardCVC.sendKeys("321" +Keys.ENTER);
        ReusableMethods.wait(2);
        instructorFor_Instructor.nameOnCard.sendKeys("Abc Def");
        ReusableMethods.wait(2);
      /*  actions.moveToElement(instructorFor_Instructor.countryName).perform();
        ReusableMethods.wait(2);
        actions.moveToElement(instructorFor_Instructor.countrySweden).click().perform();
        ReusableMethods.wait(2);  */

        //Burada zatan Sweden secili oldugu icin hata veriyor

        Driver.closeDriver(); }



    @AfterClass
    public void tearDown(){

        Driver.closeDriver();
    }
}
