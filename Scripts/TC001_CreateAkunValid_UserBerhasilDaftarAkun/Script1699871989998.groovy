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

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stage.mobipaid.com/en/register')

WebUI.setText(findTestObject('Object Repository/Page_Register/first_name_input'), 'Evi')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_signatory_last_name'), '')

WebUI.click(findTestObject('Object Repository/Page_Register/input_Login_signatory_last_name'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_signatory_last_name'), 'Silaen')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_email'), 'rossasilaen03@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_password'), '5SxhS6Y8Ww/5jLgcFrosOg==')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_name'), 'AB')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_land Islands_form-control btn-log bor_48151b'), '85280184374')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Your country                        _da403c'), 
    'Your country', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Your country                        _da403c'), 
    '9', true)

WebUI.setText(findTestObject('Object Repository/Page_Register/input_land Islands_state'), 'Jakarta Selatan')

WebUI.click(findTestObject('Object Repository/Page_Register/input_By clicking this box, I accept the,an_f76ab8'))

WebUI.click(findTestObject('Object Repository/Page_Register/button_Next Step   please wait'))

