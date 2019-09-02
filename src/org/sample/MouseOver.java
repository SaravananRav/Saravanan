package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\smart saran\\eclipse-workspace\\Three\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement mse = driver.findElement(By.id("wrapper"));
		Actions acc=new Actions(driver);
		acc.moveToElement(mse).perform();
		WebElement clk = driver.findElement(By.xpath("//span[text()='UML Training']"));
		clk.click();
	}

}
