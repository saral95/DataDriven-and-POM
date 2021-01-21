package org.datadriven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task10 extends Base_class{
	public static void main(String[] args) throws IOException, InterruptedException {
           chromeBrowser();
           launchUrl("http://www.adactin.com/HotelApp/");
           WebElement user = driver.findElement(By.id("username"));
           find(user, excel(1,0));
           WebElement pass = driver.findElement(By.id("password"));
           find(pass, excel(1,1));
           WebElement login = driver.findElement(By.id("login"));
           btnClick(login);
           
           WebElement selectloc = driver.findElement(By.id("location"));
           selectText(selectloc, excel(1,2));
           
           WebElement selecthotel = driver.findElement(By.id("hotels"));
           selectText(selecthotel, excel(1,3));
           
           WebElement selectRoom = driver.findElement(By.id("room_type"));
           selectText(selectRoom, excel(1,4));
           
           WebElement no = driver.findElement(By.id("room_nos"));
           selectText(no, excel(1,5));
           
           WebElement datein = driver.findElement(By.id("datepick_in"));
           find(datein, excel(1,6));
           
           WebElement dateout = driver.findElement(By.id("datepick_out"));
           find(dateout, excel(1,7));
           
           WebElement adult = driver.findElement(By.id("adult_room"));
           selectText(adult, excel(1,8));
           
           WebElement child = driver.findElement(By.id("child_room"));
           selectText(child, excel(1,9));
           
           WebElement sub = driver.findElement(By.id("Submit"));
           btnClick(sub);
           
           WebElement clk = driver.findElement(By.id("radiobutton_0"));
           btnClick(clk);

           WebElement cont = driver.findElement(By.id("continue"));
           btnClick(cont);
           
           WebElement name = driver.findElement(By.id("first_name"));
           find(name, excel(1,10));
           
           WebElement lastname = driver.findElement(By.id("last_name"));
           find(lastname, excel(1,11));
           
           WebElement add = driver.findElement(By.id("address"));
           find(add, excel(1,12));
           
           WebElement ccnum = driver.findElement(By.id("cc_num"));
           find(ccnum, excel(1,13));
           
           WebElement cctype = driver.findElement(By.id("cc_type"));
           find(cctype, excel(1,14));
           
           WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
           find(expmonth, excel(1,15));
           
           WebElement expyear = driver.findElement(By.id("cc_exp_year"));
           find(expyear, excel(1,16));
           
           WebElement cvv = driver.findElement(By.id("cc_cvv"));
           find(cvv, excel(1,17));
           
           WebElement book = driver.findElement(By.id("book_now"));
           btnClick(book);
           Thread.sleep(6000);
           
           WebElement orderno = driver.findElement(By.xpath("//input[@id='order_no']"));
           //Thread.sleep(8000);
           String att = Attribute(orderno);
           excelWrite(1, 18, att);

           
	
	}

}
