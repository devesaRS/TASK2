package com.mercedes

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
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
import com.mercedes.interactions


import internal.GlobalVariable


public class steps extends interactions {

	private void AllSteps() {
		cookies()
		our_models()
		hatchbacks()
		aclass_hatchback()
		build_your_car()
		fuel_options()
		fuel_diesel()
		Screenshot_cars()
		car_prices()
	}

	public void NavigateURL(int line) {
		GoToURL()
	}




	public void KillProcess() {
		String processTask = "taskkill /F /IM "
		Runtime.getRuntime().exec(processTask)
	}


	public void KillProcesses() {
		ConsoleLog("Kill Processes")

		List<String> processes = new ArrayList<>()

		processes.add("EXCEL.EXE")
		processes.add("chrome.exe")
		processes.add("chromedriver.exe")
		processes.add("firefox.exe")
		processes.add("geckodriver.exe")

		KillProcess()
	}
}
