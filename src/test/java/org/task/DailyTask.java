package org.task;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DailyTask {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saba Siva\\eclipse-workspace\\DailyTask\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.westjet.com/en-ca/index");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement sorce = driver.findElement(By.xpath("(//div[@class='input-text can-clear'])[1]"));
		Actions ac = new Actions(driver);
		ac.doubleClick(sorce);
		sorce.click();
		Robot robot = new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screenSize);
		BufferedImage createScreenCapture = robot.createScreenCapture(rectangle);
		File file = new File("E:\\airline.png");
		ImageIO.write(createScreenCapture, "png", file);
		WebElement source = driver.findElement(By.name("origin-airport"));
		source.sendKeys("Toronto, ON");
		WebElement des = driver.findElement(By.name("destination-airport"));
		des.sendKeys("Sydney, NSW");
		WebElement deDate = driver.findElement(By.name("departure-date"));
		deDate.sendKeys("Sun Sep 20");
		Dimension screenSize1 = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle1 = new Rectangle(screenSize1);
		BufferedImage createScreenCapture1 = robot.createScreenCapture(rectangle1);
		File file1 = new File("E:\\airline1.png");
		ImageIO.write(createScreenCapture1, "png", file1);

	}

}
