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
    @Column(length = 4000)
    private String description;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    public Order() {

    }

    public Order(String productName, BigDecimal amountNegotiated, LocalDate deliveryDate, String productUrl, String imageUrl, String description, OrderStatus status) {
        this.id = id;
        this.productName = productName;
        this.amountNegotiated = amountNegotiated;
        this.deliveryDate = deliveryDate;
        this.productUrl = productUrl;
        this.imageUrl = imageUrl;
        this.description = description;
        this.status = status;
    }

    public Long getId() {
        return id;
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

    public OrderStatus getStatus() {
        return status;
    }
}
