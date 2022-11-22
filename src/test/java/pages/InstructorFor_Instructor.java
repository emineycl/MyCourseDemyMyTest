package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstructorFor_Instructor {

    public InstructorFor_Instructor(){
        PageFactory.initElements(Driver.getDriver(),this);}
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
    //Home Page > Categories
    @FindBy (xpath = "//i[@class='fas fa-bars text-16px']")
    public WebElement categories;
    //Home Page > Categories > Web Design Course
    @FindBy (xpath = "(//a[@class='py-2 text-wrap d-flex'])[1]")
    public WebElement categoriWebDesing;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    @FindBy (xpath = "//*[text()='Web Design for Web Developers']")
    public WebElement webDevelopers;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers > Wordpress
    @FindBy(xpath = "//img[@src='https://qualitydemy.com/uploads/thumbnails/course_thumbnails/optimized/course_thumbnail_default_31666766582.jpg']")
    public WebElement wordpresslink;
    //Home Page > Categories > Web Design Course > Wordpress > Buy now
    @FindBy (xpath = "//*[text()='Buy now']")
    public WebElement wordpressBuyNow;
    //Home Page > Shopping
    @FindBy(xpath = "(//a[@href='https://qualitydemy.com/home/shopping_cart'])[1]")
    public WebElement shoppingButton;
    //Home Page > Shopping > checkout
    @FindBy (xpath = "//button[@class='btn red w-100 radius-10 mb-3']")
    public WebElement checkoutButton;
    //Home Page > Shopping >  'Wordpress' course > checkout > stripe
    @FindBy (xpath = "//img[@class='payment-gateway-icon']")
    public WebElement stripeButoon;
    //Home Page > Shopping >  'Wordpress' course > checkout > stripe > payWithStripe
    @FindBy (xpath = "//button[@class='stripe-button payment-button float-end']")
    public WebElement payWithStripe;
    //Home Page > Shopping >  'Wordpress' course > checkout > close button
    @FindBy (xpath = "//i[@class='fa fa-times']")
    public WebElement closeButton;
    //Home Page > Shopping Card Page
    @FindBy (xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement shoppingCardPage;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy (xpath = "(//input[@class='CheckoutInput Input Input--empty'])[1]")
    public WebElement checkoutEmail;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy (xpath = "//input[@autocomplete='cc-number']")
    public WebElement cardNummer;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy (xpath = "//input[@autocomplete='cc-exp']")
    public WebElement expDatum;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy(xpath = "//input[@autocomplete='cc-csc']")
    public WebElement cardCVC;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy (xpath = "//input[@autocomplete='ccname']")
    public WebElement nameOnCard;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy (xpath = "//select[@autocomplete='billing country']")
    public WebElement countryName;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy (xpath = "//*[text()='Sweden']")
    public WebElement countrySweden;

}
