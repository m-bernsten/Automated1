import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.edge.EdgeDriver;

public class DemoEdge {
    public static void main(String[] args) throws InterruptedException{

        System.out.println("EdgeDriver execution on Windows!!");
        System.setProperty("webdriver.edge.driver", "E:\\EdgeDriver\\85\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demoqa.com");
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Execution complete on Windows");

    }
}