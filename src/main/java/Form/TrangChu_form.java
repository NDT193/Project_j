/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import Controller.Service;
import env.Env;
import javax.swing.JPanel;

/**
 *
 * @author tuann
 */
public class TrangChu_form extends javax.swing.JFrame {

    /**
     * Creates new form TrangChu_form
     */
    private Service sv = new Service();

    public TrangChu_form() {
        initComponents();

        if (Env.role.equals("khach")) {
            btlQuanlisanpham.setEnabled(false);
            btlQuanlidanhmuc.setEnabled(false);
            btlBaocaothongke.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btlChitietdonhang = new javax.swing.JButton();
        btlQuanlisanpham = new javax.swing.JButton();
        btlBaocaothongke = new javax.swing.JButton();
        btlQuanlidanhmuc = new javax.swing.JButton();
        btl_TTtaikhoan = new javax.swing.JButton();
        btl_TTtaikhoan1 = new javax.swing.JButton();
        btl_TTtaikhoan2 = new javax.swing.JButton();
        swPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jTextField1.setBackground(new java.awt.Color(0, 204, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setText("Cửa Hàng Linh Kiện Điện Tử");

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\tuann\\OneDrive\\Tài liệu\\Baitap\\năm 3 kỳ 3\\Java nâng cao\\Src\\delivery-box.png")); // NOI18N
        jButton1.setText("Thông tin sản phẩm");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btlChitietdonhang.setBackground(new java.awt.Color(0, 204, 255));
        btlChitietdonhang.setIcon(new javax.swing.ImageIcon("C:\\Users\\tuann\\OneDrive\\Tài liệu\\Baitap\\năm 3 kỳ 3\\Java nâng cao\\Src\\shopping-list.png")); // NOI18N
        btlChitietdonhang.setText("Chi Tiết Đơn Hàng");
        btlChitietdonhang.setBorderPainted(false);
        btlChitietdonhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlChitietdonhangActionPerformed(evt);
            }
        });

        btlQuanlisanpham.setBackground(new java.awt.Color(0, 204, 255));
        btlQuanlisanpham.setIcon(new javax.swing.ImageIcon("C:\\Users\\tuann\\OneDrive\\Tài liệu\\Baitap\\năm 3 kỳ 3\\Java nâng cao\\Src\\box.png")); // NOI18N
        btlQuanlisanpham.setText("Quản Lý Sản Phẩm");
        btlQuanlisanpham.setBorderPainted(false);
        btlQuanlisanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlQuanlisanphamActionPerformed(evt);
            }
        });

        btlBaocaothongke.setBackground(new java.awt.Color(0, 204, 255));
        btlBaocaothongke.setIcon(new javax.swing.ImageIcon("C:\\Users\\tuann\\OneDrive\\Tài liệu\\Baitap\\năm 3 kỳ 3\\Java nâng cao\\Src\\accounting.png")); // NOI18N
        btlBaocaothongke.setText("Báo Cáo Thống Kê");
        btlBaocaothongke.setBorderPainted(false);
        btlBaocaothongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlBaocaothongkeActionPerformed(evt);
            }
        });

        btlQuanlidanhmuc.setBackground(new java.awt.Color(0, 204, 255));
        btlQuanlidanhmuc.setIcon(new javax.swing.ImageIcon("C:\\Users\\tuann\\OneDrive\\Tài liệu\\Baitap\\năm 3 kỳ 3\\Java nâng cao\\Src\\timeline.png")); // NOI18N
        btlQuanlidanhmuc.setText("Quản Lý Danh Mục");
        btlQuanlidanhmuc.setBorderPainted(false);
        btlQuanlidanhmuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlQuanlidanhmucActionPerformed(evt);
            }
        });

        btl_TTtaikhoan.setBackground(new java.awt.Color(0, 204, 255));
        btl_TTtaikhoan.setIcon(new javax.swing.ImageIcon("C:\\Users\\tuann\\OneDrive\\Tài liệu\\Baitap\\năm 3 kỳ 3\\Java nâng cao\\Src\\user.png")); // NOI18N
        btl_TTtaikhoan.setBorderPainted(false);
        btl_TTtaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btl_TTtaikhoanActionPerformed(evt);
            }
        });

        btl_TTtaikhoan1.setBackground(new java.awt.Color(0, 204, 255));
        btl_TTtaikhoan1.setIcon(new javax.swing.ImageIcon("C:\\Users\\tuann\\OneDrive\\Tài liệu\\Baitap\\năm 3 kỳ 3\\Java nâng cao\\Src\\cart.png")); // NOI18N
        btl_TTtaikhoan1.setBorderPainted(false);
        btl_TTtaikhoan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btl_TTtaikhoan1ActionPerformed(evt);
            }
        });

        btl_TTtaikhoan2.setBackground(new java.awt.Color(0, 204, 255));
        btl_TTtaikhoan2.setIcon(new javax.swing.ImageIcon("C:\\Users\\tuann\\OneDrive\\Tài liệu\\Baitap\\năm 3 kỳ 3\\Java nâng cao\\Src\\logout.png")); // NOI18N
        btl_TTtaikhoan2.setBorderPainted(false);
        btl_TTtaikhoan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btl_TTtaikhoan2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btlChitietdonhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btlQuanlisanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btlQuanlidanhmuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btlBaocaothongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btl_TTtaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btl_TTtaikhoan1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btl_TTtaikhoan2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btlChitietdonhang, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btlQuanlisanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btlQuanlidanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btlBaocaothongke, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btl_TTtaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btl_TTtaikhoan1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btl_TTtaikhoan2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        swPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(swPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(swPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Sanpham_panel sanpham = new Sanpham_panel();
        sv.Switch(swPanel, sanpham);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btlQuanlidanhmucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlQuanlidanhmucActionPerformed
        // TODO add your handling code here:
        QuanliDanhmuc_Form dm = new QuanliDanhmuc_Form();
        sv.Switch(swPanel, dm);
    }//GEN-LAST:event_btlQuanlidanhmucActionPerformed

    private void btlQuanlisanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlQuanlisanphamActionPerformed
        // TODO add your handling code here:
        QuanliSanpham_panel qlsp = new QuanliSanpham_panel();
        sv.Switch(swPanel, qlsp);
    }//GEN-LAST:event_btlQuanlisanphamActionPerformed

    private void btlChitietdonhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlChitietdonhangActionPerformed
        // TODO add your handling code here:   
        Chitietdonhang_panel chitietdonhang = new Chitietdonhang_panel();
        sv.Switch(swPanel, chitietdonhang);
    }//GEN-LAST:event_btlChitietdonhangActionPerformed

    private void btlBaocaothongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlBaocaothongkeActionPerformed
        // TODO add your handling code here:
        Baocaothongke_panel baocao = new Baocaothongke_panel();
        sv.Switch(swPanel, baocao);

    }//GEN-LAST:event_btlBaocaothongkeActionPerformed

    private void btl_TTtaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btl_TTtaikhoanActionPerformed
        // TODO add your handling code here:
        Thongtintaikhoan_panel tt = new Thongtintaikhoan_panel();
        sv.Switch(swPanel, tt);
    }//GEN-LAST:event_btl_TTtaikhoanActionPerformed

    private void btl_TTtaikhoan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btl_TTtaikhoan2ActionPerformed
        // TODO add your handling code here:
        Login_form log = new Login_form();
        log.setVisible(true);
        this.setVisible(false);
        Env.idKhach = "";
        Env.role= "khach";        
    }//GEN-LAST:event_btl_TTtaikhoan2ActionPerformed

    private void btl_TTtaikhoan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btl_TTtaikhoan1ActionPerformed
        // TODO add your handling code here:
        Giohang_form giohang = new Giohang_form();
        sv.Switch(swPanel, giohang);
    }//GEN-LAST:event_btl_TTtaikhoan1ActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChu_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu_form().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlBaocaothongke;
    private javax.swing.JButton btlChitietdonhang;
    private javax.swing.JButton btlQuanlidanhmuc;
    private javax.swing.JButton btlQuanlisanpham;
    private javax.swing.JButton btl_TTtaikhoan;
    private javax.swing.JButton btl_TTtaikhoan1;
    private javax.swing.JButton btl_TTtaikhoan2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel swPanel;
    // End of variables declaration//GEN-END:variables

}
