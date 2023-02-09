package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//verify the page
		String text=driver.findElement(By.tagName("h2")).getText();
		//click on crmsfa hyperlink
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abishua");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Abi");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Engineer");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("450000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I am a software tester");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("nil");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S R");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Rick");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Manufacturing Engineering");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("20");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Heart");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("11/19");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abishuarickz352@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9952845227");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Selbet Raj");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("ArapuraVilagom");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Marthandam");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("629169");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Stalin Sunitha A");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Nesarpuram");
		
		}

}
