import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.co.nz/')

WebUI.setText(findTestObject('Object Repository/Page_Google/input__q'), 'Britz')

WebUI.sendKeys(findTestObject('Object Repository/Page_Google/input__q'), Keys.chord(Keys.ENTER))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Brtiz - Google Search/h3_Britz Campervans  Australasias Largest R_9ed4d4'))

WebUI.click(findTestObject('Object Repository/Page_Brtiz - Google Search/h3_Britz Campervans  Australasias Largest R_9ed4d4'))

WebUI.verifyElementPresent(findTestObject('Page_Britz Campervans  Australasias Largest Rental Vehicle Co/BritzLogo'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Britz Campervans  Australasias Largest Rental Vehicle Co/BritzHomepage'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/div_Choose your destination'))

WebUI.click(findTestObject('Page_maui Motorhomes  Australasias Largest Rental Vehicle Co/li_New Zealand'))

WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/button_Pick Up Date'))

WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/a_29'))

WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/a_21'))

WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/div_Pick Up Location'))

WebUI.click(findTestObject('Page_maui Motorhomes  Australasias Largest Rental Vehicle Co/li_Auckland'))

WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/div_Drop Off Location'))

WebUI.click(findTestObject('Page_maui Motorhomes  Australasias Largest Rental Vehicle Co/li_Christchurch'))

WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/button_Passengers'))

WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/div_1'))

//WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/form_Book your Campervan     Pick Up Date 2_553a1d'))
WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/a_Drivers Licence'))

WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/li_New Zealand'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/h4_We are Australasias leader in self-drive_027561'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Britz Campervans  Australasias Largest_9e69f9/span_Search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Britz New Zealand  real-time campervan search/p_Check out our affordable  wide range of B_733675'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Britz New Zealand  real-time campervan search/span_7 Results'))

WebUI.closeBrowser()

