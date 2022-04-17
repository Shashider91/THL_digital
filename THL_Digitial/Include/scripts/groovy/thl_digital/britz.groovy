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

class britz {

	@Given("User navigates to Chrome Browser")
	def chromeBrowser() {
		WebUI.openBrowser('')
	}

	@When("User enter Google Search NZ")
	def googleNZ() {
		WebUI.navigateToUrl('https://www.google.co.nz/')
	}

	@And("In Google search for Britz")
	def googleSearchforBritz() {
		WebUI.setText(findTestObject('Object Repository/Page_Google/input__q'), 'Britz')
		WebUI.sendKeys(findTestObject('Object Repository/Page_Google/input__q'), Keys.chord(Keys.ENTER))
	}

	@Then("Britz website is displayed in results")
	def results() {
		WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Brtiz - Google Search/h3_Britz Campervans  Australasias Largest R_9ed4d4'))
	}

	@Given("User navigates to Britz homepage")
	def brtizHomepage() {
		WebUI.click(findTestObject('Object Repository/Page_Brtiz - Google Search/h3_Britz Campervans  Australasias Largest R_9ed4d4'))
		WebUI.verifyElementPresent(findTestObject('Page_Britz Campervans  Australasias Largest Rental Vehicle Co/BritzLogo'), 5)
		WebUI.verifyElementPresent(findTestObject('Page_Britz Campervans  Australasias Largest Rental Vehicle Co/BritzHomepage'),
				5)
	}

	@When("User Select destination as New Zealand")
	def selectNewZealand() {
		WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/div_Choose your destination'))
		WebUI.click(findTestObject('Page_maui Motorhomes  Australasias Largest Rental Vehicle Co/li_New Zealand'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/h4_We are Australasias leader in self-drive_027561'),
				0)
	}

	@And("User Perform Rental booking search with Pickup location in Auckland")
	def pickuplocation() {
		WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/button_Pick Up Date'))
		WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/a_29'))
		WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/span_Next'))
		WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/a_21'))
		WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/div_Pick Up Location'))
		WebUI.click(findTestObject('Page_maui Motorhomes  Australasias Largest Rental Vehicle Co/li_Auckland'))
	}

	@And("Drop of Location in Christchurch with 2 Audults for New Zealand Drivers License")
	def dropoofLocation( ) {
		WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/div_Drop Off Location'))
		WebUI.click(findTestObject('Page_maui Motorhomes  Australasias Largest Rental Vehicle Co/li_Christchurch'))
		WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/button_Passengers'))
		WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/div_1'))
		WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/a_Drivers Licence'))
		WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/li_New Zealand'))
		WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/span_Search'))
	}

	@Then("User can view number of records for search")
	def viewRecords() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Britz New Zealand  real-time campervan search/p_Check out our affordable  wide range of B_733675'),
				0)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Britz New Zealand  real-time campervan search/span_7 Results'))
		WebUI.closeBrowser()
	}
}