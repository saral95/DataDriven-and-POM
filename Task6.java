package org.datadriven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task6 extends Base_classfb6{
	
public static void main(String[] args) throws IOException {
		
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		find(email, excel(1, 0));
		WebElement pass = driver.findElement(By.id("pass"));
		find(pass, excel(1,1));
		WebElement login = driver.findElement(By.id("u_0_b"));
		btnClick(login);
	}



}
