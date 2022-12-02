package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us_12 {

     /*
    US_012 Course compare page functions should work correctly

    -Courses should be searchable from dropboxes
    -When to learn more link is clicked, it should redirect to the page of the relevant course
    -When the buy now button is clicked, it should redirect to the shopping_cart page
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
    public void US12_TC01(){

      //  -Courses should be searchable from dropboxes

        ReusableMethods.wait(5);

    actions.moveToElement(qualityDemyPage_User.categories).perform();
        actions.moveToElement(qualityDemyPage_User.categoriWebDesing).perform();
        actions.moveToElement(qualityDemyPage_User.webDevelopers).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.wait(3);
        qualityDemyPage_User.courseCompareReactandTypescriptinsButton.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();

        actions.moveToElement(qualityDemyPage_User.courseComparePageChooseButton1).click().perform();
        qualityDemyPage_User.courseComparePageChooseButtonWebDesignforWebPHP.click();

        ReusableMethods.wait(2);
        qualityDemyPage_User.courseComparePageChooseButton2.click();
        ReusableMethods.wait(3);
        qualityDemyPage_User.courseComparePageChooseButton2SAA.click();
        ReusableMethods.wait(2);

    }
    @Test
    public void US12_TC02(){
      // -When to learn more link is clicked, it should redirect to the page of the relevant course

        actions.moveToElement(qualityDemyPage_User.categories).perform();
        actions.moveToElement(qualityDemyPage_User.categoriWebDesing).perform();
        actions.moveToElement(qualityDemyPage_User.webDevelopers).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.wait(3);
        qualityDemyPage_User.courseCompareReactandTypescriptinsButton.click();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.wait(3);

        qualityDemyPage_User.reactandTypescriptinsLearnMoreLink.click();

        ReusableMethods.wait(2);

        String expectedCourseName= "React and Typescript";
        String actualCourseName=qualityDemyPage_User.reactAndTypescriptText.getText();
        Assert.assertTrue(actualCourseName.contains(expectedCourseName));
    }
    @Test
    public void US12_TC03(){

       // -When the buy now button is clicked, it should redirect to the shopping_cart page

        actions.moveToElement(qualityDemyPage_User.categories).perform();
        actions.moveToElement(qualityDemyPage_User.categoriWebDesing).perform();
        actions.moveToElement(qualityDemyPage_User.webDevelopers).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .perform();
        ReusableMethods.wait(3);

        qualityDemyPage_User.wordpressButton.click();

        ReusableMethods.wait(5);

        qualityDemyPage_User.wordpressBuyNow.click();

        ReusableMethods.wait(5);

        String expectedName= "Shopping cart";
        String actualName=qualityDemyPage_User.shoppingBuyPage.getText();
        Assert.assertTrue(actualName.contains(expectedName));

    }
    @AfterClass
    public void tearDown(){

        Driver.closeDriver();
    }

}
