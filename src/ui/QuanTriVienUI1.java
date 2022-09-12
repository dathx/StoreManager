/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import DAO.NhanVienDAO;
import Entity.NhanVien;
import Utils.Auth;
import Utils.MsgBox;
import bean.DanhMucBean;
import controller.ChuyenManHinh;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.Timer;
import Music.Nhac;
import Utils.XImage;
import Music.Nhac;
import ui.DoiMatKhauJDialog;
import Music.Nhac;

/**
 *
 * @author Vu Hoang Phuc
 */
public class QuanTriVienUI1 extends javax.swing.JFrame {

    /**
     * Creates new form QuanTriVienUI
     */
    public QuanTriVienUI1() {

        initComponents();
        init();

        ChuyenManHinh controller = new ChuyenManHinh(jpnView);
        controller.setDashboard(pnlTrangChu, lblTrangChu);

        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("TrangChu", pnlTrangChu, lblTrangChu));
        listItem.add(new DanhMucBean("DonHang", pnlDongHang, lblDonHang));
        listItem.add(new DanhMucBean("KhachHang", pnlKhachHang, lblKhachHang));
        listItem.add(new DanhMucBean("NhaCungCap", pnlNCC, lblNCC));
        listItem.add(new DanhMucBean("NhanVien", pnlNhanVien, lblNhanVien));
        listItem.add(new DanhMucBean("SanPham", pnlSanPham, lblSanPham));
        listItem.add(new DanhMucBean("ThongKe", pnlThongKe, lblThongKe));

        controller.setEvent(listItem);

    }
    Nhac nhac = new Nhac();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new keeptoo.KGradientPanel();
        jpnMenu = new javax.swing.JPanel();
        pnlTrangChu = new keeptoo.KGradientPanel();
        lblTrangChu = new javax.swing.JLabel();
        pnlKhachHang = new keeptoo.KGradientPanel();
        lblKhachHang = new javax.swing.JLabel();
        pnlDongHang = new keeptoo.KGradientPanel();
        lblDonHang = new javax.swing.JLabel();
        pnlSanPham = new keeptoo.KGradientPanel();
        lblSanPham = new javax.swing.JLabel();
        pnlNhanVien = new keeptoo.KGradientPanel();
        lblNhanVien = new javax.swing.JLabel();
        pnlNCC = new keeptoo.KGradientPanel();
        lblNCC = new javax.swing.JLabel();
        pnlThongKe = new keeptoo.KGradientPanel();
        lblThongKe = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTenQuanTriVien = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        kButton4 = new keeptoo.KButton();
        kButton1 = new keeptoo.KButton();
        btn_DoiMK = new keeptoo.KButton();
        btn_DangXuat = new keeptoo.KButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 740));

        jpnRoot.setBackground(new java.awt.Color(0, 0, 0));
        jpnRoot.setkEndColor(new java.awt.Color(204, 204, 255));
        jpnRoot.setkStartColor(new java.awt.Color(204, 204, 255));
        jpnRoot.setLayout(null);

        jpnMenu.setBackground(new java.awt.Color(0, 0, 0));
        jpnMenu.setLayout(null);

        pnlTrangChu.setOpaque(false);
        pnlTrangChu.setLayout(null);

        lblTrangChu.setBackground(new java.awt.Color(0, 0, 0));
        lblTrangChu.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        lblTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manhinhchinh.png"))); // NOI18N
        lblTrangChu.setText("MÀN HÌNH CHÍNH");
        lblTrangChu.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblTrangChu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblTrangChu.setDisabledIcon(null);
        lblTrangChu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTrangChu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlTrangChu.add(lblTrangChu);
        lblTrangChu.setBounds(0, 0, 180, 70);

        jpnMenu.add(pnlTrangChu);
        pnlTrangChu.setBounds(20, 100, 180, 70);

        pnlKhachHang.setOpaque(false);
        pnlKhachHang.setLayout(null);

        lblKhachHang.setBackground(new java.awt.Color(0, 0, 0));
        lblKhachHang.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        lblKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/khachhang.png"))); // NOI18N
        lblKhachHang.setText("QUẢN LÝ KHÁCH HÀNG");
        lblKhachHang.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblKhachHang.setDisabledIcon(null);
        lblKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblKhachHang.setMaximumSize(new java.awt.Dimension(86, 65));
        lblKhachHang.setMinimumSize(new java.awt.Dimension(86, 65));
        lblKhachHang.setPreferredSize(new java.awt.Dimension(86, 65));
        lblKhachHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlKhachHang.add(lblKhachHang);
        lblKhachHang.setBounds(0, 0, 180, 70);

        jpnMenu.add(pnlKhachHang);
        pnlKhachHang.setBounds(20, 190, 180, 70);

        pnlDongHang.setOpaque(false);
        pnlDongHang.setLayout(null);

        lblDonHang.setBackground(new java.awt.Color(0, 0, 0));
        lblDonHang.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblDonHang.setForeground(new java.awt.Color(255, 255, 255));
        lblDonHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/donhang.png"))); // NOI18N
        lblDonHang.setText("QUẢN LÝ ĐƠN HÀNG");
        lblDonHang.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblDonHang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDonHang.setDisabledIcon(null);
        lblDonHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblDonHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlDongHang.add(lblDonHang);
        lblDonHang.setBounds(0, 0, 180, 70);

        jpnMenu.add(pnlDongHang);
        pnlDongHang.setBounds(20, 280, 180, 70);

        pnlSanPham.setOpaque(false);
        pnlSanPham.setLayout(null);

        lblSanPham.setBackground(new java.awt.Color(0, 0, 0));
        lblSanPham.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sanpham.png"))); // NOI18N
        lblSanPham.setText("QUẢN LÝ SẢN PHẨM");
        lblSanPham.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblSanPham.setDisabledIcon(null);
        lblSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblSanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlSanPham.add(lblSanPham);
        lblSanPham.setBounds(0, 0, 180, 70);

        jpnMenu.add(pnlSanPham);
        pnlSanPham.setBounds(20, 370, 180, 70);

        pnlNhanVien.setOpaque(false);
        pnlNhanVien.setLayout(null);

        lblNhanVien.setBackground(new java.awt.Color(0, 0, 0));
        lblNhanVien.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nhanvien.png"))); // NOI18N
        lblNhanVien.setText("QUẢN LÝ NHÂN VIÊN");
        lblNhanVien.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblNhanVien.setDisabledIcon(null);
        lblNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlNhanVien.add(lblNhanVien);
        lblNhanVien.setBounds(0, 0, 180, 70);

        jpnMenu.add(pnlNhanVien);
        pnlNhanVien.setBounds(20, 460, 180, 70);

        pnlNCC.setOpaque(false);
        pnlNCC.setLayout(null);

        lblNCC.setBackground(new java.awt.Color(0, 0, 0));
        lblNCC.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblNCC.setForeground(new java.awt.Color(255, 255, 255));
        lblNCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nhacungcap.png"))); // NOI18N
        lblNCC.setText("QUẢN LÝ NHÀ CUNG CẤP");
        lblNCC.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblNCC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblNCC.setDisabledIcon(null);
        lblNCC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNCC.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlNCC.add(lblNCC);
        lblNCC.setBounds(0, 0, 180, 70);

        jpnMenu.add(pnlNCC);
        pnlNCC.setBounds(20, 550, 180, 70);

        pnlThongKe.setOpaque(false);
        pnlThongKe.setLayout(null);

        lblThongKe.setBackground(new java.awt.Color(0, 0, 0));
        lblThongKe.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblThongKe.setForeground(new java.awt.Color(255, 255, 255));
        lblThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thongke.png"))); // NOI18N
        lblThongKe.setText("THỐNG KÊ");
        lblThongKe.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblThongKe.setDisabledIcon(null);
        lblThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblThongKe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlThongKe.add(lblThongKe);
        lblThongKe.setBounds(0, 0, 180, 70);

        jpnMenu.add(pnlThongKe);
        pnlThongKe.setBounds(20, 640, 180, 70);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 51, 0));
        kGradientPanel1.setOpaque(false);
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseClicked(evt);
            }
        });
        kGradientPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/khachhang.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(10, 4, 50, 60);

        lblTenQuanTriVien.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        lblTenQuanTriVien.setForeground(new java.awt.Color(255, 255, 255));
        lblTenQuanTriVien.setText("Họ Tên");
        lblTenQuanTriVien.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblTenQuanTriVienAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        kGradientPanel1.add(lblTenQuanTriVien);
        lblTenQuanTriVien.setBounds(70, 15, 100, 20);

        lblDongHo.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblDongHo.setForeground(new java.awt.Color(255, 255, 255));
        lblDongHo.setText("15 - 03 PM");
        lblDongHo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDongHoMouseClicked(evt);
            }
        });
        kGradientPanel1.add(lblDongHo);
        lblDongHo.setBounds(70, 40, 100, 17);

        jpnMenu.add(kGradientPanel1);
        kGradientPanel1.setBounds(20, 10, 180, 70);

        jpnRoot.add(jpnMenu);
        jpnMenu.setBounds(0, 0, 220, 740);

        jpnView.setBackground(new java.awt.Color(0, 0, 0));
        jpnView.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 10, true));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        jpnRoot.add(jpnView);
        jpnView.setBounds(210, 90, 890, 650);

        kGradientPanel2.setBackground(new java.awt.Color(0, 0, 0));

        kButton4.setText("Máy tính");
        kButton4.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        kButton4.setkBackGroundColor(new java.awt.Color(151, 255, 255));
        kButton4.setkBorderRadius(30);
        kButton4.setkEndColor(new java.awt.Color(151, 255, 255));
        kButton4.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton4.setkHoverStartColor(new java.awt.Color(151, 255, 255));
        kButton4.setkPressedColor(new java.awt.Color(0, 153, 153));
        kButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton4MouseClicked(evt);
            }
        });
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });

        kButton1.setText("Mail");
        kButton1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(151, 255, 255));
        kButton1.setkBorderRadius(30);
        kButton1.setkEndColor(new java.awt.Color(151, 255, 255));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(151, 255, 255));
        kButton1.setkPressedColor(new java.awt.Color(0, 153, 153));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        btn_DoiMK.setText("Đổi Mật Khẩu");
        btn_DoiMK.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btn_DoiMK.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_DoiMK.setkBackGroundColor(new java.awt.Color(151, 255, 255));
        btn_DoiMK.setkBorderRadius(30);
        btn_DoiMK.setkEndColor(new java.awt.Color(151, 255, 255));
        btn_DoiMK.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btn_DoiMK.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_DoiMK.setkHoverStartColor(new java.awt.Color(151, 255, 255));
        btn_DoiMK.setkPressedColor(new java.awt.Color(0, 153, 153));
        btn_DoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DoiMKActionPerformed(evt);
            }
        });

        btn_DangXuat.setText("Đăng Xuất");
        btn_DangXuat.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btn_DangXuat.setkBackGroundColor(new java.awt.Color(151, 255, 255));
        btn_DangXuat.setkBorderRadius(30);
        btn_DangXuat.setkEndColor(new java.awt.Color(151, 255, 255));
        btn_DangXuat.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        btn_DangXuat.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_DangXuat.setkHoverStartColor(new java.awt.Color(151, 255, 255));
        btn_DangXuat.setkPressedColor(new java.awt.Color(0, 153, 153));
        btn_DangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangXuatActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngegg.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_DoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_DoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jpnRoot.add(kGradientPanel2);
        kGradientPanel2.setBounds(220, 0, 880, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 1102, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DoiMKActionPerformed
        // TODO add your handling code here:
        nhac.playWin();
        this.dispose();
        new DoiMatKhauJDialog(null, true).setVisible(true);
    }//GEN-LAST:event_btn_DoiMKActionPerformed

    private void btn_DangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangXuatActionPerformed
        // TODO add your handling code here:
        Auth.clear();
        this.dispose();
        new DangNhap().setVisible(true);
    }//GEN-LAST:event_btn_DangXuatActionPerformed

    private void lblTenQuanTriVienAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblTenQuanTriVienAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTenQuanTriVienAncestorAdded

    private void kButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton4MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_kButton4MouseClicked

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
        nhac.playWin();
        new CalculatorJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        nhac.playWin();
        new MailJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void lblDongHoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDongHoMouseClicked
        // TODO add your handling code here:
        new ChiTietQuanTriVienDialog(this, true).setVisible(true);
    }//GEN-LAST:event_lblDongHoMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        new ChiTietQuanTriVienDialog(this, true).setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void kGradientPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseClicked
        // TODO add your handling code here:
        new ChiTietQuanTriVienDialog(this, true).setVisible(true);
    }//GEN-LAST:event_kGradientPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(QuanTriVienUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanTriVienUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanTriVienUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanTriVienUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanTriVienUI1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btn_DangXuat;
    private keeptoo.KButton btn_DoiMK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jpnMenu;
    private keeptoo.KGradientPanel jpnRoot;
    private javax.swing.JPanel jpnView;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lblDonHang;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblNCC;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblTenQuanTriVien;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblTrangChu;
    private keeptoo.KGradientPanel pnlDongHang;
    private keeptoo.KGradientPanel pnlKhachHang;
    private keeptoo.KGradientPanel pnlNCC;
    private keeptoo.KGradientPanel pnlNhanVien;
    private keeptoo.KGradientPanel pnlSanPham;
    private keeptoo.KGradientPanel pnlThongKe;
    private keeptoo.KGradientPanel pnlTrangChu;
    // End of variables declaration//GEN-END:variables

    NhanVienDAO dao = new NhanVienDAO();

    private void init() {
        this.startDongHo();
        String ten = Auth.user.getTENNV();// lấy tên qtv
        lblTenQuanTriVien.setText(ten);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        jpnMenu.setLayout(null);
        jpnView.setLayout(null);
        jpnRoot.setLayout(null);
        setIconImage(XImage.getAppIcon());
    }

    void startDongHo() {
        SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
        new Timer(1000, (ActionEvent e) -> {
            lblDongHo.setText(formater.format(new Date()));
        }).start();
    }

}