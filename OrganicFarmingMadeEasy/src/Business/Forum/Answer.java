/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Forum;

import Business.UserAccount.UserAccount;

/**
 *
 * @author vaibhavdhoke
 */
public class Answer {
    private String text;
    private boolean isRelevant;
    private UserAccount farmerAccount;

    public Answer() {
        this.farmerAccount = new UserAccount();
    }
   
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isIsRelevant() {
        return isRelevant;
    }

    public void setIsRelevant(boolean isRelevant) {
        this.isRelevant = isRelevant;
    }

    public UserAccount getFarmerAccount() {
        return farmerAccount;
    }

    public void setFarmerAccount(UserAccount farmerAccount) {
        this.farmerAccount = farmerAccount;
    }
    
    @Override
    public String toString() {
        return farmerAccount.getEmployee().getName();
    }
    
    
}
