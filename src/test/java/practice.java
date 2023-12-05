import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class practice {
    public static void main(String[] args){
        System.setProperty("webdriver.edge.driver","C:\\Users\\mhkum\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver=new EdgeDriver();

        driver.get("https://qamoviesapp.ccbp.tech/login");

        WebElement user=driver.findElement(By.id("usernameInput"));
        user.sendKeys("rahul");

        WebElement passowrd=driver.findElement(By.id("passwordInput"));
        passowrd.sendKeys("rahul@2021");

        WebElement button=driver.findElement(By.className("login-button"));
        button.click();


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Popular")));

        if(driver.getCurrentUrl().equals("https://qamoviesapp.ccbp.tech/")) {
            System.out.println("url correct");
            System.out.println("correct");
        }else {
            System.out.println("url not correct");
        }
            driver.quit();
    }
}
