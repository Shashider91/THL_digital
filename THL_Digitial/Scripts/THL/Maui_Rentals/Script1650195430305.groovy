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

WebUI.setText(findTestObject('Object Repository/Page_Google/input__q'), 'Maui')

WebUI.sendKeys(findTestObject('Object Repository/Page_Google/input__q'), Keys.chord(Keys.ENTER))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Maui - Google Search/h3_maui Motorhomes  Australasias Largest Re_9ae5d9'))

WebUI.click(findTestObject('Object Repository/Page_Maui - Google Search/h3_maui Motorhomes  Australasias Largest Re_9ae5d9'))

WebUI.verifyElementPresent(findTestObject('Page_maui Motorhomes  Australasias Largest Rental Vehicle Co/maui'), 5)

WebUI.verifyElementPresent(findTestObject('Page_maui Motorhomes  Australasias Largest Rental Vehicle Co/HomepageMaui'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/div_Choose your destination'))

WebUI.click(findTestObject('Page_maui Motorhomes  Australasias Largest Rental Vehicle Co/li_New Zealand'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/h4_We are Australasias leader in self-drive_027561'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/button_Pick Up Date'))

WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/a_30'))

WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/a_14'))

WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/div_Pick Up Location'))

WebUI.click(findTestObject('Page_maui Motorhomes  Australasias Largest Rental Vehicle Co/li_Auckland'))

WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/div_Drop Off Location'))

WebUI.click(findTestObject('Page_maui Motorhomes  Australasias Largest Rental Vehicle Co/li_Christchurch'))

WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/button_Passengers'))

WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/div_1'))

WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/b'))

WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/li_New Zealand'))

WebUI.click(findTestObject('Object Repository/Page_maui Motorhomes  Australasias Largest _37c74f/span_Search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Maui New Zealand  real-time campervan search/p_Check out our fully self contained premiu_7d208e'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Maui New Zealand  real-time campervan search/span_2 Results'), 
    0)

WebUI.closeBrowser()

