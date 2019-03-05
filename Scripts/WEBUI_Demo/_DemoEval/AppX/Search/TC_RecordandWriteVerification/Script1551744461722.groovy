import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.verifyElementText(findTestObject('Page_CURA Healthcare Service/strong_CURA Healthcare Service'), 'CURA Healthcare ServiceWH', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Page_CURA Healthcare Service/input_Password_password'), 'I474VAixgZjVtcCCRsKxXQKA2HsH6T4T')

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))

WebUI.closeBrowser()
