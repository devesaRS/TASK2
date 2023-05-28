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
import internal.GlobalVariable


public class pages {

	/** TestObject Agree to all cookies */
	TestObject cookies_agree = findTestObject('cookies_agree')

	/** TestObject Our Models */
	TestObject our_models = findTestObject('our_models')

	/** TestObject Hatchback models */
	TestObject hatchbacks = findTestObject('hatchbacks')

	/** TestObject A-Class Hatchback models */
	TestObject aclass_hatchback = findTestObject('aclass_hatchback')

	/** TestObject Build your car */
	TestObject build_your_car = findTestObject('build_your_car')

	/** TestObject Fuel Options */
	TestObject fuel_options = findTestObject('fuel_options')

	/** TestObject Fuel Diesel */
	TestObject fuel_diesel = findTestObject('fuel_diesel')

	/** TestObject Fuel Diesel Checkbox */
	TestObject fuel_diesel_check = findTestObject('shadows/fuel_diesel_check')
	
	/** TestObject Car_sort by */
	TestObject more_filters = findTestObject('more_filters')


	/** TestObject Car_diesel */
	TestObject car_diesel = findTestObject('car_diesel')


	/** TestObject Car_prices */
	TestObject car_prices = findTestObject('car_prices')

	/** TestObject Car text */
	TestObject car_text = findTestObject('car_text')
}






