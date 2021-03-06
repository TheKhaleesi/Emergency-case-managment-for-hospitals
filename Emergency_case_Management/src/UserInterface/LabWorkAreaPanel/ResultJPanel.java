/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabWorkAreaPanel;

import Business.LabWorkQueueArea.RequestLabWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author puja_
 */
public class ResultJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ResultJPanel
     */
    JPanel userProcessContainer;
    RequestLabWorkRequest request;
    public ResultJPanel(JPanel userProcessContainer, RequestLabWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
    }



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
        resultTxt = new javax.swing.JTextField();
        sendresultBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(222, 248, 248));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Result Work Area");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Result of the Test:");

        resultTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultTxtActionPerformed(evt);
            }
        });

        sendresultBtn.setBackground(new java.awt.Color(0, 153, 153));
        sendresultBtn.setForeground(new java.awt.Color(255, 255, 255));
        sendresultBtn.setText("Send Result");
        sendresultBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendresultBtnActionPerformed(evt);
            }
        });

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectModel/back.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sendresultBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(244, 244, 244)
                            .addComponent(jLabel2)
                            .addGap(30, 30, 30)
                            .addComponent(resultTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(303, 303, 303)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(resultTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addComponent(sendresultBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resultTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultTxtActionPerformed

    private void sendresultBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendresultBtnActionPerformed
        // TODO add your handling code here:
        request.setResult(resultTxt.getText());
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(null, "Result sent successfully");
    }//GEN-LAST:event_sendresultBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistantWorkAreaJPanel dwjp = (LabAssistantWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
           
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField resultTxt;
    private javax.swing.JButton sendresultBtn;
    // End of variables declaration//GEN-END:variables
}
