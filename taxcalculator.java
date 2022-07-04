package com.mindtree.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class taxcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://www.moneycontrol.com/");
	     driver.manage().window().maximize();
	     driver.get("https://www.moneycontrol.com/personal-finance/");
	     driver.get("https://www.moneycontrol.com/personal-finance/tools/income-tax-calculator");
	     driver.findElements(By.xpath( "//input[@class='cust_inp custradio active']"));
	     driver.findElements(By.xpath("//input[@class='calculate_taxes is_widget']"));
	     driver.findElements(By.xpath("//input[@class='input_value']"));
	     driver.findElements(By.xpath("//input[@class='calculate_taxes is_widget']"));
	     driver.findElements(By.xpath("//input[@class='btn_common nextfrm MR10 calculateTax']"));
	     driver.findElements(By.xpath("//input[@class='input_heading']"));
	     driver.findElements(By.xpath("//input[@class='input_box']"));
	     driver.findElements(By.id("//input[@class='other_income']"));
	     
	} 

}