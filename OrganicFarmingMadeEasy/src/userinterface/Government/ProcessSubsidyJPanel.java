/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Government;


import Business.WorkQueue.FarmerSubsidyWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.Farmer.FarmerWorkAreaJPanel;

/**
 *
 * @author aishwarya
 */
public class ProcessSubsidyJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    FarmerSubsidyWorkRequest request;
    /**
     * Creates new form ProcessSubsidyJPanel
     */
    public ProcessSubsidyJPanel(JPanel userProcessContainer,FarmerSubsidyWorkRequest request) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        txtFarmerName.setText(request.getSender().getUsername());
        System.out.println("Amount req "+request.getRequestedSubsidyValue());
        txtSubsidyAmountRequested.setText(String.valueOf(request.getRequestedSubsidyValue()));
        //txtSubsidyAmount.setText(TOOL_TIP_TEXT_KEY);
    }
    
//    public double calculateLoss(){
//        WorkQueue wq = request.getSender().getWorkQueue();
////        for(WorkRequest wr: wq.getWorkRequestList()){
////            if(wr.)
////        }
//        
//        return 0.0;
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFarmerName = new javax.swing.JTextField();
        txtSubsidyAmountRequested = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSubsidyAmountGranted = new javax.swing.JTextField();
        btnDone = new javax.swing.JButton();
        lblSubsidyAmount = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtOfficerComments = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBackButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("Farmer Name:");

        jLabel2.setText("Subsidy Amount Requested:");

        txtFarmerName.setEditable(false);

        txtSubsidyAmountRequested.setEditable(false);

        jLabel3.setText("Subsidy Percent Granted:");

        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(47, 72, 147));

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Process Subsidy");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Provide Subsidy to encourage Organic Farming ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(287, 287, 287))
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

        jLabel4.setText("Comments:");

        jLabel5.setText("Total Subsidy Given:");

        btnBackButton.setText("<< Back");
        btnBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFarmerName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSubsidyAmountRequested, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSubsidyAmountGranted, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(btnBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOfficerComments, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSubsidyAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtFarmerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSubsidyAmountRequested, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSubsidyAmountGranted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtOfficerComments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblSubsidyAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(264, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
        //request.setGivenSubsidyValue(Double.parseDouble(txtSubsidyAmountGranted.getText()));
        try{
            String quantRegex = "[0-9]+";
        if(txtSubsidyAmountGranted.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter a valid Subsidy amount");
        }else if(txtOfficerComments.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter comments to proceed");
        }
        else{
            if(!txtSubsidyAmountGranted.getText().matches(quantRegex)){
                JOptionPane.showMessageDialog(null, "Please enter digits in quantity");
                return;
            }
            if(Integer.parseInt(txtSubsidyAmountGranted.getText())==0){
                lblSubsidyAmount.setText(String.valueOf((Double.parseDouble(txtSubsidyAmountGranted.getText())/100)*Double.parseDouble(txtSubsidyAmountRequested.getText())));
                request.setStatus("Subsidy Rejected");
                request.setResolveDate(new Date());
                request.isIsSubsidyApproved(false);
                request.setGivenSubsidyValue(Double.parseDouble(lblSubsidyAmount.getText()));
                request.setOfficerComment(txtOfficerComments.getText());
                txtSubsidyAmountGranted.setEditable(false);
                txtOfficerComments.setEditable(false);
                JOptionPane.showMessageDialog(null, "Subsidy Request Rejected !!!");
            }else{
                lblSubsidyAmount.setText(String.valueOf((Double.parseDouble(txtSubsidyAmountGranted.getText())/100)*Double.parseDouble(txtSubsidyAmountRequested.getText())));
                request.setStatus("Subsidy Provided");
                //Date d1=new Date();
                request.setResolveDate(new Date());
                request.isIsSubsidyApproved(true);
                request.setGivenSubsidyValue(Double.parseDouble(lblSubsidyAmount.getText()));
                request.setOfficerComment(txtOfficerComments.getText());
                txtSubsidyAmountGranted.setEditable(false);
                txtOfficerComments.setEditable(false);
                JOptionPane.showMessageDialog(null, "Subsidy Request Processed Successfully !!!");
            }
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter subsidy percentage in proper format");
        }
            
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        OfficerWorkAreaJPanel panel = (OfficerWorkAreaJPanel) component;
        panel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackButton;
    private javax.swing.JButton btnDone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSubsidyAmount;
    private javax.swing.JTextField txtFarmerName;
    private javax.swing.JTextField txtOfficerComments;
    private javax.swing.JTextField txtSubsidyAmountGranted;
    private javax.swing.JTextField txtSubsidyAmountRequested;
    // End of variables declaration//GEN-END:variables
}
