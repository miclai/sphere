package test_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class book {
	

	public static void main(String args[]) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String title;
		
		
		driver.get("https://www.whitcoulls.co.nz/product/middle-earth-the-lord-of-the-rings-5545868");
		
		title=driver.getTitle();
		System.out.println(title);
		if( title == null){
			System.out.println("Title is not present on page");
		}
		//WebElement price=driver.findElement(By.className("hummInfo"));
		
		/*if(driver.findElement(By.cssSelector("price")).length() > 0){
			System.out.println("price is present on page");
		}*/
		WebElement price=driver.findElement(By.className("price"));
		if( price == null){
			System.out.println("Price is not present on page");
		}
		else {
			System.out.println("Price is present on page");
		}
		//System.out.println(Charsequence(price));
		WebElement description=driver.findElement(By.className("description"));
		if( description == null){
			System.out.println("Description is not present on page");
		}
		else {
			System.out.println("Description is present on page");
		}
	}

	
}	

