
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.awt.FwDispatcher;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class FormNhap extends javax.swing.JFrame {

    ArrayList<NhanVien> dsnv = new ArrayList();
    String headerString[] = {"Ho va ten", "Ngay sinh", "Dia chi", "Gioi tinh", "Phong ban", "He so luong", "Tham nien", "Luong co ban"};
    DefaultTableModel model = new DefaultTableModel(headerString, 0);

    /**
     * Creates new form FormNhap
     */
    public FormNhap() {
        initComponents();
        tbl1.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHT = new javax.swing.JTextField();
        txtNS = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHSL = new javax.swing.JTextField();
        txtTN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rbNam = new javax.swing.JRadioButton();
        rbNu = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtLCB = new javax.swing.JTextField();
        btnLF = new javax.swing.JButton();
        btnHTTB = new javax.swing.JButton();
        btnThemNv = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        btnDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ho va ten");

        jLabel2.setText("Ngay sinh");

        jLabel3.setText("Dia chi");

        jLabel4.setText("Gioi tinh");

        jLabel5.setText("Phong ban");

        jLabel6.setText("He so luong");

        jLabel7.setText("Tham nien");

        buttonGroup1.add(rbNam);
        rbNam.setText("Nam");
        rbNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNamActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbNu);
        rbNu.setText("Nu");

        jLabel8.setText("Luong co ban");

        btnLF.setText("Luu vao File");
        btnLF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLFActionPerformed(evt);
            }
        });

        btnHTTB.setText("Hien thi trong table");
        btnHTTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHTTBActionPerformed(evt);
            }
        });

        btnThemNv.setText("Them nhan vien");
        btnThemNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNvActionPerformed(evt);
            }
        });

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl1);

        btnDF.setText("Doc FIle");
        btnDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbNam)
                                .addGap(18, 18, 18)
                                .addComponent(rbNu))
                            .addComponent(txtHT, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(txtNS)
                            .addComponent(txtDC)
                            .addComponent(txtPB)
                            .addComponent(txtHSL)
                            .addComponent(txtTN)
                            .addComponent(txtLCB)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThemNv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDF)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHTTB)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rbNam)
                            .addComponent(rbNu))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtHSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtLCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLF)
                    .addComponent(btnHTTB)
                    .addComponent(btnThemNv)
                    .addComponent(btnDF))
                .addContainerGap(439, Short.MAX_VALUE))
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

    private void rbNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNamActionPerformed

    private void btnLFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLFActionPerformed
        // TODO add your handling code here:
        if (dsnv.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Yeu cau nhap du thong tin");
        } else {
            try {
                File f = new File("nhanvien.dat");
                FileWriter fw = new FileWriter(f);
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < dsnv.size(); i++) {
                    fw.write(dsnv.get(i).toString());
                    fw.write("\n");
                }
                fw.close();
                bw.close();
                JOptionPane.showMessageDialog(rootPane, "Doc File thanh cong");

            } catch (Exception e) {
            }

        }

    }//GEN-LAST:event_btnLFActionPerformed

    private void btnThemNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNvActionPerformed
        // TODO add your handling code here:
        if (txtHT.getText().isEmpty() || txtNS.getText().isEmpty() || txtDC.getText().isEmpty() || txtPB.getText().isEmpty() || txtHSL.getText().isEmpty() || txtLCB.getText().isEmpty() || txtTN.getText().isEmpty() || !buttonGroup1.getSelection().isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Vui long nhap du thong tin");

        }
        NhanVien nv = new NhanVien();
        nv.setHT(txtHT.getText());
        nv.setNS(txtNS.getText());
        nv.setDC(txtDC.getText());
        nv.setPB(txtPB.getText());
        if (rbNam.isSelected()) {
            nv.setGT("Nam");

        }
        if (rbNu.isSelected()) {
            nv.setGT("Nu");

        }
        nv.setHSL(Float.parseFloat(txtHSL.getText()));
        nv.setLCB(Float.parseFloat(txtLCB.getText()));
        nv.setTN(Float.parseFloat(txtTN.getText()));
        nv.setLTL(nv.LCB * nv.HSL * (1 + nv.TN / 100));
        System.out.println(nv.toString());
        dsnv.add(nv);
        JOptionPane.showMessageDialog(rootPane, "Them nhan vien thanh cong");

    }//GEN-LAST:event_btnThemNvActionPerformed

    private void btnHTTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHTTBActionPerformed
        // TODO add your handling code here:
        String GT = "";
        if (rbNam.isSelected()) {
            GT = "Nam";
        } else {
            GT = "Nu";
        }
        model.addRow(new Object[]{txtHT.getText(), txtNS.getText(), txtDC.getText(), GT, txtPB.getText(), txtHSL.getText(), txtTN.getText(), txtLCB.getText()});

    }//GEN-LAST:event_btnHTTBActionPerformed

    private void btnDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDFActionPerformed
        // TODO add your handling code here:
        try {
            File f = new File("nhanvien.dat");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String lineString;
            while ((lineString = br.readLine()) != null) {
                String resultString[] = new String[9];
                resultString = lineString.split("\\$");
                NhanVien nv = new NhanVien();
                nv.setHT(resultString[0]);
                nv.setNS(resultString[1]);
                nv.setDC(resultString[2]);
                nv.setPB(resultString[3]);
                nv.setGT(resultString[4]);
                nv.setHSL(Float.parseFloat(resultString[5]));
                nv.setLCB(Float.parseFloat(resultString[6]));
                nv.setTN(Float.parseFloat(resultString[7]));
                nv.setLTL(nv.LCB * nv.HSL * (1 + nv.TN / 100));
                dsnv.add(nv);

            }
            fr.close();
            br.close();
            JOptionPane.showMessageDialog(rootPane, "Doc File thanh cong");

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnDFActionPerformed

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
            java.util.logging.Logger.getLogger(FormNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDF;
    private javax.swing.JButton btnHTTB;
    private javax.swing.JButton btnLF;
    private javax.swing.JButton btnThemNv;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JRadioButton rbNu;
    private javax.swing.JTable tbl1;
    private javax.swing.JTextField txtDC;
    private javax.swing.JTextField txtHSL;
    private javax.swing.JTextField txtHT;
    private javax.swing.JTextField txtLCB;
    private javax.swing.JTextField txtNS;
    private javax.swing.JTextField txtPB;
    private javax.swing.JTextField txtTN;
    // End of variables declaration//GEN-END:variables
}