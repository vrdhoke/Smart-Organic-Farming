/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

import Business.UserAccount.UserAccount;


/**
 *
 * @author aishwarya
 */
public class Disease {
    private DiseaseType diseaseType;
    private DiseaseCondition diseaseCondition;
    //private boolean usedFertilizersInLastThreeYears;

    private UserAccount userAccount;
    
    public Disease(){

    }
    
    public enum DiseaseType {
        Fever("Fever"),
        Diabetes("Diabetes"),
        BloodPressure("BloodPressure");

        private String value;

        private DiseaseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
      
    public DiseaseType getDiseaseType() {
        return diseaseType;
    }
    
    public enum DiseaseCondition {
        Severe("Severe"),
        Moderate("Moderate"),
        Mild("Mild");

        private String value;

        private DiseaseCondition(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public DiseaseCondition getDiseaseCondition() {
        return diseaseCondition;
    }   

    public void setDiseaseCondition(DiseaseCondition diseaseCondition) {
        this.diseaseCondition = diseaseCondition;
    }

    public void setDiseaseType(DiseaseType diseaseType) {
        this.diseaseType = diseaseType;
    }
    
    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
}
