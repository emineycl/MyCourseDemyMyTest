package tests;

import org.testng.annotations.Test;
import pages.InstructorFor_Student;
import utilities.ConfigReader;
import utilities.Driver;

public class Us_12 {

     /*
    US_012 Course compare page functions should work correctly

    -Courses should be searchable from dropboxes
    -When the learn more link is clicked, it should redirect to the page of the relevant course
    -When the buy now button is clicked, it should redirect to the shopping_cart page
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

        // US_012 Course compare page functions should work correctly


    }


}
