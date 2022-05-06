
//"My restored version"
//import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

    public class TestPlan {
        private static final WebDriver driver = new EdgeDriver();

        @BeforeSuite
        public static void main(String[] args) {
            // ChromeDrive/EdgeDriverr location set up in Utils class

            System.setProperty("webdriver.edge.driver", Utils.CHROME_DRIVER_LOCATION );
           // WebDriver driver = new EdgeDriver();
        }

        @Test(testName = "Submit a WebForm")
        public static void submitForm(){
            driver.get(Utils.BASE_URL);
            WebForm webForm = new WebForm(driver);
            webForm.enterFirstName();
            webForm.enterLastName();
            webForm.pressSubmitButton();
        }

        @AfterSuite
        public static void cleanUp(){
            driver.manage().deleteAllCookies();
            driver.close();
        }
    }
