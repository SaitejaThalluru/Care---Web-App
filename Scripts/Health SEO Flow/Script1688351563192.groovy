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

WebUI.navigateToUrl('https://www.careinsurance.com/health-insurance/cr/chi-health-insurance-plans-new.html?agentId=20004977&utm_source=google&utm_medium=cpc&utm_campaign=ht_ind_new-101_AD_CR_MB&utm_content=eta&utm_keyword=care%20health%20insurance&s_kwcid=AL!10397!3!599158986150!e!!g!!care%20health%20insurance&utm_term=11058545985&utm_adgroup=107793228185&gad=1&gclid=Cj0KCQjwqNqkBhDlARIsAFaxvwyeQ5u0OQs1YFkNUsQjnYhd33RofwCDtYTkE2GNVfEKRBgsOY-eOrgaAr-REALw_wcB')

WebUI.setText(findTestObject('Object Repository/Health SEO/Page_Buy Care Health Insurance Plans Online/input_Buy Care Health Insurance Online_mobile_no'), 
    '8919396555')

WebUI.click(findTestObject('Object Repository/Health SEO/Page_Buy Care Health Insurance Plans Online/a_Calculate Premium'))

WebUI.click(findTestObject('Object Repository/Health SEO/Page_Buy Care Health Insurance Plans Online/a_Continue'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Health SEO/Page_Buy Care Health Insurance Plans Online/select_self age18 Years19 Years20 Years21 Y_3e7bf3'), 
    '26', true)

WebUI.click(findTestObject('continue 2'))

WebUI.setText(findTestObject('Object Repository/Health SEO/Page_Buy Care Health Insurance Plans Online/input_Help us with your pincode_pin_code'), 
    '524404')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Health SEO/Page_Buy Care Health Insurance Plans Online/a_View Quote'))

WebUI.click(findTestObject('Object Repository/Health SEO/Page_Quote Details/button_BUY NOW'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Health SEO/Page_Fill Details - Care Supreme  Care Heal_dbbcb6/h2_Confirm Proposer Details'), 
    0)

WebUI.click(findTestObject('Object Repository/Health SEO/Page_Fill Details - Care Supreme  Care Heal_dbbcb6/span_Aadhaar ( Last 4 digits of Aadhaar )_r_8eb722'))

WebUI.setText(findTestObject('Object Repository/Health SEO/Page_Fill Details - Care Supreme  Care Heal_dbbcb6/input_AADHAR NO_aadhar_no'), 
    '3913')

WebUI.setText(findTestObject('Object Repository/Health SEO/Page_Fill Details - Care Supreme  Care Heal_dbbcb6/input_FULL NAME AS PER AADHAR_aadhar_name'), 
    'Thalluru Saiteja')

WebUI.setText(findTestObject('Object Repository/Health SEO/Page_Fill Details - Care Supreme  Care Heal_dbbcb6/input_DATE OF BIRTH_aadhar_dob'), 
    '12051998')

WebUI.click(findTestObject('Object Repository/Health SEO/Page_Fill Details - Care Supreme  Care Heal_dbbcb6/button_VERIFY'))

WebUI.click(findTestObject('Object Repository/Health SEO/Page_Fill Details - Care Supreme  Care Heal_dbbcb6/button_VERIFY'))

WebUI.setText(findTestObject('Object Repository/Health SEO/Page_Fill Details - Care Supreme  Care Heal_dbbcb6/input_Last Name_last_name'), 
    'Saiteja')

WebUI.click(findTestObject('Object Repository/Health SEO/Page_Fill Details - Care Supreme  Care Heal_dbbcb6/button_Next'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Health SEO/Page_Care Payment/h4_Enter Your Card Details'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Health SEO/Page_Care Payment/h4_Enter Your Card Details'), 
    0)

WebUI.closeBrowser()

