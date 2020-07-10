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

WebUI.openBrowser('https://admin.ideabank.ua/uk/admin/structure/webform/submissions/manage')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Admin/Page_  -   Idea Bank    ideabankua/a_'))

WebUI.setText(findTestObject('Admin/Login/Name'), 'Admin')

WebUI.setText(findTestObject('Admin/Login/Pass'), 'Mt$^BoqeCrBI')

WebUI.click(findTestObject('Admin/Login/Enter button'), FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://admin.ideabank.ua/uk/admin/structure/webform/submissions/manage')

WebUI.setText(findTestObject('Admin/Page_-  Idea Bank/input_ _search'), 'Тест Тест Тест')

WebUI.click(findTestObject('Admin/Page_-  Idea Bank/input__op'))

