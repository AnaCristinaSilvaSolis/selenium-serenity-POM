package pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;

@Getter
@Setter
public class LoginPage {
    By TXTUSERNAME = By.id("user-name");
    By TXTPASSWORD = By.id("password");
    By BTNLOGIN = By.id("login-button");
}
