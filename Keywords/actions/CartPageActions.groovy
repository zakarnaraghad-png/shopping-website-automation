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
import validation.CheckoutValidation
import com.kms.katalon.core.testobject.TestObject
import internal.GlobalVariable


public class CartPageActions {

	public static TestObject PlaceOrder() {
		return findTestObject('Object Repository/Page_Automation Exercise - Checkout/place order')
	}

	public static void clickProceedCheckout() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/proceedToCeckout'))
	}

	public static void clickPlaceOrder() {
		WebUI.click(PlaceOrder())
	} // this method takes you to payment information page

	public static void cardName(String name) {
		WebUI.setText(
				findTestObject('Object Repository/Page_Automation Exercise - Payment/CardName'),
				name
				)
	}

	public static void cardNumber(String number) {
		WebUI.setText(
				findTestObject('Object Repository/Page_Automation Exercise - Payment/Card Number'),
				number
				)
	}

	public static void cvc(String number) {
		WebUI.setText(
				findTestObject('Object Repository/Page_Automation Exercise - Payment/cvc'),
				number
				)
	}

	public static void Expiration(String number) {
		WebUI.setText(
				findTestObject('Object Repository/Page_Automation Exercise - Payment/Expiration'),
				number
				)
	}

	public static void year(String number) {
		WebUI.setText(
				findTestObject('Object Repository/Page_Automation Exercise - Payment/year'),
				number
				)
	}

	public static void clickConfirmPayment() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Payment/Confirm and Pay'))
	}


	public static void clickContinueOnCart() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Cart/ContinueOnCart'))
	}

	public static void clickGotoProducts() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Cart/emptyCart-GotoProducts'))
	}

	public static void clickLoginToCont() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Cart/LoginToCont'))
	}


	public static void clickContinueOrderPlaced() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Order Placed/Continue'))
	}

	public static void fillPaymentForm() {
		cardName(GlobalVariable.cardName)
		cardNumber(GlobalVariable.cardNumber)
		cvc(GlobalVariable.cvc)
		Expiration(GlobalVariable.cardExpiration)
		year(GlobalVariable.year)
	}
	public static void checkoutOrder() {

		clickProceedCheckout()
		WebUI.scrollToElement(PlaceOrder(), 10)
		CheckoutValidation.validateOrderPlaced()
		WebUI.click(PlaceOrder())
		fillPaymentForm()
		clickConfirmPayment()
		CheckoutValidation.validateOrderDoneSuccessfully()
		clickContinueOrderPlaced()
	}
}

