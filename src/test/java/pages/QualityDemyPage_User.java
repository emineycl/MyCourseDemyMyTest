package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityDemyPage_User {

    public QualityDemyPage_User(){PageFactory.initElements(Driver.getDriver(),this);}
    // Home page > Log in
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLink;
    //Home Page > Log in > Email box
    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailBox;
    //Home Page > Log in > Login
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;
    //Home Page > cookies "Accept"
    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement acceptCookies;
    //Home Page > Log in > Password box
    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordBox;
    //Home Page
    @FindBy (xpath = "//img[@src='https://qualitydemy.com/uploads/system/393645bf994114c23be28028a47a77a0.png']")
    public WebElement homePage;
    //Home Page >> Heart
   @FindBy (xpath = "(//i[@class='far fa-heart'])[1]")
    public WebElement heartButton;
    //Home Page >> Heart >> Go to WishList
    @FindBy (xpath = "//*[text()='Go to wishlist']")
    public WebElement goToWistListButton;
    //Home Page >> Heart >> Go to WishList >> Course 'React and Typescript' compare link
    @FindBy (xpath = "(//button[@class='btn-compare-sm float-end'])")
    public WebElement myWishListCompare1;
    //Home Page >> Heart >> Go to WishList >> Course compare page
    @FindBy (xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement courseComparePage;
    //Home Page > Heart > Go to MywishList > SearchBox
    @FindBy (xpath = "//input[@placeholder='Search my wishlist']")
    public WebElement searchMyWishlist;
    //Home Page > Heart > Go to MywishList > React and Typescript
    @FindBy (xpath = "(//*[text()='React and Typescript'])[2]")
    public WebElement reactAndTypescriptText;
    //Home Page > User Test
    @FindBy (xpath = "(//img[@src='https://qualitydemy.com/uploads/user_image/placeholder.png'])[1]")
    public WebElement userTestButton;
    //Home Page > Heart > Go to MywishList > React and Typescript > Admin User
    @FindBy (xpath = "//a[@class='text-14px fw-600 text-decoration-none']")
    public WebElement ReactandTypescriptinstrocturIcon;
    //Home Page > Heart > Go to MywishList > React and Typescriptins >  38:45:16 Hours On demand videos
    @FindBy (xpath = "//i[@class='far fa-file-video']")
    public WebElement durationCourse;
    //Home Page > Heart > Go to MywishList > React and Typescriptins > 12 Lessons
    @FindBy (xpath = "//*[text()='12 Lessons']")
    public WebElement numberCourse;
    //Home Page > User Test >> Logg out
    @FindBy (xpath = "//*[text()=' Log out']")
    public WebElement loggOutButton;
    // ---------------------------------------- US_12 --------------------------------------
    //Home Page > Categories
    @FindBy (xpath = "//i[@class='fas fa-bars text-16px']")
    public WebElement categories;
    //Home Page > Categories > Web Design Course
    @FindBy (xpath = "(//a[@class='py-2 text-wrap d-flex'])[1]")
    public WebElement categoriWebDesing;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    @FindBy (xpath = "//*[text()='Web Design for Web Developers']")
    public WebElement webDevelopers;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers > React and Typescriptins compare link
    @FindBy (xpath = "(//button[@class='btn-compare-sm'])[2]")
    public WebElement courseCompareReactandTypescriptinsButton;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    // > React and Typescriptins compare link > Choose a course to compare 1
    @FindBy(xpath = "(//select[@class='form-select compare-select-box'])[2]")
    public WebElement courseComparePageChooseButton1;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    // > React and Typescriptins compare link > Choose a course to compare 1 > Web design for PHP
    @FindBy(xpath = "(//option[@value='web-design-for-php_1'])[2]")
    public WebElement courseComparePageChooseButtonWebDesignforWebPHP;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    // > React and Typescriptins compare link > Choose a course to compare 2
    @FindBy (xpath = "(//select[@class='form-select compare-select-box'])[3]")
    public WebElement courseComparePageChooseButton2;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    // > React and Typescriptins compare link > Choose a course to compare 2 > Ultimate AWS Certified Solutions Architect Associate SAA-C03
    @FindBy (xpath = "(//option[@value='ultimate-aws-certified-solutions-architect-associate-saa-c03_7'])[3]")
    public WebElement courseComparePageChooseButton2SAA;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    // > React and Typescriptins compare link > learn more link
    @FindBy (xpath = "//*[text()='Learn more ']")
    public WebElement reactandTypescriptinsLearnMoreLink;
    //------------------------US_14--------------------------------------------------------------
    //Home Page > Categories > Web Design Course > Wordpress
    @FindBy (xpath = "    //img[@src='https://qualitydemy.com/uploads/thumbnails/course_thumbnails/optimized/course_thumbnail_default_31666766582.jpg']\n")
    public WebElement wordpressButton;
    //Home Page > Categories > Web Design Course > Wordpress > Buy now
    @FindBy (xpath = "//*[text()='Buy now']")
    public WebElement wordpressBuyNow;
    //Home Page > Categories > Web Design Course > Wordpress > Buy now > Shopping Buy text
    @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement shoppingBuyPage;
    // Home Page > Test User > Purchase history
    @FindBy (xpath = "//*[text()='Purchase history']")
    public WebElement purchaseHistoryButton;
    //Home Page > Test User > Purchase history > Invoice Button
    @FindBy (xpath = "//*[text()='Invoice']")
    public  WebElement invoiceButton;
    //Home Page > Test User > Purchase history > Invoice Button > 'INVOICE' text
    @FindBy (xpath = "//h1[@class='page-title py-5 text-white print-hidden']")
    public WebElement invoiceText;
    //Home Page > Test User > Purchase history >  Disney Magic English
    @FindBy (xpath = "//a[@class='purchase-history-course-title']")
    public WebElement   disneyMagicEnglish;
    //Home Page > Test User > Purchase history >  Disney Magic English > Disney Magic English page
    @FindBy (xpath = "//div[@class='course-header-wrap']")
    public WebElement disneyMagicEnglishPage;




}
