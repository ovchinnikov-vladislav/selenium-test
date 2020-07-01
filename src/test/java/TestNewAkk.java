import org.apache.commons.io.FileUtils;
import org.junit.*;

import static java.lang.Thread.sleep;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class TestNewAkk {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp1() throws Exception {

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver(ops);
        driver.manage().timeouts().implicitlyWait(210, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(210, SECONDS);
        driver.manage().timeouts().setScriptTimeout(210, SECONDS);
        driver.manage().window().maximize();
        baseUrl = "https://moscow.netprint.ru/";


    }

    @Test
    public void testZakaz() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        try {
            driver.get("https://moscow.netprint.ru");
            SECONDS.sleep(2);
            driver.navigate().refresh();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")));
            WebElement element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]"));
            element.click();

            driver.findElement(By.id("auth_login_field")).clear();
            driver.findElement(By.id("auth_login_field")).sendKeys("autobot1@netprint.ru");
            driver.findElement(By.id("pass_field")).clear();
            driver.findElement(By.id("pass_field")).sendKeys("qwe");
            driver.findElement(By.id("auth_login_field")).click();
            SECONDS.sleep(2);
            driver.findElement(By.id("login_button")).click();


            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")));
            WebElement element001 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]"));
            element001.click();
            SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[1]/preceding::img[2]")));
            WebElement element1 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[1]/preceding::img[2]"));
            element1.click();


            SECONDS.sleep(5);
            driver.navigate().refresh();
            SECONDS.sleep(5);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login_name")));
            WebElement element2 = driver.findElement(By.id("login_name"));
            element2.click();
            SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[2]/a/div/i")));
            WebElement element3 = driver.findElement(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[2]/a/div/i"));
            element3.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои Альбомы'])[2]/following::button[1]")));
            WebElement element4 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои Альбомы'])[2]/following::button[1]"));
            element4.click();
            SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("album_name")));
            WebElement element01 = driver.findElement(By.id("album_name"));
            element01.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("album_name")));
            WebElement element02 = driver.findElement(By.id("album_name"));
            element02.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("album_name")));
            WebElement element03 = driver.findElement(By.id("album_name"));
            element03.sendKeys("название");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::label[1]")));
            WebElement element04 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::label[1]"));
            element04.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[3]/following::div[3]")));
            WebElement element05 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[3]/following::div[3]"));
            element05.click();

            SECONDS.sleep(2);
            driver.findElement(By.id("upload_files_button")).sendKeys("C:/Users/photo1/SeleniumTests/photo/мои альбомы/5-1.jpg");
            SECONDS.sleep(2);
            driver.findElement(By.id("upload_files_button")).sendKeys("C:/Users/photo1/SeleniumTests/photo/мои альбомы/1300373376_378f498f90.jpg");
            SECONDS.sleep(2);
            driver.findElement(By.id("upload_files_button")).sendKeys("C:/Users/photo1/SeleniumTests/photo/мои альбомы/1354447917-0264735-www.nevsepic.com.ua.jpg");
            SECONDS.sleep(2);
            driver.findElement(By.id("upload_files_button")).sendKeys("C:/Users/photo1/SeleniumTests/photo/мои альбомы/1477469507_autumn-panorama.jpg");
            SECONDS.sleep(2);
            driver.findElement(By.id("upload_files_button")).sendKeys("C:/Users/photo1/SeleniumTests/photo/мои альбомы/thumb-8ipwnn.jpg");
            SECONDS.sleep(2);
            driver.findElement(By.id("upload_files_button")).sendKeys("C:/Users/photo1/SeleniumTests/photo/мои альбомы/Фото-природы_1.jpg");
            SECONDS.sleep(5);
            driver.navigate().refresh();
            SECONDS.sleep(5);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::label[1]")));
            WebElement element5 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::label[1]"));
            element5.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Скрыть пропорции'])[1]/following::span[1]")));
            WebElement element6 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Скрыть пропорции'])[1]/following::span[1]"));
            element6.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[2]/following::div[3]")));
            WebElement element7 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[2]/following::div[3]"));
            element7.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='По формату'])[1]/following::div[3]")));
            WebElement element8 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='По формату'])[1]/following::div[3]"));
            element8.click();

            driver.get("https://telegram.vteme.ru/channel.html?text=AUTOTEST:+Загрузка+фото+ОК&chat_id=-1001244278517&bot_id=bot853245415:AAGCzEpjD7Xdv5Yp8mlo1tBx8Jorxp1daaA");
            TimeUnit.SECONDS.sleep(3);
            driver.get("https://moscow.netprint.ru");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login_name")));
            WebElement element06 = driver.findElement(By.id("login_name"));
            element06.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои альбомы'])[3]/following::a[1]")));
            WebElement element07 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои альбомы'])[3]/following::a[1]"));
            element07.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке 20х20'])[1]/following::a[1]")));
            WebElement element08 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке 20х20'])[1]/following::a[1]"));
            element08.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")));
            WebElement element09 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]"));
            element09.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]")));
            WebElement element10 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]"));
            element10.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]")));
            WebElement element11 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]"));
            element11.click();

            driver.get("https://telegram.vteme.ru/channel.html?text=AUTOTEST:+Оформление+фотокниги+ОК&chat_id=-1001244278517&bot_id=bot853245415:AAGCzEpjD7Xdv5Yp8mlo1tBx8Jorxp1daaA");
            TimeUnit.SECONDS.sleep(3);
            driver.get("https://www.netprint.ru/order/basket");
            SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::button[1]")));
            WebElement element9 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::button[1]"));
            element9.click();


            // ПОПАП с Магнитами

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Купить за 144 руб.'])[24]/following::div[6]")));
            WebElement element99 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Купить за 144 руб.'])[24]/following::div[6]"));
            element99.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element21 = driver.findElement(By.id("select2-select_city-container"));
            element21.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element15 = driver.findElement(By.id("select2-select_city-container"));
            element15.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element16 = driver.findElement(By.id("select2-select_city-container"));
            element16.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")));
            WebElement element17 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]"));
            element17.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")));
            WebElement element18 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]"));
            element18.sendKeys("Москва");

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")).sendKeys(Keys.ENTER);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_metro-container")));
            WebElement element19 = driver.findElement(By.id("select2-select_metro-container"));
            element19.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Авиамоторная'])[2]/preceding::input[1]")));
            WebElement element20 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Авиамоторная'])[2]/preceding::input[1]"));
            element20.click();

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Академическая'])[2]/preceding::input[1]")).sendKeys("Академическая");
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Академическая'])[2]/preceding::input[1]")).sendKeys(Keys.ENTER);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите адрес доставки'])[1]/following::label[1]")));
            WebElement vubor = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите адрес доставки'])[1]/following::label[1]"));
            vubor.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save_delivery")));
            WebElement element100 = driver.findElement(By.id("save_delivery"));
            element100.click();

            WebDriver augmentedDriver = new Augmenter().augment(driver);
            File screenshot = ((TakesScreenshot)augmentedDriver).
                    getScreenshotAs(OutputType.FILE);
            String path = "C:/Users/photo1/Скрины/1.jpg" + screenshot.getName();
            FileUtils.copyFile(screenshot, new File(path));

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("send-order")));
            WebElement element002 = driver.findElement(By.id("send-order"));
            element002.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оплатить'])[1]/following::button[1]")));
            WebElement element003 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оплатить'])[1]/following::button[1]"));
            element003.click();

            //Часть кода отвечает за оплату наличными
            //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='При оплате картой скидка на доставку от 20 до 260 руб. Доставка от 2500 руб. - БЕСПЛАТНО.'])[1]/following::label[2]")));
            //WebElement element110 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='При оплате картой скидка на доставку от 20 до 260 руб. Доставка от 2500 руб. - БЕСПЛАТНО.'])[1]/following::label[2]"));
            //element110.click();
            //SECONDS.sleep(2);
            //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("send-order")));
            //WebElement element120 = driver.findElement(By.id("send-order"));
            //element120.click();

            SECONDS.sleep(5);
            driver.navigate().refresh();
            SECONDS.sleep(5);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заказ не оплачен'])[1]/following::a[2]")));
            WebElement element130 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заказ не оплачен'])[1]/following::a[2]"));
            element130.click();


            driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы уверены, что хотите отменить этот заказ'])[1]/following::div[3]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отправлен запрос на удаление заказа. В ближайшее время ваш заказ будет удален.'])[1]/following::div[3]")).click();
            driver.findElement(By.id("login_name")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сохраненные макеты'])[1]/following::i[1]")).click();

            driver.get("https://telegram.vteme.ru/channel.html?text=AUTOTEST: Отмена+заказа+ОК&chat_id=-1001244278517&bot_id=bot853245415:AAGCzEpjD7Xdv5Yp8mlo1tBx8Jorxp1daaA");
            SECONDS.sleep(3);
            driver.get("https://www.netprint.ru/order/basket");

            driver.findElement(By.id("login_name")).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[2]/a/div/i")));
            WebElement element30 = driver.findElement(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[2]/a/div/i"));
            element30.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='print'])[1]/following::i[1]")));
            WebElement element31 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='print'])[1]/following::i[1]"));
            element31.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='edit'])[1]/following::a[1]")));
            WebElement element32 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='edit'])[1]/following::a[1]"));
            element32.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отмена'])[1]/preceding::div[1]")));
            WebElement element33 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отмена'])[1]/preceding::div[1]"));
            element33.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[5]")));
            WebElement element34 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[5]"));
            element34.click();

            WebDriver augmentedDriver1 = new Augmenter().augment(driver);
            File screenshot1 = ((TakesScreenshot)augmentedDriver1).
                    getScreenshotAs(OutputType.FILE);
            String path1 = "C:/Users/photo1/Скрины/1.jpg" + screenshot1.getName();
            FileUtils.copyFile(screenshot, new File(path1));

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[11]/a/div/i")));
            WebElement element35 = driver.findElement(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[11]/a/div/i"));
            element35.click();
            SECONDS.sleep(2);
            driver.get("https://telegram.vteme.ru/channel.html?text=AUTOTEST:2/2+Полное+прохождение+заказа&chat_id=-1001244278517&bot_id=bot853245415:AAGCzEpjD7Xdv5Yp8mlo1tBx8Jorxp1daaA");
            SECONDS.sleep(2);
        } finally {

        }
        driver.quit();
    }


//    @Test
    //  public void testZakazPovtor1() throws Exception {
    //    WebDriverWait wait = new WebDriverWait(driver, 60);
    //  try {
    //     driver.get("https://moscow.netprint.ru");
    //     SECONDS.sleep(3);
    // } finally {

//           driver.quit();
    //     }

    // }
    @Test
    public void testZakaz1() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        try {
            driver.get("https://moscow.netprint.ru");
            SECONDS.sleep(3);
            driver.navigate().refresh();
            SECONDS.sleep(3);

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")).click();
            driver.findElement(By.id("auth_login_field")).clear();
            SECONDS.sleep(3);
            driver.findElement(By.id("auth_login_field")).sendKeys("autobot1@netprint.ru");
            driver.findElement(By.id("pass_field")).clear();
            SECONDS.sleep(3);
            driver.findElement(By.id("pass_field")).sendKeys("qwe");
            SECONDS.sleep(3);
            driver.findElement(By.id("auth_login_field")).click();
            driver.findElement(By.id("login_button")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[3]/a/div/i")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке 20х20'])[1]/following::a[1]")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Продолжить покупки'])[1]/following::button[1]")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы действительно хотите удалить все товары из корзины?'])[1]/following::div[3]")).click();
            SECONDS.sleep(3);
        } finally {

            driver.quit();
        }

    }

    @Test
    public void test1() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        try {
            driver.get("https://moscow.netprint.ru");
            SECONDS.sleep(3);
            driver.navigate().refresh();
            SECONDS.sleep(3);
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")).click();
            driver.findElement(By.id("auth_login_field")).clear();
            SECONDS.sleep(3);
            driver.findElement(By.id("auth_login_field")).sendKeys("autobot1@netprint.ru");
            driver.findElement(By.id("pass_field")).clear();
            SECONDS.sleep(3);
            driver.findElement(By.id("pass_field")).sendKeys("qwe");
            driver.findElement(By.id("auth_login_field")).click();
            SECONDS.sleep(3);
            driver.findElement(By.id("login_button")).click();
            driver.findElement(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[3]/a/div/i")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке 20х20'])[1]/following::a[1]")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Продолжить покупки'])[1]/following::button[1]")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы действительно хотите удалить все товары из корзины?'])[1]/following::div[3]")).click();
            SECONDS.sleep(3);
        } finally {

            driver.quit();
        }

    }

    @Test
    public void testProverkaSMS1отмена() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        try {
            driver.get("https://moscow.netprint.ru");
            SECONDS.sleep(3);
            driver.navigate().refresh();
            SECONDS.sleep(3);
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")).click();
            driver.findElement(By.id("auth_login_field")).clear();
            SECONDS.sleep(3);
            driver.findElement(By.id("auth_login_field")).sendKeys("autobot1@netprint.ru");
            driver.findElement(By.id("pass_field")).clear();
            driver.findElement(By.id("pass_field")).sendKeys("qwe");
            SECONDS.sleep(3);
            driver.findElement(By.id("auth_login_field")).click();
            driver.findElement(By.id("login_button")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[3]/a/div/i")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке 20х20'])[1]/following::a[1]")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Продолжить покупки'])[1]/following::button[1]")).click();
            SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы действительно хотите удалить все товары из корзины?'])[1]/following::div[3]")).click();
            SECONDS.sleep(3);
        } finally {

            driver.quit();
        }

    }

    @Test
    public void testProverka_menu() throws Exception {


        WebDriverWait wait = new WebDriverWait(driver, 60);
        try {

            driver.get("https://moscow.netprint.ru");
            SECONDS.sleep(3);
            driver.navigate().refresh();
            SECONDS.sleep(3);

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")).click();
            driver.findElement(By.id("auth_login_field")).clear();
            driver.findElement(By.id("auth_login_field")).sendKeys("autobot1@netprint.ru");
            driver.findElement(By.id("pass_field")).clear();
            driver.findElement(By.id("pass_field")).sendKeys("qwe");
            driver.findElement(By.id("auth_login_field")).click();
            driver.findElement(By.id("login_button")).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='поздравить всех близких'])[1]/following::div[6]")));
            WebElement element1 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='поздравить всех близких'])[1]/following::div[6]"));
            element1.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/nav/ul/li[2]/a")));
            WebElement element2 = driver.findElement(By.xpath("//main[@id='main']/nav/ul/li[2]/a"));
            element2.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои Альбомы'])[1]/following::a[1]")));
            WebElement element3 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мои Альбомы'])[1]/following::a[1]"));
            element3.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Альбомы из соц. сетей'])[1]/following::a[1]")));
            WebElement element4 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Альбомы из соц. сетей'])[1]/following::a[1]"));
            element4.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/nav/ul/li[3]/a")));
            WebElement element5 = driver.findElement(By.xpath("//main[@id='main']/nav/ul/li[3]/a"));
            element5.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/nav/ul/li[4]/a")));
            WebElement element6 = driver.findElement(By.xpath("//main[@id='main']/nav/ul/li[4]/a"));
            element6.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*/text()[normalize-space(.)='Мои финансы']/parent::*")));
            WebElement element7 = driver.findElement(By.xpath("//*/text()[normalize-space(.)='Мои финансы']/parent::*"));
            element7.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/nav/div/a/i")));
            WebElement element8 = driver.findElement(By.xpath("//main[@id='main']/nav/div/a/i"));
            element8.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@id='nav-menu-overflow']/li/a")));
            WebElement element9 = driver.findElement(By.xpath("//ul[@id='nav-menu-overflow']/li/a"));
            element9.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[5]")));
            WebElement element10 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[5]"));
            element10.click();

            //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/nav/div/a/i")));
            //WebElement element10 = driver.findElement(By.xpath("//main[@id='main']/nav/div/a/i"));
            //element10.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[6]/a/div/i")));
            WebElement element11 = driver.findElement(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[6]/a/div/i"));
            element11.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[5]")));
            WebElement element013 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[5]"));
            element013.click();


            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[8]/a/div/i")));
            WebElement element13 = driver.findElement(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[8]/a/div/i"));
            element13.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/nav/div/a/i")));
            WebElement element14 = driver.findElement(By.xpath("//main[@id='main']/nav/div/a/i"));
            element14.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@id='nav-menu-overflow']/li[4]/a")));
            WebElement element15 = driver.findElement(By.xpath("//ul[@id='nav-menu-overflow']/li[4]/a"));
            element15.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/nav/div/a/i")));
            WebElement element16 = driver.findElement(By.xpath("//main[@id='main']/nav/div/a/i"));
            element16.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@id='nav-menu-overflow']/li[5]/a")));
            WebElement element17 = driver.findElement(By.xpath("//ul[@id='nav-menu-overflow']/li[5]/a"));
            element17.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/div/div/div/div/div/a[2]")));
            WebElement element18 = driver.findElement(By.xpath("//main[@id='main']/div/div/div/div/div/a[2]"));
            element18.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/div/div/div/div/div/a[3]")));
            WebElement element19 = driver.findElement(By.xpath("//main[@id='main']/div/div/div/div/div/a[3]"));
            element19.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/div/div/div/div[2]/div/a")));
            WebElement element20 = driver.findElement(By.xpath("//main[@id='main']/div/div/div/div[2]/div/a"));
            element20.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/div/div/div/div/div/a[4]")));
            WebElement element21 = driver.findElement(By.xpath("//main[@id='main']/div/div/div/div/div/a[4]"));
            element21.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/nav/div/a/i")));
            WebElement element22 = driver.findElement(By.xpath("//main[@id='main']/nav/div/a/i"));
            element22.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Настройки сайта'])[1]/preceding::a[1]")));
            WebElement element23 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Настройки сайта'])[1]/preceding::a[1]"));
            element23.click();
            SECONDS.sleep(2);
            driver.get("https://telegram.vteme.ru/channel.html?text=AUTOTEST:3/3+ПроверкаМеню&chat_id=-1001244278517&bot_id=bot853245415:AAGCzEpjD7Xdv5Yp8mlo1tBx8Jorxp1daaA");
            SECONDS.sleep(2);
        } finally {

            driver.quit();
        }

    }

    @Test
    public void testProverkaSMS() throws Exception {
        driver.get("https://telegram.vteme.ru/channel.html?text=AUTOTEST:+STARTED&chat_id=-1001244278517&bot_id=bot853245415:AAGCzEpjD7Xdv5Yp8mlo1tBx8Jorxp1daaA");
        SECONDS.sleep(2);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        try {

            driver.get("https://www.netprint.ru/moscow");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")));
            WebElement element1 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]"));
            element1.click();

            TimeUnit.SECONDS.sleep(3);
            driver.navigate().refresh();
            TimeUnit.SECONDS.sleep(3);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("auth_login_field")));
            WebElement element34 = driver.findElement(By.id("auth_login_field"));
            element34.click();
            driver.findElement(By.id("auth_login_field")).sendKeys("autobot1@netprint.ru");
            driver.findElement(By.id("pass_field")).clear();
            driver.findElement(By.id("pass_field")).sendKeys("qwe");
            driver.findElement(By.id("auth_login_field")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login_button")));
            WebElement element35 = driver.findElement(By.id("login_button"));
            element35.click();
            TimeUnit.SECONDS.sleep(2);
            driver.get("https://www.netprint.ru/order/profile");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[contains(@src,'https://moscow.netprint.ru/assets/np2016/images/logo.jpg')]")));
            WebElement element2 = driver.findElement(By.xpath("//img[contains(@src,'https://moscow.netprint.ru/assets/np2016/images/logo.jpg')]"));
            element2.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::a[1]")));
            WebElement element3 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::a[1]"));
            element3.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[1]/following::span[1]")));
            WebElement element4 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[1]/following::span[1]"));
            element4.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Создать дизайн с netPrint.ru'])[2]/following::a[1]")));
            WebElement element5 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Создать дизайн с netPrint.ru'])[2]/following::a[1]"));
            element5.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Ваш стиль')]")));
            WebElement element666 = driver.findElement(By.xpath("//a[contains(text(),'Ваш стиль')]"));
            element666.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[contains(@src,'https://xcdn.ru/RBalancerWeb/SquidCPG/preview_size=250&itw=1&foe=1&q=type%3D1%26style_id%3D27019&s=46f871c1baa0755fdf8a854ff6a87b2c')]")));
            WebElement element6 = driver.findElement(By.xpath("//img[contains(@src,'https://xcdn.ru/RBalancerWeb/SquidCPG/preview_size=250&itw=1&foe=1&q=type%3D1%26style_id%3D27019&s=46f871c1baa0755fdf8a854ff6a87b2c')]"));
            element6.click();
            TimeUnit.SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='СОЗДАТЬ'])[3]/following::a[1]")));
            WebElement element7 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='СОЗДАТЬ'])[3]/following::a[1]"));
            element7.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")));
            WebElement element8 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]"));
            element8.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[2]/following::a[1]")));
            WebElement element9 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[2]/following::a[1]"));
            element9.click();
            TimeUnit.SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*/text()[normalize-space(.)='66 фото']/parent::*")));
            WebElement element10 = driver.findElement(By.xpath("//*/text()[normalize-space(.)='66 фото']/parent::*"));
            element10.click();
            TimeUnit.SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заполнить пустые'])[11]/following::button[1]")));
            WebElement element11 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заполнить пустые'])[11]/following::button[1]"));
            element11.click();

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::i[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]")));
            WebElement element12 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]"));
            element12.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]")));
            WebElement element13 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]"));
            element13.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::button[1]")));
            WebElement element14 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::button[1]"));
            element14.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Купить за 144 руб.'])[20]/following::div[6]")));
            WebElement element15 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Купить за 144 руб.'])[20]/following::div[6]"));
            element15.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element16 = driver.findElement(By.id("select2-select_city-container"));
            element16.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element17 = driver.findElement(By.id("select2-select_city-container"));
            element17.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element18 = driver.findElement(By.id("select2-select_city-container"));
            element18.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")));
            WebElement element19 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]"));
            element19.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")));
            WebElement element20 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]"));
            element20.sendKeys("Москва");

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")).sendKeys(Keys.ENTER);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_metro-container")));
            WebElement element21 = driver.findElement(By.id("select2-select_metro-container"));
            element21.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Авиамоторная'])[2]/preceding::input[1]")));
            WebElement element22 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Авиамоторная'])[2]/preceding::input[1]"));
            element22.click();

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Академическая'])[2]/preceding::input[1]")).sendKeys("Академическая");
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Академическая'])[2]/preceding::input[1]")).sendKeys(Keys.ENTER);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите адрес доставки'])[1]/following::label[1]")));
            WebElement element23 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите адрес доставки'])[1]/following::label[1]"));
            element23.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Телефон'])[1]/following::label[1]")));
            WebElement element24 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Телефон'])[1]/following::label[1]"));
            element24.click();
            ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
            TimeUnit.SECONDS.sleep(3);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save_delivery")));
            WebElement element25 = driver.findElement(By.id("save_delivery"));
            element25.click();


            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("send-order")));
            WebElement element26 = driver.findElement(By.id("send-order"));
            element26.click();
            TimeUnit.SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оплатить'])[1]/following::button[1]")));
            WebElement element27 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оплатить'])[1]/following::button[1]"));
            element27.click();

            TimeUnit.SECONDS.sleep(3);
            driver.navigate().refresh();
            TimeUnit.SECONDS.sleep(3);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заказ не оплачен'])[1]/following::a[2]")));
            WebElement element28 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заказ не оплачен'])[1]/following::a[2]"));
            element28.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Новый заказ - ожидает обработки. На этом этапе заказ можно отменить.'])[1]/following::button[1]")));
            WebElement element29 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Новый заказ - ожидает обработки. На этом этапе заказ можно отменить.'])[1]/following::button[1]"));
            element29.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы уверены, что хотите отменить этот заказ'])[1]/following::div[3]")));
            WebElement element30 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы уверены, что хотите отменить этот заказ'])[1]/following::div[3]"));
            element30.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отправлен запрос на удаление заказа. В ближайшее время ваш заказ будет удален.'])[1]/following::div[3]")));
            WebElement element31 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отправлен запрос на удаление заказа. В ближайшее время ваш заказ будет удален.'])[1]/following::div[3]"));
            element31.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login_name")));
            WebElement element32 = driver.findElement(By.id("login_name"));
            element32.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[11]/a/div/i")));
            WebElement element33 = driver.findElement(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[11]/a/div/i"));
            element33.click();
            SECONDS.sleep(2);
            driver.get("https://telegram.vteme.ru/channel.html?text=AUTOTEST:1/1+ПроверкаСМС&chat_id=-1001244278517&bot_id=bot853245415:AAGCzEpjD7Xdv5Yp8mlo1tBx8Jorxp1daaA");
        } finally {

            driver.quit();
        }
    }

    @Test
    public void testZakazPovtor() throws Exception {



        WebDriverWait wait = new WebDriverWait(driver, 60);
        try {

            driver.get("https://www.netprint.ru/moscow");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")));
            WebElement element1 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]"));
            element1.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("auth_login_field")));
            WebElement element0 = driver.findElement(By.id("auth_login_field"));
            element0.click();
            driver.findElement(By.id("auth_login_field")).sendKeys("autobot1@netprint.ru");
            driver.findElement(By.id("pass_field")).clear();
            driver.findElement(By.id("pass_field")).sendKeys("qwe");
            driver.findElement(By.id("auth_login_field")).click();
            TimeUnit.SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login_button")));
            WebElement element2 = driver.findElement(By.id("login_button"));
            element2.click();
            TimeUnit.SECONDS.sleep(2);
            driver.get("https://www.netprint.ru/order/profile");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[3]/a/div/i")));
            WebElement element3 =  driver.findElement(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[3]/a/div/i"));
            element3.click();
            TimeUnit.SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке 20х20'])[1]/following::a[1]")));
            WebElement element4 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке 20х20'])[1]/following::a[1]"));
            element4.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")));
            WebElement element5 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]"));
            element5.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]")));
            WebElement element6 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]"));
            element6.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]")));
            WebElement element7 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]"));
            element7.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::button[1]")));
            WebElement element8 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::button[1]"));
            element8.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Купить за 144 руб.'])[20]/following::div[6]")));
            WebElement element9 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Купить за 144 руб.'])[20]/following::div[6]"));
            element9.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element10 = driver.findElement(By.id("select2-select_city-container"));
            element10.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element11 = driver.findElement(By.id("select2-select_city-container"));
            element11.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element12 = driver.findElement(By.id("select2-select_city-container"));
            element12.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")));
            WebElement element13 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]"));
            element13.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")));
            WebElement element14 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]"));
            element14.sendKeys("Москва");

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")).sendKeys(Keys.ENTER);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_metro-container")));
            WebElement element15 = driver.findElement(By.id("select2-select_metro-container"));
            element15.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Авиамоторная'])[2]/preceding::input[1]")));
            WebElement element16 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Авиамоторная'])[2]/preceding::input[1]"));
            element16.click();

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Академическая'])[2]/preceding::input[1]")).sendKeys("Академическая");
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Академическая'])[2]/preceding::input[1]")).sendKeys(Keys.ENTER);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите адрес доставки'])[1]/following::label[1]")));
            WebElement element17 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите адрес доставки'])[1]/following::label[1]"));
            element17.click();
            TimeUnit.SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save_delivery")));
            WebElement element017 = driver.findElement(By.id("save_delivery"));
            element017.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("send-order")));
            WebElement element18 = driver.findElement(By.id("send-order"));
            element18.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оплатить'])[1]/following::button[1]")));
            WebElement element19 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оплатить'])[1]/following::button[1]"));
            element19.click();

            TimeUnit.SECONDS.sleep(3);
            driver.navigate().refresh();
            TimeUnit.SECONDS.sleep(3);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заказ не оплачен'])[1]/following::a[2]")));
            WebElement element20 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заказ не оплачен'])[1]/following::a[2]"));
            element20.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Новый заказ - ожидает обработки. На этом этапе заказ можно отменить.'])[1]/following::button[1]")));
            WebElement element21 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Новый заказ - ожидает обработки. На этом этапе заказ можно отменить.'])[1]/following::button[1]"));
            element21.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы уверены, что хотите отменить этот заказ'])[1]/following::div[3]")));
            WebElement element22 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы уверены, что хотите отменить этот заказ'])[1]/following::div[3]"));
            element22.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отправлен запрос на удаление заказа. В ближайшее время ваш заказ будет удален.'])[1]/following::div[3]")));
            WebElement element23 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отправлен запрос на удаление заказа. В ближайшее время ваш заказ будет удален.'])[1]/following::div[3]"));
            element23.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Получить SMS с номером заказа'])[1]/following::button[1]")));
            WebElement element24 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Получить SMS с номером заказа'])[1]/following::button[1]"));
            element24.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Все товары этого заказа будут добавлены в корзину к тем, что там сейчас находятся.'])[1]/following::div[3]")));
            WebElement element25 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Все товары этого заказа будут добавлены в корзину к тем, что там сейчас находятся.'])[1]/following::div[3]"));
            element25.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Товары добавлены в корзину'])[1]/following::div[5]")));
            WebElement element26 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Товары добавлены в корзину'])[1]/following::div[5]"));
            element26.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::button[1]")));
            WebElement element27 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::button[1]"));
            element27.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Купить за 144 руб.'])[20]/following::div[6]")));
            WebElement element28 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Купить за 144 руб.'])[20]/following::div[6]"));
            element28.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element29 = driver.findElement(By.id("select2-select_city-container"));
            element29.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element30 = driver.findElement(By.id("select2-select_city-container"));
            element30.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element31 = driver.findElement(By.id("select2-select_city-container"));
            element31.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")));
            WebElement element32 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]"));
            element32.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")));
            WebElement element33 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]"));
            element33.sendKeys("Москва");

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")).sendKeys(Keys.ENTER);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_metro-container")));
            WebElement element34 = driver.findElement(By.id("select2-select_metro-container"));
            element34.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Авиамоторная'])[2]/preceding::input[1]")));
            WebElement element35 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Авиамоторная'])[2]/preceding::input[1]"));
            element35.click();

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Академическая'])[2]/preceding::input[1]")).sendKeys("Академическая");
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Академическая'])[2]/preceding::input[1]")).sendKeys(Keys.ENTER);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите адрес доставки'])[1]/following::label[1]")));
            WebElement element36 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите адрес доставки'])[1]/following::label[1]"));
            element36.click();
            TimeUnit.SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save_delivery")));
            WebElement element37 = driver.findElement(By.id("save_delivery"));
            element37.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("send-order")));
            WebElement element38 = driver.findElement(By.id("send-order"));
            element38.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оплатить'])[1]/following::button[1]")));
            WebElement element39 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оплатить'])[1]/following::button[1]"));
            element39.click();

            TimeUnit.SECONDS.sleep(3);
            driver.navigate().refresh();
            TimeUnit.SECONDS.sleep(3);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заказ не оплачен'])[1]/following::a[2]")));
            WebElement element40 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заказ не оплачен'])[1]/following::a[2]"));
            element40.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Новый заказ - ожидает обработки. На этом этапе заказ можно отменить.'])[1]/following::button[1]")));
            WebElement element41 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Новый заказ - ожидает обработки. На этом этапе заказ можно отменить.'])[1]/following::button[1]"));
            element41.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы уверены, что хотите отменить этот заказ'])[1]/following::div[3]")));
            WebElement element42 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы уверены, что хотите отменить этот заказ'])[1]/following::div[3]"));
            element42.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отправлен запрос на удаление заказа. В ближайшее время ваш заказ будет удален.'])[1]/following::div[3]")));
            WebElement element43 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отправлен запрос на удаление заказа. В ближайшее время ваш заказ будет удален.'])[1]/following::div[3]"));
            element43.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login_name")));
            WebElement element44 = driver.findElement(By.id("login_name"));
            element44.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[11]/a/div/i")));
            WebElement element45 = driver.findElement(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[11]/a/div/i"));
            element45.click();
            SECONDS.sleep(2);
            driver.get("https://telegram.vteme.ru/channel.html?text=AUTOTEST:7/7+ЗаказПовтор&chat_id=-1001244278517&bot_id=bot853245415:AAGCzEpjD7Xdv5Yp8mlo1tBx8Jorxp1daaA");
            TimeUnit.SECONDS.sleep(3);
            driver.get("https://telegram.vteme.ru/channel.html?text=AUTOTEST:+FINISHED&chat_id=-1001244278517&bot_id=bot853245415:AAGCzEpjD7Xdv5Yp8mlo1tBx8Jorxp1daaA");

        } finally {
            SECONDS.sleep(28800);
            driver.quit();
        }
    }

    @Test
    public void testОтзыв() throws Exception {


        WebDriverWait wait = new WebDriverWait(driver, 60);
        try {

            driver.get("https://moscow.netprint.ru");
            SECONDS.sleep(2);
            driver.navigate().refresh();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")));
            WebElement element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]"));
            element.click();

            driver.findElement(By.id("auth_login_field")).clear();
            driver.findElement(By.id("auth_login_field")).sendKeys("autobot1@netprint.ru");
            driver.findElement(By.id("pass_field")).clear();
            driver.findElement(By.id("pass_field")).sendKeys("qwe");
            driver.findElement(By.id("auth_login_field")).click();
            driver.findElement(By.id("login_button")).click();
            SECONDS.sleep(2);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[1]/preceding::img[2]")));
            WebElement element1 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[1]/preceding::img[2]"));
            element1.click();


            ((JavascriptExecutor) driver).executeScript("scroll(0,1500)");
            SECONDS.sleep(5);
            driver.navigate().refresh();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login_name")));
            WebElement element2 = driver.findElement(By.id("login_name"));
            element2.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[contains(@src,'https://moscow.netprint.ru/assets/np2016/images/logo.jpg')]")));
            WebElement element3 = driver.findElement(By.xpath("//img[contains(@src,'https://moscow.netprint.ru/assets/np2016/images/logo.jpg')]"));
            element3.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::a[1]")));
            WebElement element4 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::a[1]"));
            element4.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[1]/following::span[1]")));
            WebElement element5 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[1]/following::span[1]"));
            element5.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Посмотреть отзывы'])[1]/following::a[1]")));
            WebElement element6 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Посмотреть отзывы'])[1]/following::a[1]"));
            element6.click();
            SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//textarea[@name='IMPRESSION'])[3]")));
            WebElement element7 = driver.findElement(By.xpath("(//textarea[@name='IMPRESSION'])[3]"));
            element7.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//textarea[@name='IMPRESSION'])[3]")));
            WebElement element8 = driver.findElement(By.xpath("(//textarea[@name='IMPRESSION'])[3]"));
            element8.sendKeys("test test test");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Комментарий'])[4]/following::button[1]")));
            WebElement element9 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Комментарий'])[4]/following::button[1]"));
            element9.click();

            SECONDS.sleep(2);
            driver.navigate().refresh();
            //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[20]")));
            //WebElement element10 = driver.findElement(By.xpath("//div[20]"));
            //element10.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке'])[3]/following::a[1]")));
            WebElement element11 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке'])[3]/following::a[1]"));
            element11.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::a[2]")));
            WebElement element12 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::a[2]"));
            element12.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[11]/a/div/i")));
            WebElement element13 = driver.findElement(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[11]/a/div/i"));
            element13.click();
            SECONDS.sleep(2);
            driver.get("https://telegram.vteme.ru/channel.html?text=AUTOTEST:4/4+Отзыв&chat_id=-1001244278517&bot_id=bot853245415:AAGCzEpjD7Xdv5Yp8mlo1tBx8Jorxp1daaA");
        } finally {

            driver.quit();
        }
    }

    @Test
    public void testИнстаграмм() throws Exception {


        WebDriverWait wait = new WebDriverWait(driver, 60);
        try {

            driver.get("https://www.instagram.com/accounts/login/?force_authentication=1&enable_fb_login=1&platform_app_id=&next=/oauth/authorize/%3Fclient_id%3D9ad796e5781646fab21d8ca166439496%26redirect_uri%3Dhttps%3A//www.netprint.ru/orderfiles/instagram.html%26response_type%3Dtoken%26hl%3Den");
            driver.findElement(By.name("username")).clear();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
            WebElement element1 = driver.findElement(By.name("username"));
            element1.sendKeys("TestFakeAcc01@yandex.ru");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
            WebElement element2 = driver.findElement(By.name("password"));
            element2.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
            WebElement element3 = driver.findElement(By.name("password"));
            element3.clear();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
            WebElement element4 = driver.findElement(By.name("password"));
            element4.sendKeys("Qwerty123321");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
            WebElement element5 = driver.findElement(By.name("password"));
            element5.sendKeys(Keys.ENTER);

            TimeUnit.SECONDS.sleep(5);
            driver.get("https://www.netprint.ru/moscow");

            ((JavascriptExecutor)driver).executeScript("scroll(0,1500)");
            TimeUnit.SECONDS.sleep(3);
            driver.navigate().refresh();
            TimeUnit.SECONDS.sleep(3);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")));
            WebElement element6 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]"));
            element6.click();

            driver.findElement(By.id("auth_login_field")).clear();
            driver.findElement(By.id("auth_login_field")).sendKeys("autobot1@netprint.ru");
            driver.findElement(By.id("pass_field")).clear();
            driver.findElement(By.id("pass_field")).sendKeys("qwe");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("auth_login_field")));
            WebElement element7 = driver.findElement(By.id("auth_login_field"));
            element7.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login_button")));
            WebElement element8 = driver.findElement(By.id("login_button"));
            element8.click();
            TimeUnit.SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[1]/preceding::img[2]")));
            WebElement element9 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[1]/preceding::img[2]"));
            element9.click();


            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::a[1]")));
            WebElement element10 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокниги'])[2]/following::a[1]"));
            element10.click();


            TimeUnit.SECONDS.sleep(3);
            driver.navigate().refresh();
            TimeUnit.SECONDS.sleep(3);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[5]/following::span[1]")));
            WebElement element11 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Срок изготовления: 2 дня'])[5]/following::span[1]"));
            element11.click();
            TimeUnit.SECONDS.sleep(3);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Создать дизайн с netPrint.ru'])[2]/following::a[1]")));
            WebElement element12 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Создать дизайн с netPrint.ru'])[2]/following::a[1]"));
            element12.click();
            TimeUnit.SECONDS.sleep(3);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Instagram'])[2]/following::input[1]")));
            WebElement element13 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Instagram'])[2]/following::input[1]"));
            element13.sendKeys("TestFakeAcc01@yandex.ru");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Instagram'])[2]/following::button[1]")));
            WebElement element14 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Instagram'])[2]/following::button[1]"));
            element14.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мы можем расположить'])[1]/following::button[1]")));
            WebElement element15 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мы можем расположить'])[1]/following::button[1]"));
            element15.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='пост'])[1]/following::button[1]")));
            WebElement element16 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='пост'])[1]/following::button[1]"));
            element16.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("settings-from-date")));
            WebElement element25 = driver.findElement(By.id("settings-from-date"));
            element25.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("settings-from-date")));
            WebElement element26 = driver.findElement(By.id("settings-from-date"));
            element26.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("settings-from-date")));
            WebElement element27 = driver.findElement(By.id("settings-from-date"));
            element27.clear();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("settings-from-date")));
            WebElement element28 = driver.findElement(By.id("settings-from-date"));
            element28.sendKeys("1.1.2017");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[3]/following::div[3]")));
            WebElement element29 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[3]/following::div[3]"));
            element29.click();
            TimeUnit.SECONDS.sleep(3);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element30 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element30.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element31 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element31.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element32 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element32.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element33 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element33.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element34 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element34.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element35 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element35.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element36 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element36.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element37 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element37.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element38 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element38.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element39 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element39.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element40 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element40.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element41 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element41.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element42 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element42.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element43 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element43.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element44 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element44.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element45 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element45.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element46 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element46.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element47 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element47.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element48 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element48.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element49 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element49.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element50 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element50.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element51 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element51.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element52 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element52.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element53 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element53.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element54 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element54.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element55 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element55.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]")));
            WebElement element56 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сменить логин'])[1]/following::a[1]"));
            element56.click();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Удалить фото'])[1]/following::button[1]")).click();
            TimeUnit.SECONDS.sleep(3);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::button[1]")).click();
            TimeUnit.SECONDS.sleep(1);
            // ПОПАП с Магнитами
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Купить за 144 руб.'])[20]/following::div[6]")).click();
            TimeUnit.SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element21 = driver.findElement(By.id("select2-select_city-container"));
            element21.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element17 = driver.findElement(By.id("select2-select_city-container"));
            element17.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element18 = driver.findElement(By.id("select2-select_city-container"));
            element18.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")));
            WebElement element19 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]"));
            element19.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")));
            WebElement element20 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]"));
            element20.sendKeys("Москва");

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")).sendKeys(Keys.ENTER);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_metro-container")));
            WebElement element23 = driver.findElement(By.id("select2-select_metro-container"));
            element23.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Авиамоторная'])[2]/preceding::input[1]")));
            WebElement element22 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Авиамоторная'])[2]/preceding::input[1]"));
            element22.click();

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Академическая'])[2]/preceding::input[1]")).sendKeys("Академическая");
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Академическая'])[2]/preceding::input[1]")).sendKeys(Keys.ENTER);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите адрес доставки'])[1]/following::label[1]")));
            WebElement vubor = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите адрес доставки'])[1]/following::label[1]"));
            vubor.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save_delivery")));
            WebElement element100 = driver.findElement(By.id("save_delivery"));
            element100.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("send-order")));
            WebElement element002 = driver.findElement(By.id("send-order"));
            element002.click();
            TimeUnit.SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оплатить'])[1]/following::button[1]")));
            WebElement element003 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оплатить'])[1]/following::button[1]"));
            element003.click();

            //Часть кода отвечает за оплату наличными
            //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='При оплате картой скидка на доставку от 20 до 260 руб. Доставка от 2500 руб. - БЕСПЛАТНО.'])[1]/following::label[2]")));
            //WebElement element110 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='При оплате картой скидка на доставку от 20 до 260 руб. Доставка от 2500 руб. - БЕСПЛАТНО.'])[1]/following::label[2]"));
            //element110.click();
            //SECONDS.sleep(2);
            //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("send-order")));
            //WebElement element120 = driver.findElement(By.id("send-order"));
            //element120.click();

            SECONDS.sleep(5);
            driver.navigate().refresh();
            SECONDS.sleep(5);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заказ не оплачен'])[1]/following::a[2]")));
            WebElement element130 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заказ не оплачен'])[1]/following::a[2]"));
            element130.click();


            driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы уверены, что хотите отменить этот заказ'])[1]/following::div[3]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отправлен запрос на удаление заказа. В ближайшее время ваш заказ будет удален.'])[1]/following::div[3]")).click();
            driver.findElement(By.id("login_name")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сохраненные макеты'])[1]/following::i[1]")).click();



            driver.findElement(By.id("login_name")).click();

            SECONDS.sleep(3);
            driver.get("https://telegram.vteme.ru/channel.html?text=AUTOTEST:6/6+Инстаграмм&chat_id=-1001244278517&bot_id=bot853245415:AAGCzEpjD7Xdv5Yp8mlo1tBx8Jorxp1daaA");

        } finally {

            driver.quit();
        }
    }

    @Test
    public void testРазные_доставки() throws Exception {


        WebDriverWait wait = new WebDriverWait(driver, 60);
        try {

            driver.get("https://www.netprint.ru/moscow");
            SECONDS.sleep(2);
            driver.navigate().refresh();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]")));
            WebElement element1 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Корзина'])[1]/following::span[6]"));
            element1.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("auth_login_field")));
            WebElement element2 = driver.findElement(By.id("auth_login_field"));
            element2.clear();

            driver.findElement(By.id("auth_login_field")).sendKeys("autobot1@netprint.ru");
            driver.findElement(By.id("pass_field")).clear();
            driver.findElement(By.id("pass_field")).sendKeys("qwe");
            driver.findElement(By.id("auth_login_field")).click();
            driver.findElement(By.id("login_button")).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[3]/a/div/i")));
            WebElement element3 = driver.findElement(By.xpath("//main[@id='main']/section[2]/div/div/div[3]/div/div[3]/a/div/i"));
            element3.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке 20х20'])[5]/following::a[1]")));
            WebElement element4 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Фотокнига Премиум в твердой обложке 20х20'])[5]/following::a[1]"));
            element4.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]")));
            WebElement element5 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=''])[1]/following::button[1]"));
            element5.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]")));
            WebElement element6 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Исправить'])[1]/following::button[1]"));
            element6.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]")));
            WebElement element7 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Проверить еще раз'])[1]/following::button[1]"));
            element7.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::button[1]")));
            WebElement element8 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Итого'])[1]/following::button[1]"));
            element8.click();
            SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Купить за 144 руб.'])[20]/following::div[6]")));
            WebElement element9 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Купить за 144 руб.'])[20]/following::div[6]"));
            element9.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element10 = driver.findElement(By.id("select2-select_city-container"));
            element10.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element11 = driver.findElement(By.id("select2-select_city-container"));
            element11.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element12 = driver.findElement(By.id("select2-select_city-container"));
            element12.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")));
            WebElement element13 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]"));
            element13.clear();

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")).sendKeys("Москва");
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")).sendKeys(Keys.ENTER);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_metro-container")));
            WebElement element14 = driver.findElement(By.id("select2-select_metro-container"));
            element14.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Авиамоторная'])[2]/preceding::input[1]")));
            WebElement element15 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Авиамоторная'])[2]/preceding::input[1]"));
            element15.clear();

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Академическая'])[2]/preceding::input[1]")).sendKeys("Академическая");
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Академическая'])[2]/preceding::input[1]")).sendKeys(Keys.ENTER);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите адрес доставки'])[1]/following::label[1]")));
            WebElement element16 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите адрес доставки'])[1]/following::label[1]"));
            element16.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save_delivery")));
            WebElement element17 = driver.findElement(By.id("save_delivery"));
            element17.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Изменить заказ'])[1]/following::span[3]")));
            WebElement element18 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Изменить заказ'])[1]/following::span[3]"));
            element18.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element19 = driver.findElement(By.id("select2-select_city-container"));
            element19.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element20 = driver.findElement(By.id("select2-select_city-container"));
            element20.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element21 = driver.findElement(By.id("select2-select_city-container"));
            element21.click();

            //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")));
            //WebElement element22 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]"));
            //element22.clear();
            SECONDS.sleep(2);
            driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Ангарск");
            driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);

            SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите адрес доставки'])[1]/following::label[1]")));
            WebElement element23 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите адрес доставки'])[1]/following::label[1]"));
            element23.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save_delivery")));
            WebElement element24 = driver.findElement(By.id("save_delivery"));
            element24.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Изменить заказ'])[1]/following::span[3]")));
            WebElement element25 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Изменить заказ'])[1]/following::span[3]"));
            element25.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element26 = driver.findElement(By.id("select2-select_city-container"));
            element26.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element27 = driver.findElement(By.id("select2-select_city-container"));
            element27.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element28 = driver.findElement(By.id("select2-select_city-container"));
            element28.click();
            SECONDS.sleep(2);
            //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")));
            //WebElement element29 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]"));
            //element29.clear();

            driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Почтой в любой город");
            driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
            SECONDS.sleep(2);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("b6d6d73fbd44431089fedbbdd8a5c6ce")));
            WebElement element30 = driver.findElement(By.id("b6d6d73fbd44431089fedbbdd8a5c6ce"));
            element30.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save_delivery")));
            WebElement element31 = driver.findElement(By.id("save_delivery"));
            element31.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Изменить заказ'])[1]/following::span[3]")));
            WebElement element32 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Изменить заказ'])[1]/following::span[3]"));
            element32.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_delivery_types_group-container")));
            WebElement element33 = driver.findElement(By.id("select2-select_delivery_types_group-container"));
            element33.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element34 = driver.findElement(By.id("select2-select_city-container"));
            element34.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element35 = driver.findElement(By.id("select2-select_city-container"));
            element35.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_city-container")));
            WebElement element36 = driver.findElement(By.id("select2-select_city-container"));
            element36.click();
            SECONDS.sleep(2);
            //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")));
            //WebElement element37 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]"));
            //element37.clear();

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")).sendKeys("Москва");
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Москва'])[3]/preceding::input[1]")).sendKeys(Keys.ENTER);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_metro-container")));
            WebElement element38 = driver.findElement(By.id("select2-select_metro-container"));
            element38.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_metro-container")));
            WebElement element = driver.findElement(By.id("select2-select_metro-container"));
            element38.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-select_metro-container")));
            WebElement element01 = driver.findElement(By.id("select2-select_metro-container"));
            element38.click();

            //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]")));
            //WebElement element39 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LiveTex'])[6]/following::input[1]"));
            //element39.clear();

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Академическая'])[2]/preceding::input[1]")).sendKeys("Академическая");
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Академическая'])[2]/preceding::input[1]")).sendKeys(Keys.ENTER);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите адрес доставки'])[1]/following::label[1]")));
            WebElement element40 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите адрес доставки'])[1]/following::label[1]"));
            element40.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save_delivery")));
            WebElement element41 = driver.findElement(By.id("save_delivery"));
            element41.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("send-order")));
            WebElement element002 = driver.findElement(By.id("send-order"));
            element002.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оплатить'])[1]/following::button[1]")));
            WebElement element003 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оплатить'])[1]/following::button[1]"));
            element003.click();

            //Часть кода отвечает за оплату наличными
            //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='При оплате картой скидка на доставку от 20 до 260 руб. Доставка от 2500 руб. - БЕСПЛАТНО.'])[1]/following::label[2]")));
            //WebElement element110 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='При оплате картой скидка на доставку от 20 до 260 руб. Доставка от 2500 руб. - БЕСПЛАТНО.'])[1]/following::label[2]"));
            //element110.click();
            //SECONDS.sleep(2);
            //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("send-order")));
            //WebElement element120 = driver.findElement(By.id("send-order"));
            //element120.click();

            SECONDS.sleep(5);
            driver.navigate().refresh();
            SECONDS.sleep(5);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заказ не оплачен'])[1]/following::a[2]")));
            WebElement element130 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Заказ не оплачен'])[1]/following::a[2]"));
            element130.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='button'])[4]")));
            WebElement element42 = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
            element42.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы уверены, что хотите отменить этот заказ'])[1]/following::div[3]")));
            WebElement element43 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вы уверены, что хотите отменить этот заказ'])[1]/following::div[3]"));
            element43.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отправлен запрос на удаление заказа. В ближайшее время ваш заказ будет удален.'])[1]/following::div[3]")));
            WebElement element44 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Отправлен запрос на удаление заказа. В ближайшее время ваш заказ будет удален.'])[1]/following::div[3]"));
            element44.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login_name")));
            WebElement element45 = driver.findElement(By.id("login_name"));
            element45.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сохраненные макеты'])[1]/following::i[1]")));
            WebElement element46 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сохраненные макеты'])[1]/following::i[1]"));
            element46.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login_name")));
            WebElement element47 = driver.findElement(By.id("login_name"));
            element47.click();
            SECONDS.sleep(3);
            driver.get("https://telegram.vteme.ru/channel.html?text=AUTOTEST:5/5+РазныеДоставки&chat_id=-1001244278517&bot_id=bot853245415:AAGCzEpjD7Xdv5Yp8mlo1tBx8Jorxp1daaA");
        } finally {
            SECONDS.sleep(3);
            driver.quit();
        }
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}


