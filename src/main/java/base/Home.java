package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Home {
    public static WebDriver driver = null;

    @BeforeMethod
    public void run() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunzida\\IdeaProjects\\PageObjModelDec13\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();


    }

    @AfterMethod
    public void cleanup() {

        driver.close();

    }

    @Test
    public void dropdown() throws InterruptedException {

        WebElement drop = driver.findElement(By.id("searchDropdownBox"));

        Select sel = new Select(drop);

        sel.selectByVisibleText("Electronics");
        Thread.sleep(5000);

    }


    @Test
    public void searchBox() {


        WebElement textbook = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement textbook1 = driver.findElement(By.xpath("twotabsearchtextbox"));
        textbook.sendKeys("Iphone");



    }
@Test
    public void searchClick(){

        WebElement searchclick = driver.findElement(By.xpath("//input[@class='nav-input' and @type='submit']"));
        searchclick.click();


    }

}