package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us_14 {
    /*
    US_014 The functions of the purchase_history page should work correctly

    -When the invoice button is clicked, it should redirect to the invoice page.
    -When the course name is clicked, it should redirect to the page of the relevant course.
    */
    QualityDemyPage_User qualityDemyPage_User=new QualityDemyPage_User();
    Actions actions=new Actions(Driver.getDriver());


    @BeforeClass
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        qualityDemyPage_User.acceptCookies.click();
        qualityDemyPage_User.loginLink.click();
        qualityDemyPage_User.emailBox.sendKeys(ConfigReader.getProperty("myStudentEmail1"));
        qualityDemyPage_User.passwordBox.sendKeys(ConfigReader.getProperty("myStudentPassword1"));
        qualityDemyPage_User.loginButton.click();
    }
    @Test
    public void invoiceTest(){

        // -When the invoice button is clicked, it should redirect to the invoice page.
        

        ReusableMethods.wait(7);
        actions.moveToElement(qualityDemyPage_User.userTestButton).perform();
        actions.moveToElement(qualityDemyPage_User.purchaseHistoryButton).perform();
        actions.moveToElement(qualityDemyPage_User.purchaseHistoryButton).click().perform();
        ReusableMethods.wait(2);
        actions.moveToElement(qualityDemyPage_User.invoiceButton).click().perform();
        ReusableMethods.wait(2);

        Assert.assertTrue(qualityDemyPage_User.invoiceText.isDisplayed());


    }
        @Test
        public void courseNameTest(){

        // -When the course name is clicked, it should redirect to the page of the relevant course.

            ReusableMethods.wait(7);
            actions.moveToElement(qualityDemyPage_User.userTestButton).perform();
            actions.moveToElement(qualityDemyPage_User.purchaseHistoryButton).perform();
            actions.moveToElement(qualityDemyPage_User.purchaseHistoryButton).click().perform();
            ReusableMethods.wait(2);

            qualityDemyPage_User.disneyMagicEnglish.click();

            qualityDemyPage_User.disneyMagicEnglishPage.click();

            Assert.assertTrue(qualityDemyPage_User.disneyMagicEnglishPage.isDisplayed());

    }
    @AfterClass
    public void tearDown(){

        Driver.getDriver().quit();

    }
}
