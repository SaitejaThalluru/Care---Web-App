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

WebUI.click(findTestObject('Object Repository/Articles2/Page_1 Crore Health Insurance Plan Buy Affo_4ec2a0/a_Blog'))

WebUI.click(findTestObject('Object Repository/Articles2/Page_Health and Travel Insurance Articles/a_The Ultimate Guide to Organ Donation and _8c5d41'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Articles2/Page_Guide to Organ Donation and Transplantation/img_Views_img-fluid rounded main-image'), 
    0)

int scrollPosition = 0

int scrollIncrement = 500

int totalScrolls = 9

for (int i = 0; i < totalScrolls; i++) {
    scrollPosition = (scrollPosition + scrollIncrement)

    String scrollScript = "window.scrollTo(0, $scrollPosition)"

    WebUI.executeJavaScript(scrollScript, null)

    WebUI.takeScreenshot()

    WebUI.delay(1)

    WebUI.scrollToPosition(0, 0)
}

WebUI.closeBrowser()

