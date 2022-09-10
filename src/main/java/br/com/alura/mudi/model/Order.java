package br.com.alura.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Order {

    private final String productName;
    private final BigDecimal amountNegotiated;
    private final LocalDate deliveryDate;
    private final String productUrl;
    private final String imageUrl;
    private final String description;

    public Order(String productName, BigDecimal amountNegotiated, LocalDate deliveryDate, String productUrl, String imageUrl, String description) {
        this.productName = productName;
        this.amountNegotiated = amountNegotiated;
        this.deliveryDate = deliveryDate;
        this.productUrl = productUrl;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getAmountNegotiated() {
        return amountNegotiated;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
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

}
