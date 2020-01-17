/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Crop.Crop;
import Business.Farmer.Farmer;

/**
 *
 * @author vaibhavdhoke
 */
public class FarmerCropWorkRequest extends WorkRequest {
    private Crop crop;

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }
    
    @Override
    public String toString() {
        return this.crop.getCropName();
    }
    
}
