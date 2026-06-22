package org.harsh.payment.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cards")
public class CreditCard {

    @Id
    @Column(name="ccardno")
    int ccardno;

    @Column(name="cvv")
    String cvv;

    @Column(name="balance")
    float balance;

    public int getCcardno() {
        return ccardno;
    }

    public void setCcardno(int ccardno) {
        this.ccardno = ccardno;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
