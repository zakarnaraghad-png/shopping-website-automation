package validation

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class CheckoutValidation {

	public static TestObject getPlaceOrderButton() {
		return findTestObject(
				'Object Repository/Page_Automation Exercise - Checkout/place order'
				)
	}

	public static TestObject getOrderPlacedMessage() {
		return findTestObject(
				'Object Repository/Validation messages/Page_Automation Exercise - Order Placed/orderplaced'
				)
	}

	public static TestObject getProductInCart(String productName) {
		return findTestObject(
				'Object Repository/products/txtProductInCart',
				['productName': productName]
				)
	}

	public static TestObject getProductQuantity(String productName) {
		return findTestObject(
				'Object Repository/products/ProductQnty',
				['productName': productName]
				)
	}
	@Keyword
	public static void validateOrderPlaced() {
		WebUI.verifyElementVisible(
				getPlaceOrderButton()
				)

		WebUI.comment('ORDER PLACED: validation passed')
	}

	@Keyword
	public static void validateOrderDoneSuccessfully() {

		WebUI.verifyElementVisible(getOrderPlacedMessage())

		WebUI.comment('ORDER CONFIRMED: validation passed')
	}

	@Keyword
	public static void validateProductsInCart(Map<String, Integer> expectedProducts) {

		expectedProducts.each { productName, qty ->

			// Validate product presence
			WebUI.verifyElementPresent(
					getProductInCart(productName),10)

			// Validate product quantity
			WebUI.verifyElementText(
					getProductQuantity(productName), qty.toString())

			WebUI.comment("CART VALIDATED: ${productName} with quantity ${qty}")
		}
	}
}
