package com.sezar.model;

import com.sezar.model.enums.PaymentStatuse;

import javax.persistence.*;

/**
 * Created by mahmoudbarakat on 12.07.17.
 */

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String datePaymentInfo;
    private String paymentInfo;
    private String amountPaymentInfo;
    @Enumerated(EnumType.STRING)
    private PaymentStatuse paymentStatuse;

    public Payment() {}

    public Payment(String datePaymentInfo, String paymentInfo,
                   String amountPaymentInfo, PaymentStatuse paymentStatuse) {
        this.datePaymentInfo = datePaymentInfo;
        this.paymentInfo = paymentInfo;
        this.amountPaymentInfo = amountPaymentInfo;
        this.paymentStatuse = paymentStatuse;
    }

    public String getDatePaymentInfo() {
        return datePaymentInfo;
    }

    public void setDatePaymentInfo(String datePaymentInfo) {
        this.datePaymentInfo = datePaymentInfo;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public String getAmountPaymentInfo() {
        return amountPaymentInfo;
    }

    public void setAmountPaymentInfo(String amountPaymentInfo) {
        this.amountPaymentInfo = amountPaymentInfo;
    }

    public PaymentStatuse getPaymentStatuse() {
        return paymentStatuse;
    }

    public void setPaymentStatuse(PaymentStatuse paymentStatuse) {
        this.paymentStatuse = paymentStatuse;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", datePaymentInfo='" + datePaymentInfo + '\'' +
                ", paymentInfo='" + paymentInfo + '\'' +
                ", amountPaymentInfo='" + amountPaymentInfo + '\'' +
                ", paymentStatuse=" + paymentStatuse +
                '}';
    }
}
