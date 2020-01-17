/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import Business.OrganicCertification.*;

/**
 *
 * @author raunak
 */
public class OrganicCertificationWorkRequest extends WorkRequest{
    
    private OrganicCertification organicCertification;
    private boolean isCertified;

    public OrganicCertification getOrganicCertification() {
        return organicCertification;
    }

    public void setOrganicCertification(OrganicCertification organicCertification) {
        this.organicCertification = organicCertification;
    }

    public boolean getIsCertified() {
        return isCertified;
    }

    public void setIsCertified(boolean isCertified) {
        this.isCertified = isCertified;
    }
}
