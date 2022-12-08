package questions;
import pageObject.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ClickDropdown {
    private WebDriver driver;

    @Before
    public void setUp() {
//      выбираем браузер
        driver = new ChromeDriver();
//      driver = new FirefoxDriver(); //для проверки браузера Firefox
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test //проверка 1 элемента
    public void testQuestion1(){
        HomePage mainPage = new HomePage(driver);
        mainPage.open();
        mainPage.clickCookie();
        mainPage.scrollHowMuch();
        mainPage.clickHowMuch();
        mainPage.isAnswerHowMuch();
    }
    @Test //проверка 2 элемента
    public void testQuestion2(){
        HomePage mainPage = new HomePage(driver);
        mainPage.open();
        mainPage.clickCookie();
        mainPage.scrollHowMuch();
        mainPage.clickWantSeveralScooters();
        mainPage.isAnswerSeveralScooters();
    }
    @Test //проверка 3 элемента
    public void testQuestion3(){
        HomePage mainPage = new HomePage(driver);
        mainPage.open();
        mainPage.clickCookie();
        mainPage.scrollHowMuch();
        mainPage.clickHowRentalTimeCalculated();
        mainPage.isAnswerHowRentalTimeCalculated();
    }
    @Test //проверка 4 элемента
    public void testQuestion4(){
        HomePage mainPage = new HomePage(driver);
        mainPage.open();
        mainPage.clickCookie();
        mainPage.scrollHowMuch();
        mainPage.clickTodayOrder();
        mainPage.isAnswerTodayOrder();
    }
    @Test //проверка 5 элемента
    public void testQuestion5(){
        HomePage mainPage = new HomePage(driver);
        mainPage.open();
        mainPage.clickCookie();
        mainPage.scrollHowMuch();
        mainPage.clickExtendOrder();
        mainPage.isAnswerExtendOrder();
    }
    @Test //проверка 6 элемента
    public void testQuestion6(){
        HomePage mainPage = new HomePage(driver);
        mainPage.open();
        mainPage.clickCookie();
        mainPage.scrollHowMuch();
        mainPage.clickCharging();
        mainPage.isAnswerCharging();
    }
    @Test //проверка 7 элемента
    public void testQuestion7(){
        HomePage mainPage = new HomePage(driver);
        mainPage.open();
        mainPage.clickCookie();
        mainPage.scrollHowMuch();
        mainPage.clickCanOrderCancellation();
        mainPage.isAnswerCanOrderCancellation();
    }
    @Test //проверка 8 элемента
    public void testQuestion8(){
        HomePage mainPage = new HomePage(driver);
        mainPage.open();
        mainPage.clickCookie();
        mainPage.scrollHowMuch();
        mainPage.clickLiveOutsideMoscow();
        mainPage.isAnswerLiveOutsideMoscow();
    }
    @After
    public void teardown() {
        driver.quit(); //Закрываем браузер
    }

}
