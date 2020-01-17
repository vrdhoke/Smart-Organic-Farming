/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.Expert.ExpertWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.Distributor.DistributorWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class DistributorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DistributorWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
    
}
