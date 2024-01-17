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

WebUI.navigateToUrl('https://parabank.parasoft.com/parabank/index.htm')

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Welcome  Online Banking/a_Register'))

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.firstName'), 
    FirstName)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.lastName'), 
    LastName)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.street'), 
    Street)

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.street'))

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.city'), 
    City)

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.city'))

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.state'), 
    State)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.zipCode'), 
    Zipcode)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.phoneNumber'), 
    PhoneNumber)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.ssn'), 
    '123')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.username'), 
    'EFG')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.password'), 
    'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_repeatedPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_button'))

