/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Farmer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FarmerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FarmerEventsWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import static userinterface.Customer.CustomerOrderJPanel.VALID_EMAIL_ADDRESS_REGEX;
import static userinterface.Customer.CustomerOrderJPanel.validate;
import userinterface.Customer.SendMailUsingAuthentication;

/**
 *
 * @author Pranali
 */
public class FarmerEventsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FarmerEventsJPanel
     */
    
    private JPanel userProcessContainer;
    private FarmerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;

    FarmerEventsJPanel(JPanel userProcessContainer, UserAccount userAccount, FarmerOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        JTableHeader header = tblEvents.getTableHeader();
        TableCellRenderer rendererFromHeader = header.getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        header.setFont(new Font("SansSerif", Font.BOLD, 16));
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.business = business;
        valueLabel.setText(userAccount.getEmployee().getName());
        populateEventsTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void populateEventsTable(){
        DefaultTableModel model = (DefaultTableModel)tblEvents.getModel();
        
        model.setRowCount(0);
//        List<WorkRequest> temp = new ArrayList<>();
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
//            temp.add(request);
            if(request instanceof FarmerEventsWorkRequest){
                Object[] row = new Object[4];
                row[0] = request;
                row[1] = ((FarmerEventsWorkRequest) request).getEventDesc();
                row[2] = ((FarmerEventsWorkRequest) request).getEventDate();
                row[3] = ((FarmerEventsWorkRequest) request).getLocation();
                model.addRow(row);
            }
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEvents = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        tblEvents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Event Name", "Description", "Date", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEvents.setRowHeight(25);
        jScrollPane1.setViewportView(tblEvents);
        if (tblEvents.getColumnModel().getColumnCount() > 0) {
            tblEvents.getColumnModel().getColumn(0).setResizable(false);
            tblEvents.getColumnModel().getColumn(1).setResizable(false);
            tblEvents.getColumnModel().getColumn(2).setResizable(false);
            tblEvents.getColumnModel().getColumn(3).setResizable(false);
        }

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel1.setText("Register for event");

        jLabel2.setText("Enter email address");

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(47, 72, 147));

        jLabel3.setFont(new java.awt.Font("Malayalam MN", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Informational Events");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Register for events");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(45, 45, 45))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Farmer/event.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 152, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(147, 147, 147)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRegister)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRefresh))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 64, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FarmerWorkAreaJPanel panel = (FarmerWorkAreaJPanel) component;
        panel.populateCheckEventsTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateEventsTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    public static boolean validate(String emailStr) {
        if (emailStr == null) {
            return false;
        }
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
    
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        int rowCount = tblEvents.getRowCount();
        
        if(rowCount==0){
            JOptionPane.showMessageDialog(null, "There is nothing to Register");
            return;
        }
        
        int selectedRow = tblEvents.getSelectedRow();
        FarmerEventsWorkRequest fNew = new FarmerEventsWorkRequest();
        
        FarmerEventsWorkRequest request = (FarmerEventsWorkRequest)tblEvents.getValueAt(selectedRow, 0);
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row !");
            return;
        }
        else
        {
            if(txtEmail.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Email address cannot be empty");
                return;
            }
            else
            {
                boolean isValidEmail = validate(txtEmail.getText());
                
                if (!isValidEmail) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid email address");
                    return;
                }
                
                List<FarmerEventsWorkRequest> temp = new ArrayList<>();
                for(WorkRequest workRequest :userAccount.getWorkQueue().getWorkRequestList()){

                    if(workRequest instanceof FarmerEventsWorkRequest){
                        FarmerEventsWorkRequest few = (FarmerEventsWorkRequest) workRequest;
                        temp.add(few);
//                        
                    }
                }
                
                
                if(temp.size()==0){
                           fNew.setEventDate(request.getEventDate());
                           fNew.setEventDesc(request.getEventDesc());
                           fNew.setEventName(request.getEventName());
                           fNew.setLocation(request.getLocation());
                           fNew.setStatus("Registered");
                           userAccount.getWorkQueue().getWorkRequestList().add(fNew);
                           JOptionPane.showMessageDialog(null, "You have successfully registered for this event");
                           SendMailUsingAuthentication sendMail = new SendMailUsingAuthentication();
                           sendMail.send("organic3farm@gmail.com", "organic@123",
                           txtEmail.getText(), "Registered !!", "You have successfully registered for the event " + tblEvents.getValueAt(selectedRow, 0) + ": "+ tblEvents.getValueAt(selectedRow, 1) 
                           + " at " + tblEvents.getValueAt(selectedRow, 3) + " " + tblEvents.getValueAt(selectedRow, 2));
                }else{
                    boolean flag = true;
                    for(FarmerEventsWorkRequest few : temp){
                        if(few.getEventName().equalsIgnoreCase(request.getEventName())&&few.getStatus().equalsIgnoreCase("Registered")){
                            JOptionPane.showMessageDialog(null, "Already Registered");   
                            flag=false;
                            } 
                    }
                    if(flag){
                            fNew.setEventDate(request.getEventDate());
                            fNew.setEventDesc(request.getEventDesc());
                            fNew.setEventName(request.getEventName());
                            fNew.setLocation(request.getLocation());
                            fNew.setStatus("Registered");
                            userAccount.getWorkQueue().getWorkRequestList().add(fNew);
                            JOptionPane.showMessageDialog(null, "You have successfully registered for this event");
                            SendMailUsingAuthentication sendMail = new SendMailUsingAuthentication();
                            sendMail.send("organic3farm@gmail.com", "organic@123",
                            txtEmail.getText(), "Registered !!", "You have successfully registered for the event " + tblEvents.getValueAt(selectedRow, 0) + ": "+ tblEvents.getValueAt(selectedRow, 1) 
                            + " at " + tblEvents.getValueAt(selectedRow, 3) + " " + tblEvents.getValueAt(selectedRow, 2));
                        }
                }
                
                
                
                
                
                
                
                
                
                
                
//                for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
//            if(request instanceof FarmerEventsWorkRequest) {
//                FarmerEventsWorkRequest fewr = new FarmerEventsWorkRequest();
//                if(((FarmerEventsWorkRequest) request).getEventName().equalsIgnoreCase(String.valueOf(tblEvents.getValueAt(selectedRow, 0))) && !fewr.getStatus().equalsIgnoreCase("Registered")){
////                    System.out.println(request.getStatus());
////                    FarmerEventsWorkRequest fewr = new FarmerEventsWorkRequest();
//                    fewr.setEventName(((FarmerEventsWorkRequest) request).getEventName());
//                    fewr.setEventDesc(((FarmerEventsWorkRequest) request).getEventDesc());
//                    fewr.setLocation(((FarmerEventsWorkRequest) request).getLocation());
//                    fewr.setEventDate(((FarmerEventsWorkRequest) request).getEventDate());
//                    
//                    userAccount.getWorkQueue().getWorkRequestList().add(fewr);
//                    fewr.setStatus("Registered");
//                    System.out.println("You have successfully registered!");
//                    SendMailUsingAuthentication sendMail = new SendMailUsingAuthentication();
//            sendMail.send("organic3farm@gmail.com", "organic@123",
//            txtEmail.getText(), "Registered !!", "You have successfully registered for the event " + tblEvents.getValueAt(selectedRow, 0) + ": "+ tblEvents.getValueAt(selectedRow, 1) 
//                            + " at " + tblEvents.getValueAt(selectedRow, 3) + " " + tblEvents.getValueAt(selectedRow, 2));
//                }
//                else if(fewr.getStatus().equalsIgnoreCase("Registered"))
//                {
//                    System.out.println("Already registered!");
//                    JOptionPane.showMessageDialog(null, "You've already registerd for this event!");
//                    break;
//                }
//            }
//            }
            }
            
        
//        if(request.getStatus().equalsIgnoreCase("Registered")){
//            System.out.println("You have already registerd for this event!");
//            JOptionPane.showMessageDialog(null, "You have already registered for this event");
//        }
//        else
//        {
//            System.out.println("You have successfully registered!");
//            request.setStatus("Registered");
//            SendMailUsingAuthentication sendMail = new SendMailUsingAuthentication();
//            sendMail.send("organic3farm@gmail.com", "organic@123",
//            txtEmail.getText(), "Registered !!", "You have successfully registered for the event " + tblEvents.getValueAt(selectedRow, 0) + ": "+ tblEvents.getValueAt(selectedRow, 1) 
//                            + " at " + tblEvents.getValueAt(selectedRow, 3) + " " + tblEvents.getValueAt(selectedRow, 2));
//            userAccount.getWorkQueue().getWorkRequestList().add(request);
//        }
        
        }
        
    }//GEN-LAST:event_btnRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEvents;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}