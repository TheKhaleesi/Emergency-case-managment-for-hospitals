/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.OrganInventoryWorkAreaPanel;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organ.Organ;
import Business.OrganWorkQueue.GetOrganWorkRequest;
import Business.OrganWorkQueue.OrganCollectionWorkRequest;
import Business.Organisation.OrganInventoryCollectionOrganization;
import Business.Organisation.OrganInventoryReceptionOrganization;
import Business.Organisation.Organization;
import Business.RequestOrganByDoctorWorkArea.RequestOrganFromDoctorWorkRequest;
import Business.RequestOrganByDoctorWorkArea.RequestOrganWorkRequest;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author puja_
 */
public class OrganCollectionWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private Business business;
    private OrganInventoryCollectionOrganization organCollectionOrganization;

    /**
     * Creates new form OrganInventoryWorkAreaJPanel
     */
    public OrganCollectionWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,  Business business, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.account = account;
        this.business = business;
        this.organCollectionOrganization = (OrganInventoryCollectionOrganization)organization;
        this.enterprise= enterprise;
        populateTable();
        populateOrganInventoryTable();
    }
    
    
    public void populateOrganInventoryTable(){
        DefaultTableModel dtm = (DefaultTableModel)organInventoryTable.getModel();
        dtm.setRowCount(0);
        
        for(Organ organ : organCollectionOrganization.getInventoryList()){
             Object[] row = new Object[3];
            row[0] = organ.getOrgan();
            row[1] = organ.getBloodtype();
            row[2] = organ.getQuantity();
            dtm.addRow(row);
        }
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)organRequestJTable.getModel();
        model.setRowCount(0);
        
        
        for(Organization organization :enterprise.getOrganizationDirectory().getOrganizationList())
            if(organization instanceof OrganInventoryReceptionOrganization)
            {
               for(RequestOrganWorkRequest request : organization.getReceiveOrganRequestFromDoctor().getOrganWorkRequestList()){
                Object[] row = new Object[7];
            
            row[0] = request;
            row[1] = request.getOrganType();
            row[2] = request.getBloodType();
            row[3] = request.getQty();
            row[4] = request.getStatus();
            row[5] = request.getSender();
            row[6] = request.getReceiver();
            
            model.addRow(row);
    } 
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

        jScrollPane1 = new javax.swing.JScrollPane();
        organRequestJTable = new javax.swing.JTable();
        sendorganBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        organInventoryTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(222, 248, 248));

        organRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Organ Type", "Blood Type", "Quantity Needed", "Status", "Sender", "Receiver"
            }
        ));
        jScrollPane1.setViewportView(organRequestJTable);

        sendorganBtn.setBackground(new java.awt.Color(0, 153, 153));
        sendorganBtn.setForeground(new java.awt.Color(255, 255, 255));
        sendorganBtn.setText("Send Organ to Reception");
        sendorganBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendorganBtnActionPerformed(evt);
            }
        });

        organInventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Organ Type", "Blood Type", "Quantity Available"
            }
        ));
        jScrollPane2.setViewportView(organInventoryTable);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Organ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Organ Inventory");

        refreshBtn.setBackground(new java.awt.Color(0, 153, 153));
        refreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshBtn.setText("Refresh Inventory ");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sendorganBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(refreshBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(refreshBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(sendorganBtn)
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        OrganInventoryJPanel oijp = new OrganInventoryJPanel(userProcessContainer, account, enterprise,this.organCollectionOrganization.getInventoryList());
        userProcessContainer.add("BloodCampJPanel", oijp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sendorganBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendorganBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = organRequestJTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null,"No Row selected");
            return;
        }
        
        RequestOrganWorkRequest request =(RequestOrganWorkRequest) organRequestJTable.getValueAt(selectedRow, 0);
        int organQuantityNeeded = Integer.parseInt(organRequestJTable.getValueAt(selectedRow, 3).toString());
        String organType = organRequestJTable.getValueAt(selectedRow, 1).toString();
        boolean flag = false;
        for(Organ organ1 : this.organCollectionOrganization.getInventoryList())
        {
            if(organ1.getOrgan().equals(organType))
            {
                flag =true;
                
                if(organ1.getQuantity() > organQuantityNeeded )
                {
               int qty = organ1.getQuantity() - organQuantityNeeded;
               organ1.setQuantity(qty);
               request.setStatus("Sent from Inventory to reception");
               JOptionPane.showMessageDialog(null,"Organ sent to Reception");
               break;
                }
                else
                    JOptionPane.showMessageDialog(null,"Requested quantity is more than available");
                
                break;
            }
            
            
            
         }
        if(flag==false)
            {
                JOptionPane.showMessageDialog(null,"Organ not available in inventory");
                
            }
        populateOrganInventoryTable();
        
        
        
//        RequestOrganFromDoctorWorkRequest organrequest = (RequestOrganFromDoctorWorkRequest)organRequestJTable.getValueAt(selectedRow, 0);
//        organrequest.setStatus("Completed");
    }//GEN-LAST:event_sendorganBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable organInventoryTable;
    private javax.swing.JTable organRequestJTable;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton sendorganBtn;
    // End of variables declaration//GEN-END:variables
}
