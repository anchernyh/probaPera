
    import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


    public class NewTest {

        static WebDriver driver;

        @BeforeEach
        public  void setup() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.youtube.com/");
        }

        @Test
        public void test() {
            Assertions.assertTrue(driver.findElement(By.xpath("//*[@id='search-icon-legacy']/yt-icon")).isEnabled());
        }

        @AfterEach
        public  void disable() {
            driver.quit();
        }
    }

