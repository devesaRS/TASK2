package com.mercedes

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import com.mercedes.pages
import org.apache.commons.lang3.StringUtils
import java.lang.Integer as Integer

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;



public class interactions extends pages{

	public void ConsoleLog(String message) {
		System.out.println("   ➤   ✔   " + message )
	}


	public void WriteLogFile(String message) {
		String file = "Results.txt"
		// Open the file in append mode.
		FileWriter fw = new FileWriter(file,true);
		PrintWriter out = new PrintWriter(fw);

		// Append the name of ocean to the file
		out.println(message);
		out.flush()
		// Close the file.
		//out.close();
	}


	public void ConsoleLog_file(String message) {

		WriteLogFile("\r\n")
		WriteLogFile("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂")
		WriteLogFile(message)
		WriteLogFile("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂")
	}

	public void cookies() {
		WebUI.delay(1)
		WebUI.click(cookies_agree)
		ConsoleLog('[CLICK] -> Agree to all cookies')
		WebUI.delay(1)
	}

	public void our_models() {
		WebUI.delay(1)
		WebUI.click(our_models)
		ConsoleLog('[CLICK] -> Our Models')
		WebUI.delay(1)
	}

	public void hatchbacks() {
		WebUI.delay(1)
		WebUI.click(hatchbacks)
		ConsoleLog('[CLICK] -> Hatchbacks')
		WebUI.delay(1)
	}

	public void aclass_hatchback() {
		WebUI.delay(1)
		WebUI.click(aclass_hatchback)
		ConsoleLog('[CLICK] -> A-Class Hatchbacks')
		WebUI.delay(1)
	}

	public void build_your_car() {
		WebUI.delay(1)
		WebUI.click(build_your_car)
		ConsoleLog('[CLICK] -> Build your car')
		WebUI.delay(1)
	}

	public void fuel_options() {
		WebUI.delay(1)
		WebUI.click(fuel_options)
		ConsoleLog('[CLICK] -> Open List of Fuel types')
		WebUI.delay(1)
	}

	public void fuel_diesel() {
		WebUI.delay(1)
		WebUI.enhancedClick(fuel_diesel_check)
		ConsoleLog('[CLICK] -> Checkbox Diesel')
		WebUI.delay(1)
	}



	public void Screenshot_cars() {
		WebUI.delay(1)
		WebUI.scrollToPosition(500, 600)
		WebUI.delay(1)
		WebUI.click(more_filters)
		WebUI.delay(1)
		WebUI.click(more_filters)
		WebUI.delay(1)
		WebUI.scrollToPosition(1000, 1000)
		WebUI.delay(1)
		WebUI.takeScreenshot('Screenshots/Diesel_car_prices.png')
		ConsoleLog('[SCREENSHOT DIESEL CAR PRICES]')
		WebUI.delay(1)
	}

	public void car_prices() {
		WebUI.delay(1)
		String all_car_text = WebUI.getText(car_text)
		WebUI.delay(2)

		String[] text= all_car_text.split('£')
		String price_diesel1=text[1].substring(0,6)
		String car_price_diesel1 = price_diesel1.replace(",", "")
		String car1_price= "Diesel Car 1 Price= " + car_price_diesel1 + "£"
		ConsoleLog("Diesel Car 1 Price= " + car_price_diesel1 + "£")
		String price_diesel2=text[2].substring(0,6)
		String car_price_diesel2 = price_diesel2.replace(",", "")
		String car2_price= "Diesel Car 2 Price= " + car_price_diesel2 + "£"
		ConsoleLog("Diesel Car 2 Price= " + car_price_diesel2 + "£")
		String price_diesel3=text[3].substring(0,6)
		String car_price_diesel3 = price_diesel3.replace(",", "")
		String car3_price= "Diesel Car 3 Price= " + car_price_diesel3 + "£"
		ConsoleLog("Diesel Car 3 Price= " + car_price_diesel3 + "£")
		String price_diesel4=text[4].substring(0,6)
		String car_price_diesel4 = price_diesel4.replace(",", "")
		String car4_price= "Diesel Car 4 Price= " + car_price_diesel4 + "£"
		ConsoleLog("Diesel Car 4 Price= " + car_price_diesel4 + "£")
		WebUI.delay(3)




		int price1 = Integer.parseInt(car_price_diesel1)
		int price2 = Integer.parseInt(car_price_diesel2)
		int price3 = Integer.parseInt(car_price_diesel3)
		int price4 = Integer.parseInt(car_price_diesel4)
		//		WebUI.verifyGreaterThan(price1, 30000)
		//		int price1 = price_diesel1.toInteger()
		WebUI.delay(2)
		ConsoleLog_file(car1_price)
		ConsoleLog_file(car2_price)
		ConsoleLog_file(car3_price)
		ConsoleLog_file(car4_price)
		ConsoleLog('File Results.txt')

		//		String file_name = "C:\\Folder_Name\\OutPut.txt"
		//		WriteFile data = new WriteFile(file_name, true)
		//		data.WriteToFile("This-is-a-line-of-text")
		//		println("One record written to file...")
		//

		if (price1>30000 & price1<price2 & price2<price3 & price3<price4 & price4<60000) {
			ConsoleLog("ALL DIESEL CARS COST MORE THAN 30000£ AND LESS THAN 60000£")
			ConsoleLog_file("ALL DIESEL CARS COST MORE THAN 30000£ AND LESS THAN 60000£")



			//			}

		}



	}


	public void writetxt() {
		String filePath = 'Text/file.txt'
		String theString=""
		new File(filePath).withWriter("utf-8") { writer ->
			writer.writeLine(theString)

		}
	}


	public void GoToURL() {
		String url_df = "https://www.mercedes-benz.co.uk/"
		WebUI.navigateToUrl(url_df)
		ConsoleLog("URL:" + url_df)
	}

	public void NavigateURL(int line) {
		GoToURL()
	}

	public void KillProcess() {
		for(String process : "processes") {
			String processTask = "taskkill /F /IM " + process
			Runtime.getRuntime().exec(processTask)
			ConsoleLog("Process: " + process + " closed!")
		}
	}

	public void KillProcesses(int line) {
		ConsoleLog("Kill Processes")

		List<String> processes = new ArrayList<>()

		processes.add("EXCEL.EXE")
		processes.add("chrome.exe")
		processes.add("chromedriver.exe")
		processes.add("firefox.exe")
		processes.add("geckodriver.exe")

		KillProcess()
	}

	public void MaximizeWindow() {
		WebUI.maximizeWindow()
		ConsoleLog("Maximize Browser")
	}


}
