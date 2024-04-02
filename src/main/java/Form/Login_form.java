/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import Controller.Service;
import env.Env;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import Database.MyConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import env.Env;

/**
 *
 * @author Admin
 */
public class Login_form extends javax.swing.JFrame {

    private Service sv = new Service();

    /**
     * Creates new form Login
     */
    public Login_form() {
        initComponents();
   
    }

    public void Start() {
    }

    ;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CoverPanelCDK_Login = new javax.swing.JPanel();
        btlDangkithongtin = new javax.swing.JButton();
        btn_ChangetoDK = new javax.swing.JLabel();
        themeCover_Login1 = new javax.swing.JLabel();
        panel_DangNhap = new javax.swing.JPanel();
        txtTaikhoan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMatkhau = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        rbtlSetrole = new javax.swing.JRadioButton();
        CoverPanelCDN_Login = new javax.swing.JPanel();
        btl_ChangetoDN = new javax.swing.JLabel();
        themeCover_Login = new javax.swing.JLabel();
        panel_DangKy = new javax.swing.JPanel();
        txt_Username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        Panel_bg_login = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(559, 360));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CoverPanelCDK_Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btlDangkithongtin.setText("Điền thông tin ");
        btlDangkithongtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlDangkithongtinActionPerformed(evt);
            }
        });
        CoverPanelCDK_Login.add(btlDangkithongtin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, 40));

        btn_ChangetoDK.setIcon(new javax.swing.ImageIcon("C:\\Users\\tuann\\OneDrive\\Tài liệu\\Baitap\\năm 3 kỳ 3\\Java nâng cao\\Src\\btn_DangKy.png")); // NOI18N
        btn_ChangetoDK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ChangetoDK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ChangetoDKMouseClicked(evt);
            }
        });
        CoverPanelCDK_Login.add(btn_ChangetoDK, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 180, 40));

        themeCover_Login1.setIcon(new javax.swing.ImageIcon("C:\\Users\\tuann\\Downloads\\coverPanel.png")); // NOI18N
        CoverPanelCDK_Login.add(themeCover_Login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 360));

        getContentPane().add(CoverPanelCDK_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 200, 360));

        panel_DangNhap.setBackground(new java.awt.Color(153, 255, 204));
        panel_DangNhap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTaikhoan.setBackground(new java.awt.Color(204, 255, 255));
        txtTaikhoan.setToolTipText("Username");
        panel_DangNhap.add(txtTaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 180, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Password:");
        panel_DangNhap.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Username:");
        panel_DangNhap.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 30));

        txtMatkhau.setBackground(new java.awt.Color(204, 255, 255));
        txtMatkhau.setToolTipText("Password");
        panel_DangNhap.add(txtMatkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 180, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ĐĂNG NHẬP");
        panel_DangNhap.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 340, 60));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\tuann\\OneDrive\\Tài liệu\\Baitap\\năm 3 kỳ 3\\Java nâng cao\\Src\\btn_DangNhap.png")); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel_DangNhap.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 120, 40));

        rbtlSetrole.setBackground(new java.awt.Color(153, 255, 204));
        rbtlSetrole.setText("Đăng nhập Bằng Quyền Admin");
        rbtlSetrole.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtlSetroleMouseClicked(evt);
            }
        });
        panel_DangNhap.add(rbtlSetrole, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 200, 40));

        getContentPane().add(panel_DangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 360));

        CoverPanelCDN_Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btl_ChangetoDN.setIcon(new javax.swing.ImageIcon("C:\\Users\\tuann\\Downloads\\btn_DangNhap.png")); // NOI18N
        btl_ChangetoDN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btl_ChangetoDNMouseClicked(evt);
            }
        });
        CoverPanelCDN_Login.add(btl_ChangetoDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 170, 40));

        themeCover_Login.setIcon(new javax.swing.ImageIcon("C:\\Users\\tuann\\OneDrive\\Tài liệu\\Baitap\\năm 3 kỳ 3\\Java nâng cao\\Src\\coverPanel.png")); // NOI18N
        CoverPanelCDN_Login.add(themeCover_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 358));

        getContentPane().add(CoverPanelCDN_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, 200, 360));

        panel_DangKy.setBackground(new java.awt.Color(153, 255, 204));
        panel_DangKy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Username.setBackground(new java.awt.Color(204, 255, 255));
        txt_Username.setToolTipText("Username");
        panel_DangKy.add(txt_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 180, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Password:");
        panel_DangKy.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Username:");
        panel_DangKy.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 30));

        txt_Password.setBackground(new java.awt.Color(204, 255, 255));
        txt_Password.setToolTipText("Password");
        panel_DangKy.add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 180, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ĐĂNG KÝ");
        panel_DangKy.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 340, 60));

        getContentPane().add(panel_DangKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 340, 360));

        Panel_bg_login.setBackground(new java.awt.Color(204, 255, 255));
        Panel_bg_login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel_bg_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Panel_bg_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ChangetoDKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ChangetoDKMouseClicked
        Timer timer = new Timer(10, new ActionListener() {
            int Endtime = 0;
            int XpanelDangNhap = 0;
            int XcoverDangnhap = 340;
            int XcoverDangky = -540;
            int XpanelDangKy = 740;

            @Override
            public void actionPerformed(ActionEvent e) {
                XpanelDangNhap -= 5;
                XcoverDangnhap += 5;
                XcoverDangky += 5;
                XpanelDangKy -= 5;
                Endtime += 5;

                if (XpanelDangNhap >= -340) {
                    panel_DangNhap.setLocation(XpanelDangNhap, panel_DangNhap.getY());
                }
                if (XcoverDangnhap <= 540) {
                    CoverPanelCDK_Login.setLocation(XcoverDangnhap, CoverPanelCDK_Login.getY());
                }
                if (XcoverDangky <= 0) {
                    CoverPanelCDN_Login.setLocation(XcoverDangky, CoverPanelCDN_Login.getY());
                }
                if (XpanelDangKy >= 200) {
                    panel_DangKy.setLocation(XpanelDangKy, panel_DangKy.getY());
                }
                if (Endtime > 600) {
                    ((Timer) e.getSource()).stop();
                    Endtime = 0;
                }
            }
        });
        timer.start();
    }//GEN-LAST:event_btn_ChangetoDKMouseClicked

    private void btl_ChangetoDNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btl_ChangetoDNMouseClicked
        // TODO add your handling code here:
        Timer timer1 = new Timer(10, new ActionListener() {
            int Endtime = 0;
            int XcoverDangky = 0;
            int XpanelDangKy = 200;
            int XpanelDangNhap = -540;
            int XcoverDangnhap = 740;

            @Override
            public void actionPerformed(ActionEvent e) {
                XcoverDangky -= 5;
                XpanelDangKy += 5;
                XpanelDangNhap += 5;
                XcoverDangnhap -= 5;
                Endtime += 5;

                if (XcoverDangky >= -200) {
                    CoverPanelCDN_Login.setLocation(XcoverDangky, CoverPanelCDN_Login.getY());
                }
                if (XpanelDangKy <= 540) {
                    panel_DangKy.setLocation(XpanelDangKy, panel_DangKy.getY());
                }
                if (XpanelDangNhap <= 0) {
                    panel_DangNhap.setLocation(XpanelDangNhap, panel_DangNhap.getY());
                }
                if (XcoverDangnhap >= 340) {
                    CoverPanelCDK_Login.setLocation(XcoverDangnhap, CoverPanelCDK_Login.getY());
                }

                if (Endtime >= 600) {
                    ((Timer) e.getSource()).stop();
                }
//                if(Endtime>600){
//                    ((Timer) e.getSource()).stop();
//                    Endtime=0;
//                }
            }
        });
        timer1.start();
    }//GEN-LAST:event_btl_ChangetoDNMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String user = txtTaikhoan.getText();
        String pass = new String(txtMatkhau.getPassword());

        try {
            if (user.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đủ thông tin");
            } else if (sv.Login("taikhoan", user, pass, Env.role)) {
                TakeIdkhach();
                System.out.println("Đăng nhập thành công!");
                TrangChu_form trangchu = new TrangChu_form();
                trangchu.setVisible(true);               
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Sai tài khoản hoặc mật khẩu");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbtlSetroleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtlSetroleMouseClicked
        // TODO add your handling code here:
        if (rbtlSetrole.isSelected()) {
            Env.role = "admin";
        } else {
            Env.role = "khach";
        }
    }//GEN-LAST:event_rbtlSetroleMouseClicked

    private void btlDangkithongtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlDangkithongtinActionPerformed
        // TODO add your handling code here:
        Dangkithongtin_form dangkiTT = new Dangkithongtin_form();
        dangkiTT.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btlDangkithongtinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        Start();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_form().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CoverPanelCDK_Login;
    private javax.swing.JPanel CoverPanelCDN_Login;
    private javax.swing.JPanel Panel_bg_login;
    private javax.swing.JButton btlDangkithongtin;
    private javax.swing.JLabel btl_ChangetoDN;
    private javax.swing.JLabel btn_ChangetoDK;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panel_DangKy;
    private javax.swing.JPanel panel_DangNhap;
    private javax.swing.JRadioButton rbtlSetrole;
    private javax.swing.JLabel themeCover_Login;
    private javax.swing.JLabel themeCover_Login1;
    private javax.swing.JPasswordField txtMatkhau;
    private javax.swing.JTextField txtTaikhoan;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables

    private void TakeIdkhach() {
        Connection conn = new MyConnect().getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String user = txtTaikhoan.getText();
        
        try {
            String query = "SELECT maKh FROM taikhoan WHERE username = ? ";
            statement = conn.prepareStatement(query);
            statement.setString(1, user);
            
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
               Env.idKhach = resultSet.getString("maKh");      
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
