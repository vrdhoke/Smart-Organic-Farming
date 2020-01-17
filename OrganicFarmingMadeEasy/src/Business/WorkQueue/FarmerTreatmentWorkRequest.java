/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Disease.Disease;

/**
 *
 * @author aishwarya
 */
public class FarmerTreatmentWorkRequest extends WorkRequest{
    private Disease disease;
    private boolean isTreated;
    private String treatmentComments;
    

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public boolean getIsTreated() {
        return isTreated;
    }

    public void setIsTreated(boolean isTreated) {
        this.isTreated = isTreated;
    }

    public String getTreatmentComments() {
        return treatmentComments;
    }

    public void setTreatmentComments(String treatmentComments) {
        this.treatmentComments = treatmentComments;
    }
    
}
