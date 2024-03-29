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

WebUI.navigateToUrl('https://www.techlistic.com/p/selenium-practice-form.html')

WebUI.setText(findTestObject('Object Repository/Page_/input_firstname'), 'aa')

WebUI.setText(findTestObject('Object Repository/Page_/input_lastname'), 'bb')

WebUI.click(findTestObject('Object Repository/Page_/input_sex'))

WebUI.click(findTestObject('Object Repository/Page_/input_exp'))

WebUI.setText(findTestObject('Object Repository/Page_/inputdatepicker'), 'asd')

WebUI.click(findTestObject('Object Repository/Page_/input_profession'))

WebUI.click(findTestObject('Object Repository/Page_/input_tool'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_AsiaEuropeAfricaAustraliaSouth Ameri_982c86'), 
    'Australia', true)

WebUI.click(findTestObject('Object Repository/Page_/div_Selenium CommandsCSS Tutorial For Begin_0a7f1b'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Browser CommandsNavigation CommandsS_69f390'), 
    'WebElement Commands', true)

WebUI.click(findTestObject('Object Repository/Page_/button_Button'))

WebUI.click(findTestObject('Object Repository/Page_/a_Click here to Download File'))

