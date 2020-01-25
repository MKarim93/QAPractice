package com.QAPractise.letterboxd;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotHandle {
	static WebDriver driver;
	
	public static void takeScreenshot(String fileName) throws IOException {
		//1. take screenshot and store it as a file format:
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//2. now copy the screenshot to desired loocaton using copyfile method:
		FileHandler.copy(file, new File("C:\\Users\\Mohammad Karim\\eclipse-workspace\\"
				+ "QAPractise\\src\\com\\QAPractise\\letterboxd\\screenshots"+fileName+".png"));
	}

}
