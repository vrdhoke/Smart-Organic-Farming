/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ExpertRole;
import Business.Role.OfficerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OfficerOrganization extends Organization{

    public OfficerOrganization() {
        super(Type.Officer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OfficerRole());
        return roles;
    }
     
   
    
    
}
