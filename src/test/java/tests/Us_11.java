package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
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


    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        instructorFor_student.acceptButton.click();
        instructorFor_student.loginLink.click();
        instructorFor_student.emailBox.sendKeys(ConfigReader.getProperty("myStudentEmail1"));
        instructorFor_student.passwordBox.sendKeys(ConfigReader.getProperty("myStudentPassword1"));
        instructorFor_student.loginButton.click();

        // US_011 my_wishlist page functions should work correctly

        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(instructorFor_student.categories).perform();
        actions.moveToElement(instructorFor_student.categoriWebDesing).perform();
        actions.moveToElement(instructorFor_student.webDevelopers).click().perform();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.wait(3);
        instructorFor_student.reactAndTypescriptCourse.click();
        instructorFor_student.addWishButton.click();
        ReusableMethods.wait(2);

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

        actions.moveToElement(instructorFor_student.categories).perform();
        actions.moveToElement(instructorFor_student.categoriEnglish).perform();
        actions.moveToElement(instructorFor_student.englishSpeaking).click().perform();
        instructorFor_student.englishSpeakinCourse.click();
        instructorFor_student.addWishButton.click();

        instructorFor_student.homePage.click();

        actions.moveToElement(instructorFor_student.heartButton).perform();
        instructorFor_student.wistListButton.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.wait(3);
        //   -When the compare link is clicked, it should redirect to the Course compare page
        instructorFor_student.compareLink.click();
        Assert.assertTrue(instructorFor_student.courseCompare.isEnabled());
        ReusableMethods.wait(3);
       //  -Course should be able to get selected from the search box
        Driver.getDriver().navigate().back();
        instructorFor_student.searchMyWishlist.sendKeys("React and Typescript" + Keys.ENTER);
        ReusableMethods.wait(3);

        //  -When the course name is clicked, it should redirect to the page of the relevant course.
        instructorFor_student.nameCourse.click();
        ReusableMethods.wait(3);
        // -When the instructor icon is clicked, it should redirect to the relevant instructor page.
        instructorFor_student.instrocturIcon.click();
        ReusableMethods.wait(3);
        // -The course should be able to verify the number
        // and duration of the course on the relevant page when the course name is clicked.
        Driver.getDriver().navigate().back();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.wait(3);
        Assert.assertTrue(instructorFor_student.durationCourse.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(instructorFor_student.numberCourse.isDisplayed());

    }


}
