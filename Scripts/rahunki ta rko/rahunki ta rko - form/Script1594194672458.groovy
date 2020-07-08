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

WebUI.navigateToUrl('https://ideabank.ua/ru/business/rahunki-ta-rko')

WebUI.maximizeWindow()

WebUI.click(findTestObject('rahunki ta rko/Page_/button_'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('rahunki ta rko/Page_/input_    _clname'), '639348839')

WebUI.sendKeys(findTestObject('rahunki ta rko/Page_/input_    _clname'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('rahunki ta rko/Page_/input_    _clname'), Keys.chord(Keys.CONTROL, 'x'))

WebUI.click(findTestObject('Page_  -   Idea Bank    ideabankua/input__phone'))

WebUI.sendKeys(findTestObject('Page_  -   Idea Bank    ideabankua/input__phone'), Keys.chord(Keys.CONTROL, 'v'))

WebUI.setText(findTestObject('rahunki ta rko/Page_/input_    _clname'), 'Тест Тест Тест')

WebUI.setText(findTestObject('rahunki ta rko/Page_/input_   _edrpou'), '00000000000000')

WebUI.click(findTestObject('rahunki ta rko/Page_/div__select__indicator select__dropdown-indicator css-1gtu0rj-indicatorContainer'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('rahunki ta rko/Page_/div_'))

WebUI.setText(findTestObject('rahunki ta rko/Page_/input__mail'), 'test.qa.wise@gmail.com')

WebUI.click(findTestObject('rahunki ta rko/Page_/input_  _personal_data'))

WebUI.click(findTestObject('rahunki ta rko/Page_/Page_/button_'))

