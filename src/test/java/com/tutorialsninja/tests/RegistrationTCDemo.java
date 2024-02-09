package com.tutorialsninja.tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class RegistrationTCDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

         driver.manage().window().maximize();
        // Perform your Selenium actions here

        WebElement header = driver.findElement(By.xpath("//div[@id='content']/h1"));
        System.out.println(header.getText());

        WebElement info = driver.findElement(By.xpath("//div[@id='content']/p"));
        System.out.println(info.getText());

        WebElement formHeading =driver.findElement(By.xpath("//fieldset[@id=\"account\"]/legend"));
        System.out.println(formHeading.getText());

        WebElement fname =driver.findElement(By.xpath("//input[@id=\'input-firstname\']"));
        fname.sendKeys("Nisha");

        WebElement lname =driver.findElement(By.xpath("//input[@id=\'input-lastname\']"));
        lname.sendKeys("Pawar");

        WebElement email =driver.findElement(By.xpath("//input[@id=\"input-email\"]"));
        email.sendKeys("pawar08nisha@gmail.com");

        WebElement telephone =driver.findElement(By.xpath("//input[@id=\'input-telephone\']"));
        telephone.sendKeys("7067341707");


        WebElement passwordheader =driver.findElement(By.xpath("//fieldset[legend[text()='Your Password']]"));
        System.out.println(passwordheader.getText());

        WebElement password = driver.findElement(By.xpath("//input[@id=\"input-password\"]"));
        password.sendKeys("123321@Np");

        WebElement cpassword = driver.findElement(By.xpath("//input[@id='input-confirm']"));
        cpassword.sendKeys("123321@Np");

        WebElement newsletter =driver.findElement(By.xpath("//fieldset[legend[text() =\"Newsletter\"]]"));
        System.out.println(newsletter.getText());

        WebElement radiolable  = driver.findElement(By.xpath(""));
        System.out.println(radiolable .getText());

        WebElement radioYes =driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]"));
        radioYes.click();

        WebElement radioNo =driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]"));
        radioYes.click();

        WebElement privacyInfo =driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div"));
        System.out.println(privacyInfo.getText());

        WebElement checkPrivacy =driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
        checkPrivacy.click();

        WebElement continueBtn =driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
        continueBtn.click();


        Thread.sleep(8000);



        // Close the browser
     //  driver.quit();
    }

}
