package pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;

@Getter
@Setter
public class LoginPage {
    By txtUserName = By.id("user-name");
    By txtUserPassword = By.id("password");
    By btnLogin = By.id("login-button");
}
