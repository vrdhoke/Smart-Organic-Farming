/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Customer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FarmerCropWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import org.joda.time.Days;
import org.joda.time.LocalDate;

/**
 *
 * @author aishwarya
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkAreaJPanel
     */  
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
            
    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,Enterprise enterprise,Organization organization, EcoSystem business) {
        initComponents();
        JTableHeader header = tblCropRequest.getTableHeader();
        TableCellRenderer rendererFromHeader = header.getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        header.setFont(new Font("SansSerif", Font.BOLD, 16));
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.organization = organization;
        this.enterprise = enterprise;
        valueLabel.setText(userAccount.getEmployee().getName());
        
        populateCropRequestTable();
        
        tblCropRequest.setAutoCreateRowSorter(true);
        TableRowSorter<DefaultTableModel> rowSorter = (TableRowSorter<DefaultTableModel>)tblCropRequest.getRowSorter();
       
        int cropName_Column = 0;
        
        rowSorter.setComparator(cropName_Column, (FarmerCropWorkRequest o1, FarmerCropWorkRequest o2) -> o1.getCrop().getCropName().compareTo(o2.getCrop().getCropName()));
        
        int double_Column = 1;
        
        rowSorter.setComparator(double_Column, (Double c1, Double c2) -> c1.compareTo(c2));
        
        int quantity_column = 2;
        
        rowSorter.setComparator(quantity_column, (Integer c1, Integer c2) -> c1.compareTo(c2));
        
        int farmerName_column = 3;
        
        rowSorter.setComparator(farmerName_column, (String c1, String c2) -> c1.compareTo(c2));

        tblCropRequest.setRowSorter(rowSorter);
        
    }

    
    public void populateCropRequestTable(){
        Organization org = null;
            for(Network network : business.getNetworkList()){
                for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                    for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if(organization instanceof CustomerOrganization){
                            org = organization;
                            break;
                        }
                    }
                }
            }
//            List<WorkRequest> temp = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) tblCropRequest.getModel();
        if(org.getWorkQueue().getWorkRequestList().size()> 0){
            model.setRowCount(0);
            for (WorkRequest wr : org.getWorkQueue().getWorkRequestList()){
                if(wr instanceof FarmerCropWorkRequest){
//                    temp.add(wr);
                    FarmerCropWorkRequest fc = (FarmerCropWorkRequest)wr;
//                    System.out.println("fc"+fc);
                 
                Object[] row = new Object[6];
                row[0] = fc;
//                row[1] = fc.getCrop().getQuantity();
                row[1] = fc.getCrop().getPrice();
                row[2] = fc.getCrop().getQuantity();
                row[3] = fc.getSender().getEmployee().getName();
//                row[4] = fc.getCrop().getManufacturingDate();
                
                Date date1 = fc.getCrop().getExpiryDate();
                    System.out.println(fc.getCrop().getExpiryDate());
//                cal1.setTime(date1);
                Date date2 = new Date();
//                cal2.setTime(date2);
//              
                if(date1.after(date2))
                {
                    row[4] = Days.daysBetween(new LocalDate(date2),new LocalDate(date1)).getDays();;
                }
                else 
                {
                    row[4] = "Expired";
                }
                model.addRow(row);
                }
                
        }
        }
        
        else JOptionPane.showMessageDialog(null, "Crops are coming soon !!!");
//         userAccount.getWorkQueue().getWorkRequestList().removeAll(temp);
//         org.getWorkQueue().getWorkRequestList().removeAll(temp);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCropRequest = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnBuyOrganic = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnOrders = new javax.swing.JButton();

        tblCropRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Crop Name", "Price", "Quantity", "Farmer Name", "Days to expire/Shelf life"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCropRequest.setPreferredSize(new java.awt.Dimension(450, 200));
        tblCropRequest.setRowHeight(25);
        jScrollPane1.setViewportView(tblCropRequest);
        if (tblCropRequest.getColumnModel().getColumnCount() > 0) {
            tblCropRequest.getColumnModel().getColumn(0).setMinWidth(100);
            tblCropRequest.getColumnModel().getColumn(0).setMaxWidth(150);
            tblCropRequest.getColumnModel().getColumn(1).setMinWidth(100);
            tblCropRequest.getColumnModel().getColumn(1).setMaxWidth(150);
            tblCropRequest.getColumnModel().getColumn(2).setMinWidth(100);
            tblCropRequest.getColumnModel().getColumn(2).setMaxWidth(150);
            tblCropRequest.getColumnModel().getColumn(3).setMinWidth(150);
            tblCropRequest.getColumnModel().getColumn(3).setMaxWidth(200);
            tblCropRequest.getColumnModel().getColumn(4).setMinWidth(200);
            tblCropRequest.getColumnModel().getColumn(4).setMaxWidth(500);
        }

        jPanel1.setBackground(new java.awt.Color(47, 72, 147));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Organic Food Delivery Portal");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Welcome");

        valueLabel.setForeground(new java.awt.Color(255, 255, 255));
        valueLabel.setText("<value>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        btnBuyOrganic.setText("Buy Organic Food");
        btnBuyOrganic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyOrganicActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(47, 72, 147));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Farmer/organic-icon-1.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Farmer/orga.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnOrders.setText("View Your Orders");
        btnOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnOrders)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuyOrganic)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuyOrganic, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
 
    private void btnBuyOrganicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyOrganicActionPerformed
        // TODO add your handling code here:
        int rowCount = tblCropRequest.getRowCount();
        
        if(rowCount==0){
            JOptionPane.showMessageDialog(null, "There is nothing to Buy");
            return;
        }
        
                int selectedRow = tblCropRequest.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row !");
            return; 
        }
        else if(tblCropRequest.getValueAt(selectedRow,4).equals("Expired")){
            JOptionPane.showMessageDialog(null, "Crop Expired!, please select different product!");
            return;
        }
        else
        {
                
                FarmerCropWorkRequest request = (FarmerCropWorkRequest)tblCropRequest.getValueAt(selectedRow, 0);  
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                userProcessContainer.add("CustomerOrderJPanel", new CustomerOrderJPanel(userProcessContainer, userAccount, enterprise, organization, business,request));
                layout.next(userProcessContainer);
        }
        
        
    }//GEN-LAST:event_btnBuyOrganicActionPerformed

    private void btnOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersActionPerformed
        // TODO add your handling code here:
        //FarmerCropWorkRequest request = (FarmerCropWorkRequest)tblCropRequest.getValueAt(selectedRow, 0);  
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("CustomerItemsOrderedJPanel", new CustomerItemsOrderedJPanel(userProcessContainer, userAccount, enterprise, organization));
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_btnOrdersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuyOrganic;
    private javax.swing.JButton btnOrders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCropRequest;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
