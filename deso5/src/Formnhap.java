
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class Formnhap extends javax.swing.JFrame {

    ArrayList<SinhvienATTT> dssvattt = new ArrayList();
    ArrayList<SinhvienMatMa> dssvmm = new ArrayList();

    /**
     * Creates new form Formnhap
     */
    public Formnhap() {
        initComponents();
        txtHP.setEnabled(false);
        txtDV.setEnabled(false);
        txtLuong.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtn_GT = new javax.swing.ButtonGroup();
        gbtn_Chon = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHT = new javax.swing.JTextField();
        txtNS = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMSV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDTB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtHP = new javax.swing.JTextField();
        txtDV = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        rbSvattt = new javax.swing.JRadioButton();
        rbSvmm = new javax.swing.JRadioButton();
        rbNam = new javax.swing.JRadioButton();
        rbNu = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnLF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ho va ten");

        jLabel2.setText("Ngay sinh");

        jLabel3.setText("Gioi tinh");

        jLabel4.setText("Ma sinh vien");

        jLabel5.setText("Diem trung binh");

        jLabel7.setText("Hoc phi");

        jLabel8.setText("Don vi");

        jLabel9.setText("Luong");

        gbtn_Chon.add(rbSvattt);
        rbSvattt.setText("Sinh vien ATTT");
        rbSvattt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSvatttActionPerformed(evt);
            }
        });

        gbtn_Chon.add(rbSvmm);
        rbSvmm.setText("Sinh vien Mat Ma");
        rbSvmm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSvmmActionPerformed(evt);
            }
        });

        gbtn_GT.add(rbNam);
        rbNam.setText("Nam");

        gbtn_GT.add(rbNu);
        rbNu.setText("Nu");

        btnThem.setText("Them sinh vien");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnLF.setText("Luu vao file");
        btnLF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnLF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDV, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHP, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHT, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNS, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMSV, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbSvattt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbSvmm))
                    .addComponent(txtDTB, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbNam)
                        .addGap(18, 18, 18)
                        .addComponent(rbNu)))
                .addContainerGap(267, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbNam)
                    .addComponent(rbNu))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSvattt)
                    .addComponent(rbSvmm))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnLF))
                .addContainerGap(389, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (rbSvattt.isSelected()) {
            if (txtHT.getText().isEmpty() || txtNS.getText().isEmpty() || txtMSV.getText().isEmpty() || txtDTB.getText().isEmpty() || txtHP.getText().isEmpty() || !gbtn_GT.getSelection().isSelected()) {
                JOptionPane.showMessageDialog(rootPane, "Vui long nhap du thong tin");
            } else {
                SinhvienATTT svattt = new SinhvienATTT();
                svattt.setHT(txtHT.getText());
                svattt.setNS(txtNS.getText());
                svattt.setMSV(txtMSV.getText());
                svattt.setDTB(txtDTB.getText());
                svattt.setHP(txtHP.getText());
                if (rbNam.isSelected()) {
                    svattt.setGT("Nam");

                }
                if (rbNu.isSelected()) {
                    svattt.setGT("Nu");

                }
                dssvattt.add(svattt);
                System.out.println(svattt.toString());
                JOptionPane.showMessageDialog(rootPane, "Nhap thong tin thanh cong");

            }
        } else if (rbSvmm.isSelected()) {
            if (txtHT.getText().isEmpty() || txtNS.getText().isEmpty() || txtMSV.getText().isEmpty() || txtDTB.getText().isEmpty() || txtDV.getText().isEmpty() || txtLuong.getText().isEmpty() || !gbtn_GT.getSelection().isSelected()) {
                JOptionPane.showMessageDialog(rootPane, "Vui long nhap du thong tin");
            } else {
                SinhvienMatMa svmm = new SinhvienMatMa();
                svmm.setHT(txtHT.getText());
                svmm.setNS(txtNS.getText());
                svmm.setMSV(txtMSV.getText());
                svmm.setDTB(txtDTB.getText());
                svmm.setDV(txtHP.getText());
                svmm.setLuong(txtLuong.getText());
                if (rbNam.isSelected()) {
                    svmm.setGT("Nam");

                }
                if (rbNu.isSelected()) {
                    svmm.setGT("Nu");

                }
                dssvmm.add(svmm);
                System.out.println(svmm.toString());
                JOptionPane.showMessageDialog(rootPane, "Nhap thong tin thanh cong");

            }

        }


    }//GEN-LAST:event_btnThemActionPerformed

    public void resetAll() {
        txtHT.setText("");
        txtNS.setText("");
        txtMSV.setText("");
        txtDTB.setText("");
        txtDTB.setText("");
        gbtn_GT.clearSelection();
        gbtn_Chon.clearSelection();
        txtHP.setText("");
        txtDV.setText("");
        txtLuong.setText("");
    }

    private void rbSvatttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSvatttActionPerformed
        // TODO add your handling code here:
        txtHP.setEnabled(true);
        txtHP.setText("");
        txtDV.setEnabled(false);
        txtDV.setText("");
        txtLuong.setEnabled(false);
        txtLuong.setText("");

    }//GEN-LAST:event_rbSvatttActionPerformed

    private void rbSvmmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSvmmActionPerformed
        // TODO add your handling code here:
        txtHP.setEnabled(false);
        txtHP.setText("");
        txtDV.setEnabled(true);
        txtDV.setText("");
        txtLuong.setEnabled(true);
        txtLuong.setText("");

    }//GEN-LAST:event_rbSvmmActionPerformed

    private void btnLFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLFActionPerformed
        // TODO add your handling code here:
        if (txtHT.getText().isEmpty() || txtNS.getText().isEmpty() || txtMSV.getText().isEmpty() || txtDTB.getText().isEmpty() || !gbtn_GT.getSelection().isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Vui long nhap du thong tin");
        } else {
            if (rbSvattt.isSelected()) {
                if (txtHP.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "Vui long nhap du thong tin");
                } else {
                    try {
                        File f = new File("svat.dat");
                        FileWriter fw = new FileWriter(f);
                        SinhvienATTT svattt = new SinhvienATTT();
                        svattt.setHT(txtHT.getText());
                        svattt.setNS(txtNS.getText());
                        svattt.setMSV(txtMSV.getText());
                        svattt.setDTB(txtDTB.getText());
                        svattt.setHP(txtHP.getText());
                        if (rbNam.isSelected()) {
                            svattt.setGT("Nam");

                        }
                        if (rbNu.isSelected()) {
                            svattt.setGT("Nu");

                        }
                        fw.write(svattt.toString());
                        fw.write("\n");
                        fw.close();
                        JOptionPane.showMessageDialog(rootPane, "Luu vao file thanh cong");
                        resetAll();

                    } catch (Exception e) {
                    }
                }
            } else if (rbSvmm.isSelected()) {
                if (txtDV.getText().isEmpty() || txtLuong.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "Vui long nhap du thong tin");
                } else {
                    try {
                        File f = new File("svmm.dat");
                        FileWriter fw = new FileWriter(f);
                        SinhvienMatMa svmm = new SinhvienMatMa();
                        svmm.setHT(txtHT.getText());
                        svmm.setNS(txtNS.getText());
                        svmm.setMSV(txtMSV.getText());
                        svmm.setDTB(txtDTB.getText());
                        svmm.setDV(txtHP.getText());
                        svmm.setLuong(txtLuong.getText());
                        if (rbNam.isSelected()) {
                            svmm.setGT("Nam");

                        }
                        if (rbNu.isSelected()) {
                            svmm.setGT("Nu");

                        }
                        fw.write(svmm.toString());
                        fw.write("\n");
                        fw.close();
                        JOptionPane.showMessageDialog(rootPane, "Luu vao file thanh cong");
                        resetAll();

                    } catch (Exception e) {
                    }

                }
            }
        }


    }//GEN-LAST:event_btnLFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formnhap.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formnhap.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formnhap.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formnhap.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formnhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLF;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup gbtn_Chon;
    private javax.swing.ButtonGroup gbtn_GT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JRadioButton rbNu;
    private javax.swing.JRadioButton rbSvattt;
    private javax.swing.JRadioButton rbSvmm;
    private javax.swing.JTextField txtDTB;
    private javax.swing.JTextField txtDV;
    private javax.swing.JTextField txtHP;
    private javax.swing.JTextField txtHT;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMSV;
    private javax.swing.JTextField txtNS;
    // End of variables declaration//GEN-END:variables
}