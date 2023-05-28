package com.mercedes

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxProfile
import org.openqa.selenium.firefox.ProfilesIni
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.driver.WebUIDriverType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.awt.Desktop
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL
import org.apache.commons.lang3.StringUtils
import com.kms.katalon.core.configuration.RunConfiguration
import java.util.HashMap
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import org.openqa.selenium.By
import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper

public class pdf{

	public static void WebDriverController() throws Exception {


		WebUIDriverType executedBrowser = DriverFactory.getExecutedBrowser()
		switch(executedBrowser) {

			case WebUIDriverType.CHROME_DRIVER:
				System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath())
				ChromeOptions  options = new ChromeOptions ()
				HashMap<String, Object> chromePrefs = new HashMap<String, Object>()
				chromePrefs.put("profile.default_content_settings.popups", 0)
				chromePrefs.put("download.default_directory", 0)
				options.setExperimentalOption("prefs", chromePrefs)
				options.addArguments("--force-device-scale-factor=1" )
				options.addArguments("--window-size=1920,1080")
				options.addArguments("--marionette= true")
				options.addArguments("--download.prompt_for_download=false")
				options.addArguments("--disable-browser-side-navigation")
				options.addArguments("--pdfjs.disabled=true")
				options.addArguments("--browser.helperApps.neverAsk.saveToDisk=image/jpg/download/octet-stream")
				WebDriver driver = new ChromeDriver(options)
				DriverFactory.changeWebDriver(driver)
				break

			default:
				WebUI.openBrowser('')
		}
	}
}
