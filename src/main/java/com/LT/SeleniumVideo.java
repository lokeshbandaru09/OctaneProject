package com.LT;
/*
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import Base.BaseUtil;
import  cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class SeleniumVideo{
    @Test
public void JenkinsTest () throws InterruptedException {
      // Code to make run faster in Internet Explorer
      DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
      capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
      capabilities.setCapability("requireWindowFocus", true);

     //   WebDriver driver = new InternetExplorerDriver(capabilities);
   //     System.setProperty("webdriver.ie.driver", "C:\\Users\\Administrator\\Downloads\\IEDriverServer_x64_3.5.0\\IEDriverServer.exe");
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe" );





      // Code for Maximising the Windows
        //WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);


     //  WebDriver driver = new InternetExplorerDriver(capabilities);
        System.out.println("Hi, Welcome to Devops Demo");

    //   Code for Amazon wesite to serach for desired Name : DEVOPS BOOKS
        driver.navigate().to("https://www.amazon.com");
       // ((IJavaScriptExecutor)driver).ExecuteScript("window.resizeTo(1024, 768);");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lemontree AB");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        System.out.println("Wrong place to SEARCH  ");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().back();
        String title= driver.getTitle();
        System.out.println("Page Title is :  " + title);
        System.out.println("Please Search URL 'https://lemontree.se/' ");


        driver.navigate().to("https://lemontree.se/");
        String company= driver.getTitle();
        System.out.println("Page Title is :  " + company);


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("menu-item-1859")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



        driver.findElement(By.id("menu-item-2120")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body[@class='page-template page-template-page-templates page-template-page-contact page-template-page-templatespage-contact-php page page-id-889 single-author']/div[@id='page']/div[@id='main']/div[@id='primary contact-page']/div[@id='content']/div[@class='blocks-container content-container']/div[@class='inner']/article[@id='post-889']/div[@class='entry-content post-separator']/div[@id='wpcf7-f4755-p889-o1']/form[@class='wpcf7-form']/div[@id='contact-form']/fieldset/p[1]/span[@class='wpcf7-form-control-wrap your-name']/input[@class='wpcf7-form-control wpcf7-text wpcf7-validates-as-required']")).sendKeys("Your Name");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body[@class='page-template page-template-page-templates page-template-page-contact page-template-page-templatespage-contact-php page page-id-889 single-author']/div[@id='page']/div[@id='main']/div[@id='primary contact-page']/div[@id='content']/div[@class='blocks-container content-container']/div[@class='inner']/article[@id='post-889']/div[@class='entry-content post-separator']/div[@id='wpcf7-f4755-p889-o1']/form[@class='wpcf7-form']/div[@id='contact-form']/fieldset/p[2]/span[@class='wpcf7-form-control-wrap your-email']/input[@class='wpcf7-form-control wpcf7-text wpcf7-email wpcf7-validates-as-required wpcf7-validates-as-email']")).sendKeys("Your Email");

  /*
        driver.findElement(By.name("your-name")).sendKeys("Your Name");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.name("your-email")).sendKeys("Your Email");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS );
       */
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS );
      driver.quit();


    }

}
