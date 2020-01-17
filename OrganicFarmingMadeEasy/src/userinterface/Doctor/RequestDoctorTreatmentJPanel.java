/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Doctor;

import Business.EcoSystem;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FarmerTreatmentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author aishwarya
 */
public class RequestDoctorTreatmentJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private DoctorOrganization doctorOrganization;
    /**
     * Creates new form RequestDoctorTreatmentJPanel
     */
    public RequestDoctorTreatmentJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
         JTableHeader header = tblTreatmentRequest.getTableHeader();
        TableCellRenderer rendererFromHeader = header.getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        header.setFont(new Font("SansSerif", Font.BOLD, 16));
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.doctorOrganization = (DoctorOrganization)organization;
        valueLabel.setText(userAccount.getEmployee().getName());
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblTreatmentRequest.getModel();
        
        model.setRowCount(0);
//        List<WorkRequest> temp = new ArrayList<>();
        for(WorkRequest request : doctorOrganization.getWorkQueue().getWorkRequestList()){
//            temp.add(request);
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            
            
            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblTreatmentRequest = new javax.swing.JTable();
        btnAssignToMe = new javax.swing.JButton();
        btnViewRequest = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        tblTreatmentRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Disease", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTreatmentRequest.setRowHeight(25);
        jScrollPane2.setViewportView(tblTreatmentRequest);

        btnAssignToMe.setText("Assign to me");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        btnViewRequest.setText("View Request");
        btnViewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(47, 72, 147));

        jLabel3.setFont(new java.awt.Font("Malayalam MN", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Doctor Work Area");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Check farmers for Treatment");

        valueLabel.setForeground(new java.awt.Color(255, 255, 255));
        valueLabel.setText("<value>");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(355, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAssignToMe)
                                .addGap(370, 370, 370)
                                .addComponent(btnViewRequest))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(266, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    WorkRequest request = null;
    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        
        int rowCount = tblTreatmentRequest.getRowCount();
        
        if(rowCount==0){
            JOptionPane.showMessageDialog(null, "There is nothing to Assign");
            return;
        }
        
        
        int selectedRow = tblTreatmentRequest.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row !");
            return;
        }
       
        request = (WorkRequest)tblTreatmentRequest.getValueAt(selectedRow, 0);
        if(request.getStatus().equalsIgnoreCase("processing")||request.getStatus().equalsIgnoreCase("completed") || request.getStatus().equalsIgnoreCase("rejected")){
            JOptionPane.showMessageDialog(null, "Request is already assigned");
            return;
        }else{
            request.setReceiver(userAccount);
            request.setStatus("Pending");
        populateTable();
        }
        
        
        

    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnViewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestActionPerformed
//        if(request == null){
//            JOptionPane.showMessageDialog(null,"Assign the request first to view it");
//        
//        }
        //else {
        
        int rowCount = tblTreatmentRequest.getRowCount();
        
        if(rowCount==0){
            JOptionPane.showMessageDialog(null, "There is nothing to View");
            return;
        }
            
        int selectedRow = tblTreatmentRequest.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row !");
            return;
        }
        FarmerTreatmentWorkRequest ft= (FarmerTreatmentWorkRequest)tblTreatmentRequest.getValueAt(selectedRow, 0);
        if(ft.getStatus().equalsIgnoreCase("completed")){
            JOptionPane.showMessageDialog(null, "Request is already completed");
            return;
        }
        if(ft.getStatus().equalsIgnoreCase("Rejected")){    
//           if(request.getStatus().equalsIgnoreCase("completed") || request.getStatus().equalsIgnoreCase("rejected")){
            JOptionPane.showMessageDialog(null, "Request is already rejected");
            return;
        }
        else{
            if(ft.getStatus().equalsIgnoreCase("sent") && ft.getReceiver()==null){
                JOptionPane.showMessageDialog(null,"Assign the request first to view it");
                return;
            }
        FarmerTreatmentWorkRequest request = (FarmerTreatmentWorkRequest)tblTreatmentRequest.getValueAt(selectedRow, 0);
        
        request.setStatus("Processing");

        ProcessTreatmentWorkRequestJPanel processTreatmentWorkRequestJPanel = new ProcessTreatmentWorkRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("processTreatmentWorkRequestJPanel", processTreatmentWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        
        
            
            
            
        //}
    }//GEN-LAST:event_btnViewRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnViewRequest;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTreatmentRequest;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}