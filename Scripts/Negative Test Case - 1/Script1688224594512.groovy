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

WebUI.setText(findTestObject('Object Repository/Negative Test Case - Buy Now/Page_1 Crore Health Insurance Plan Buy Affo_4ec2a0/input_Claim Support_mobile_no'), 
    '8919396555')

WebUI.click(findTestObject('Object Repository/Negative Test Case - Buy Now/Page_1 Crore Health Insurance Plan Buy Affo_4ec2a0/button_Calculate Premium'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negative Test Case - Buy Now/Page_Care Advantage- A Health Insurance Pla_ee32b2/select_Select age5-17 Years18-24 Years25-35_2c9cec'), 
    '25', true)

WebUI.click(findTestObject('Object Repository/Negative Test Case - Buy Now/Page_Care Advantage- A Health Insurance Pla_ee32b2/a_Continue'))

WebUI.setText(findTestObject('Object Repository/Negative Test Case - Buy Now/Page_Care Advantage- A Health Insurance Pla_ee32b2/input_Help us with your city_city_name'), 
    '524404')

WebUI.click(findTestObject('Object Repository/Negative Test Case - Buy Now/Page_Care Advantage- A Health Insurance Pla_ee32b2/li_Balayapalle'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negative Test Case - Buy Now/Page_Care Advantage- A Health Insurance Pla_ee32b2/select_Select Insured CitizenshipResident I_f112a3'), 
    'Resident Indian', true)

WebUI.click(findTestObject('Object Repository/Negative Test Case - Buy Now/Page_Care Advantage- A Health Insurance Pla_ee32b2/a_View Quote'))

WebUI.click(findTestObject('Object Repository/Negative Test Case - Buy Now/Page_Quote Details/div_ADDITIONAL COVERS'))

WebUI.click(findTestObject('Object Repository/Negative Test Case - Buy Now/Page_Quote Details/img__lozad care_spritepencil-icon'))

WebUI.click(findTestObject('Object Repository/Negative Test Case - Buy Now/Page_Quote Details/span_'))

WebUI.click(findTestObject('Object Repository/Negative Test Case - Buy Now/Page_Quote Details/label_0'))

WebUI.click(findTestObject('Object Repository/Negative Test Case - Buy Now/Page_Quote Details/p_BUY NOW'))

WebUI.click(findTestObject('Object Repository/Negative Test Case - Buy Now/Page_Quote Details/span_Female_loking_inure_dot'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Negative Test Case - Buy Now/Page_Quote Details/span_Please select at least one insured member'), 
    0)

WebUI.closeBrowser()

