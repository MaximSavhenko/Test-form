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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ideabank.ua/uk')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_  -   Idea Bank    ideabankua/button_'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_  -   Idea Bank    ideabankua/input_  _pib'), '639348839')

WebUI.sendKeys(findTestObject('Page_  -   Idea Bank    ideabankua/input_  _pib'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_  -   Idea Bank    ideabankua/input_  _pib'), Keys.chord(Keys.CONTROL, 'x'))

WebUI.click(findTestObject('Page_  -   Idea Bank    ideabankua/input__phone'))

WebUI.sendKeys(findTestObject('Page_  -   Idea Bank    ideabankua/input__phone'), Keys.chord(Keys.CONTROL, 'v'))

WebUI.setText(findTestObject('Page_  -   Idea Bank    ideabankua/input_  _pib'), 'Тест Тест Тест')

WebUI.setText(findTestObject('Page_  -   Idea Bank    ideabankua/input__inn'), '2255710298')

WebUI.click(findTestObject('Page_  -   Idea Bank    ideabankua/div_ _select__indicator select__dropdown-in_5a3d99'))

WebUI.click(findTestObject('Page_  -   Idea Bank    ideabankua/div_ ()'))

WebUI.setText(findTestObject('Page_  -   Idea Bank    ideabankua/input_ ()_mail'), 'test.qa.wise@gmail.com')

WebUI.click(findTestObject('Page_  -   Idea Bank    ideabankua/Page_  -   Idea Bank    ideabankua/input_concat(      )_personal_data'))

