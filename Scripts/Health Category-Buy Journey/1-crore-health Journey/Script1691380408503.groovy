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

WebUI.setText(findTestObject('Object Repository/Positive Journey/Page_1 Crore Health Insurance Plan Buy Affo_4ec2a0/input_Claim and Customer Support_mobile_no'), 
    '7856456789')

WebUI.click(findTestObject('Object Repository/Positive Journey/Page_1 Crore Health Insurance Plan Buy Affo_4ec2a0/button_Calculate Premium'))

WebUI.click(findTestObject('Object Repository/Positive Journey/Page_Care Advantage- A Health Insurance Pla_ee32b2/a_Continue'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Positive Journey/Page_Care Advantage- A Health Insurance Pla_ee32b2/select_self age18 Yr19 Yr20 Yr21 Yr22 Yr23 _a54acf'), 
    '22', true)

WebUI.waitForElementClickable(findTestObject('Continue - Age'), 0)

WebUI.click(findTestObject('Continue - Age'))

WebUI.setText(findTestObject('Object Repository/Positive Journey/Page_Care Advantage- A Health Insurance Pla_ee32b2/input_Help us with your city_city_name'), 
    '524404')

WebUI.click(findTestObject('Object Repository/Positive Journey/Page_Care Advantage- A Health Insurance Pla_ee32b2/li_Balayapalle'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Positive Journey/Page_Care Advantage- A Health Insurance Pla_ee32b2/select_Select Insured CitizenshipResident I_f112a3'), 
    'Resident Indian', true)

WebUI.click(findTestObject('Object Repository/Positive Journey/Page_Care Advantage- A Health Insurance Pla_ee32b2/a_View Quote'))

WebUI.click(findTestObject('Object Repository/Positive Journey/Page_Quote Details/button_BUY NOW'))

WebUI.click(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care Advantage  Care He_6dd95f/span_Aadhaar ( Last 4 digits of Aadhaar )_r_8eb722'))

WebUI.setText(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care Advantage  Care He_6dd95f/input_AADHAR NO_aadhar_no'), 
    '3913')

WebUI.setText(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care Advantage  Care He_6dd95f/input_FULL NAME AS PER AADHAR_aadhar_name'), 
    'Thalluru Saiteja')

WebUI.setText(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care Advantage  Care He_6dd95f/input_DATE OF BIRTH_aadhar_dob'), 
    '12051998')

WebUI.click(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care Advantage  Care He_6dd95f/button_VERIFY'))

WebUI.click(findTestObject('Complete Form/Page_Fill Details - Care  Care Health Insurance/button_VERIFY'))

WebUI.setText(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care Advantage  Care He_6dd95f/input_Last Name_last_name'), 
    'Teja')

WebUI.click(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care Advantage  Care He_6dd95f/a_Continue with detailed form to pay'))

WebUI.setText(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care  Care Health Insurance/input_Email_email_id'), 
    'thejachowdary282@gmail.com')

WebUI.setText(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care  Care Health Insurance/input_Emergency Contact No_EmergencyMobileNumber'), 
    '9994641265')

WebUI.setText(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care  Care Health Insurance/input_Address line 1_addressLine1'), 
    '1-1-31')

WebUI.setText(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care  Care Health Insurance/input_Landmark_landmark'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care  Care Health Insurance/input_Same as permanent address_cores_address'))

WebUI.setText(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care  Care Health Insurance/input_Name_nominee_name'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care  Care Health Insurance/div_Choose Relation'))

WebUI.click(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care  Care Health Insurance/li_Brother'))

WebUI.setText(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care  Care Health Insurance/input_Nominee DOB_nomineeDob'), 
    '11111996')

WebUI.click(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care  Care Health Insurance/button_Next'))

WebUI.setText(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care  Care Health Insurance/input_Height_insured_members1height_feet'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care  Care Health Insurance/input__insured_members1height_inches'), 
    '11')

WebUI.setText(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care  Care Health Insurance/input_Weight_insured_members1weight'), 
    '67')

WebUI.click(findTestObject('Button - Next'))

WebUI.click(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care  Care Health Insurance/span'))

WebUI.click(findTestObject('CheckBox TC'))

WebUI.click(findTestObject('CheckBox TC2'))

WebUI.click(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care  Care Health Insurance/button_Next_1'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care  Care Health Insurance/button_PROCEED TO PAY'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Positive Journey/Page_Fill Details - Care  Care Health Insurance/button_PROCEED TO PAY'), 
    0)

WebUI.closeBrowser()

