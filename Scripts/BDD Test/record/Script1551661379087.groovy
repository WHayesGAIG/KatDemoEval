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

WebUI.navigateToUrl('http://www.thetestingworld.com/testings/')

WebUI.setText(findTestObject('TestingWorld_LoginPage/username'), 'wandauser')

WebUI.setText(findTestObject('TestingWorld_LoginPage/email'), 'whayesgaig@gmail.com')

WebUI.setEncryptedText(findTestObject('TestingWorld_LoginPage/password'), '8SQVv/p9jVQvfbXQdyi7tg==')

WebUI.setEncryptedText(findTestObject('TestingWorld_LoginPage/cpassword'), '8SQVv/p9jVQvfbXQdyi7tg==')

WebUI.click(findTestObject('TestingWorld_LoginPage/datefield'))

WebUI.setText(findTestObject('TestingWorld_LoginPage/HomeOffice_phone'), '5131234467')

WebUI.click(findTestObject('TestingWorld_LoginPage/input_signup'))

WebUI.selectOptionByValue(findTestObject('TestingWorld_LoginPage/select_ChooseGender'), '2', true)

WebUI.selectOptionByValue(findTestObject('TestingWorld_LoginPage/select_Select Country'), '231', true)

WebUI.selectOptionByValue(findTestObject('TestingWorld_LoginPage/select_SelectState'), '3959', true)

WebUI.selectOptionByValue(findTestObject('TestingWorld_LoginPage/select_SelectCity'), '45606', true)

WebUI.setText(findTestObject('TestingWorld_LoginPage/input_AddressZip'), '45323')

WebUI.closeBrowser()

