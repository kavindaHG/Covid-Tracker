package tracking;

import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class systemApp extends javax.swing.JFrame {

    Conn conn = new Conn();
    public String uname;
    
    public void comboClear(){
    cmb_SearchMem.setSelectedItem("");
    cmb_SearchVi.setSelectedItem("");
    report_SearchIDRep.setSelectedItem("");
    report_SearchdepRep.setSelectedItem("");
    report_SearchDesignationRep.setSelectedItem("");
    cmb_SearchAdmin.setSelectedItem("");
    report_SearchIDAdmin.setSelectedItem("");
    report_SearchDesigAdmin.setSelectedItem("");
    }

    private void runners() {
        conn.gen_combo("SELECT `AdName`,`AdUName` FROM `admin`;", cmb_SearchAdmin, "AdName", "AdUName");
        AutoCompleteDecorator.decorate(cmb_SearchAdmin);

        conn.gen_table("SELECT `AdUName` AS `Admin Username`, `Date`, `Time`, `AdAction` AS `Action`, `notes` AS `Notes` FROM `admin_action`", Adactions);
        conn.gen_combo("SELECT `admin_action`.`AdUName`,`admin`.`AdNIC` FROM `admin_action` INNER JOIN `admin` WHERE `admin_action`.`AdUName` = `admin`.`AdUName` GROUP BY `admin_action`.`AdUName`", report_SearchIDAdmin, "admin_action.AdUName", "admin.AdNIC");
        AutoCompleteDecorator.decorate(report_SearchIDAdmin);
        conn.gen_combo("SELECT `admin`.`AdDesig` FROM `admin` INNER JOIN `admin_action` WHERE `admin_action`.`AdUName`=`admin`.`AdUName` GROUP BY `admin`.`AdDesig`", report_SearchDesigAdmin, "admin.AdDesig");
        AutoCompleteDecorator.decorate(report_SearchDesigAdmin);

        conn.gen_combo("SELECT `MemName`,`MemUName` FROM `member`;", cmb_SearchMem, "MemName", "MemUName");
        AutoCompleteDecorator.decorate(cmb_SearchMem);

        conn.gen_combo("SELECT `ViName`, `ViNIC` FROM `visitor`", cmb_SearchVi, "ViName", "ViNIC");
        AutoCompleteDecorator.decorate(cmb_SearchVi);

        conn.gen_table("SELECT `member`.`MemName` AS `Name` , `member`.`MemDOB` AS `Date of Birth` , `member`.`MemAddress` AS `Address` , `member`.`MemDept` AS `Department` , `member`.`MemDesig` AS `Designation` , TIMESTAMPDIFF(YEAR, `MemDOB`, CURDATE()) AS `Age` , `member`.`MemNIC` AS `NIC` , `member`.`MemGender` AS `Gender` , `member`.`MemMobile` AS `Mobile` , `member_log`.`Date` , `member_log`.`TimeIn` , `member_log`.`TimeOut` FROM `tkdb`.`member_log` INNER JOIN `tkdb`.`member` ON (`member_log`.`MemUName` = `member`.`MemUName`);", jTable2);
        conn.gen_table("SELECT `visitor`.`ViName` AS `Name` , `visitor`.`ViNIC` AS `NIC` , `visitor`.`ViDob` AS `Date of Birth` , TIMESTAMPDIFF(YEAR, `ViDob`, CURDATE()) AS `Age` , `visitor`.`ViAddress` AS `Address` , `visitor`.`ViGender` AS `Gender` , `visitor`.`ViMobile` AS `Phone` , `visitor`.`ViReason` AS `Reason` , `visitor_log`.`Date` , `visitor_log`.`TimeIn` , `visitor_log`.`TimeOut` FROM `tkdb`.`visitor_log` INNER JOIN `tkdb`.`visitor` ON (`visitor_log`.`ViNIC` = `visitor`.`ViNIC`);", jTable3);
        conn.gen_combo("SELECT `member`.`MemName`,`member`.`MemNIC` FROM `member` UNION SELECT `visitor`.`ViName`,`visitor`.`ViNIC` FROM `visitor`;", report_SearchIDRep, "MemName", "MemNIC");
        AutoCompleteDecorator.decorate(report_SearchIDRep);
        conn.gen_combo("SELECT `MemDept` FROM `member`", report_SearchdepRep, "MemDept");
        AutoCompleteDecorator.decorate(report_SearchdepRep);
        conn.gen_combo("SELECT `MemDesig` FROM `member`", report_SearchDesignationRep, "MemDesig");
    }

    public systemApp() {
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 35, 35));
        runners();
        comboClear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        txt_UName10 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        Home = new javax.swing.JPanel();
        Ad_system = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Head = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        max = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        btn_data = new javax.swing.JButton();
        lbl_data = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        lbl_logout = new javax.swing.JLabel();
        btn_admin = new javax.swing.JButton();
        lbl_admin = new javax.swing.JLabel();
        btn_web = new javax.swing.JButton();
        lbl_web = new javax.swing.JLabel();
        btn_report = new javax.swing.JButton();
        btn_about = new javax.swing.JButton();
        btn_darkMode = new javax.swing.JToggleButton();
        lbl_report = new javax.swing.JLabel();
        lbl_about = new javax.swing.JLabel();
        MainContainer = new javax.swing.JPanel();
        Nav = new javax.swing.JPanel();
        btn_Navhome = new javax.swing.JButton();
        btn_NavData = new javax.swing.JButton();
        btn_NavReport = new javax.swing.JButton();
        btn_NavWeb = new javax.swing.JButton();
        btn_NavAdmin = new javax.swing.JButton();
        btn_NavWeb1 = new javax.swing.JButton();
        btn_NavWeb2 = new javax.swing.JButton();
        Title = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        exit1 = new javax.swing.JLabel();
        max1 = new javax.swing.JLabel();
        min1 = new javax.swing.JLabel();
        ContainerData = new javax.swing.JPanel();
        manageData_choice = new javax.swing.JPanel();
        btn_selectMem = new javax.swing.JButton();
        btn_selectVi = new javax.swing.JButton();
        ManageData_Mem = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_UserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_nic = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_age = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_gender = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_mobile = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_department = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_designation = new javax.swing.JTextField();
        btn_deleteMem = new javax.swing.JButton();
        btn_saveMem = new javax.swing.JButton();
        btn_clearMem = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        txt_Q2Mem = new javax.swing.JTextField();
        txt_Q1Mem = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txt_A1Mem = new javax.swing.JTextField();
        txt_A2Mem = new javax.swing.JTextField();
        cmb_SearchMem = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        txt_dob = new com.github.lgooddatepicker.components.DatePicker();
        ManageData_Vi = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txt_NameVi = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_IdVi = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_emailVi = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_ageVi = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_addressVi = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_genderVi = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_mobileVi = new javax.swing.JTextField();
        txt_resonVi = new javax.swing.JTextField();
        btn_saveVi = new javax.swing.JButton();
        btn_clearVi = new javax.swing.JButton();
        btn_deleteVi = new javax.swing.JButton();
        cmb_SearchVi = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txt_dobVi = new com.github.lgooddatepicker.components.DatePicker();
        report = new javax.swing.JPanel();
        report_SearchIDRep = new javax.swing.JComboBox<>();
        report_SearchdepRep = new javax.swing.JComboBox<>();
        report_SearchDesignationRep = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        datePicker3 = new com.github.lgooddatepicker.components.DatePicker();
        datePicker4 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel56 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        ManageAdmin = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        txt_nameAdmin = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_UserNameAdmin = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txt_nicAdmin = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txt_ageAdmin = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txt_addressAdmin = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txt_genderAdmin = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txt_mobileAdmin = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txt_emailAdmin = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txt_designationAdmin = new javax.swing.JTextField();
        cmb_SearchAdmin = new javax.swing.JComboBox<>();
        btn_deleteAdmin = new javax.swing.JButton();
        btn_saveAdmin = new javax.swing.JButton();
        btn_clearAdmin = new javax.swing.JButton();
        btn_adminAction = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txt_answer1Admin = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txt_answer2Admin = new javax.swing.JTextField();
        cmb_Q1Admin = new javax.swing.JComboBox<>();
        cmb_Q2Admin = new javax.swing.JComboBox<>();
        btn_ResPWAdmin = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txt_pwdAdmin = new javax.swing.JPasswordField();
        txt_dobAdmin = new com.github.lgooddatepicker.components.DatePicker();
        adminAction = new javax.swing.JPanel();
        report_SearchIDAdmin = new javax.swing.JComboBox<>();
        report_SearchDesigAdmin = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Adactions = new javax.swing.JTable();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();
        jButton1 = new javax.swing.JButton();
        about = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setText("Department");

        txt_UName10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UName10ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        Home.setBackground(new java.awt.Color(204, 204, 204));

        Ad_system.setBackground(new java.awt.Color(0, 102, 153));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo2.png"))); // NOI18N
        Logo.setText("jLabel1");

        Head.setText("Administrative System");
        Head.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        Head.setForeground(new java.awt.Color(255, 255, 255));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/btn_Exit.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/btn_maximize.png"))); // NOI18N
        max.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/btn_Minimize.png"))); // NOI18N
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Ad_systemLayout = new javax.swing.GroupLayout(Ad_system);
        Ad_system.setLayout(Ad_systemLayout);
        Ad_systemLayout.setHorizontalGroup(
            Ad_systemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ad_systemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(max)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(min)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(Head)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Ad_systemLayout.setVerticalGroup(
            Ad_systemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ad_systemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Ad_systemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addGroup(Ad_systemLayout.createSequentialGroup()
                        .addGroup(Ad_systemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Head, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(max)
                            .addComponent(exit)
                            .addComponent(min))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btn_data.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Data.png"))); // NOI18N
        btn_data.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dataActionPerformed(evt);
            }
        });

        lbl_data.setText("Manage User Data");
        lbl_data.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout.png"))); // NOI18N
        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        lbl_logout.setText("Log Out");
        lbl_logout.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        btn_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Administrator.png"))); // NOI18N
        btn_admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminActionPerformed(evt);
            }
        });

        lbl_admin.setText("Manage Administrative");
        lbl_admin.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        btn_web.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Web.png"))); // NOI18N
        btn_web.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_web.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_webActionPerformed(evt);
            }
        });

        lbl_web.setText("Manage website");
        lbl_web.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        btn_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Report.png"))); // NOI18N
        btn_report.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });

        btn_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/about.png"))); // NOI18N
        btn_about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutActionPerformed(evt);
            }
        });

        btn_darkMode.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        btn_darkMode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moon.png"))); // NOI18N
        btn_darkMode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_darkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_darkModeActionPerformed(evt);
            }
        });

        lbl_report.setText("Report");
        lbl_report.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        lbl_about.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl_about.setText("About");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ad_system, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(lbl_data)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_report)
                        .addGap(266, 266, 266))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_data, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_report, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_about, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(213, 213, 213))
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(lbl_about)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))
                    .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                            .addComponent(lbl_web)
                            .addGap(149, 149, 149))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                            .addComponent(btn_web, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(73, 73, 73)
                            .addComponent(btn_darkMode, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                        .addComponent(lbl_logout)
                        .addGap(182, 182, 182))))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addComponent(Ad_system, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_web, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_darkMode, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btn_data, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_data)
                        .addComponent(lbl_web))
                    .addComponent(lbl_report))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                        .addComponent(btn_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_admin)
                        .addGap(61, 61, 61))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_logout))
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addComponent(btn_about, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_about)))
                        .addGap(58, 58, 58))))
        );

        btn_data.getAccessibleContext().setAccessibleName("btn_data");
        btn_logout.getAccessibleContext().setAccessibleName("btn_logout");
        btn_admin.getAccessibleContext().setAccessibleName("btn_admin");
        btn_web.getAccessibleContext().setAccessibleName("btn_web");
        btn_report.getAccessibleContext().setAccessibleName("btn_report");
        btn_about.getAccessibleContext().setAccessibleName("btn_about");

        getContentPane().add(Home, "card2");

        MainContainer.setBackground(new java.awt.Color(102, 255, 102));

        Nav.setBackground(new java.awt.Color(153, 153, 153));

        btn_Navhome.setBackground(new java.awt.Color(153, 153, 153));
        btn_Navhome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_Navhome.setForeground(new java.awt.Color(0, 102, 153));
        btn_Navhome.setText("Home");
        btn_Navhome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Navhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NavhomeActionPerformed(evt);
            }
        });

        btn_NavData.setBackground(new java.awt.Color(153, 153, 153));
        btn_NavData.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btn_NavData.setForeground(new java.awt.Color(0, 102, 153));
        btn_NavData.setText("Manage User Data");
        btn_NavData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_NavData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NavDataActionPerformed(evt);
            }
        });

        btn_NavReport.setBackground(new java.awt.Color(153, 153, 153));
        btn_NavReport.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_NavReport.setForeground(new java.awt.Color(0, 102, 153));
        btn_NavReport.setText("Report");
        btn_NavReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_NavReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NavReportActionPerformed(evt);
            }
        });

        btn_NavWeb.setBackground(new java.awt.Color(153, 153, 153));
        btn_NavWeb.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_NavWeb.setForeground(new java.awt.Color(0, 102, 153));
        btn_NavWeb.setText("Manage Website");
        btn_NavWeb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_NavWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NavWebActionPerformed(evt);
            }
        });

        btn_NavAdmin.setBackground(new java.awt.Color(153, 153, 153));
        btn_NavAdmin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_NavAdmin.setForeground(new java.awt.Color(0, 102, 153));
        btn_NavAdmin.setText("Manage Administrator");
        btn_NavAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_NavAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NavAdminActionPerformed(evt);
            }
        });

        btn_NavWeb1.setBackground(new java.awt.Color(153, 153, 153));
        btn_NavWeb1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_NavWeb1.setForeground(new java.awt.Color(0, 102, 153));
        btn_NavWeb1.setText("Log out");
        btn_NavWeb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_NavWeb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NavWeb1ActionPerformed(evt);
            }
        });

        btn_NavWeb2.setBackground(new java.awt.Color(153, 153, 153));
        btn_NavWeb2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_NavWeb2.setForeground(new java.awt.Color(0, 102, 153));
        btn_NavWeb2.setText("Manage Website");
        btn_NavWeb2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_NavWeb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NavWeb2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NavLayout = new javax.swing.GroupLayout(Nav);
        Nav.setLayout(NavLayout);
        NavLayout.setHorizontalGroup(
            NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_Navhome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_NavData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_NavReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_NavAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
            .addComponent(btn_NavWeb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_NavWeb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_NavWeb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NavLayout.setVerticalGroup(
            NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btn_Navhome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_NavData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_NavReport, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_NavAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_NavWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_NavWeb2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_NavWeb1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_Navhome.getAccessibleContext().setAccessibleName("btn_home");
        btn_NavData.getAccessibleContext().setAccessibleName("btn_NavData");
        btn_NavReport.getAccessibleContext().setAccessibleName("btn_NavReport");
        btn_NavWeb.getAccessibleContext().setAccessibleName("btn_NavWeb");

        Title.setBackground(new java.awt.Color(0, 102, 153));

        jLabel9.setText("Administrative System");
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo2.png"))); // NOI18N

        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/btn_Exit.png"))); // NOI18N
        exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit1MouseClicked(evt);
            }
        });

        max1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/btn_maximize.png"))); // NOI18N
        max1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        min1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/btn_Minimize.png"))); // NOI18N
        min1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                min1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(max1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(min1)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
            .addGroup(TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(min1)
                    .addComponent(max1)
                    .addComponent(exit1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(30, 30, 30))
        );

        ContainerData.setBackground(new java.awt.Color(204, 51, 0));
        ContainerData.setLayout(new java.awt.CardLayout());

        manageData_choice.setBackground(new java.awt.Color(204, 204, 204));

        btn_selectMem.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_selectMem.setForeground(new java.awt.Color(0, 102, 153));
        btn_selectMem.setText("Member Data");
        btn_selectMem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_selectMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selectMemActionPerformed(evt);
            }
        });

        btn_selectVi.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_selectVi.setForeground(new java.awt.Color(0, 102, 153));
        btn_selectVi.setText("Visitor Data");
        btn_selectVi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_selectVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selectViActionPerformed(evt);
            }
        });

        ManageData_Mem.setVisible(false);

        javax.swing.GroupLayout manageData_choiceLayout = new javax.swing.GroupLayout(manageData_choice);
        manageData_choice.setLayout(manageData_choiceLayout);
        manageData_choiceLayout.setHorizontalGroup(
            manageData_choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageData_choiceLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(btn_selectMem, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(btn_selectVi, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );
        manageData_choiceLayout.setVerticalGroup(
            manageData_choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageData_choiceLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(manageData_choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_selectMem, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_selectVi, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(235, Short.MAX_VALUE))
        );

        ContainerData.add(manageData_choice, "card2");

        ManageData_Mem.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Name");
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_Name.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NameActionPerformed(evt);
            }
        });

        jLabel4.setText("User Name");
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_UserName.setEditable(false);
        txt_UserName.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UserNameActionPerformed(evt);
            }
        });

        jLabel5.setText("N.I.C");
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_nic.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nicActionPerformed(evt);
            }
        });

        jLabel6.setText("Date Of Birth");
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        jLabel7.setText("Age");
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_age.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ageActionPerformed(evt);
            }
        });

        jLabel8.setText("Address");
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_address.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });

        jLabel11.setText("Gender");
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_gender.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_genderActionPerformed(evt);
            }
        });

        jLabel12.setText("Mobile");
        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_mobile.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mobileActionPerformed(evt);
            }
        });

        jLabel13.setText("Email");
        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_email.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        jLabel14.setText("Department");
        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_department.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_departmentActionPerformed(evt);
            }
        });

        jLabel16.setText("Designation");
        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_designation.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_designation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_designationActionPerformed(evt);
            }
        });

        btn_deleteMem.setBackground(new java.awt.Color(204, 204, 204));
        btn_deleteMem.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_deleteMem.setForeground(new java.awt.Color(153, 0, 0));
        btn_deleteMem.setText("Delete");
        btn_deleteMem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_deleteMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteMemActionPerformed(evt);
            }
        });

        btn_saveMem.setBackground(new java.awt.Color(204, 204, 204));
        btn_saveMem.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_saveMem.setForeground(new java.awt.Color(0, 102, 153));
        btn_saveMem.setText("Save");
        btn_saveMem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_saveMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveMemActionPerformed(evt);
            }
        });

        btn_clearMem.setBackground(new java.awt.Color(204, 204, 204));
        btn_clearMem.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_clearMem.setForeground(new java.awt.Color(153, 0, 0));
        btn_clearMem.setText("Clear");
        btn_clearMem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clearMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearMemActionPerformed(evt);
            }
        });

        jLabel35.setText("Security Question 1");
        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_Q2Mem.setEditable(false);
        txt_Q2Mem.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_Q2Mem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Q2MemActionPerformed(evt);
            }
        });

        txt_Q1Mem.setEditable(false);
        txt_Q1Mem.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_Q1Mem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Q1MemActionPerformed(evt);
            }
        });

        jLabel37.setText("Security Question 2");
        jLabel37.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        jLabel38.setText("Answer");
        jLabel38.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel39.setText("Answer");
        jLabel39.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txt_A1Mem.setEditable(false);
        txt_A1Mem.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_A1Mem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_A1MemActionPerformed(evt);
            }
        });

        txt_A2Mem.setEditable(false);
        txt_A2Mem.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_A2Mem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_A2MemActionPerformed(evt);
            }
        });

        cmb_SearchMem.setEditable(true);
        cmb_SearchMem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmb_SearchMem.setBorder(null);
        cmb_SearchMem.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cmb_SearchMem.setName(""); // NOI18N
        cmb_SearchMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_SearchMemActionPerformed(evt);
            }
        });

        jLabel25.setText("Name or ID");
        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        ManageData_Mem.setVisible(false);

        javax.swing.GroupLayout ManageData_MemLayout = new javax.swing.GroupLayout(ManageData_Mem);
        ManageData_Mem.setLayout(ManageData_MemLayout);
        ManageData_MemLayout.setHorizontalGroup(
            ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageData_MemLayout.createSequentialGroup()
                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ManageData_MemLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmb_SearchMem, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ManageData_MemLayout.createSequentialGroup()
                        .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ManageData_MemLayout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel13)))
                                    .addGroup(ManageData_MemLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel35)
                                            .addComponent(jLabel37)))))
                            .addGroup(ManageData_MemLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(btn_saveMem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageData_MemLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                                .addComponent(btn_clearMem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(btn_deleteMem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ManageData_MemLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Q2Mem)
                                    .addComponent(txt_Q1Mem))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_A2Mem, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(txt_A1Mem)))
                            .addGroup(ManageData_MemLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_email, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_department, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_designation)))
                            .addGroup(ManageData_MemLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_UserName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_nic, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_age, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_address, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_gender, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_mobile)
                                    .addComponent(txt_Name)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageData_MemLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel25)
                                        .addGap(126, 126, 126))
                                    .addComponent(txt_dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(142, 142, 142))
        );
        ManageData_MemLayout.setVerticalGroup(
            ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageData_MemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(5, 5, 5)
                .addComponent(cmb_SearchMem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txt_Q1Mem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(txt_A1Mem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txt_Q2Mem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(txt_A2Mem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ManageData_MemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_saveMem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deleteMem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clearMem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_deleteMem.getAccessibleContext().setAccessibleName("bt_delete");
        btn_saveMem.getAccessibleContext().setAccessibleName("btn_Save");

        ContainerData.add(ManageData_Mem, "card2");

        ManageData_Vi.setBackground(new java.awt.Color(204, 204, 204));

        jLabel17.setText("Name");
        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_NameVi.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_NameVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NameViActionPerformed(evt);
            }
        });

        jLabel18.setText("Visitor ID / NIC");
        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_IdVi.setEditable(false);
        txt_IdVi.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_IdVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdViActionPerformed(evt);
            }
        });

        jLabel19.setText("Email");
        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_emailVi.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_emailVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailViActionPerformed(evt);
            }
        });

        jLabel20.setText("Date Of Birth");
        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        jLabel21.setText("Age");
        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_ageVi.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_ageVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ageViActionPerformed(evt);
            }
        });

        jLabel22.setText("Address");
        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_addressVi.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_addressVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressViActionPerformed(evt);
            }
        });

        jLabel23.setText("Gender");
        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_genderVi.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_genderVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_genderViActionPerformed(evt);
            }
        });

        jLabel24.setText("Mobile");
        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_mobileVi.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_mobileVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mobileViActionPerformed(evt);
            }
        });

        txt_resonVi.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_resonVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resonViActionPerformed(evt);
            }
        });

        btn_saveVi.setText("Save");
        btn_saveVi.setBackground(new java.awt.Color(204, 204, 204));
        btn_saveVi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_saveVi.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_saveVi.setForeground(new java.awt.Color(0, 102, 153));
        btn_saveVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveViActionPerformed(evt);
            }
        });

        btn_clearVi.setText("Clear");
        btn_clearVi.setBackground(new java.awt.Color(204, 204, 204));
        btn_clearVi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clearVi.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_clearVi.setForeground(new java.awt.Color(153, 0, 0));
        btn_clearVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearViActionPerformed(evt);
            }
        });

        btn_deleteVi.setText("Delete");
        btn_deleteVi.setBackground(new java.awt.Color(204, 204, 204));
        btn_deleteVi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_deleteVi.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_deleteVi.setForeground(new java.awt.Color(153, 0, 0));
        btn_deleteVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteViActionPerformed(evt);
            }
        });

        cmb_SearchVi.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cmb_SearchVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_SearchViActionPerformed(evt);
            }
        });

        jLabel44.setText("Reason");
        jLabel44.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        jLabel45.setText("Visitor name OR ID");
        jLabel45.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        ManageData_Mem.setVisible(false);

        javax.swing.GroupLayout ManageData_ViLayout = new javax.swing.GroupLayout(ManageData_Vi);
        ManageData_Vi.setLayout(ManageData_ViLayout);
        ManageData_ViLayout.setHorizontalGroup(
            ManageData_ViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageData_ViLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(ManageData_ViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ManageData_ViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ManageData_ViLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(btn_saveVi, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(65, 65, 65)
                            .addComponent(btn_clearVi, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                            .addComponent(btn_deleteVi, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ManageData_ViLayout.createSequentialGroup()
                            .addGroup(ManageData_ViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addComponent(jLabel18)
                                .addComponent(jLabel19)
                                .addComponent(jLabel20)
                                .addComponent(jLabel21)
                                .addGroup(ManageData_ViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22)
                                    .addGroup(ManageData_ViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel24)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel44))))
                            .addGap(38, 38, 38)
                            .addGroup(ManageData_ViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_mobileVi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                                .addComponent(txt_genderVi, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_addressVi, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_ageVi, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_IdVi, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_NameVi, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_emailVi)
                                .addComponent(txt_resonVi)
                                .addComponent(txt_dobVi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(ManageData_ViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel45)
                        .addComponent(cmb_SearchVi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        ManageData_ViLayout.setVerticalGroup(
            ManageData_ViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageData_ViLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_SearchVi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(ManageData_ViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_NameVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ManageData_ViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txt_IdVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ManageData_ViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txt_emailVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ManageData_ViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt_dobVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ManageData_ViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageData_ViLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel44))
                    .addGroup(ManageData_ViLayout.createSequentialGroup()
                        .addComponent(txt_ageVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_addressVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_genderVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_mobileVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_resonVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(ManageData_ViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_deleteVi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clearVi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_saveVi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ContainerData.add(ManageData_Vi, "card2");

        report.setBackground(new java.awt.Color(204, 204, 204));

        report_SearchIDRep.setEditable(true);
        report_SearchIDRep.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153)));
        report_SearchIDRep.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        report_SearchIDRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_SearchIDRepActionPerformed(evt);
            }
        });

        report_SearchdepRep.setEditable(true);
        report_SearchdepRep.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153)));
        report_SearchdepRep.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        report_SearchdepRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_SearchdepRepActionPerformed(evt);
            }
        });

        report_SearchDesignationRep.setEditable(true);
        report_SearchDesignationRep.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153)));
        report_SearchDesignationRep.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        report_SearchDesignationRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_SearchDesignationRepActionPerformed(evt);
            }
        });

        jLabel46.setText("Department");
        jLabel46.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel47.setText("Designation");
        jLabel47.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel48.setText("Name or NIC");
        jLabel48.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel49.setText("Last Date");
        jLabel49.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel50.setText("First Date");
        jLabel50.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTable2);

        datePicker4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datePicker4PropertyChange(evt);
            }
        });

        jLabel2.setText("Members");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTable3);

        jLabel56.setText("Visitors");

        jButton2.setText("Reset");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ManageData_Mem.setVisible(false);

        javax.swing.GroupLayout reportLayout = new javax.swing.GroupLayout(report);
        report.setLayout(reportLayout);
        reportLayout.setHorizontalGroup(
            reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(jLabel2)
                    .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2)
                        .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane5)
                            .addGroup(reportLayout.createSequentialGroup()
                                .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel50)
                                    .addComponent(datePicker3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel49)
                                    .addComponent(datePicker4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(report_SearchIDRep, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48))
                                .addGap(57, 57, 57)
                                .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(report_SearchdepRep, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel46))
                                .addGap(57, 57, 57)
                                .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(report_SearchDesignationRep, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47)))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(45, 45, 45))
        );
        reportLayout.setVerticalGroup(
            reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(report_SearchdepRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(report_SearchDesignationRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(report_SearchIDRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePicker3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePicker4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(40, 40, 40))
        );

        ContainerData.add(report, "card2");

        ManageAdmin.setBackground(new java.awt.Color(204, 204, 204));

        jLabel26.setText("Admin Name");
        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_nameAdmin.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_nameAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameAdminActionPerformed(evt);
            }
        });

        jLabel27.setText("Admin User Name");
        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_UserNameAdmin.setEditable(false);
        txt_UserNameAdmin.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_UserNameAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UserNameAdminActionPerformed(evt);
            }
        });

        jLabel28.setText("Admin N.I.C");
        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_nicAdmin.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_nicAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nicAdminActionPerformed(evt);
            }
        });

        jLabel29.setText("Date Of Birth");
        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        jLabel30.setText("Age");
        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_ageAdmin.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_ageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ageAdminActionPerformed(evt);
            }
        });

        jLabel31.setText("Address");
        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_addressAdmin.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_addressAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressAdminActionPerformed(evt);
            }
        });

        jLabel32.setText("Gender");
        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_genderAdmin.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_genderAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_genderAdminActionPerformed(evt);
            }
        });

        jLabel33.setText("Mobile");
        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_mobileAdmin.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_mobileAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mobileAdminActionPerformed(evt);
            }
        });

        jLabel34.setText("Email");
        jLabel34.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_emailAdmin.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_emailAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailAdminActionPerformed(evt);
            }
        });

        jLabel36.setText("Designation");
        jLabel36.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_designationAdmin.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_designationAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_designationAdminActionPerformed(evt);
            }
        });

        cmb_SearchAdmin.setEditable(true);
        cmb_SearchAdmin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cmb_SearchAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_SearchAdminActionPerformed(evt);
            }
        });

        btn_deleteAdmin.setText("Delete");
        btn_deleteAdmin.setBackground(new java.awt.Color(204, 204, 204));
        btn_deleteAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_deleteAdmin.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_deleteAdmin.setForeground(new java.awt.Color(153, 0, 0));
        btn_deleteAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteAdminActionPerformed(evt);
            }
        });

        btn_saveAdmin.setText("Update");
        btn_saveAdmin.setBackground(new java.awt.Color(204, 204, 204));
        btn_saveAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_saveAdmin.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_saveAdmin.setForeground(new java.awt.Color(0, 102, 153));
        btn_saveAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveAdminActionPerformed(evt);
            }
        });

        btn_clearAdmin.setText("Clear");
        btn_clearAdmin.setBackground(new java.awt.Color(204, 204, 204));
        btn_clearAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clearAdmin.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_clearAdmin.setForeground(new java.awt.Color(153, 0, 0));
        btn_clearAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearAdminActionPerformed(evt);
            }
        });

        btn_adminAction.setText("Administrative Actions");
        btn_adminAction.setBackground(new java.awt.Color(204, 204, 204));
        btn_adminAction.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_adminAction.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_adminAction.setForeground(new java.awt.Color(0, 102, 153));
        btn_adminAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminActionActionPerformed(evt);
            }
        });

        jLabel40.setText("Security Question 1");
        jLabel40.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        jLabel41.setText("Security Question 1");
        jLabel41.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_answer1Admin.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_answer1Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_answer1AdminActionPerformed(evt);
            }
        });

        jLabel42.setText("Answer");
        jLabel42.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel43.setText("Answer");
        jLabel43.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txt_answer2Admin.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_answer2Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_answer2AdminActionPerformed(evt);
            }
        });

        cmb_Q1Admin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Question 1", "What was your first School?", "What is the city you were born?", "what is your grand mother's first name?", "what are the 4 last numbers of your Driving License?", "In what town did you meet your life partner?" }));
        cmb_Q1Admin.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N

        cmb_Q2Admin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Question 2", "What was your first School?", "What is the city you were born?", "what is your grand mother's first name?", "what are the 4 last numbers of your Driving License?", "In what town did you meet your life partner?" }));
        cmb_Q2Admin.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N

        btn_ResPWAdmin.setText("Reset Password");
        btn_ResPWAdmin.setBackground(new java.awt.Color(204, 204, 204));
        btn_ResPWAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ResPWAdmin.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btn_ResPWAdmin.setForeground(new java.awt.Color(153, 0, 0));
        btn_ResPWAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResPWAdminActionPerformed(evt);
            }
        });

        jLabel51.setText("Admin Name or ID");
        jLabel51.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jCheckBox1.setText("Add new");
        jCheckBox1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Password");
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        txt_pwdAdmin.setEnabled(false);

        ManageData_Mem.setVisible(false);

        javax.swing.GroupLayout ManageAdminLayout = new javax.swing.GroupLayout(ManageAdmin);
        ManageAdmin.setLayout(ManageAdminLayout);
        ManageAdminLayout.setHorizontalGroup(
            ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageAdminLayout.createSequentialGroup()
                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageAdminLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ManageAdminLayout.createSequentialGroup()
                                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel31)
                                        .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel33)
                                            .addComponent(jLabel34)
                                            .addComponent(jLabel32)))
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29))
                                .addGap(79, 79, 79)
                                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_mobileAdmin)
                                    .addComponent(txt_genderAdmin)
                                    .addComponent(txt_addressAdmin)
                                    .addComponent(txt_ageAdmin)
                                    .addComponent(txt_nicAdmin)
                                    .addComponent(txt_UserNameAdmin)
                                    .addComponent(txt_nameAdmin)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageAdminLayout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel51)
                                            .addComponent(cmb_SearchAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txt_dobAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_emailAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_pwdAdmin)
                                .addGroup(ManageAdminLayout.createSequentialGroup()
                                    .addComponent(cmb_Q1Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel42)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_answer1Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ManageAdminLayout.createSequentialGroup()
                                    .addComponent(cmb_Q2Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel43)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_answer2Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_designationAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_adminAction, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(ManageAdminLayout.createSequentialGroup()
                                    .addComponent(btn_saveAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_clearAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_ResPWAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_deleteAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(ManageAdminLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel36)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        ManageAdminLayout.setVerticalGroup(
            ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageAdminLayout.createSequentialGroup()
                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageAdminLayout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(1, 1, 1)
                        .addComponent(cmb_SearchAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ManageAdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nameAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_UserNameAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nicAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dobAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(14, 14, 14)
                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ageAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addressAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_genderAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mobileAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_emailAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_designationAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pwdAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(cmb_Q1Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_answer1Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(14, 14, 14)
                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(cmb_Q2Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_answer2Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_adminAction, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ManageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_saveAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deleteAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clearAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ResPWAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ContainerData.add(ManageAdmin, "card2");

        adminAction.setBackground(new java.awt.Color(204, 204, 204));
        adminAction.setPreferredSize(new java.awt.Dimension(942, 612));

        report_SearchIDAdmin.setEditable(true);
        report_SearchIDAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153)));
        report_SearchIDAdmin.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        report_SearchIDAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_SearchIDAdminActionPerformed(evt);
            }
        });

        report_SearchDesigAdmin.setEditable(true);
        report_SearchDesigAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153)));
        report_SearchDesigAdmin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        report_SearchDesigAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_SearchDesigAdminActionPerformed(evt);
            }
        });

        jLabel52.setText("First Date");
        jLabel52.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel53.setText("Last Date");
        jLabel53.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel54.setText("Admin Name or NIC");
        jLabel54.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel55.setText("Admin Designation");
        jLabel55.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        Adactions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(Adactions);

        datePicker2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datePicker2PropertyChange(evt);
            }
        });

        jButton1.setText("Reset Filters");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ManageData_Mem.setVisible(false);

        javax.swing.GroupLayout adminActionLayout = new javax.swing.GroupLayout(adminAction);
        adminAction.setLayout(adminActionLayout);
        adminActionLayout.setHorizontalGroup(
            adminActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminActionLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(adminActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(adminActionLayout.createSequentialGroup()
                        .addGroup(adminActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(adminActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminActionLayout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                                .addComponent(jLabel54))
                            .addGroup(adminActionLayout.createSequentialGroup()
                                .addComponent(datePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                .addComponent(report_SearchIDAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67)
                        .addGroup(adminActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(report_SearchDesigAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55))))
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminActionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(71, 71, 71))
        );
        adminActionLayout.setVerticalGroup(
            adminActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminActionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55))
                .addGap(9, 9, 9)
                .addGroup(adminActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(report_SearchIDAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(report_SearchDesigAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        ContainerData.add(adminAction, "card2");

        about.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\t\t        Web Based System for store personal informations\n\n\t\t\tAdministrative System\n\n\t\t\t        version 1.0.0\n\n\t\t\tDeveloped by *************\n\n\t                   Developed for - Advanced Technological Institue Kegalle as a Project\n\n\t\t\t All right reserved 2021\n\n\t\t                          Copyrright is not allowed\n\n");
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153)));
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("\t\t\t   Development team \t\n\n\tK.Kavinda Heshan\t\t\tP.P.L.Chamidu Ravihara\n\tHNDIT 2019 \t\t\t\tHNDIT 2019\n\tKegalle ATI\t\t\t\tKegalle ATI\n\t077 491 4032\t\t\t\t075 402 6549\n\tkavinda731@gmai.com\t\t\tpplchamiduravihara@gmail.com\n\n\tW.R.pasindu Ruwandeniya\t\t\tW.B.Maduwantha\n\tHNDIT 2019 \t\t\t\tHNDIT 2019\n\tKegalle ATI\t\t\t\tKegalle ATI\n\t071 570 6007 \t\t\t\t070 246 7583\n\tpasindujayanada@gmail.com\t\t\teronmadhuwantha@gmail.com\t");
        jTextArea2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153)));
        jScrollPane3.setViewportView(jTextArea2);

        ManageData_Mem.setVisible(false);

        javax.swing.GroupLayout aboutLayout = new javax.swing.GroupLayout(about);
        about.setLayout(aboutLayout);
        aboutLayout.setHorizontalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        aboutLayout.setVerticalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ContainerData.add(about, "card2");

        javax.swing.GroupLayout MainContainerLayout = new javax.swing.GroupLayout(MainContainer);
        MainContainer.setLayout(MainContainerLayout);
        MainContainerLayout.setHorizontalGroup(
            MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainContainerLayout.createSequentialGroup()
                .addComponent(Nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ContainerData, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE))
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainContainerLayout.setVerticalGroup(
            MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainContainerLayout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContainerData, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                    .addComponent(Nav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(MainContainer, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dataActionPerformed
        Home.setVisible(false);
        MainContainer.setVisible(true);

        ManageData_Mem.setVisible(false);
        ManageData_Vi.setVisible(false);
        report.setVisible(false);
        manageData_choice.setVisible(true);
        ManageAdmin.setVisible(false);
        adminAction.setVisible(false);
        about.setVisible(false);
    }//GEN-LAST:event_btn_dataActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        
        conn.adminaction(uname, "Exit System", "");
        dispose();
        Login lg = new Login();
        lg.setVisible(true);


    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminActionPerformed
        Home.setVisible(false);
        MainContainer.setVisible(true);

        ManageData_Mem.setVisible(false);
        ManageData_Vi.setVisible(false);
        report.setVisible(false);
        manageData_choice.setVisible(false);
        ManageAdmin.setVisible(true);
        adminAction.setVisible(false);
        about.setVisible(false);
    }//GEN-LAST:event_btn_adminActionPerformed

    private void btn_webActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_webActionPerformed
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://localhost/GroupProject/index.php"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }


    }//GEN-LAST:event_btn_webActionPerformed

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
        Home.setVisible(false);
        MainContainer.setVisible(true);

        ManageData_Mem.setVisible(false);
        ManageData_Vi.setVisible(false);
        report.setVisible(true);
        manageData_choice.setVisible(false);
        ManageAdmin.setVisible(false);
        adminAction.setVisible(false);
        about.setVisible(false);
    }//GEN-LAST:event_btn_reportActionPerformed

    private void btn_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutActionPerformed
        Home.setVisible(false);
        MainContainer.setVisible(true);
        ManageData_Mem.setVisible(false);
        ManageData_Vi.setVisible(false);
        report.setVisible(false);
        manageData_choice.setVisible(false);
        ManageAdmin.setVisible(false);
        adminAction.setVisible(false);
        about.setVisible(true);
    }//GEN-LAST:event_btn_aboutActionPerformed

    private void btn_NavhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NavhomeActionPerformed
        Home.setVisible(true);
        MainContainer.setVisible(false);

        ManageData_Mem.setVisible(false);
        ManageData_Vi.setVisible(false);
        report.setVisible(false);
        manageData_choice.setVisible(false);
        ManageAdmin.setVisible(false);
        adminAction.setVisible(false);
        about.setVisible(false);
    }//GEN-LAST:event_btn_NavhomeActionPerformed

    private void btn_NavReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NavReportActionPerformed
        Home.setVisible(false);
        MainContainer.setVisible(true);

        ManageData_Mem.setVisible(false);
        ManageData_Vi.setVisible(false);
        report.setVisible(true);
        manageData_choice.setVisible(false);
        ManageAdmin.setVisible(false);
        adminAction.setVisible(false);
        about.setVisible(false);
    }//GEN-LAST:event_btn_NavReportActionPerformed

    private void btn_NavWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NavWebActionPerformed
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://localhost/GroupProject/index.php"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_NavWebActionPerformed

    private void btn_NavAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NavAdminActionPerformed
        Home.setVisible(false);
        MainContainer.setVisible(true);

        ManageData_Mem.setVisible(false);
        ManageData_Vi.setVisible(false);
        report.setVisible(false);
        manageData_choice.setVisible(false);
        ManageAdmin.setVisible(true);
        adminAction.setVisible(false);
        about.setVisible(false);
    }//GEN-LAST:event_btn_NavAdminActionPerformed

    private void txt_UName10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UName10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UName10ActionPerformed

    private void btn_selectMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selectMemActionPerformed
        Home.setVisible(false);
        MainContainer.setVisible(true);

        ManageData_Mem.setVisible(true);
        ManageData_Vi.setVisible(false);
        report.setVisible(false);
        manageData_choice.setVisible(false);
        adminAction.setVisible(false);
        about.setVisible(false);
    }//GEN-LAST:event_btn_selectMemActionPerformed

    private void txt_NameViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NameViActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NameViActionPerformed

    private void txt_IdViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdViActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdViActionPerformed

    private void txt_emailViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailViActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailViActionPerformed

    private void txt_ageViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ageViActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ageViActionPerformed

    private void txt_addressViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressViActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressViActionPerformed

    private void txt_genderViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_genderViActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_genderViActionPerformed

    private void txt_mobileViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mobileViActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mobileViActionPerformed

    private void txt_resonViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resonViActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_resonViActionPerformed

    private void btn_saveViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveViActionPerformed
        try {
            if (txt_IdVi.getText().equals("")) {
                JOptionPane.showMessageDialog(this, " Select a recode first");
            } else {
                int op = JOptionPane.showConfirmDialog(this, "Are you sure you want to update this recode ?", "Update", JOptionPane.YES_NO_OPTION);
                if (op == 0) {
                    conn.start_conn2("UPDATE `visitor` SET `ViName`='" + txt_NameVi.getText() + "',`ViEmail`='" + txt_emailVi.getText() + "',`ViDob`='" + txt_dobVi.getDate() + "',`ViAge`='" + txt_ageVi.getText() + "',`ViAddress`='" + txt_addressVi.getText() + "',`ViGender`='" + txt_genderVi.getText() + "',`ViMobile`='" + txt_mobileVi.getText() + "',`ViReason`='" + txt_resonVi.getText() + "' WHERE `ViNIC`='" + txt_IdVi.getText() + "';");
                    conn.end_conn2();
                    conn.adminaction(uname, "Update Visitor recode", txt_IdVi.getText());
                    runners();
                    txt_NameVi.setText(null);
                    txt_IdVi.setText(null);
                    txt_emailVi.setText(null);
                    txt_dobVi.setText(null);
                    txt_ageVi.setText(null);
                    txt_addressVi.setText(null);
                    txt_genderVi.setText(null);
                    txt_mobileVi.setText(null);
                    txt_resonVi.setText(null);
                    JOptionPane.showMessageDialog(this, "Update Successfull");
                }
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(systemApp.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btn_saveViActionPerformed

    private void btn_clearViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearViActionPerformed
        txt_NameVi.setText(null);
        txt_IdVi.setText(null);
        txt_emailVi.setText(null);
        txt_dobVi.setText(null);
        txt_ageVi.setText(null);
        txt_addressVi.setText(null);
        txt_genderVi.setText(null);
        txt_mobileVi.setText(null);
        txt_resonVi.setText(null);

    }//GEN-LAST:event_btn_clearViActionPerformed

    private void btn_deleteViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteViActionPerformed
        try {
            if (txt_IdVi.getText().equals("")) {
                JOptionPane.showMessageDialog(this, " Select a recode first");
            } else {
                int op = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this recode ?", "Delete", JOptionPane.YES_NO_OPTION);
                if (op == 0) {
                    conn.start_conn2("DELETE FROM `visitor` WHERE `ViNIC`='" + txt_IdVi.getText() + "';");
                    conn.end_conn2();
                    conn.adminaction(uname, "Detele visitor recode", txt_IdVi.getText());
                    txt_NameVi.setText(null);
                    txt_IdVi.setText(null);
                    txt_emailVi.setText(null);
                    txt_dobVi.setText(null);
                    txt_ageVi.setText(null);
                    txt_addressVi.setText(null);
                    txt_genderVi.setText(null);
                    txt_mobileVi.setText(null);
                    txt_resonVi.setText(null);
                    runners();
                    JOptionPane.showMessageDialog(this, "Delete Successfull");
                }
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(systemApp.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btn_deleteViActionPerformed

    private void btn_selectViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selectViActionPerformed
        Home.setVisible(false);
        MainContainer.setVisible(true);

        ManageData_Mem.setVisible(false);
        ManageData_Vi.setVisible(true);
        report.setVisible(false);
        manageData_choice.setVisible(false);
        adminAction.setVisible(false);
        about.setVisible(false);
    }//GEN-LAST:event_btn_selectViActionPerformed

    private void btn_NavDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NavDataActionPerformed
        Home.setVisible(false);
        MainContainer.setVisible(true);

        ManageData_Mem.setVisible(false);
        ManageData_Vi.setVisible(false);
        report.setVisible(false);
        manageData_choice.setVisible(true);
        adminAction.setVisible(false);
        about.setVisible(false);
    }//GEN-LAST:event_btn_NavDataActionPerformed

    private void txt_nameAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameAdminActionPerformed

    private void txt_UserNameAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UserNameAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UserNameAdminActionPerformed

    private void txt_nicAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nicAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nicAdminActionPerformed

    private void txt_ageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ageAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ageAdminActionPerformed

    private void txt_addressAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressAdminActionPerformed

    private void txt_genderAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_genderAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_genderAdminActionPerformed

    private void txt_mobileAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mobileAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mobileAdminActionPerformed

    private void txt_emailAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailAdminActionPerformed

    private void txt_designationAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_designationAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_designationAdminActionPerformed

    private void cmb_SearchAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_SearchAdminActionPerformed
        if (conn.finish == true) {
            try {
                conn.start_conn("SELECT * FROM `admin` WHERE `AdUName` ='" + cmb_SearchAdmin.getSelectedItem() + "' OR `AdName`='" + cmb_SearchAdmin.getSelectedItem() + "' ");

                if (conn.rs.next()) {
                    txt_nameAdmin.setText(conn.rs.getString("AdName"));
                    txt_UserNameAdmin.setText(conn.rs.getString("AdUName"));
                    txt_nicAdmin.setText(conn.rs.getString("AdNIC"));
                    txt_dobAdmin.setDate(conn.rs.getDate("AdDob").toLocalDate());
                    txt_ageAdmin.setText(conn.rs.getString("AdAge"));
                    txt_addressAdmin.setText(conn.rs.getString("AdAddress"));
                    txt_genderAdmin.setText(conn.rs.getString("AdGender"));
                    txt_mobileAdmin.setText(conn.rs.getString("AdMobile"));
                    txt_emailAdmin.setText(conn.rs.getString("AdEmail"));
                    txt_designationAdmin.setText(conn.rs.getString("AdDesig"));
                }
                conn.end_conn();
            } catch (Exception e) {
                java.util.logging.Logger.getLogger(systemApp.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
            }

        }
    }//GEN-LAST:event_cmb_SearchAdminActionPerformed

    private void btn_deleteAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteAdminActionPerformed
        try {
            if (txt_UserNameAdmin.getText().equals("")) {
                JOptionPane.showMessageDialog(this, " Select a recode first");
            } else {
                int op = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this recode ?", "Update", JOptionPane.YES_NO_OPTION);
                if (op == 0) {
                    conn.start_conn2("DELETE FROM `admin` WHERE `AdUName` = '" + txt_UserNameAdmin.getText() + "';");
                    conn.end_conn2();
                    conn.adminaction(uname, "Detele Admin recode", txt_UserNameAdmin.getText());
                    txt_nameAdmin.setText(null);
                    txt_UserNameAdmin.setText(null);
                    txt_nicAdmin.setText(null);
                    txt_dobAdmin.setText(null);
                    txt_ageAdmin.setText(null);
                    txt_addressAdmin.setText(null);
                    txt_genderAdmin.setText(null);
                    txt_mobileAdmin.setText(null);
                    txt_emailAdmin.setText(null);
                    txt_designationAdmin.setText(null);
                    txt_answer1Admin.setText(null);
                    txt_answer2Admin.setText(null);
                    JOptionPane.showMessageDialog(this, "Delete Successfull");
                }
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(systemApp.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btn_deleteAdminActionPerformed

    private void btn_saveAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveAdminActionPerformed
        try {
            if (jCheckBox1.isSelected()) {

                if (conn.all_filled(ManageAdmin) == true) {
                    conn.start_conn2("INSERT INTO `admin`(`AdUName`, `AdName`, `Adpassword`, `AdDesig`, `AdNIC`, `AdDob`, `AdAge`, `AdAddress`, `AdGender`, `AdMobile`, `AdEmail`, `AdQ1`, `AdAns1`, `AdQ2`, `AdAns2`) VALUES ('" + txt_UserNameAdmin.getText() + "','" + txt_nameAdmin.getText() + "','" + txt_pwdAdmin.getText() + "','" + txt_designationAdmin.getText() + "','" + txt_nicAdmin.getText() + "','" + txt_dobAdmin.getDate() + "','" + txt_ageAdmin.getText() + "','" + txt_addressAdmin.getText() + "','" + txt_genderAdmin.getText() + "','" + txt_mobileAdmin.getText() + "','" + txt_emailAdmin.getText() + "','" + cmb_Q1Admin.getSelectedItem() + "','" + txt_answer1Admin.getText() + "','" + cmb_Q2Admin.getSelectedItem() + "','" + txt_answer2Admin.getText() + "')");
                    conn.end_conn2();
                    conn.adminaction(uname, "Add new Admin Recode", txt_UserNameAdmin.getText());
                    JOptionPane.showMessageDialog(this, "Recode added");
                    runners();
                } else {
                    JOptionPane.showMessageDialog(this, "Fill all feilds");
                }

            } else {
                if (!txt_UserNameAdmin.getText().equals("")) {
                    conn.start_conn2("UPDATE `admin` SET `AdName`='" + txt_nameAdmin.getText() + "',`AdDesig`='" + txt_designationAdmin.getText() + "',`AdNIC`='" + txt_nicAdmin.getText() + "',`AdDob`='" + txt_dobAdmin.getDate() + "',`AdAge`='" + txt_ageAdmin.getText() + "',`AdAddress`='" + txt_addressAdmin.getText() + "',`AdGender`='" + txt_genderAdmin.getText() + "',`AdMobile`='" + txt_mobileAdmin.getText() + "',`AdEmail`='" + txt_emailAdmin.getText() + "' WHERE `AdUName`= '" + txt_UserNameAdmin.getText() + "'");
                    conn.end_conn2();
                    conn.adminaction(uname, "Update Admin Recode", txt_UserNameAdmin.getText());
                    JOptionPane.showMessageDialog(this, "Recode updated");
                    runners();
                } else {
                    JOptionPane.showMessageDialog(this, "Select a recode");
                }
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(systemApp.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btn_saveAdminActionPerformed

    private void btn_clearAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearAdminActionPerformed
        txt_nameAdmin.setText(null);
        txt_UserNameAdmin.setText(null);
        txt_nicAdmin.setText(null);
        txt_dobAdmin.setText(null);
        txt_ageAdmin.setText(null);
        txt_addressAdmin.setText(null);
        txt_genderAdmin.setText(null);
        txt_mobileAdmin.setText(null);
        txt_emailAdmin.setText(null);
        txt_designationAdmin.setText(null);
        txt_answer1Admin.setText(null);
        txt_answer2Admin.setText(null);
    }//GEN-LAST:event_btn_clearAdminActionPerformed

    private void btn_adminActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminActionActionPerformed
        Home.setVisible(false);
        MainContainer.setVisible(true);

        ManageData_Mem.setVisible(false);
        ManageData_Vi.setVisible(false);
        report.setVisible(false);
        manageData_choice.setVisible(false);
        ManageAdmin.setVisible(false);
        adminAction.setVisible(true);
        about.setVisible(false);
    }//GEN-LAST:event_btn_adminActionActionPerformed

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked

    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_darkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_darkModeActionPerformed
        if (btn_darkMode.isSelected()) {
            //dark pressed
            //home
            Ad_system.setBackground(new java.awt.Color(0, 0, 51));
            Home.setBackground(new java.awt.Color(0, 0, 0));
            btn_data.setBackground(new java.awt.Color(51, 51, 51));
            btn_report.setBackground(new java.awt.Color(51, 51, 51));
            btn_web.setBackground(new java.awt.Color(51, 51, 51));
            btn_admin.setBackground(new java.awt.Color(51, 51, 51));
            btn_logout.setBackground(new java.awt.Color(51, 51, 51));
            btn_about.setBackground(new java.awt.Color(51, 51, 51));
            lbl_data.setForeground(new java.awt.Color(204, 204, 204));
            lbl_report.setForeground(new java.awt.Color(204, 204, 204));
            lbl_web.setForeground(new java.awt.Color(204, 204, 204));
            lbl_admin.setForeground(new java.awt.Color(204, 204, 204));
            lbl_logout.setForeground(new java.awt.Color(204, 204, 204));
            lbl_about.setForeground(new java.awt.Color(204, 204, 204));
            btn_data.setBorder(null);
            btn_report.setBorder(null);
            btn_web.setBorder(null);
            btn_about.setBorder(null);
            btn_admin.setBorder(null);
            btn_logout.setBorder(null);

            //navbar
            Title.setBackground(new java.awt.Color(0, 0, 51));
            Nav.setBackground(new java.awt.Color(0, 0, 0));
            btn_Navhome.setBackground(new java.awt.Color(51, 51, 51));
            btn_NavData.setBackground(new java.awt.Color(51, 51, 51));
            btn_NavReport.setBackground(new java.awt.Color(51, 51, 51));
            btn_NavWeb.setBackground(new java.awt.Color(51, 51, 51));
            btn_NavAdmin.setBackground(new java.awt.Color(51, 51, 51));
            btn_Navhome.setBorder(null);
            btn_NavData.setBorder(null);
            btn_NavReport.setBorder(null);
            btn_NavWeb.setBorder(null);
            btn_NavAdmin.setBorder(null);
            //navbar button foreground
            btn_Navhome.setForeground(new java.awt.Color(0, 0, 0));
            btn_NavData.setForeground(new java.awt.Color(0, 0, 0));
            btn_NavReport.setForeground(new java.awt.Color(0, 0, 0));
            btn_NavWeb.setForeground(new java.awt.Color(0, 0, 0));
            btn_NavAdmin.setForeground(new java.awt.Color(0, 0, 0));

            //Data
            manageData_choice.setBackground(new java.awt.Color(51, 51, 51));
            btn_selectMem.setBackground(new java.awt.Color(51, 51, 51));
            btn_selectVi.setBackground(new java.awt.Color(51, 51, 51));
            btn_selectMem.setForeground(new java.awt.Color(0, 0, 0));
            btn_selectVi.setForeground(new java.awt.Color(0, 0, 0));
            btn_selectMem.setBorder(null);
            btn_selectVi.setBorder(null);

            //data
            ManageData_Mem.setBackground(new java.awt.Color(51, 51, 51));
            ManageData_Vi.setBackground(new java.awt.Color(51, 51, 51));
            report.setBackground(new java.awt.Color(51, 51, 51));
            ManageAdmin.setBackground(new java.awt.Color(51, 51, 51));
            adminAction.setBackground(new java.awt.Color(51, 51, 51));
            about.setBackground(new java.awt.Color(51, 51, 51));
            btn_saveMem.setBackground(new java.awt.Color(102, 102, 102));
            btn_clearMem.setBackground(new java.awt.Color(102, 102, 102));
            btn_deleteMem.setBackground(new java.awt.Color(102, 102, 102));
            btn_saveMem.setForeground(new java.awt.Color(0, 0, 0));
            btn_clearMem.setForeground(new java.awt.Color(0, 0, 0));
            btn_deleteMem.setForeground(new java.awt.Color(0, 0, 0));
            txt_Name.setBackground(new java.awt.Color(102, 102, 102));
            txt_UserName.setBackground(new java.awt.Color(102, 102, 102));
            txt_nic.setBackground(new java.awt.Color(102, 102, 102));
            txt_dob.setBackground(new java.awt.Color(102, 102, 102));
            txt_age.setBackground(new java.awt.Color(102, 102, 102));
            txt_address.setBackground(new java.awt.Color(102, 102, 102));
            txt_gender.setBackground(new java.awt.Color(102, 102, 102));
            txt_mobile.setBackground(new java.awt.Color(102, 102, 102));
            txt_email.setBackground(new java.awt.Color(102, 102, 102));
            txt_department.setBackground(new java.awt.Color(102, 102, 102));
            txt_designation.setBackground(new java.awt.Color(102, 102, 102));
            txt_Q1Mem.setBackground(new java.awt.Color(102, 102, 102));
            txt_Q2Mem.setBackground(new java.awt.Color(102, 102, 102));
            txt_A1Mem.setBackground(new java.awt.Color(102, 102, 102));
            txt_A2Mem.setBackground(new java.awt.Color(102, 102, 102));

            //visitor
            btn_saveVi.setBackground(new java.awt.Color(102, 102, 102));
            btn_clearVi.setBackground(new java.awt.Color(102, 102, 102));
            btn_deleteVi.setBackground(new java.awt.Color(102, 102, 102));
            btn_saveVi.setForeground(new java.awt.Color(0, 0, 0));
            btn_clearVi.setForeground(new java.awt.Color(0, 0, 0));
            btn_deleteVi.setForeground(new java.awt.Color(0, 0, 0));
            txt_NameVi.setBackground(new java.awt.Color(102, 102, 102));
            txt_IdVi.setBackground(new java.awt.Color(102, 102, 102));
            txt_addressVi.setBackground(new java.awt.Color(102, 102, 102));
            txt_ageVi.setBackground(new java.awt.Color(102, 102, 102));
            txt_dobVi.setBackground(new java.awt.Color(102, 102, 102));
            txt_resonVi.setBackground(new java.awt.Color(102, 102, 102));
            txt_genderVi.setBackground(new java.awt.Color(102, 102, 102));
            txt_emailVi.setBackground(new java.awt.Color(102, 102, 102));
            txt_mobileVi.setBackground(new java.awt.Color(102, 102, 102));

            //admin
            btn_saveAdmin.setBackground(new java.awt.Color(102, 102, 102));
            btn_clearAdmin.setBackground(new java.awt.Color(102, 102, 102));
            btn_deleteAdmin.setBackground(new java.awt.Color(102, 102, 102));
            btn_adminAction.setBackground(new java.awt.Color(102, 102, 102));
            btn_ResPWAdmin.setBackground(new java.awt.Color(102, 102, 102));
            btn_saveAdmin.setForeground(new java.awt.Color(0, 0, 0));
            btn_clearAdmin.setForeground(new java.awt.Color(0, 0, 0));
            btn_deleteAdmin.setForeground(new java.awt.Color(0, 0, 0));
            btn_adminAction.setForeground(new java.awt.Color(0, 0, 0));
            btn_ResPWAdmin.setForeground(new java.awt.Color(0, 0, 0));
            txt_nameAdmin.setBackground(new java.awt.Color(102, 102, 102));
            txt_nicAdmin.setBackground(new java.awt.Color(102, 102, 102));
            txt_mobileAdmin.setBackground(new java.awt.Color(102, 102, 102));
            txt_genderAdmin.setBackground(new java.awt.Color(102, 102, 102));
            txt_emailAdmin.setBackground(new java.awt.Color(102, 102, 102));
            txt_dobAdmin.setBackground(new java.awt.Color(102, 102, 102));
            txt_designationAdmin.setBackground(new java.awt.Color(102, 102, 102));
            txt_ageAdmin.setBackground(new java.awt.Color(102, 102, 102));
            txt_addressAdmin.setBackground(new java.awt.Color(102, 102, 102));
            txt_UserNameAdmin.setBackground(new java.awt.Color(102, 102, 102));
            cmb_Q1Admin.setBackground(new java.awt.Color(0, 0, 0));
            cmb_Q2Admin.setBackground(new java.awt.Color(0, 0, 0));
            txt_answer1Admin.setBackground(new java.awt.Color(102, 102, 102));
            txt_answer2Admin.setBackground(new java.awt.Color(102, 102, 102));

            //about
            jTextArea1.setBackground(new java.awt.Color(153, 153, 153));
            jTextArea2.setBackground(new java.awt.Color(153, 153, 153));

            //report
            datePicker4.setBackground(new java.awt.Color(0, 0, 0));
            report_SearchDesignationRep.setBackground(new java.awt.Color(0, 0, 0));
            report_SearchIDRep.setBackground(new java.awt.Color(0, 0, 0));
            report_SearchdepRep.setBackground(new java.awt.Color(0, 0, 0));

            //admin action
            report_SearchDesigAdmin.setBackground(new java.awt.Color(0, 0, 0));
            report_SearchIDAdmin.setBackground(new java.awt.Color(0, 0, 0));
            cmb_SearchAdmin.setBackground(new java.awt.Color(0, 0, 0));
            cmb_SearchMem.setBackground(new java.awt.Color(0, 0, 0));
            cmb_SearchVi.setBackground(new java.awt.Color(0, 0, 0));

            //admin PWReset
        } else {
            //dark released
            //home
            Ad_system.setBackground(new java.awt.Color(0, 102, 153));
            Home.setBackground(new java.awt.Color(204, 204, 204));
            btn_data.setBackground(new java.awt.Color(204, 204, 204));
            btn_report.setBackground(new java.awt.Color(204, 204, 204));
            btn_web.setBackground(new java.awt.Color(204, 204, 204));
            btn_admin.setBackground(new java.awt.Color(204, 204, 204));
            btn_logout.setBackground(new java.awt.Color(204, 204, 204));
            btn_about.setBackground(new java.awt.Color(204, 204, 204));
            lbl_data.setForeground(new java.awt.Color(0, 0, 0));
            lbl_report.setForeground(new java.awt.Color(0, 0, 0));
            lbl_web.setForeground(new java.awt.Color(0, 0, 0));
            lbl_admin.setForeground(new java.awt.Color(0, 0, 0));
            lbl_logout.setForeground(new java.awt.Color(0, 0, 0));
            lbl_about.setForeground(new java.awt.Color(0, 0, 0));
            btn_data.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(102, 0, 102)));
            btn_report.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(102, 0, 102)));
            btn_web.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(102, 0, 102)));
            btn_admin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(102, 0, 102)));
            btn_logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(102, 0, 102)));
            btn_about.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(102, 0, 102)));

            //navbar
            Title.setBackground(new java.awt.Color(0, 102, 153));
            Nav.setBackground(new java.awt.Color(153, 153, 153));
            btn_Navhome.setBackground(new java.awt.Color(153, 153, 153));
            btn_NavData.setBackground(new java.awt.Color(153, 153, 153));
            btn_NavReport.setBackground(new java.awt.Color(153, 153, 153));
            btn_NavWeb.setBackground(new java.awt.Color(153, 153, 153));
            btn_NavAdmin.setBackground(new java.awt.Color(153, 153, 153));
            btn_Navhome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 102, 153)));
            btn_NavData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 102, 153)));
            btn_NavReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 102, 153)));
            btn_NavAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 102, 153)));
            btn_NavWeb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 102, 153)));

            //navbar button foreground
            btn_Navhome.setForeground(new java.awt.Color(0, 102, 153));
            btn_NavData.setForeground(new java.awt.Color(0, 102, 153));
            btn_NavReport.setForeground(new java.awt.Color(0, 102, 153));
            btn_NavWeb.setForeground(new java.awt.Color(0, 102, 153));
            btn_NavAdmin.setForeground(new java.awt.Color(0, 102, 153));

            //data
            manageData_choice.setBackground(new java.awt.Color(204, 204, 204));
            btn_selectMem.setBackground(new java.awt.Color(240, 240, 240));
            btn_selectVi.setBackground(new java.awt.Color(240, 240, 240));
            btn_selectMem.setForeground(new java.awt.Color(0, 102, 153));
            btn_selectVi.setForeground(new java.awt.Color(0, 102, 153));
            btn_selectMem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153)));
            btn_selectVi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 102, 153)));

            //data fields
            //member
            ManageData_Mem.setBackground(new java.awt.Color(204, 204, 204));
            ManageData_Vi.setBackground(new java.awt.Color(204, 204, 204));
            report.setBackground(new java.awt.Color(204, 204, 204));
            ManageAdmin.setBackground(new java.awt.Color(204, 204, 204));
            adminAction.setBackground(new java.awt.Color(204, 204, 204));
            about.setBackground(new java.awt.Color(204, 204, 204));
            btn_saveMem.setBackground(new java.awt.Color(204, 204, 204));
            btn_clearMem.setBackground(new java.awt.Color(204, 204, 204));
            btn_deleteMem.setBackground(new java.awt.Color(204, 204, 204));
            cmb_SearchMem.setBackground(new java.awt.Color(255, 255, 255));
            btn_saveMem.setForeground(new java.awt.Color(0, 102, 153));
            btn_clearMem.setForeground(new java.awt.Color(153, 0, 0));
            btn_deleteMem.setForeground(new java.awt.Color(153, 0, 0));
            txt_Name.setBackground(new java.awt.Color(255, 255, 255));
            txt_UserName.setBackground(new java.awt.Color(255, 255, 255));
            txt_nic.setBackground(new java.awt.Color(255, 255, 255));
            txt_dob.setBackground(new java.awt.Color(255, 255, 255));
            txt_age.setBackground(new java.awt.Color(255, 255, 255));
            txt_address.setBackground(new java.awt.Color(255, 255, 255));
            txt_gender.setBackground(new java.awt.Color(255, 255, 255));
            txt_mobile.setBackground(new java.awt.Color(255, 255, 255));
            txt_email.setBackground(new java.awt.Color(255, 255, 255));
            txt_department.setBackground(new java.awt.Color(255, 255, 255));
            txt_designation.setBackground(new java.awt.Color(255, 255, 255));
            txt_Q1Mem.setBackground(new java.awt.Color(255, 255, 255));
            txt_Q2Mem.setBackground(new java.awt.Color(255, 255, 255));
            txt_A1Mem.setBackground(new java.awt.Color(255, 255, 255));
            txt_A2Mem.setBackground(new java.awt.Color(255, 255, 255));

            //visitor
            cmb_SearchVi.setBackground(new java.awt.Color(255, 255, 255));
            btn_saveVi.setBackground(new java.awt.Color(204, 204, 204));
            btn_clearVi.setBackground(new java.awt.Color(204, 204, 204));
            btn_deleteVi.setBackground(new java.awt.Color(204, 204, 204));
            btn_saveVi.setForeground(new java.awt.Color(0, 102, 153));
            btn_clearVi.setForeground(new java.awt.Color(153, 0, 0));
            btn_deleteVi.setForeground(new java.awt.Color(153, 0, 0));
            txt_NameVi.setBackground(new java.awt.Color(255, 255, 255));
            txt_IdVi.setBackground(new java.awt.Color(255, 255, 255));
            txt_addressVi.setBackground(new java.awt.Color(255, 255, 255));
            txt_ageVi.setBackground(new java.awt.Color(255, 255, 255));
            txt_dobVi.setBackground(new java.awt.Color(255, 255, 255));
            txt_resonVi.setBackground(new java.awt.Color(255, 255, 255));
            txt_genderVi.setBackground(new java.awt.Color(255, 255, 255));
            txt_emailVi.setBackground(new java.awt.Color(255, 255, 255));
            txt_mobileVi.setBackground(new java.awt.Color(255, 255, 255));

            //admin
            btn_saveAdmin.setBackground(new java.awt.Color(204, 204, 204));
            btn_clearAdmin.setBackground(new java.awt.Color(204, 204, 204));
            btn_deleteAdmin.setBackground(new java.awt.Color(204, 204, 204));
            btn_adminAction.setBackground(new java.awt.Color(204, 204, 204));
            btn_ResPWAdmin.setBackground(new java.awt.Color(204, 204, 204));
            btn_adminAction.setForeground(new java.awt.Color(0, 102, 153));
            btn_deleteAdmin.setForeground(new java.awt.Color(153, 0, 0));
            btn_clearAdmin.setForeground(new java.awt.Color(153, 0, 0));
            btn_saveAdmin.setForeground(new java.awt.Color(0, 102, 153));
            btn_ResPWAdmin.setForeground(new java.awt.Color(153, 0, 0));
            txt_nameAdmin.setBackground(new java.awt.Color(255, 255, 255));
            txt_nicAdmin.setBackground(new java.awt.Color(255, 255, 255));
            txt_mobileAdmin.setBackground(new java.awt.Color(255, 255, 255));
            txt_genderAdmin.setBackground(new java.awt.Color(255, 255, 255));
            txt_emailAdmin.setBackground(new java.awt.Color(255, 255, 255));
            txt_dobAdmin.setBackground(new java.awt.Color(255, 255, 255));
            txt_designationAdmin.setBackground(new java.awt.Color(255, 255, 255));
            txt_ageAdmin.setBackground(new java.awt.Color(255, 255, 255));
            txt_addressAdmin.setBackground(new java.awt.Color(255, 255, 255));
            txt_UserNameAdmin.setBackground(new java.awt.Color(255, 255, 255));
            cmb_Q1Admin.setBackground(new java.awt.Color(255, 255, 255));
            cmb_Q2Admin.setBackground(new java.awt.Color(255, 255, 255));
            txt_answer1Admin.setBackground(new java.awt.Color(255, 255, 255));
            txt_answer2Admin.setBackground(new java.awt.Color(255, 255, 255));
            cmb_SearchAdmin.setBackground(new java.awt.Color(255, 255, 255));

            //about
            jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
            jTextArea2.setBackground(new java.awt.Color(204, 204, 204));

            //report
            datePicker4.setBackground(new java.awt.Color(255, 255, 255));
            report_SearchDesignationRep.setBackground(new java.awt.Color(255, 255, 255));
            report_SearchIDRep.setBackground(new java.awt.Color(255, 255, 255));
            report_SearchdepRep.setBackground(new java.awt.Color(255, 255, 255));

            //admin action
            report_SearchDesigAdmin.setBackground(new java.awt.Color(255, 255, 255));
            report_SearchIDAdmin.setBackground(new java.awt.Color(255, 255, 255));

            cmb_SearchMem.setBackground(new java.awt.Color(255, 255, 255));
            cmb_SearchVi.setBackground(new java.awt.Color(255, 255, 255));
        }
    }//GEN-LAST:event_btn_darkModeActionPerformed

    private void txt_Q1MemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Q1MemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Q1MemActionPerformed

    private void txt_Q2MemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Q2MemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Q2MemActionPerformed

    private void btn_clearMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearMemActionPerformed
        txt_Name.setText(null);
        txt_UserName.setText(null);
        txt_nic.setText(null);
        txt_dob.setText(null);
        txt_age.setText(null);
        txt_address.setText(null);
        txt_gender.setText(null);
        txt_mobile.setText(null);
        txt_email.setText(null);
        txt_department.setText(null);
        txt_designation.setText(null);


    }//GEN-LAST:event_btn_clearMemActionPerformed

    private void btn_saveMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveMemActionPerformed
        try {
            if (txt_UserName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, " Select a recode first");
            } else {
                int op = JOptionPane.showConfirmDialog(this, "Are you sure you want to update this recode ?", "Update", JOptionPane.YES_NO_OPTION);
                if (op == 0) {
                    conn.start_conn2("UPDATE `member` SET `MemName`='" + txt_Name.getText() + "',`MemDOB`='" + txt_dob.getDate() + "',`MemAddress`='" + txt_address.getText() + "',`MemDept`='" + txt_department.getText() + "',`MemDesig`='" + txt_designation.getText() + "',`MemAge`='" + txt_age.getText() + "',`MemNIC`='" + txt_nic.getText() + "',`MemGender`='" + txt_gender.getText() + "',`MemMobile`='" + txt_mobile.getText() + "',`MemEmail`='" + txt_email.getText() + "' WHERE `MemUName` ='" + txt_UserName.getText() + "';");
                    conn.end_conn2();
                    conn.adminaction(uname, "Update Member recode", txt_UserName.getText());
                    runners();
                    txt_Name.setText(null);
                    txt_UserName.setText(null);
                    txt_nic.setText(null);
                    txt_dob.setText(null);
                    txt_age.setText(null);
                    txt_address.setText(null);
                    txt_gender.setText(null);
                    txt_mobile.setText(null);
                    txt_email.setText(null);
                    txt_department.setText(null);
                    txt_designation.setText(null);
                    JOptionPane.showMessageDialog(this, "Update Successfull");
                }
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(systemApp.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btn_saveMemActionPerformed

    private void btn_deleteMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteMemActionPerformed
        try {
            if (txt_UserName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, " Select a recode first");
            } else {
                int op = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this recode ?", "Delete", JOptionPane.YES_NO_OPTION);
                if (op == 0) {
                    conn.start_conn2("DELETE FROM `member` WHERE `MemUName` ='" + txt_UserName.getText() + "' ;");
                    conn.end_conn2();
                    conn.adminaction(uname, "Detele Member recode", txt_UserName.getText());
                    txt_Name.setText(null);
                    txt_UserName.setText(null);
                    txt_nic.setText(null);
                    txt_dob.setText(null);
                    txt_age.setText(null);
                    txt_address.setText(null);
                    txt_gender.setText(null);
                    txt_mobile.setText(null);
                    txt_email.setText(null);
                    txt_department.setText(null);
                    txt_designation.setText(null);
                    runners();
                    JOptionPane.showMessageDialog(this, "Delete Successfull");
                }
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(systemApp.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btn_deleteMemActionPerformed

    private void txt_designationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_designationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_designationActionPerformed

    private void txt_departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_departmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_departmentActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mobileActionPerformed

    private void txt_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_genderActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void txt_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ageActionPerformed

    private void txt_nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nicActionPerformed

    private void txt_UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UserNameActionPerformed

    private void txt_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NameActionPerformed

    private void txt_A1MemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_A1MemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_A1MemActionPerformed

    private void txt_A2MemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_A2MemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_A2MemActionPerformed

    private void txt_answer1AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_answer1AdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_answer1AdminActionPerformed

    private void txt_answer2AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_answer2AdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_answer2AdminActionPerformed

    private void cmb_SearchMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_SearchMemActionPerformed
        if (conn.finish == true) {
            try {
                conn.start_conn("SELECT `MemUName`, `MemName`, `MemDOB`, `MemAddress`, `MemDept`, `MemDesig`, `MemAge`, `MemNIC`, `MemGender`, `MemMobile`, `MemEmail`, `MemQ1`, `MemAns1`, `MemQ2`, `MemAns2` FROM `member` WHERE `MemUName`='" + cmb_SearchMem.getSelectedItem() + "' OR `MemName`='" + cmb_SearchMem.getSelectedItem() + "'");
                if (conn.rs.next()) {
                    txt_Name.setText(conn.rs.getString("MemName"));
                    txt_UserName.setText(conn.rs.getString("MemUName"));
                    txt_nic.setText(conn.rs.getString("MemNIC"));
                    txt_dob.setDate(conn.rs.getDate("MemDOB").toLocalDate());
                    txt_age.setText(conn.rs.getString("MemAge"));
                    txt_address.setText(conn.rs.getString("MemAddress"));
                    txt_gender.setText(conn.rs.getString("MemGender"));
                    txt_mobile.setText(conn.rs.getString("MemMobile"));
                    txt_email.setText(conn.rs.getString("MemEmail"));
                    txt_department.setText(conn.rs.getString("MemDept"));
                    txt_designation.setText(conn.rs.getString("MemDesig"));
                }

                conn.end_conn();
            } catch (Exception e) {
                java.util.logging.Logger.getLogger(systemApp.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
            }

        }
    }//GEN-LAST:event_cmb_SearchMemActionPerformed

    private void cmb_SearchViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_SearchViActionPerformed
        if (conn.finish == true) {
            try {
                conn.start_conn("SELECT `ViName`, `ViNIC`, `ViEmail`, `ViDob`, `ViAge`, `ViAddress`, `ViGender`, `ViMobile`, `ViReason` FROM `visitor` WHERE `ViNIC` LIKE '%" + cmb_SearchVi.getSelectedItem() + "%' OR `ViName` LIKE '%" + cmb_SearchVi.getSelectedItem() + "%';");
                if (conn.rs.next()) {
                    txt_NameVi.setText(conn.rs.getString("ViName"));
                    txt_IdVi.setText(conn.rs.getString("ViNIC"));
                    txt_emailVi.setText(conn.rs.getString("ViEmail"));
                    txt_dobVi.setDate(conn.rs.getDate("ViDob").toLocalDate());
                    txt_ageVi.setText(conn.rs.getString("ViAge"));
                    txt_addressVi.setText(conn.rs.getString("ViAddress"));
                    txt_genderVi.setText(conn.rs.getString("ViGender"));
                    txt_mobileVi.setText(conn.rs.getString("ViMobile"));
                    txt_resonVi.setText(conn.rs.getString("ViReason"));
                }

                conn.end_conn();
            } catch (Exception e) {
                java.util.logging.Logger.getLogger(systemApp.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
            }

        }
    }//GEN-LAST:event_cmb_SearchViActionPerformed

    private void btn_ResPWAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResPWAdminActionPerformed

        ForgetPWAdmin f1 = new ForgetPWAdmin();
        f1.setVisible(true);


    }//GEN-LAST:event_btn_ResPWAdminActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            btn_saveAdmin.setText("Add");
//            cmb_Q1Admin.setEnabled(true);
//            cmb_Q2Admin.setEnabled(true);
//            txt_answer1Admin.setEnabled(true);
//            txt_answer2Admin.setEnabled(true);
            txt_UserNameAdmin.setEditable(true);
            txt_pwdAdmin.setEnabled(true);
        } else {
            btn_saveAdmin.setText("Update");
//            cmb_Q1Admin.setEnabled(false);
//            cmb_Q2Admin.setEnabled(false);
//            txt_answer1Admin.setEnabled(false);
//            txt_answer2Admin.setEnabled(false);
            txt_UserNameAdmin.setEditable(false);
            txt_pwdAdmin.setEnabled(false);

        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        conn.adminaction(uname, "Exit System", "");
    }//GEN-LAST:event_formWindowClosing

    private void report_SearchIDAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_SearchIDAdminActionPerformed
        if (conn.finish == true) {
            conn.gen_table("SELECT `admin_action`.`AdUName` AS `Admin Username` , `admin_action`.`Date` , `admin_action`.`Time` AS `Action` , `admin_action`.`AdAction` , `admin_action`.`notes` AS `Notes` FROM `tkdb`.`admin_action` INNER JOIN `tkdb`.`admin` ON (`admin_action`.`AdUName` = `admin`.`AdUName`) WHERE (`admin_action`.`AdUName`='" + report_SearchIDAdmin.getSelectedItem() + "') OR (`admin`.`AdNIC`='" + report_SearchIDAdmin.getSelectedItem() + "');", Adactions);
        }
    }//GEN-LAST:event_report_SearchIDAdminActionPerformed

    private void report_SearchDesigAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_SearchDesigAdminActionPerformed
        if (conn.finish == true) {
            conn.gen_table("SELECT `admin_action`.`AdUName` AS `Admin Username` , `admin_action`.`Date` , `admin_action`.`Time` , `admin_action`.`AdAction` AS `Action` , `admin_action`.`notes` AS `Notes` FROM `tkdb`.`admin_action` INNER JOIN `tkdb`.`admin` ON (`admin_action`.`AdUName` = `admin`.`AdUName`) WHERE (`admin`.`AdDesig` ='" + report_SearchDesigAdmin.getSelectedItem() + "');", Adactions);
        }
    }//GEN-LAST:event_report_SearchDesigAdminActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        runners();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void datePicker2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datePicker2PropertyChange
        conn.gen_table("SELECT `AdUName` AS `Admin Username` , `Date` , `Time` , `AdAction` AS `Action` , `notes` AS `Notes` FROM `tkdb`.`admin_action` WHERE `Date` BETWEEN '" + datePicker1.getDate() + "' AND '" + datePicker2.getDate() + "' ;", Adactions);
    }//GEN-LAST:event_datePicker2PropertyChange

    private void report_SearchIDRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_SearchIDRepActionPerformed
        if (conn.finish == true) {
            conn.gen_table("SELECT `member`.`MemName` AS `Name` , `member`.`MemDOB` AS `Date of Birth` , `member`.`MemAddress` AS `Address` , `member`.`MemDept` AS `Department` , `member`.`MemDesig` AS `Designation` , TIMESTAMPDIFF(YEAR, `MemDOB`, CURDATE()) AS `Age` , `member`.`MemNIC` AS `NIC` , `member`.`MemGender` AS `Gender` , `member`.`MemMobile` AS `Mobile` , `member_log`.`Date` , `member_log`.`TimeIn` , `member_log`.`TimeOut` FROM `tkdb`.`member_log` INNER JOIN `tkdb`.`member` ON (`member_log`.`MemUName` = `member`.`MemUName`) WHERE `member`.`MemName`LIKE '%" + report_SearchIDRep.getSelectedItem() + "%' OR `member`.`MemNIC` LIKE '%" + report_SearchIDRep.getSelectedItem() + "%';", jTable2);

            conn.gen_table("SELECT `visitor`.`ViName` AS `Name` , `visitor`.`ViNIC` AS `NIC` , `visitor`.`ViDob` AS `Date of Birth` , TIMESTAMPDIFF(YEAR, `ViDob`, CURDATE()) AS `Age` , `visitor`.`ViAddress` AS `Address` , `visitor`.`ViGender` AS `Gender` , `visitor`.`ViMobile` AS `Phone` , `visitor`.`ViReason` AS `Reason` , `visitor_log`.`Date` , `visitor_log`.`TimeIn` , `visitor_log`.`TimeOut` FROM `tkdb`.`visitor_log` INNER JOIN `tkdb`.`visitor` ON (`visitor_log`.`ViNIC` = `visitor`.`ViNIC`) WHERE `visitor`.`ViName` LIKE '%" + report_SearchIDRep.getSelectedItem() + "%' OR `visitor`.`ViNIC` LIKE '%" + report_SearchIDRep.getSelectedItem() + "%'", jTable3);
        }
    }//GEN-LAST:event_report_SearchIDRepActionPerformed

    private void report_SearchdepRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_SearchdepRepActionPerformed
        if (conn.finish == true) {
            conn.gen_table("SELECT `member`.`MemName` AS `Name` , `member`.`MemDOB` AS `Date of Birth` , `member`.`MemAddress` AS `Address` , `member`.`MemDept` AS `Department` , `member`.`MemDesig` AS `Designation` , TIMESTAMPDIFF(YEAR, `MemDOB`, CURDATE()) AS `Age` , `member`.`MemNIC` AS `NIC` , `member`.`MemGender` AS `Gender` , `member`.`MemMobile` AS `Mobile` , `member_log`.`Date` , `member_log`.`TimeIn` , `member_log`.`TimeOut` FROM `tkdb`.`member_log` INNER JOIN `tkdb`.`member` ON (`member_log`.`MemUName` = `member`.`MemUName`) WHERE `member`.`MemDept`LIKE '%" + report_SearchdepRep.getSelectedItem() + "%';", jTable2);
        }
    }//GEN-LAST:event_report_SearchdepRepActionPerformed

    private void report_SearchDesignationRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_SearchDesignationRepActionPerformed
        if (conn.finish == true) {
            conn.gen_table("SELECT `member`.`MemName` AS `Name` , `member`.`MemDOB` AS `Date of Birth` , `member`.`MemAddress` AS `Address` , `member`.`MemDept` AS `Department` , `member`.`MemDesig` AS `Designation` , TIMESTAMPDIFF(YEAR, `MemDOB`, CURDATE()) AS `Age` , `member`.`MemNIC` AS `NIC` , `member`.`MemGender` AS `Gender` , `member`.`MemMobile` AS `Mobile` , `member_log`.`Date` , `member_log`.`TimeIn` , `member_log`.`TimeOut` FROM `tkdb`.`member_log` INNER JOIN `tkdb`.`member` ON (`member_log`.`MemUName` = `member`.`MemUName`) WHERE `member`.`MemDesig`LIKE '%" + report_SearchDesignationRep.getSelectedItem() + "%';", jTable2);
        }
    }//GEN-LAST:event_report_SearchDesignationRepActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        runners();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void datePicker4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datePicker4PropertyChange
        conn.gen_table("SELECT `member`.`MemName` AS `Name` , `member`.`MemDOB` AS `Date of Birth` , `member`.`MemAddress` AS `Address` , `member`.`MemDept` AS `Department` , `member`.`MemDesig` AS `Designation` , TIMESTAMPDIFF(YEAR, `MemDOB`, CURDATE()) AS `Age` , `member`.`MemNIC` AS `NIC` , `member`.`MemGender` AS `Gender` , `member`.`MemMobile` AS `Mobile` , `member_log`.`Date` , `member_log`.`TimeIn` , `member_log`.`TimeOut` FROM `tkdb`.`member_log` INNER JOIN `tkdb`.`member` ON (`member_log`.`MemUName` = `member`.`MemUName`) WHERE `member_log`.`Date` BETWEEN '" + datePicker3.getDate() + "' AND '" + datePicker4.getDate() + "';", jTable2);

        conn.gen_table("SELECT `visitor`.`ViName` AS `Name` , `visitor`.`ViNIC` AS `NIC` , `visitor`.`ViDob` AS `Date of Birth` , TIMESTAMPDIFF(YEAR, `ViDob`, CURDATE()) AS `Age` , `visitor`.`ViAddress` AS `Address` , `visitor`.`ViGender` AS `Gender` , `visitor`.`ViMobile` AS `Phone` , `visitor`.`ViReason` AS `Reason` , `visitor_log`.`Date` , `visitor_log`.`TimeIn` , `visitor_log`.`TimeOut` FROM `tkdb`.`visitor_log` INNER JOIN `tkdb`.`visitor` ON (`visitor_log`.`ViNIC` = `visitor`.`ViNIC`) WHERE `visitor_log`.`Date` BETWEEN '" + datePicker3.getDate() + "' AND '" + datePicker4.getDate() + "'", jTable3);
    }//GEN-LAST:event_datePicker4PropertyChange

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_exit1MouseClicked

    private void min1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min1MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_min1MouseClicked

    private void btn_NavWeb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NavWeb1ActionPerformed
       conn.adminaction(uname, "Exit System", "");
       this.dispose();
       Login lg = new Login();
       lg.setVisible(true);
       
    }//GEN-LAST:event_btn_NavWeb1ActionPerformed

    private void btn_NavWeb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NavWeb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_NavWeb2ActionPerformed

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
            java.util.logging.Logger.getLogger(systemApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(systemApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(systemApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(systemApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new systemApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ad_system;
    private javax.swing.JTable Adactions;
    private javax.swing.JPanel ContainerData;
    private javax.swing.JLabel Head;
    private javax.swing.JPanel Home;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel MainContainer;
    private javax.swing.JPanel ManageAdmin;
    private javax.swing.JPanel ManageData_Mem;
    private javax.swing.JPanel ManageData_Vi;
    private javax.swing.JPanel Nav;
    private javax.swing.JPanel Title;
    private javax.swing.JPanel about;
    private javax.swing.JPanel adminAction;
    private javax.swing.JButton btn_NavAdmin;
    private javax.swing.JButton btn_NavData;
    private javax.swing.JButton btn_NavReport;
    private javax.swing.JButton btn_NavWeb;
    private javax.swing.JButton btn_NavWeb1;
    private javax.swing.JButton btn_NavWeb2;
    private javax.swing.JButton btn_Navhome;
    private javax.swing.JButton btn_ResPWAdmin;
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_admin;
    private javax.swing.JButton btn_adminAction;
    private javax.swing.JButton btn_clearAdmin;
    private javax.swing.JButton btn_clearMem;
    private javax.swing.JButton btn_clearVi;
    private javax.swing.JToggleButton btn_darkMode;
    private javax.swing.JButton btn_data;
    private javax.swing.JButton btn_deleteAdmin;
    private javax.swing.JButton btn_deleteMem;
    private javax.swing.JButton btn_deleteVi;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_report;
    private javax.swing.JButton btn_saveAdmin;
    private javax.swing.JButton btn_saveMem;
    private javax.swing.JButton btn_saveVi;
    private javax.swing.JButton btn_selectMem;
    private javax.swing.JButton btn_selectVi;
    private javax.swing.JButton btn_web;
    private javax.swing.JComboBox<String> cmb_Q1Admin;
    private javax.swing.JComboBox<String> cmb_Q2Admin;
    private javax.swing.JComboBox<String> cmb_SearchAdmin;
    private javax.swing.JComboBox<String> cmb_SearchMem;
    private javax.swing.JComboBox<String> cmb_SearchVi;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private com.github.lgooddatepicker.components.DatePicker datePicker3;
    private com.github.lgooddatepicker.components.DatePicker datePicker4;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lbl_about;
    private javax.swing.JLabel lbl_admin;
    private javax.swing.JLabel lbl_data;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_report;
    private javax.swing.JLabel lbl_web;
    private javax.swing.JPanel manageData_choice;
    private javax.swing.JLabel max;
    private javax.swing.JLabel max1;
    private javax.swing.JLabel min;
    private javax.swing.JLabel min1;
    private javax.swing.JPanel report;
    private javax.swing.JComboBox<String> report_SearchDesigAdmin;
    private javax.swing.JComboBox<String> report_SearchDesignationRep;
    private javax.swing.JComboBox<String> report_SearchIDAdmin;
    private javax.swing.JComboBox<String> report_SearchIDRep;
    private javax.swing.JComboBox<String> report_SearchdepRep;
    private javax.swing.JTextField txt_A1Mem;
    private javax.swing.JTextField txt_A2Mem;
    private javax.swing.JTextField txt_IdVi;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_NameVi;
    private javax.swing.JTextField txt_Q1Mem;
    private javax.swing.JTextField txt_Q2Mem;
    private javax.swing.JTextField txt_UName10;
    private javax.swing.JTextField txt_UserName;
    private javax.swing.JTextField txt_UserNameAdmin;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_addressAdmin;
    private javax.swing.JTextField txt_addressVi;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_ageAdmin;
    private javax.swing.JTextField txt_ageVi;
    private javax.swing.JTextField txt_answer1Admin;
    private javax.swing.JTextField txt_answer2Admin;
    private javax.swing.JTextField txt_department;
    private javax.swing.JTextField txt_designation;
    private javax.swing.JTextField txt_designationAdmin;
    private com.github.lgooddatepicker.components.DatePicker txt_dob;
    private com.github.lgooddatepicker.components.DatePicker txt_dobAdmin;
    private com.github.lgooddatepicker.components.DatePicker txt_dobVi;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_emailAdmin;
    private javax.swing.JTextField txt_emailVi;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_genderAdmin;
    private javax.swing.JTextField txt_genderVi;
    private javax.swing.JTextField txt_mobile;
    private javax.swing.JTextField txt_mobileAdmin;
    private javax.swing.JTextField txt_mobileVi;
    private javax.swing.JTextField txt_nameAdmin;
    private javax.swing.JTextField txt_nic;
    private javax.swing.JTextField txt_nicAdmin;
    private javax.swing.JPasswordField txt_pwdAdmin;
    private javax.swing.JTextField txt_resonVi;
    // End of variables declaration//GEN-END:variables
}
