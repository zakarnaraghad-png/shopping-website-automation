package validation

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling

class SignUpValidation {

	public static TestObject getAccountAlreadyExistsMessage() {
		return findTestObject(
				'Object Repository/Page_Automation Exercise - Signup  Login/EmailAddressExitMssg'
				)
	}

	@Keyword
	public static void validateAccountAlreadyExists() {

		WebUI.verifyElementPresent(getAccountAlreadyExistsMessage(),5)

		WebUI.comment('ACCOUNT ALREADY EXISTS: validation passed')
	}
	@Keyword
	public static void validateAccountDoesNotExist() {

		WebUI.verifyElementNotPresent(
				getAccountAlreadyExistsMessage(),5)

		WebUI.comment('ACCOUNT DOES NOT EXIST: validation passed')
	}
}
