package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import testngPack.FailureScreenshot;

public class ReusableMethods {

	public static void captureScreenshot(String fileName) {
		File srcFile = ((TakesScreenshot)FailureScreenshot.driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(srcFile, new File("C:\\TestNg\\TestNg\\Screenshots\\" + fileName + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
