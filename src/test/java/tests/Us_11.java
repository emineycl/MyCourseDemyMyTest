package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.InstructorFor_Student;
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

    InstructorFor_Student instructorFor_student=new InstructorFor_Student();
    Actions actions=new Actions(Driver.getDriver());
    SoftAssert softAssert=new SoftAssert();
   @BeforeClass
   public void setUp(){
       Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
       instructorFor_student.acceptButton.click();
       instructorFor_student.loginLink.click();
       instructorFor_student.emailBox.sendKeys(ConfigReader.getProperty("myStudentEmail1"));
       instructorFor_student.passwordBox.sendKeys(ConfigReader.getProperty("myStudentPassword1"));
       instructorFor_student.loginButton.click();
   }

    @Test
    public void wishListCompareTest(){

        //-When the compare link is clicked, it should redirect to the Course compare page
        ReusableMethods.wait(5);
        actions.moveToElement(instructorFor_student.heartButton).perform();
        instructorFor_student.goToWistListButton.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.wait(3);
        instructorFor_student.myWishListCompare1.click();

        String expectedCourseCompare="                Course compare            ";
        String actualCourseCompare=instructorFor_student.courseCompare.getText();
        Assert.assertTrue(expectedCourseCompare.contains(actualCourseCompare));
    }
    @Test
    public void wishlistSearcBoxTesti(){

        //  -Course should be able to get selected from the search box

        ReusableMethods.wait(5);
        actions.moveToElement(instructorFor_student.heartButton).perform();
        instructorFor_student.goToWistListButton.click();

        instructorFor_student.searchMyWishlist.sendKeys("React and Typescript" + Keys.ENTER);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        String expectedCourseName= "React and Typescript";
        String actualCourseName=instructorFor_student.reactAndTypescriptText.getText();
        softAssert.assertTrue(actualCourseName.contains(expectedCourseName));
        ReusableMethods.wait(3); }

    @Test
    public void courseNameTest(){

        //  -When the course name is clicked, it should redirect to the page of the relevant course.

        ReusableMethods.wait(5);
        actions.moveToElement(instructorFor_student.heartButton).perform();
        instructorFor_student.goToWistListButton.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        instructorFor_student.reactAndTypescriptText.click();
        String expectedCourseName= "React and Typescript";
        String actualCourseName=instructorFor_student.reactAndTypescriptText.getText();
        Assert.assertTrue(actualCourseName.contains(expectedCourseName));

    }
    @Test
    public void instructorPageTest(){

       // -When the instructor icon is clicked, it should redirect to the relevant instructor page.

        ReusableMethods.wait(5);
        instructorFor_student.homePage.click();
        actions.moveToElement(instructorFor_student.heartButton).perform();
        instructorFor_student.goToWistListButton.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        instructorFor_student.reactAndTypescriptText.click();
        instructorFor_student.ReactandTypescriptinstrocturIcon.click();

        String expectedUrl="https://qualitydemy.com/home/instructor_page/1";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl);
    }
    @Test
    public void courseNumberDurationTest(){

        // -The course should be able to verify the number
        // and duration of the course on the relevant page when the course name is clicked.

        ReusableMethods.wait(5);
        instructorFor_student.homePage.click();
        actions.moveToElement(instructorFor_student.heartButton).perform();
        instructorFor_student.goToWistListButton.click();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();

        instructorFor_student.reactAndTypescriptText.click();

        ReusableMethods.wait(2);

        String expectedNumberVerify="12 Lessons";
        String actualNumberVerify=instructorFor_student.numberCourse.getText();
        softAssert.assertTrue(actualNumberVerify.contains(expectedNumberVerify));

        ReusableMethods.wait(2);

        String expectedLessonDuration= "                    38:45:16 Hours On demand videos                  ";
        String actualLessonDuration=instructorFor_student.durationCourse.getText();
        softAssert.assertTrue(actualLessonDuration.contains(expectedLessonDuration));

    }
    @AfterClass
    public void tearDown(){
        actions.moveToElement(instructorFor_student.userTestButton).perform();
        actions.moveToElement(instructorFor_student.loggOutButton).click().perform();
       Driver.closeDriver();
    }
}

