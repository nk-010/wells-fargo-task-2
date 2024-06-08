package com.wellsfargo.counselor.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Security{

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    @Column(nullable = false)
    private String securityName;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private String quantity;

    protected Security() {

    }

    public Security(String securityName, String category, Date purchaseDate, String purchasePrice, String quantity) {
        this.securityName = securityName;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public String getsecurityName() {
        return securityName;
    }

    public String getCategory() {
        return category;
    }

    public Date getpurchaseDate() {
        return purchaseDate;
    }

    public String getQuantity() {
        return quantity;
    }


    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setpurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

}
