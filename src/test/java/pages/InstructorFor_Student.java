package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstructorFor_Student {

    public InstructorFor_Student(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "//*[text()='Accept']")
    public WebElement acceptButton;

    @FindBy (xpath="//a[text()='Log in']")
    public WebElement loginLink;

    @FindBy (xpath = "//input[@id='login-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordBox;

    @FindBy (xpath = "//button[@class='btn red radius-5 mt-4 w-100']")
    public WebElement loginButton;

    @FindBy (xpath = "//i[@class='fas fa-bars text-16px']")
   public WebElement categories;

    @FindBy (xpath = "(//a[@class='py-2 text-wrap d-flex'])[1]")
    public WebElement categoriWebDesing;

    @FindBy (xpath = "//*[text()='Web Design for Web Developers']")
    public WebElement webDevelopers;

    @FindBy (xpath = "(//a[@href='https://mycoursedemy.com/home/course/react-and-typescript/2'])[1]") //*[text()='React and Typescript']
    public WebElement reactAndTypescriptCourse;

    @FindBy (xpath = "//img[@src='https://mycoursedemy.com/uploads/thumbnails/course_thumbnails/optimized/course_thumbnail_default_11666767872.jpg']")
    public WebElement webDevelopersCourse;

    @FindBy (xpath = "//*[text()='English Course']")
    public WebElement categoriEnglish;

    @FindBy(xpath = "//*[text()='English Speaking Course']")
    public WebElement englishSpeaking;

    @FindBy(xpath = "//img[@src='https://mycoursedemy.com/uploads/thumbnails/course_thumbnails/optimized/course_thumbnail_default_41666766506.jpg']")
    public WebElement englishSpeakinCourse;

    @FindBy (xpath = "//button[@class='btn btn-add-wishlist ']")  //button[@id='2']
    public WebElement addWishButton;

    @FindBy (xpath = "//img[@src='https://mycoursedemy.com/uploads/system/fd79007ee013b28e2fb902d4ae4575ff.png']")
    public WebElement homePage;


   @FindBy (xpath = "(//i[@class='far fa-heart'])[1]")
    public WebElement heartButton;

    @FindBy (xpath = "//*[text()='Go to wishlist']")
    public WebElement wistListButton;

    @FindBy (xpath = "(//button[@class='btn-compare-sm float-end'])[1]") //button[@class='btn-compare-sm float-end']
    public  WebElement compareLink;

    @FindBy (xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement courseCompare;

    @FindBy (xpath = "(//*[text()='React and Typescript'])[2]")
    public WebElement nameCourse;

    @FindBy (xpath = "//input[@placeholder='Search my wishlist']")
    public WebElement searchMyWishlist;

    @FindBy (xpath = "(//a[@href='https://mycoursedemy.com/home/instructor_page/1'])[1]")
    public WebElement instrocturIcon;

    @FindBy (xpath = "//i[@class='far fa-file-video']")
    public WebElement durationCourse;

    @FindBy (xpath = "//*[text()='12 Lessons']") //i[@class='far fa-file-file']
    public WebElement numberCourse;




}
