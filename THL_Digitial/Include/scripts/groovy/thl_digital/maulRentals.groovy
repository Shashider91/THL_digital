package thl_digital
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class mauiRentals {

	@Given("User navigates to Browser")
	def navigatetoBrowser() {
		WebUI.openBrowser('')
	}
	@When("User enter NZ Google Search")
	def enterGoogle() {
		WebUI.navigateToUrl('https://www.google.co.nz/')
	}

	@And("In Google search for Maui")
	def MauiRentals() {
		WebUI.setText(findTestObject('Object Repository/Page_Google/input__q'), 'Maui')
		WebUI.sendKeys(findTestObject('Object Repository/Page_Google/input__q'), Keys.chord(Keys.ENTER))
	}

	@Then("Maui rental website is displayed in results")
	def MauiRentalWebsite() {
		WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Maui - Google Search/h3_maui Motorhomes  Australasias Largest Re_9ae5d9'))
		WebUI.click(findTestObject('Object Repository/Page_Maui - Google Search/h3_maui Motorhomes  Australasias Largest Re_9ae5d9'))
	}

	@Given("User navigates to Maui Rentals homepage")
	def navigatetoHomepage() {
		WebUI.verifyElementPresent(findTestObject('Page_maui Motorhomes  Australasias Largest Rental Vehicle Co/maui'), 5)
		WebUI.verifyElementPresent(findTestObject('Page_maui Motorhomes  Australasias Largest Rental Vehicle Co/HomepageMaui'),
				5)
	}

	@When("User select destination as New Zealand")
	def selectdestinationNewZealand() {
		WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/div_Choose your destination'))
		WebUI.click(findTestObject('Page_maui Motorhomes  Australasias Largest Rental Vehicle Co/li_New Zealand'))
	}

	@And("User Perform a rental booking search with Pickup location in Auckland")
	def rentalbookingSearchPickup() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/h4_We are Australasias leader in self-drive_027561'),						0)
		WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/button_Pick Up Date'))
		WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/a_30'))
		WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/span_Next'))
		WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/a_14'))
		WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/div_Pick Up Location'))
		WebUI.click(findTestObject('Page_maui Motorhomes  Australasias Largest Rental Vehicle Co/li_Auckland'))
	}

	@And("Drop of location in Christchurch with 2 Audults for New Zealand Drivers License")
	def dropofLocation( ) {
		WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/div_Drop Off Location'))
		WebUI.click(findTestObject('Page_maui Motorhomes  Australasias Largest Rental Vehicle Co/li_Christchurch'))
		WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/button_Passengers'))
		WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/div_1'))
		WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/b'))
		WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/li_New Zealand'))
		WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/span_Search'))
	}

	@Then("User can view number of records")
	def viewNumberofRecords() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Maui New Zealand  real-time campervan search/p_Check out our fully self contained premiu_7d208e'),
				0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Maui New Zealand  real-time campervan search/span_2 Results'),
				0)
		WebUI.closeBrowser()
	}
}