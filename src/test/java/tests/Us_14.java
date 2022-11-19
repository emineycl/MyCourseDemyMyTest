package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;

public class Us_14 {

    /*
    US_014 The functions of the purchase_history page should work correctly

    -When the invoice button is clicked, it should redirect to the invoice page.
    -When the course name is clicked, it should redirect to the page of the relevant course.
    */
    QualityDemyPage_User qualityDemyPage_user=new QualityDemyPage_User();
    Actions actions=new Actions(Driver.getDriver());
    SoftAssert softAssert=new SoftAssert();
    @BeforeClass
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        qualityDemyPage_user.acceptCookies.click();
        qualityDemyPage_user.loginLink.click();
        qualityDemyPage_user.emailBox.sendKeys(ConfigReader.getProperty("myStudentEmail1"));
        qualityDemyPage_user.passwordBox.sendKeys(ConfigReader.getProperty("myStudentPassword1"));
        qualityDemyPage_user.loginButton.click();
    }


    @AfterClass
    public void tearDown(){

        Driver.closeDriver();
    }
}
