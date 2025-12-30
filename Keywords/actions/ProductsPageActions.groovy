package actions

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import org.openqa.selenium.interactions.Actions

import java.util.Random
import java.util.HashSet
import java.util.Map
import java.util.HashMap
import java.util.Set

import validation.ProductsPageValidation

public class ProductsPageActions {

	public static TestObject ContinueShopping() {
		return findTestObject('Object Repository/Page_Automation Exercise - All Products/continueShopping')
	}
	public static TestObject getProductCards() {
		return findTestObject('Object Repository/products/ProductList')
	}
	public static TestObject GotoCart() {
		return findTestObject('Object Repository/Header Page links/Cart')
	}

	@Keyword
	public static Map<String, Integer> collectRandomProducts(int count) {

		// Get all product cards
		List<WebElement> products = WebUI.findWebElements(getProductCards(), 10)

		Random rand = new Random()
		Set<Integer> indices = new HashSet<>()

		// Pick random products
		while (indices.size() < count) {
			indices.add(rand.nextInt(products.size()))
		}

		Map<String, Integer> selectedProducts = new HashMap<>()

		for (int index : indices) {
			WebElement card = products.get(index)

			String productName = card.findElement(By.xpath(".//p")).getText().trim()
			WebUI.delay(0.2)
			WebElement addBtn = card.findElement(By.cssSelector("a.add-to-cart"))
			DriverFactory.getWebDriver().executeScript("arguments[0].click();", addBtn)
			ProductsPageValidation.validateItemAddedToCart()


			WebUI.click(ContinueShopping())

			selectedProducts.put(productName, 1)
		}
		WebUI.click(GotoCart())

		return selectedProducts
	}
}
