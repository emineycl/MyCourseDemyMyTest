package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us_11 {

 /*
     US_011 my_wishlist page functions should work correctly

    -When the compare link is clicked, it should redirect to the Course compare page
    -Course should be able to get selected from the search box
    -When the course name is clicked, it should redirect to the page of the relevant course.
    -When the instructor icon is clicked, it should redirect to the relevant instructor page.
    -The course should be able to verify the number
    and duration of the course on the relevant page when the course name is clicked.
    */

    QualityDemyPage_User qualityDemyPage_User=new QualityDemyPage_User();
    Actions actions=new Actions(Driver.getDriver());
    SoftAssert softAssert=new SoftAssert();
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
    public void wishListCompareTest(){

        //-When the compare link is clicked, it should redirect to the Course compare page
        ReusableMethods.wait(5);
        actions.moveToElement(qualityDemyPage_User.heartButton).perform();
        qualityDemyPage_User.goToWistListButton.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.wait(3);
        qualityDemyPage_User.myWishListCompare1.click();

        String expectedCourseCompare="                Course compare            ";
        String actualCourseCompare=qualityDemyPage_User.courseComparePage.getText();
        Assert.assertTrue(expectedCourseCompare.contains(actualCourseCompare));
    }
    @Test
    public void wishlistSearcBoxTesti(){

        //  -Course should be able to get selected from the search box

        ReusableMethods.wait(5);
        actions.moveToElement(qualityDemyPage_User.heartButton).perform();
        qualityDemyPage_User.goToWistListButton.click();

        qualityDemyPage_User.searchMyWishlist.sendKeys("React and Typescript" + Keys.ENTER);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
      String expectedCourseName= "React and Typescript";
        String actualCourseName=qualityDemyPage_User.reactAndTypescriptText.getText();
       Assert.assertTrue(actualCourseName.contains(expectedCourseName));
        ReusableMethods.wait(3);

    }
    @Test
    public void courseNameTest(){

        //  -When the course name is clicked, it should redirect to the page of the relevant course.

        ReusableMethods.wait(5);
        actions.moveToElement(qualityDemyPage_User.heartButton).perform();
        qualityDemyPage_User.goToWistListButton.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        qualityDemyPage_User.reactAndTypescriptText.click();
        String expectedCourseName= "React and Typescript";
        String actualCourseName=qualityDemyPage_User.reactAndTypescriptText.getText();
        Assert.assertTrue(actualCourseName.contains(expectedCourseName));

    }
    @Test
    public void instructorPageTest(){

       // -When the instructor icon is clicked, it should redirect to the relevant instructor page.

        ReusableMethods.wait(5);
        qualityDemyPage_User.homePage.click();
        actions.moveToElement(qualityDemyPage_User.heartButton).perform();
        qualityDemyPage_User.goToWistListButton.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        qualityDemyPage_User.reactAndTypescriptText.click();
        qualityDemyPage_User.ReactandTypescriptinstrocturIcon.click();

        String expectedUrl="https://qualitydemy.com/home/instructor_page/1";
        String actualUrl=Driver.getDriver().getCurrentUrl();
       Assert.assertEquals(actualUrl,expectedUrl);
    }
    @Test
    public void courseLessonDurationTest(){

        // -The course should be able to verify the number
        // and duration of the course on the relevant page when the course name is clicked.

        ReusableMethods.wait(5);
        qualityDemyPage_User.homePage.click();
        actions.moveToElement(qualityDemyPage_User.heartButton).perform();
        qualityDemyPage_User.goToWistListButton.click();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.wait(2);
        qualityDemyPage_User.reactAndTypescriptText.click();

        ReusableMethods.wait(2);

        String expectedNumberVerify="12 Lessons";
        String actualNumberVerify=qualityDemyPage_User.numberCourse.getText();
        Assert.assertTrue(actualNumberVerify.contains(expectedNumberVerify));

        ReusableMethods.wait(2);

        String expectedLessonDuration= "                    38:45:16 Hours On demand videos                  ";
        String actualLessonDuration=qualityDemyPage_User.durationCourse.getText();
        softAssert.assertTrue(actualLessonDuration.contains(expectedLessonDuration));

    }
    @AfterClass
    public void tearDown(){

       Driver.closeDriver();
    }
}

