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

WebUI.navigateToUrl('https://www.careinsurance.com/health-insurance/1-crore-health-insurance')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Contact Us/Page_1 Crore Health Insurance Plan Buy Affo_4ec2a0/a_contact us'))

WebUI.click(findTestObject('Object Repository/Contact Us/Page_How we can help you  WhatsApp Chat Sup_45a006/img_Download the Care Health Insurance - Cu_d02ecd'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Contact Us/Page_How we can help you  WhatsApp Chat Sup_45a006/input__sendLinkMob'), 
    0)

WebUI.click(findTestObject('Object Repository/Contact Us/Page_How we can help you  WhatsApp Chat Sup_45a006/span_'))

WebUI.click(findTestObject('Object Repository/Contact Us/Page_How we can help you  WhatsApp Chat Sup_45a006/span_8860402452'))

WebUI.switchToWindowTitle('Share on WhatsApp')

WebUI.waitForElementPresent(findTestObject('Object Repository/Contact Us/Page_Share on WhatsApp/a_Continue to Chat'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Contact Us/Page_Share on WhatsApp/a_Continue to Chat'), 0)

WebUI.switchToWindowTitle('How we can help you | WhatsApp Chat Support 8860402452')

WebUI.click(findTestObject('Object Repository/Contact Us/Page_How we can help you  WhatsApp Chat Sup_45a006/a_Click here'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Contact Us/Page_How we can help you  WhatsApp Chat Sup_45a006/div_CARE Insurance Live chat'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Contact Us/Page_How we can help you  WhatsApp Chat Sup_45a006/div_CARE Insurance Live chat'), 
    0)

WebUI.click(findTestObject('Object Repository/Contact Us/Page_How we can help you  WhatsApp Chat Sup_45a006/h2_CARE Insurance Live chat'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Contact Us/Page_How we can help you  WhatsApp Chat Sup_45a006/button_Download cashless card'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Contact Us/Page_How we can help you  WhatsApp Chat Sup_45a006/button_Update your Details'), 
    0)

WebUI.click(findTestObject('Object Repository/Contact Us/Page_How we can help you  WhatsApp Chat Sup_45a006/div_CARE Insurance Live chat_d_hotline minimize'))

WebUI.click(findTestObject('Object Repository/Contact Us/Page_How we can help you  WhatsApp Chat Sup_45a006/a_Click here_1'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Contact Us/Page_Customer Support - Self Help Portal  C_31d299/a_Policy Certificate - Soft Copy'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Contact Us/Page_Customer Support - Self Help Portal  C_31d299/a_Policy Certificate - Soft Copy'), 
    0)

WebUI.closeBrowser()

