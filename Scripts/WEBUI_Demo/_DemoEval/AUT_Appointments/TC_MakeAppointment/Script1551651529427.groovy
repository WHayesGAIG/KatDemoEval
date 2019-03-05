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

WebUI.callTestCase(findTestCase('WEBUI_Demo/_DemoEval/AUT_Appointments/TC_LoginFailure'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('otherPage/selectBoxForHealthCareCenter'), 'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/otherPage/input_Apply for hospital readmission_hospital_readmission'))

WebUI.click(findTestObject('Object Repository/otherPage/input_None_programs'))

WebUI.click(findTestObject('Object Repository/otherPage/span_Visit Date (Required)_glyphicon glyphicon-calendar'))

WebUI.click(findTestObject('Object Repository/otherPage/td_16'))

WebUI.setText(findTestObject('Object Repository/otherPage/textarea_Comment_comment'), 'Comment goes right here')

WebUI.click(findTestObject('Object Repository/otherPage/button_Book Appointment'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.closeBrowser()

