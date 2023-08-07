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

WebUI.navigateToUrl('https://www.careinsurance.com/robots.txt')

WebUI.verifyElementPresent(findTestObject('Robots.txt'), 0)

result = WebUI.getText(findTestObject('Robots.txt'))

println(result)

def expectedText  = '''#robots.txt for https://www.careinsurance.com/
User-agent: *
Disallow: /religare/
Disallow: /religarecp/
Allow: /religarecp/assets/
Allow: /religarecp/cpjs/
Disallow: /proposalcp/
Allow: /proposalcp/newdesign/css/
Allow: /proposalcp/newdesign/css/js/
Allow: /proposalcp/newdesign/css/js/images/
Disallow: /rhicl/
Allow: /rhicl/public/
Allow: /rhicl/careers
Allow: /rhicl/proposalcp/renew/index-care
Allow: /rhicl/login/register
Allow: /rhicl/hospital-empanelment
Allow: /rhicl/claim/login
Disallow: /cms/
Allow: /cms/public/
Disallow: /*?*
Allow: /assets/
Allow: /cpjs/
Disallow: /resource/
Disallow: /siteupload/
Disallow: /religarehrcrm/
Disallow: /religarehr/
Disallow: /*.csv$
Disallow: /*.php$

Disallow: /rhicl/api/sendLink
Disallow: /rhicl/branch-locator/getCity
Disallow: /rhicl/network-locator/getCity
Disallow: /rhicl/network-locator/sendemail
Disallow: /rhicl/ps/fetch-city-and-state-by-pincode
Disallow: /rhicl/qc/good-health-plus/products

Sitemap:https://www.careinsurance.com/sitemap.xml'''

def actualContent = WebUI.getText(findTestObject('Robots.txt'))

WebUI.verifyMatch(actualContent, expectedText, false)

WebUI.closeBrowser()



