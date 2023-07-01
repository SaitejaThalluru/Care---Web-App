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

WebUI.setText(findTestObject('Object Repository/Validations/Page_1 Crore Health Insurance Plan Buy Affo_4ec2a0/input_Claim Support_mobile_no'), 
    '8765345678')

WebUI.click(findTestObject('Object Repository/Validations/Page_1 Crore Health Insurance Plan Buy Affo_4ec2a0/button_Calculate Premium'))

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/label_Self'))

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/a_Continue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/p_Please select atleast one member'), 
    0)

WebUI.verifyElementText(findTestObject('Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/p_Please select atleast one member'), 
    'Please select atleast one member')

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/label_Self'))

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/label_Spouse'))

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/label_Son-'))

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/label_Daughter-'))

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/label_Father'))

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/label_Mother'))

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/a_Continue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/p_Maximum 2 adults are allowed'), 
    0)

WebUI.verifyElementText(findTestObject('Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/p_Maximum 2 adults are allowed'), 
    'Maximum 2 adults are allowed.')

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/label_Mother'))

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/label_Father'))

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/label_Daughter-'))

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/label_Son-'))

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/label_Spouse'))

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/a_Continue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/p_Please select the eldest member age'), 
    0)

WebUI.verifyElementText(findTestObject('Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/p_Please select the eldest member age'), 
    'Please select the eldest member age.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/select_Select age5-17 Years18-24 Years25-35_2c9cec'), 
    '25', true)

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/a_Continue'))

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/a_View Quote'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/p_Please enter a valid citypincode'), 
    0)

WebUI.verifyElementText(findTestObject('Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/p_Please enter a valid citypincode'), 
    'Please enter a valid city/pincode')

WebUI.verifyElementPresent(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/p_Please select a citizenship status'), 
    0)

WebUI.setText(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/input_Help us with your city_city_name'), 
    '524404')

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/li_Balayapalle'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/select_Select Insured CitizenshipResident I_f112a3'), 
    'Resident Indian', true)

WebUI.click(findTestObject('Object Repository/Validations/Page_Care Advantage- A Health Insurance Pla_ee32b2/a_View Quote'))

WebUI.click(findTestObject('Object Repository/Validations/Page_Quote Details/button_BUY NOW'))

WebUI.click(findTestObject('Object Repository/Validations/Page_Fill Details - Care Advantage  Care He_6dd95f/button_Next'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Validations/Page_Fill Details - Care Advantage  Care He_6dd95f/span_Kindly select one option for doing KYC'), 
    0)

WebUI.click(findTestObject('Object Repository/Validations/Page_Fill Details - Care Advantage  Care He_6dd95f/span_Aadhaar ( Last 4 digits of Aadhaar )_r_8eb722'))

WebUI.click(findTestObject('Object Repository/Validations/Page_Fill Details - Care Advantage  Care He_6dd95f/button_Next'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Validations/Page_Fill Details - Care Advantage  Care He_6dd95f/span_Kindly fill the required details'), 
    0)

WebUI.verifyElementText(findTestObject('Validations/Page_Fill Details - Care Advantage  Care He_6dd95f/span_Kindly fill the required details'), 
    'Kindly fill the required details *')

WebUI.closeBrowser()

