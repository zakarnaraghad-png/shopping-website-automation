import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import actions.ProductsPageActions
import validation.CheckoutValidation

//WebUI.openBrowser('https://automationexercise.com')
//WebUI.maximizeWindow()
//LoginPage.fillLoginPage("hUKwJTbofgPU9eVlw/CnDQ==", "11111111111111111112@gmail.com")
//WebUI.waitForPageLoad(30)

Map<String, Integer> selectedProducts =
        ProductsPageActions.collectRandomProducts(3)
		
		println(selectedProducts)
CheckoutValidation.validateProductsInCart(selectedProducts)