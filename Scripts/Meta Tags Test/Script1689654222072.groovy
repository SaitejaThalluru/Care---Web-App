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

// Verification of Tags presence and Content - Title, ViewPort, Charset, Canonical, Description, Robots
	

WebUI.verifyElementPresent(findTestObject('Meta Tags - Test Objects/Meta-Charset'), 0)

WebUI.verifyElementPresent(findTestObject('Meta Tags - Test Objects/Meta- ViewPort Tag'), 0)
def viewPort = WebUI.getAttribute(findTestObject('Meta Tags - Test Objects/Meta- ViewPort Tag'), 'content')
assert viewPort == 'width=device-width, initial-scale=1.0'

WebUI.verifyElementPresent(findTestObject('Meta Tags - Test Objects/Title Tag'), 0)

WebUI.verifyElementPresent(findTestObject('Meta Tags - Test Objects/Meta - Description Tag'), 0)
def description = WebUI.getAttribute(findTestObject('Meta Tags - Test Objects/Meta - Description Tag'), 'content')
assert description == 'Buy 1 Crore Health Insurance Policy with in-patient care, daycare treatment and pre & post-hospitalisation cover at an affordable premium with tax benefits under section 80D.'

WebUI.verifyElementPresent(findTestObject('Meta Tags - Test Objects/Meta - Canonical Tag'), 0)
def canonical = WebUI.getAttribute(findTestObject('Meta Tags - Test Objects/Meta - Canonical Tag'), 'href')
assert canonical == 'https://www.careinsurance.com/health-insurance/1-crore-health-insurance'

WebUI.verifyElementPresent(findTestObject('Meta Tags - Test Objects/Meta - Robots Tag'), 0)
def robots = WebUI.getAttribute(findTestObject('Meta Tags - Test Objects/Meta - Robots Tag'), 'content')
assert robots == 'index, follow'

// Verification of Open Graph Tags - type, title, description, URL, siteName

WebUI.verifyElementPresent(findTestObject('Meta Tags - Test Objects/OG - Type'), 0)
def ogType = WebUI.getAttribute(findTestObject('Meta Tags - Test Objects/OG - Type'), 'content')
assert ogType == 'website'

WebUI.verifyElementPresent(findTestObject('Meta Tags - Test Objects/OG - Title'), 0)
def ogTitle = WebUI.getAttribute(findTestObject('Meta Tags - Test Objects/OG - Title'), 'content')
assert ogTitle == '1 Crore Health Insurance Plan: Buy Affordable 1 Cr Health Policy'

WebUI.verifyElementPresent(findTestObject('Meta Tags - Test Objects/OG - Description'), 0)
def ogDescription = WebUI.getAttribute(findTestObject('Meta Tags - Test Objects/OG - Description'), 'content')
assert ogDescription == 'Buy 1 Crore Health Insurance Policy with in-patient care, daycare treatment and pre & post-hospitalisation cover at an affordable premium with tax benefits under section 80D.'

WebUI.verifyElementPresent(findTestObject('Meta Tags - Test Objects/OG - URL'), 0)
def ogURL = WebUI.getAttribute(findTestObject('Meta Tags - Test Objects/OG - URL'), 'content')
assert ogURL == 'https://www.careinsurance.com/health-insurance/1-crore-health-insurance'

WebUI.verifyElementPresent(findTestObject('Meta Tags - Test Objects/OG - siteName'), 0)
def ogSiteName = WebUI.getAttribute(findTestObject('Meta Tags - Test Objects/OG - siteName'), 'content')
assert ogSiteName == 'Care Insurance'

//Verification of Twitter Tags - card, tile, site, description

WebUI.verifyElementPresent(findTestObject('Meta Tags - Test Objects/Twitter Tags - Card Tag'), 0)

WebUI.verifyElementPresent(findTestObject('Meta Tags - Test Objects/Twitter Cards - Site'), 0)

WebUI.verifyElementPresent(findTestObject('Meta Tags - Test Objects/Twitter Tags - Title'), 0)

WebUI.verifyElementPresent(findTestObject('Meta Tags - Test Objects/Twitter Tags - Description'), 0)

WebUI.closeBrowser()

