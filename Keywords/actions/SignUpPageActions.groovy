package actions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class SignUpPageActions {

	// Instance methods
	def enterUsername(String username) {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_name'), username)
	}

	def enterEmail(String email) {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_email'), email)
	}

	def clickLogin() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/button_New User Signup_btn btn-default'))
	}

	def clickMr() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/input_Mr_id_gender1'))
	}

	def clickMrs() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/input_Mrs_id_gender2'))
	}

	def enterName(String name) {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/input__name'), name)
	}

	def enteremail(String email) {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/input__email'), email)
	}
	def enterPassword(String Password) {
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/input__password'), Password)
	}

	def enterDayOfBirth(String DayOfBirth) {
		WebUI.selectOptionByValue(
				findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/select_Date of Birth_days'),
				DayOfBirth,
				false)
	}

	def enterMonthOfBirth(String MonthOfBirth) {
		WebUI.selectOptionByValue(
				findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/select_Date of Birth_months'),
				MonthOfBirth,
				false)
	}
	def enterYearOfBirth(String YearOfBirth) {
		WebUI.selectOptionByValue(
				findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/select_Date of Birth_years'),
				YearOfBirth,
				false)
	}
	//HERE THE ADDRESS INFO
	def enterFirstName(String FirstName) {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/input__first_name'), FirstName)
	}

	def enterLastName(String LastName) {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/input__last_name'), LastName)
	}

	def enterCompany(String Company) {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/input_Company_company'), Company)
	}

	def enterAdd1(String Add1) {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/input_(Street address, P.O. Box, Company na_957d3e'), Add1)
	}

	def enterAdd2(String Add2) {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/input_Address 2_address2'), Add2)
	}

	def enterCountry(String Country) {
		WebUI.selectOptionByLabel(
				findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/select__country'),
				Country,
				false)
	}

	def enterState(String State) {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/input__state'), State)
	}

	def enterCity(String City) {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/input__city'), City)
	}

	def enterZipcode(String Zipcode) {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/input__zipcode'), Zipcode)
	}

	def enterMobile(String Mobile) {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/input__mobile_number'), Mobile)
	}
	def clickCreatAccount() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Signup/button__btn btn-default'))
	}
	public static void clickContinueAccountCreated() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise Signup Page2/Page_Automation Exercise - Account Created/a_Account Created_btn btn-primary'))
	}

	public static void fillSignUpPage1(String username, String email) {
		WebsitePagesLinks.SignUpLogin()

		SignUpPageActions page = new SignUpPageActions()
		page.enterUsername(username)
		page.enterEmail(email)
		page.clickLogin()
	}


	static void fillSignupForm(Map user) {

		def page = new SignUpPageActions()

		// Title
		if (user.title == 'Mr') {
			page.clickMr()
		} else if (user.title == 'Mrs') {
			page.clickMrs()
		}

		// Account info
		page.enterName(user.name)
		page.enterPassword(user.password)

		page.enterDayOfBirth(user.day)
		page.enterMonthOfBirth(user.month)
		page.enterYearOfBirth(user.year)

		// Address info
		page.enterFirstName(user.firstName)
		page.enterLastName(user.lastName)
		page.enterCompany(user.company)
		page.enterAdd1(user.address1)
		page.enterAdd2(user.address2)

		page.enterCountry(user.country)
		page.enterState(user.state)
		page.enterCity(user.city)
		page.enterZipcode(user.zipcode)
		page.enterMobile(user.mobile)
		page.clickCreatAccount()
	}
}
