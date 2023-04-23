package com.example.basicSpringBoot.Model;

import com.example.basicSpringBoot.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int cardId;
    private  String cardNumber;
    @JsonFormat(pattern="yyyy-MM-dd",shape = JsonFormat.Shape.STRING)
    private Date expiryDate;
    private int cvv;
    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne
    @JoinColumn
    private  User user;
    public Card() {
    }

    public Card(int cardId, String cardNumber, Date expiryDate, int cvv, Status status, User user) {
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.status = status;
        this.user = user;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
