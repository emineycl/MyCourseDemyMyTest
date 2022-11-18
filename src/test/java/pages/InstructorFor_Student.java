package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstructorFor_Student {

    public InstructorFor_Student(){PageFactory.initElements(Driver.getDriver(),this);}
    // cookies "Accept"
    @FindBy (xpath = "//*[text()='Accept']")
    public WebElement acceptButton;

    // Home page > Login
    @FindBy (xpath="//a[text()='Log in']")
    public WebElement loginLink;

    //Home Page > Log in > Email box
    @FindBy (xpath = "//input[@id='login-email']")
    public WebElement emailBox;

    //Home Page > Log in > Password box
    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordBox;

    //Home Page > Log in > Login
    @FindBy (xpath = "//button[@class='btn red radius-5 mt-4 w-100']")
    public WebElement loginButton;

    //Home Page > Categories
    @FindBy (xpath = "//i[@class='fas fa-bars text-16px']")
   public WebElement categories;

    //Home Page > Categories > IT & Software
    @FindBy (xpath = "//*[text()='IT & Software']")
    public WebElement itSoftware;

    //Home Page > Categories > IT & Software
    @FindBy (xpath = "//*[text()='AWS Certification']")
    public  WebElement AWSCertification;

    //Home Page > Categories > IT & Software > 'Ultimate AWS Certified Solutions Architect Associate SAA-C03'
    @FindBy (xpath = "//img[@src='https://qualitydemy.com/uploads/thumbnails/course_thumbnails/optimized/course_thumbnail_default_14.jpg']")
    public WebElement  AssociateSAAC03;

    //Home Page > Categories > Web Design Course
    @FindBy (xpath = "(//a[@class='py-2 text-wrap d-flex'])[1]")
    public WebElement categoriWebDesing;

    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    @FindBy (xpath = "//*[text()='Web Design for Web Developers']")
    public WebElement webDevelopers;

    //Home Page > Categories > Web Design Course > Web Design for Web Developers > React and Typescript
    @FindBy (xpath = "//img[@src='https://qualitydemy.com/uploads/thumbnails/course_thumbnails/optimized/course_thumbnail_default_21667056963.jpg']")  //(//*[text()='React and Typescript'])[2]
    public WebElement reactAndTypescriptCourse;

    //Home Page > Categories > English Course
    @FindBy (xpath = "//*[text()='English Course']")
    public WebElement categoriEnglish;

    @FindBy (xpath = "//button[@class='btn btn-add-wishlist ']")  //button[@id='2']
    public WebElement addWishButton;


    //Home Page >> Heart
   @FindBy (xpath = "(//i[@class='far fa-heart'])[1]")
    public WebElement heartButton;

    //Home Page >> Heart >> Go to WishList
    @FindBy (xpath = "//*[text()='Go to wishlist']")
    public WebElement goToWistListButton;

    //Home Page >> Heart >> Go to WishList >> Course 'React and Typescript' compare link
    @FindBy (xpath = "(//button[@class='btn-compare-sm float-end'])")
    public WebElement myWishListCompare1;


    @FindBy (xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement courseCompare;



    @FindBy (xpath = "(//*[text()='React and Typescript'])[2]")
    public WebElement nameCourse;

    @FindBy (xpath = "//input[@placeholder='Search my wishlist']")
    public WebElement searchMyWishlist;

    //Home Page >> Heart >> Go to MywishList >> SearchBox
    @FindBy (xpath = "(//*[text()='React and Typescript'])[2]")
    public WebElement reactAndTypescriptText;

    //Home Page >> User Test
    @FindBy (xpath = "(//img[@src='https://qualitydemy.com/uploads/user_image/placeholder.png'])[1]")
    public WebElement userTestButton;

    //Home Page >> User Test >> Logg out
    @FindBy (xpath = "//*[text()=' Log out']")
    public WebElement loggOutButton;

    @FindBy (xpath = "//a[@class='text-14px fw-600 text-decoration-none']")
    public WebElement ReactandTypescriptinstrocturIcon;

    @FindBy (xpath = "(//*[text()='Admin User'])[3]")
    public WebElement ReactandTypescriptinstrocturIconName;

    @FindBy (xpath = "//img[@src='https://qualitydemy.com/uploads/system/393645bf994114c23be28028a47a77a0.png']")
    public WebElement homePage;

    @FindBy (xpath = "//i[@class='far fa-file-video']")
    public WebElement durationCourse;

    @FindBy (xpath = "//*[text()='12 Lessons']") //i[@class='far fa-file-file']
    public WebElement numberCourse;




}
