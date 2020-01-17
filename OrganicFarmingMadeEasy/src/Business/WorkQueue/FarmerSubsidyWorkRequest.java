/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author aishwarya
 */
public class FarmerSubsidyWorkRequest extends WorkRequest{
    private double requestedSubsidyValue;
    private double givenSubsidyValue;
    private boolean isSubsidyApproved;
    private String officerComment;
    //private Date dateOfSubsidy;

    public double getRequestedSubsidyValue() {
        return requestedSubsidyValue;
    }

    public void setRequestedSubsidyValue(double requestedSubsidyValue) {
        this.requestedSubsidyValue = requestedSubsidyValue;
    }

    public double getGivenSubsidyValue() {
        return givenSubsidyValue;
    }

    public void setGivenSubsidyValue(double givenSubsidyValue) {
        this.givenSubsidyValue = givenSubsidyValue;
    }

    public boolean isIsSubsidyApproved() {
        return isSubsidyApproved;
    }

    public void isIsSubsidyApproved(boolean isSubsidyApproved) {
        this.isSubsidyApproved = isSubsidyApproved;
    }

    public String getOfficerComment() {
        return officerComment;
    }

    public void setOfficerComment(String officerComment) {
        this.officerComment = officerComment;
    }
    
    @Override
    public String toString() {
        return String.valueOf(requestedSubsidyValue);
    }
    
//resolve date is date of subsidy
//    public Date getDateOfSubsidy() {
//        return dateOfSubsidy;
//    }
//
//    public void setDateOfSubsidy(Date dateOfSubsidy) {
//        this.dateOfSubsidy = dateOfSubsidy;
//    }
    
    
}
