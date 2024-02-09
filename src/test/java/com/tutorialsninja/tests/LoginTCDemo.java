package com.tutorialsninja.tests;
import com.tutorialsninja.core.BrowserScript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class LoginTCDemo extends BrowserScript {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = openbrowser(); // Obtain the WebDriver instance

        // Navigate to a website

        driver.get("https://tutorialsninja.com/demo/index.php");


        Thread.sleep(5000);

        // Perform your Selenium actions here
        WebElement myAccount =driver.findElement(By.linkText("My Account"));
        myAccount.click();

        WebElement loginLink =driver.findElement(By.linkText("Login"));
        loginLink.click();

       // WebElement headerReg = driver.findElement(By.xpath("//h2[text()='New Customer']"));
     //   System.out.println(headerReg.getText());

     //   WebElement strongNew= driver.findElement(By.xpath("//h2[text()='Register Account']"));
   //     System.out.println(strongNew.getText());
        //paragraph remaining


       WebElement continueBtn = driver.findElement(By.xpath("//a[text() =\"Continue\"]"));
        continueBtn.click();


       WebElement header = driver.findElement(By.xpath("//h2[text()='Returning Customer']"));
        System.out.println(header.getText());

        WebElement strongLogin = driver.findElement(By.xpath("//strong[text()='I am a returning customer']"));
        System.out.println(strongLogin.getText());


        WebElement userName=driver.findElement(By.xpath("//input[@id='input-email']"));
        userName.sendKeys("priya1234@gmail.com");
        WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
        password.sendKeys("123321");

        WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
        login.click();


        Thread.sleep(3000);

        driver.quit();
    }
}