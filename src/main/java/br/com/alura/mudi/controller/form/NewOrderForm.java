package br.com.alura.mudi.controller.form;

import br.com.alura.mudi.model.Order;
import br.com.alura.mudi.model.OrderStatus;

import javax.validation.constraints.NotBlank;

public class NewOrderForm {

    @NotBlank
    private final String productName;
    @NotBlank
    private final String productUrl;
    @NotBlank
    private final String imageUrl;
    private final String description;

    public NewOrderForm(String productName, String productUrl, String imageUrl, String description) {
        this.productName = productName;
        this.productUrl = productUrl;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public Order convert() {
        return new Order(this.productName, null, null, this.productUrl, this.imageUrl, this.description, OrderStatus.IN_APPROVE);
    }
}
