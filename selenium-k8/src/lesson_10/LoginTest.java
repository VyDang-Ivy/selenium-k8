package lesson_10;

public class LoginTest {

    public static void main(String[] args) {
        LoginPage internalLoginpage = new InternalLoginPage();
        LoginPage externalLoginPage = new ExternalLoginPage();

        LoginTest loginTest = new LoginTest();
        loginTest.testLoginPage(internalLoginpage);
        loginTest.testLoginPage(externalLoginPage);
    }

    public void testLoginPage(LoginPage loginPage){
        loginPage.login();
        loginPage.verifyLoginSuccess();


    }
}
