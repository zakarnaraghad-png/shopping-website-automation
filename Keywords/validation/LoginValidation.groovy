package validation

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject


class LoginValidation {

	public static TestObject WrongEmailorPasswordMessage() {
		return findTestObject(
				'Object Repository/Page_Automation Exercise - Signup  Login Validation objects/Your email or password is incorrect'
				)
	}

	@Keyword
	public static void validateSuccessfulLogin() {

		WebUI.verifyElementNotPresent(WrongEmailorPasswordMessage(),5)

		WebUI.comment("LOGIN SUCCESSFUL: User is logged in")
	}

	@Keyword
	public static void validateLoginFailed() {

		WebUI.verifyElementVisible(WrongEmailorPasswordMessage())

		WebUI.comment("LOGIN FAILED: Error message displayed")
	}
}
