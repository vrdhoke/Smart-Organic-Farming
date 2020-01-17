/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Crop;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author vaibhavdhoke
 */
public class Crop {
    private String cropName;
//    private Date manufacturingDate;
    private Date expiryDate;
    private int quantity;
    private double price;
    
    //private ImageIcon img;
    
//    public Crop(String cropName, Date manufacturingDate, Date expiryDate, double price) {
//        this.cropName = cropName;
//        this.manufacturingDate = manufacturingDate;
//        this.expiryDate = expiryDate;
//        this.price = price;
//    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

//    public Date getManufacturingDate() {
//        return manufacturingDate;
//    }
//
//    public void setManufacturingDate(Date manufacturingDate) {
//        this.manufacturingDate = manufacturingDate;
//    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
