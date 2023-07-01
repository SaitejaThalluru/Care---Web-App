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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.careinsurance.com/health-insurance/1-crore-health-insurance')

WebUI.click(findTestObject('Object Repository/Page_1 Crore Health Insurance Plan Buy Affo_4ec2a0/a_contact us'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_How we can help you  WhatsApp Chat Sup_45a006/p_Know About thePolicy'), 
    0)

WebUI.waitForPageLoad(30)
int scrollPosition = 0

int scrollIncrement = 500

int totalScrolls = 5

for (int i = 0; i < totalScrolls; i++) {
	scrollPosition = scrollPosition + scrollIncrement
	String scrollScript = "window.scrollTo(0, ${scrollPosition})"
	WebUI.executeJavaScript(scrollScript, null)
	WebUI.takeScreenshot()
	WebUI.delay(1)
	WebUI.scrollToPosition(0,0)
}

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_How we can help you  WhatsApp Chat Sup_45a006/div_RenewYour Policy                       _ca8714'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_How we can help you  WhatsApp Chat Sup_45a006/a_Claim Filing and Tracking                _242460'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_How we can help you  WhatsApp Chat Sup_45a006/div_Change in Policy Details               _8ea001'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_How we can help you  WhatsApp Chat Sup_45a006/img_Download the Care Health Insurance - Cu_d02ecd'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_How we can help you  WhatsApp Chat Sup_45a006/p_Managing your Care Health Insurance polic_80c6f5'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_How we can help you  WhatsApp Chat Sup_45a006/span_'))

WebUI.click(findTestObject('Object Repository/Page_How we can help you  WhatsApp Chat Sup_45a006/span_8860402452'))

WebUI.switchToWindowTitle('Share on WhatsApp')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Share on WhatsApp/a_Continue to Chat'), 0)

WebUI.switchToWindowTitle('How we can help you | WhatsApp Chat Support 8860402452')

WebUI.click(findTestObject('Object Repository/Page_How we can help you  WhatsApp Chat Sup_45a006/a_Click here'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_How we can help you  WhatsApp Chat Sup_45a006/div_Good MorningWelcome to Care Health Insurances Chat Service Tell me, what can I help you with today'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_How we can help you  WhatsApp Chat Sup_45a006/svg'))

WebUI.click(findTestObject('Object Repository/Page_How we can help you  WhatsApp Chat Sup_45a006/a_Click here_1'))

int scrollPosition1 = 0

int scrollIncrement1 = 500

int totalScrolls1 = 5

for (int i = 0; i < totalScrolls; i++) {
	scrollPosition1 = scrollPosition1 + scrollIncrement1
	String scrollScript1 = "window.scrollTo(0, ${scrollPosition1})"
	WebUI.executeJavaScript(scrollScript1, null)
	WebUI.takeScreenshot()
	WebUI.delay(1)
	WebUI.scrollToPosition(0,0)
}

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Customer Support - Self Help Portal  C_31d299/a_Show PolicyDetails'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Customer Support - Self Help Portal  C_31d299/a_Policy Certificate - Soft Copy'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Customer Support - Self Help Portal  C_31d299/a_Policy Terms Conditions'), 
    0)

WebUI.closeBrowser()

