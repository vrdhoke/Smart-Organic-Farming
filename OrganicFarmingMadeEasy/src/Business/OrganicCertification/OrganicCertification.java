/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrganicCertification;

import Business.UserAccount.UserAccount;

/**
 *
 * @author vaibhavdhoke
 */
public class OrganicCertification {
    
    private SoilType soilType;
    private SoilStructure soilStructure;
    private boolean usedFertilizersInLastThreeYears;

    private UserAccount userAccount;
    
    public OrganicCertification(){

    }
    
//    public OrganicCertification(SoilType soilType, SoilStructure soilStructure, boolean usedFertilizersInLastThreeYears) {
//        this.soilType = soilType;
//        this.soilStructure = soilStructure;
//        this.usedFertilizersInLastThreeYears = usedFertilizersInLastThreeYears;
//    }
    
     public enum SoilStructure {
        Columns("Columns"),
        Blocky("Blocky"),
        Granular("Granular"),
        Plate("Plate-Like"),
        Crumb("Crumb");
        private String value;

        private SoilStructure(String value) {
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

    public SoilStructure getSoilStructure() {
        return soilStructure;
    } 
    
    
    public enum SoilType {
        Fertile("Fertile Soil"),
        Sandy("Sandy Soil"),
        Nutricious("Nutricious Soil"),
        Slit("Slit Soil");

        private String value;

        private SoilType(String value) {
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

    public SoilType getSoilType() {
        return soilType;
    }   

    public void setSoilType(SoilType soilType) {
        this.soilType = soilType;
    }

    public void setSoilStructure(SoilStructure soilStructure) {
        this.soilStructure = soilStructure;
    }

    public boolean isUsedFertilizersInLastThreeYears() {
        return usedFertilizersInLastThreeYears;
    }
    
    public void setUsedFertilizersInLastThreeYears(boolean usedFertilizersInLastThreeYears) {
        this.usedFertilizersInLastThreeYears = usedFertilizersInLastThreeYears;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
        
}
