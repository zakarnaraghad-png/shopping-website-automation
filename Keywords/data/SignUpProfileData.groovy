package data

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


class SignUpProfileData {

	public static Map<String, String> getValidSignupData() {

		return [
			title     : GlobalVariable.signup_title,
			name      : GlobalVariable.signup_name,
			password  : GlobalVariable.signup_password,

			day       : GlobalVariable.signup_day,
			month     : GlobalVariable.signup_month,
			year      : GlobalVariable.signup_year,

			firstName : GlobalVariable.signup_firstName,
			lastName  : GlobalVariable.signup_lastName,
			company   : GlobalVariable.signup_company,
			address1  : GlobalVariable.signup_address1,
			address2  : GlobalVariable.signup_address2,

			country   : GlobalVariable.signup_country,
			state     : GlobalVariable.signup_state,
			city      : GlobalVariable.signup_city,
			zipcode   : GlobalVariable.signup_zipcode,
			mobile    : GlobalVariable.signup_mobile
		]
	}
}
