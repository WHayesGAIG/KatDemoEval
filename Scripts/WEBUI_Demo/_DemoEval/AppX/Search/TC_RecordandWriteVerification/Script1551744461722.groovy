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

'URL for demo site'
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

'text im looking for here'
WebUI.verifyElementText(findTestObject('Page_CURA Healthcare Service/strong_CURA Healthcare Service'), 'CURA Healthcare Service')

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

'Valid username'
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

'Use a valid pswd - Note the Password has been encrypted here ... woohoo!'
WebUI.setEncryptedText(findTestObject('Page_CURA Healthcare Service/input_Password_password'), 'I474VAixgZjVtcCCRsKxXQKA2HsH6T4T')

'this is the desc of what this step does'
WebUI.click(findTestObject('Page_CURA Healthcare Service/whbutton_Login'))

WebUI.closeBrowser()

