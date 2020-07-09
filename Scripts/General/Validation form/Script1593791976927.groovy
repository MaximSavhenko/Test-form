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

WebUI.openBrowser('https://ideabank.ua/uk')

WebUI.click(findTestObject('Page_ - Idea Bank GENERAL/div_   10 000 60   51542'))

WebUI.click(findTestObject('Page_ - Idea Bank GENERAL/button_'))

WebUI.setText(findTestObject('Page_ - Idea Bank GENERAL/input_  _pib'), '&&&&&&')

WebUI.doubleClick(findTestObject('Page_ - Idea Bank GENERAL/input_  _pib'))

WebUI.setText(findTestObject('Page_ - Idea Bank GENERAL/input_  _pib'), 'Тест Тест Тест')

WebUI.click(findTestObject('Page_ - Idea Bank GENERAL/input_  _pib'))

WebUI.doubleClick(findTestObject('Page_ - Idea Bank GENERAL/input_  _pib'))

WebUI.setText(findTestObject('Page_ - Idea Bank GENERAL/input_  _pib'), '')

WebUI.setText(findTestObject('Page_ - Idea Bank GENERAL/input_concat(    )_phone'), '+38 (011) 111-11-11')

WebUI.click(findTestObject('Page_ - Idea Bank GENERAL/input_  _inn'))

WebUI.setText(findTestObject('Page_ - Idea Bank GENERAL/input_concat(    )_phone'), '+38 (093) 111-11-11')

WebUI.click(findTestObject('Page_ - Idea Bank GENERAL/input_  _inn'))

WebUI.setText(findTestObject('Page_ - Idea Bank GENERAL/input_concat(    )_phone'), '+38 (093) 011-11-1_')

WebUI.click(findTestObject('Page_ - Idea Bank GENERAL/input_  _inn'))

WebUI.click(findTestObject('Page_ - Idea Bank GENERAL/input_  _inn'))

WebUI.setText(findTestObject('Page_ - Idea Bank GENERAL/input_concat(    )_phone'), '+38 (093) 014-43-86')

WebUI.click(findTestObject('Page_ - Idea Bank GENERAL/input_  _inn'))

WebUI.setText(findTestObject('Page_ - Idea Bank GENERAL/input_concat(    )_phone'), '+38 (0__) ___-__-__')

WebUI.setText(findTestObject('Page_ - Idea Bank GENERAL/input_  _inn'), '1111111111')

WebUI.setText(findTestObject('Page_ - Idea Bank GENERAL/input_concat(      )_react-select-5-input'), 
    'Пе')

WebUI.click(findTestObject('Page_ - Idea Bank GENERAL/div_c'))

WebUI.setText(findTestObject('Page_ - Idea Bank GENERAL/input_c_mail'), '11112222222222222222222222222222222222')

WebUI.click(findTestObject('Page_ - Idea Bank GENERAL/button_ _1'))

WebUI.setText(findTestObject('Page_ - Idea Bank GENERAL/input_c_mail'), 'test.qa.wise@gmail.com')

WebUI.click(findTestObject('Page_ - Idea Bank GENERAL/button_ _1'))

