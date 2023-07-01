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

int scrollPosition = 0

int scrollIncrement = 500

int totalScrolls = 8

for (int i = 0; i < totalScrolls; i++) {
	scrollPosition = scrollPosition + scrollIncrement
	String scrollScript = "window.scrollTo(0, ${scrollPosition})"
	WebUI.executeJavaScript(scrollScript, null)
	WebUI.takeScreenshot()
	WebUI.delay(1)
	WebUI.scrollToPosition(0,0)
}

WebUI.setText(findTestObject('Object Repository/Complete Form/Page_1 Crore Health Insurance Plan Buy Affo_4ec2a0/input_Claim Support_mobile_no'), 
    '8767876545')

WebUI.click(findTestObject('Object Repository/Complete Form/Page_1 Crore Health Insurance Plan Buy Affo_4ec2a0/button_Calculate Premium'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Complete Form/Page_Care Advantage- A Health Insurance Pla_ee32b2/select_Select age5-17 Years18-24 Years25-35_2c9cec'), 
    '25', true)

WebUI.click(findTestObject('Object Repository/Complete Form/Page_Care Advantage- A Health Insurance Pla_ee32b2/a_Continue'))

WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Care Advantage- A Health Insurance Pla_ee32b2/input_Help us with your city_city_name'), 
    '524404')

WebUI.click(findTestObject('Object Repository/Complete Form/Page_Care Advantage- A Health Insurance Pla_ee32b2/li_Balayapalle'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Complete Form/Page_Care Advantage- A Health Insurance Pla_ee32b2/select_Select Insured CitizenshipResident I_f112a3'), 
    'Resident Indian', true)

WebUI.click(findTestObject('Object Repository/Complete Form/Page_Care Advantage- A Health Insurance Pla_ee32b2/a_View Quote'))

WebUI.click(findTestObject('Object Repository/Complete Form/Page_Quote Details/button_BUY NOW'))

WebUI.click(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care Advantage  Care He_6dd95f/span_Aadhaar ( Last 4 digits of Aadhaar )_r_8eb722'))

WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care Advantage  Care He_6dd95f/input_AADHAR NO_aadhar_no'), 
    '3913')

WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care Advantage  Care He_6dd95f/input_FULL NAME AS PER AADHAR_aadhar_name'), 
    'Thalluru Saiteja')

WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care Advantage  Care He_6dd95f/input_DATE OF BIRTH_aadhar_dob'), 
    '12051998')

WebUI.click(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care Advantage  Care He_6dd95f/button_VERIFY'))

// WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care Advantage  Care He_6dd95f/input_First Name_first_name'), 
// 'Saiteja')
WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care Advantage  Care He_6dd95f/input_Last Name_last_name'), 
    'teja')

WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care Advantage  Care He_6dd95f/input_DOB of Eldest Insured Member_dob'), 
    '11111996')

WebUI.click(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care Advantage  Care He_6dd95f/a_Continue with detailed form to pay'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Complete Form/Page_Fill Details - Care  Care Health Insurance/input_Email_email_id'), 
    0)

WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/input_Email_email_id'), 
    'thejachowdary282@gmail.com')

WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/input_Emergency Contact No_EmergencyMobileNumber'), 
    '8789876567')

WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/input_Address line 1_addressLine1'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/input_Landmark_landmark'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/input_Same as permanent address_cores_address'))

WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/input_Name_nominee_name'), 
    'Abhijeet')

WebUI.click(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/div_Choose Relation'))

WebUI.click(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/li_Brother'))

WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/input_Nominee DOB_nomineeDob'), 
    '11111996')

// WebUI.click(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/span_Aadhaar ( Last 4 digits of Aadhaar )_r_8eb722'))
// WebUI.click(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/button_VERIFY'))
// WebUI.click(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/button_VERIFY'))
// WebUI.click(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/input_DATE OF BIRTH_aadhar_dob'))
// WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/input_FULL NAME AS PER AADHAR_aadhar_name'), 
// 'Thalluru Saiteja')
// WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/input_DATE OF BIRTH_aadhar_dob'), 
// '12051998')
// WebUI.click(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/button_VERIFY'))
WebUI.click(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/button_Next'))

WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/input_Height_insured_members1height_feet'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/input__insured_members1height_inches'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/input_Weight_insured_members1weight'), 
    '56')

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Next Button'), 0)

WebUI.click(findTestObject('Next Button'))

WebUI.click(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/span'))

WebUI.click(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/span_1'))

WebUI.click(findTestObject('Span_2'))

WebUI.click(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/button_Next_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Complete Form/Page_Fill Details - Care  Care Health Insurance/button_PROCEED TO PAY'))

WebUI.verifyElementPresent(findTestObject('Card Details Object'), 0)

WebUI.closeBrowser()

