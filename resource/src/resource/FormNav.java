package com.mycompany.pindahvscode;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author jengb
 */
public class FormNav extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormPil
     */
    public FormNav() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_indata = new javax.swing.JButton();
        btn_shdata = new javax.swing.JButton();

        btn_indata.setText("Masukan data");
        btn_indata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_indataActionPerformed(evt);
            }
        });

        btn_shdata.setText("Tampilkan data");
        btn_shdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_shdataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btn_indata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btn_shdata)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_shdata)
                    .addComponent(btn_indata))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_shdataActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_shdataActionPerformed

        ShowData TD = new ShowData(null);
        TD.setVisible(true);
        this.getDesktopPane().add(TD);
        this.dispose();

       
        
    }// GEN-LAST:event_btn_shdataActionPerformed

    private void btn_indataActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_indataActionPerformed

        InDataForm absensiForm = new InDataForm();
        absensiForm.setVisible(true);
        this.getDesktopPane().add(absensiForm);
        this.dispose();

    }// GEN-LAST:event_btn_indataActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_indata;
    private javax.swing.JButton btn_shdata;
    // End of variables declaration//GEN-END:variables
}
