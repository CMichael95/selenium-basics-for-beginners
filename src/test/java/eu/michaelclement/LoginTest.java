package eu.michaelclement;

import eu.michaelclement.pages.cart.CartPageController;
import eu.michaelclement.pages.checkout.CheckoutPageController;
import eu.michaelclement.pages.products.ProductsPageController;
import eu.michaelclement.pages.summary.SummaryPageController;
import org.junit.jupiter.api.Test;

public class LoginTest extends ParentTest {
    private final ProductsPageController productsPageController = new ProductsPageController(driver);
    private final CartPageController cartPageController = new CartPageController(driver);
    private final CheckoutPageController checkoutPageController = new CheckoutPageController(driver);
    private final SummaryPageController summaryPageController = new SummaryPageController(driver);

    @Test
    public void testLogin() {


    }
}
