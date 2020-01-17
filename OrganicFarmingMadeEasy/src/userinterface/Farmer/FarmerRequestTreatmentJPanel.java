/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Farmer;

import Business.Disease.Disease;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.FarmerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FarmerTreatmentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.Distributor.DistributorWorkAreaJPanel;

/**
 *
 * @author aishwarya
 */
public class FarmerRequestTreatmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FarmerRequestTreatmentJPanel
     */
    private JPanel userProcessContainer;
    private FarmerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private FarmerWorkAreaJPanel fwajp;
    
    public FarmerRequestTreatmentJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, FarmerOrganization organization, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.business = business;
        
        populateDiseaseType();
        populateDiseaseCondition();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        comboDiseaseType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboDiseaseCondition = new javax.swing.JComboBox<>();
        btnTreatmentRequest = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("Disease Type:");

        comboDiseaseType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fever", "Diabetes", "BloodPressure" }));

        jLabel3.setText("Disease Condition:");

        comboDiseaseCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Severe", "Moderate", "Mild" }));

        btnTreatmentRequest.setText("Request");
        btnTreatmentRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreatmentRequestActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(47, 72, 147));

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Request Treatment");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Helps farmer to gain easy access to doctors");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel8)))
                .addContainerGap(457, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Farmer/DOCTOR-SEEKS-FARMER.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboDiseaseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(75, 75, 75)
                                    .addComponent(comboDiseaseCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnBack)
                                .addGap(75, 75, 75)
                                .addComponent(btnTreatmentRequest)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboDiseaseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboDiseaseCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTreatmentRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateDiseaseType(){
        comboDiseaseType.removeAllItems();
        for (Disease.DiseaseType dt : Disease.DiseaseType.values()) {
            comboDiseaseType.addItem(dt);
        }
    }
    
    public void populateDiseaseCondition(){
        comboDiseaseCondition.removeAllItems();
        for (Disease.DiseaseCondition dc : Disease.DiseaseCondition.values()) {
            comboDiseaseCondition.addItem(dc);
        } 
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        //        fwajp.populateOrganicCertificationRequestTable();
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FarmerWorkAreaJPanel panel = (FarmerWorkAreaJPanel) component;
        panel.populateRequestTreatmentTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnTreatmentRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreatmentRequestActionPerformed
        // TODO add your handling code here:
        FarmerTreatmentWorkRequest farmerTreatmentWorkRequest = 
                        new FarmerTreatmentWorkRequest();
        
        Disease disease = new Disease();
        
        disease.setDiseaseType((Disease.DiseaseType) comboDiseaseType.getSelectedItem());
        disease.setDiseaseCondition((Disease.DiseaseCondition) comboDiseaseCondition.getSelectedItem());
//        System.out.println("Ferti used: "+ jRadioButton1.isSelected());
       // disease.setUsedFertilizersInLastThreeYears(jRadioButton1.isSelected());
        
        farmerTreatmentWorkRequest.setDisease(disease);
        farmerTreatmentWorkRequest.setSender(userAccount);
        farmerTreatmentWorkRequest.setStatus("Sent");
        
        Organization org = null;
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof HospitalEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof DoctorOrganization) {
                            org = organization;
                            break;
                        }
                    }
                }

            }
        }
        //System.out.println("org" +org);
        List<WorkRequest> temp = new ArrayList<>();
        if (org != null) {
            if(userAccount.getWorkQueue().getWorkRequestList().size() == 0){
                org.getWorkQueue().getWorkRequestList().add(farmerTreatmentWorkRequest);
                    userAccount.getWorkQueue().getWorkRequestList().add(farmerTreatmentWorkRequest);
                    JOptionPane.showMessageDialog(null, "You have created treatment request successfully");
                    btnTreatmentRequest.setEnabled(false);
                    comboDiseaseType.removeAllItems();
                    comboDiseaseCondition.removeAllItems();
                    farmerTreatmentWorkRequest.setMessage(farmerTreatmentWorkRequest.getDisease().getDiseaseType().getValue());
                    //btnIfFertilizerUsed.clearSelection();
            }
//            else{
//                for(WorkRequest w : userAccount.getWorkQueue().getWorkRequestList()){
//            
//                if(w instanceof FarmerTreatmentWorkRequest){
//                    temp.add(w);
//                    JOptionPane.showMessageDialog(null, "You already have requested for Treatment");
//                    break;
//                }
                else{
                    org.getWorkQueue().getWorkRequestList().add(farmerTreatmentWorkRequest);
                    userAccount.getWorkQueue().getWorkRequestList().add(farmerTreatmentWorkRequest);
                    JOptionPane.showMessageDialog(null, "You have created request successfully");
                    btnTreatmentRequest.setEnabled(false);
                    comboDiseaseType.removeAllItems();
                    comboDiseaseCondition.removeAllItems();
                    farmerTreatmentWorkRequest.setMessage(farmerTreatmentWorkRequest.getDisease().getDiseaseType().getValue());
                    //btnIfFertilizerUsed.clearSelection();
                }
//            }
////                System.out.println("Before Temp: " + temp);
////                userAccount.getWorkQueue().getWorkRequestList().removeAll(temp);
////                org.getWorkQueue().getWorkRequestList().removeAll(temp);
////                for(WorkRequest w: org.getWorkQueue().getWorkRequestList()){
////                    System.out.println("Type"+ w);
////                }
//            }
            
            
        }
        
        comboDiseaseType.setEnabled(false);
        comboDiseaseCondition.setEnabled(false);
        comboDiseaseType.setEditable(false);
        comboDiseaseCondition.setEnabled(false);
    }//GEN-LAST:event_btnTreatmentRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnTreatmentRequest;
    private javax.swing.JComboBox<Object> comboDiseaseCondition;
    private javax.swing.JComboBox<Object> comboDiseaseType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
