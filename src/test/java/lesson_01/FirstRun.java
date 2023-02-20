package lesson_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstRun {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://google.com");
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

//        System.out.println("driver.getPageSource() = " + driver.getPageSource());

        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.navigate().to("https://wikipedia.org");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        Thread.sleep(1000);
        driver.quit();

    }
}
