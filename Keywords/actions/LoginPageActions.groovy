package actions

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import actions.WebsitePagesLinks
public class LoginPageActions {


	def enterEmail(String email) {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise -  LoginPage/input_Login to your account_email'), email)
	}

	def enterPassword(String Password) {
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Exercise -  LoginPage/input_Login to your account_password'), Password)
	}

	def clickLogin() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise -  LoginPage/button_Login to your account_btn btn-default'))
	}

	public static void fillLoginForm(String password, String email) {

		LoginPageActions loginPage = new LoginPageActions()
		loginPage.enterEmail(email)
		loginPage.enterPassword(password)
	}


	public static void loginWithUser(String email, String password) {
		WebsitePagesLinks.SignUpLogin()
		LoginPageActions loginPage = new LoginPageActions()
		fillLoginForm(password, email)
		loginPage.clickLogin()
	}
}
