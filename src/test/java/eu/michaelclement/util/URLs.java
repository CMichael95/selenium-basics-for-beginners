package eu.michaelclement.util;

public enum URLs {
    LOGIN("login"), PRODUCTS("products"), CONTACT("contact"), CART("cart");

    private final String value;

    URLs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
