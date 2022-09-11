package br.com.alura.mudi.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private BigDecimal amountNegotiated;
    private LocalDate deliveryDate;
    @Column(length = 4000)
    private String productUrl;
    private String imageUrl;
    private String description;

    public Order() {
    }

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
