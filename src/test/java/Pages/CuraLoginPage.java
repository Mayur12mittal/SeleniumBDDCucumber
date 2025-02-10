package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CuraLoginPage {

    WebDriver driver = null;

    public CuraLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "btn-make-appointment")
    public WebElement makeAppointmentBtn;

    @FindBy(id = "txt-username")
    public WebElement usernameInputField;

    @FindBy(id = "txt-password")
    public WebElement passwordInputField;

    @FindBy(id = "btn-login")
    public WebElement loginBtn;

    @FindBy(id = "btn-book-appointment")
    public WebElement bookAppointmentBtn;

    //Method Implementations

    public void clickOnMakeAppointmentBtn(){
        makeAppointmentBtn.click();
    }

    public void enterUsername(String username){
        usernameInputField.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordInputField.sendKeys(password);
    }

    public void clickOnLoginBtn(){
        loginBtn.click();
    }

    public void checkBookAppointmentBtn(){
        if(bookAppointmentBtn.isDisplayed()){
            System.out.println("Login Successful");
        }else {
            System.out.println("Login FAILED !!!");
        }
    }

}
