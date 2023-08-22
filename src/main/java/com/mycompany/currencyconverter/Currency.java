
package com.mycompany.currencyconverter;

import java.awt.Color;
import javax.swing.*;

public class Currency extends javax.swing.JFrame {
    
    String currencyunit[]= {
        "units",
        "USD",
        "Indian Rupee",
        "Brazilian Real",
        "Canadian Dollar",
        "Australian Dollar",
        "Hong Kong Dollar",
        "Indonesian Rupiah",
        "Iranian Rial",
        "Iraqi Dinar",
        "Israeli New Shekel",
        "Japanese Yen",
        "Mexican Peso",
        "New Zealand Dollar",
        "Pakistani Rupee",
        "Qatari Riyal",
        "Russian Ruble",
        "Saudi Riyal",
        "Singapore Dollar",
        "South Korea Won",
        "United Arab Emirates Dirham",
        "Srilankan Rupee"};
    
    

    double usd=1.28;
    double indianrupee=105.52;
    double brazil=6.26;
    double canada=1.71;
    double australia=1.94;
    double hongkong=9.98;
    double indonasia=19377.79;
    double iran=54034.54;
    double iraq=1671.87;
    double israel=4.74;
    double japan=183.65;
    double mexico=21.74;
    double newzealand=2.10;
    double pakistan=367.28;
    double qatar=4.65;
    double russia=124.80;
    double saudi=4.79;
    double singapore=1.72;
    double southkorea=1674.93;
    double uae=4.69;
    double srilanka=408.35;
    
    public Currency() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        cb1l = new javax.swing.JLabel();
        cb2l = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Currency Converter");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText(" From Country");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("To Country");

        cb1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose one...", "USA", "INDIA", "BRAZIL", "CANADA", "AUSTRALIA", "HONG KONG", "INDONASIA", "IRAN", "IRAQ", "ISRAEL", "JAPAN", "MEXICO", "NEW ZEALAND", "PAKISTAN", "QATAR", "RUSSIA", "SAUDI AREBIA", "SINGAPORE", "SOUTH KOREA", "UAE", "SRILANKA" }));
        cb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb1ItemStateChanged(evt);
            }
        });
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        cb2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose one...", "USA", "INDIA", "BRAZIL", "CANADA", "AUSTRALIA", "HONG KONG", "INDONASIA", "IRAN", "IRAQ", "ISRAEL", "JAPAN", "MEXICO", "NEW ZEALAND", "PAKISTAN", "QATAR", "RUSSIA", "SAUDI AREBIA", "SINGAPORE", "SOUTH KOREA", "UAE", "SRILANKA" }));
        cb2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb2ItemStateChanged(evt);
            }
        });
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        tf1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });

        tf2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });

        cb1l.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cb1l.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cb1l.setText("units");

        cb2l.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cb2l.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cb2l.setText("units");

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Convert Currency");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 102, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 51, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cb1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cb1l, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(198, 198, 198))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb2l, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1l)
                    .addComponent(cb2l, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(cb1.getSelectedIndex()==0||cb2.getSelectedIndex()==0||tf1.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Select Country And Fill Currency Amount","Error Meassage",JOptionPane.INFORMATION_MESSAGE);
         
        double amount=Double.parseDouble(tf1.getText());
        
        double amtinpounds=0.0;
        switch(cb1.getSelectedItem().toString())
        {
            case "USA":
                amtinpounds=amount/usd;
                break;
            case "INDIA":
                amtinpounds=amount/indianrupee;
                break;
            case "BRAZIL":
                amtinpounds=amount/brazil;
                break;
            case "CANADA":
                amtinpounds=amount/canada;
                break;
            case "AUSTRALIA":
                amtinpounds=amount/australia;
                break;
            case "HONG KONG":
                amtinpounds=amount/hongkong;
                break;
            case "INDONASIA":
                amtinpounds=amount/indonasia;
                break;
            case "IRAN":
                amtinpounds=amount/iran;
                break;
            case "IRAQ":
                amtinpounds=amount/iraq;
                break;
            case "ISRAEL":
                amtinpounds=amount/israel;
                break;
            case "JAPAN":
                amtinpounds=amount/japan;
                break;
            case "MEXICO":
                amtinpounds=amount/mexico;
                break;
            case "NEW ZEALAND":
                amtinpounds=amount/newzealand;
                break;
            case "PAKISTAN":
                amtinpounds=amount/pakistan;
                break;
            case "QATAR":
                amtinpounds=amount/qatar;
                break;
            case "RUSSIA":
                amtinpounds=amount/russia;
                break;
            case "SAUDI AREBIA":
                amtinpounds=amount/saudi;
                break;
            case "SINGAPORE":
                amtinpounds=amount/singapore;
                break;
            case "SOUTH KOREA":
                amtinpounds=amount/southkorea;
                break;
            case "UAE":
                amtinpounds=amount/uae;
                break;
            case "SRILANKA":
                amtinpounds=amount/srilanka;
                break;
        }
        
        
        double amtchange=0.0;
        switch(cb2.getSelectedItem().toString())
        {
            case "USA":
                amtchange=amtinpounds*usd;
                break;
            case "INDIA":
                amtchange=amtinpounds*indianrupee;
                break;
            case "BRAZIL":
                amtchange=amtinpounds*brazil;
                break;
            case "CANADA":
                amtchange=amtinpounds*canada;
                break;
            case "AUSTRALIA":
                amtchange=amtinpounds*australia;
                break;
            case "HONG KONG":
                amtchange=amtinpounds*hongkong;
                break;
            case "INDONASIA":
                amtchange=amtinpounds*indonasia;
                break;
            case "IRAN":
                amtchange=amtinpounds*iran;
                break;
            case "IRAQ":
                amtchange=amtinpounds*iraq;
                break;
            case "ISRAEL":
                amtchange=amtinpounds*israel;
                break;
            case "JAPAN":
                amtchange=amtinpounds*japan;
                break;
            case "MEXICO":
                amtchange=amtinpounds*mexico;
                break;
            case "NEW ZEALAND":
                amtchange=amtinpounds*newzealand;
                break;
            case "PAKISTAN":
                amtchange=amtinpounds*pakistan;
                break;
            case "QATAR":
                amtchange=amtinpounds*qatar;
                break;
            case "RUSSIA":
                amtchange=amtinpounds*russia;
                break;
            case "SAUDI AREBIA":
                amtchange=amtinpounds*saudi;
                break;
            case "SINGAPORE":
                amtchange=amtinpounds*singapore;
                break;
            case "SOUTH KOREA":
                amtchange=amtinpounds*southkorea;
                break;
            case "UAE":
                amtchange=amtinpounds*uae;
                break;
            case "SRILANKA":
                amtchange=amtinpounds*srilanka;
                break;
        }
        
        String amt=String.format("%.2f", amtchange);
        tf2.setText(amt);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cb1.setSelectedIndex(0);
        cb2.setSelectedIndex(0);
        tf1.setText("");
        tf2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb1ItemStateChanged
        // TODO add your handling code here:
        
        int pos=cb1.getSelectedIndex();
        
        cb1l.setText(currencyunit[pos]);
    }//GEN-LAST:event_cb1ItemStateChanged

    private void cb2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb2ItemStateChanged
        // TODO add your handling code here
        int pos=cb2.getSelectedIndex();
        cb2l.setText(currencyunit[pos]);
    }//GEN-LAST:event_cb2ItemStateChanged

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Currency().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JLabel cb1l;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JLabel cb2l;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
