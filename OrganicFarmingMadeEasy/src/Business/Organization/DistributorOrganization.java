/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DistributorRole;
import Business.Role.ExpertRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class DistributorOrganization extends Organization{

    public DistributorOrganization() {
        super(Type.Distributor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DistributorRole());
        return roles;
    }
     
   
    
    
}
