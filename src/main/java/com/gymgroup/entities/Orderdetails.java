package com.gymgroup.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Orderdetails implements Serializable{

    private int detailid;
    private int productid;
    private int quantity;
    private Orders orderId;
//    public Orderdetails(int productid, int quantity, Orders orderId) {
//        this.productid = productid;
//        this.quantity = quantity;
//        this.orderId = orderId;
//    }

    public Orderdetails() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detailid", nullable = false)
    public int getDetailid() {
        return detailid;
    }

    public void setDetailid(int detailid) {
        this.detailid = detailid;
    }

    @Basic
    @Column(name = "productid", nullable = false)
    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    @Basic
    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Orderdetails that = (Orderdetails) o;
        return detailid == that.detailid
                && orderId == that.orderId
                && productid == that.productid
                && quantity == that.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailid, orderId, productid, quantity);
    }

    @ManyToOne
    @JoinColumn(name = "orderId", referencedColumnName = "oid", nullable = false)
    public Orders getOrderId() {
        return orderId;
    }

    public void setOrderId(Orders orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Orderdetails{" + "detailid=" + detailid + ", productid=" + productid + ", quantity=" + quantity + ", orderId=" + orderId + '}';
    }
    
    
}
