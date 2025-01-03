
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser = new javax.swing.JColorChooser();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 7), new java.awt.Dimension(0, 7), new java.awt.Dimension(32767, 7));
        jPanel3 = new javax.swing.JPanel();
        skill1 = new javax.swing.JTextField();
        skill2 = new javax.swing.JTextField();
        skill3 = new javax.swing.JTextField();
        skill4 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        syear = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        education1 = new javax.swing.JTextArea();
        dyear = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        education2 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        cer1 = new javax.swing.JTextField();
        cer2 = new javax.swing.JTextField();
        cer3 = new javax.swing.JTextField();
        cer4 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        profiletarea = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        git = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        pro1 = new javax.swing.JTextField();
        pro2 = new javax.swing.JTextField();
        pro3 = new javax.swing.JTextField();
        pro4 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jColorChooser.setBackground(new java.awt.Color(204, 204, 255));
        jColorChooser.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 204), new java.awt.Color(255, 153, 153)));

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Deepak");
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 153), new java.awt.Color(255, 153, 153)));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 530, 70));

        jPanel2.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 155, 10, 640));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null, null, null, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N

        skill1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        skill1.setForeground(new java.awt.Color(204, 204, 204));
        skill1.setText("Java");
        skill1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                skill1MouseClicked(evt);
            }
        });

        skill2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        skill2.setForeground(new java.awt.Color(204, 204, 204));
        skill2.setText("MySQL");
        skill2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                skill2MouseClicked(evt);
            }
        });

        skill3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        skill3.setForeground(new java.awt.Color(204, 204, 204));
        skill3.setText("HTML");
        skill3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                skill3MouseClicked(evt);
            }
        });

        skill4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        skill4.setForeground(new java.awt.Color(204, 204, 204));
        skill4.setText("CSS");
        skill4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                skill4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(skill4, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(skill3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(skill2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(skill1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(skill1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(skill2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(skill3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(skill4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 210, 240));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null, null, null, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N

        syear.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        syear.setForeground(new java.awt.Color(255, 102, 102));
        syear.setText("2018-19");
        syear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                syearMouseClicked(evt);
            }
        });
        syear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syearActionPerformed(evt);
            }
        });

        education1.setColumns(20);
        education1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        education1.setLineWrap(true);
        education1.setRows(5);
        education1.setText("St. Mary's Higher Secondary School | Mhow, Madhya Pradesh Higher Secondary (10+2)\nResult - 90.6% ");
        education1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(education1);

        dyear.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dyear.setForeground(new java.awt.Color(255, 102, 102));
        dyear.setText("2019-22");
        dyear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dyearMouseClicked(evt);
            }
        });

        education2.setColumns(20);
        education2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        education2.setLineWrap(true);
        education2.setRows(5);
        education2.setText("Medicaps University | Indore, Madhya Pradesh\nBachelor of Computer\nApplications\nCGPA - 9.86");
        education2.setWrapStyleWord(true);
        jScrollPane4.setViewportView(education2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 114, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dyear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(syear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(syear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(dyear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 210, 390));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null, null, null, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N

        cer1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cer1.setForeground(new java.awt.Color(204, 204, 204));
        cer1.setText("JAVA PROGRAMMING certificate from GreatLearning");
        cer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cer1MouseClicked(evt);
            }
        });

        cer2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cer2.setForeground(new java.awt.Color(204, 204, 204));
        cer2.setText("PRINCIPLES OF SECURE CODING certificate from Coursera");
        cer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cer2MouseClicked(evt);
            }
        });

        cer3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cer3.setForeground(new java.awt.Color(204, 204, 204));
        cer3.setText("MySQL BASICS certificate from GreatLearning");
        cer3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cer3MouseClicked(evt);
            }
        });

        cer4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cer4.setForeground(new java.awt.Color(204, 204, 204));
        cer4.setText("INTRODUCTION TO HTML certificate from Coursera");
        cer4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cer4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cer3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cer2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cer1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addComponent(cer4))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(cer1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cer2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cer3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cer4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 560, 230));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null, null, null, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N

        profiletarea.setColumns(20);
        profiletarea.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        profiletarea.setForeground(new java.awt.Color(204, 204, 204));
        profiletarea.setLineWrap(true);
        profiletarea.setRows(1);
        profiletarea.setTabSize(5);
        profiletarea.setText("Enter Description");
        profiletarea.setWrapStyleWord(true);
        profiletarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profiletareaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(profiletarea);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 560, 140));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null, null, null, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/illustrations/call.png"))); // NOI18N

        contact.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contact.setForeground(new java.awt.Color(204, 204, 204));
        contact.setText("Enter Number");
        contact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactMouseClicked(evt);
            }
        });
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel3.setText(" Git");
        jLabel3.setToolTipText("");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/illustrations/mail.png"))); // NOI18N

        mail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mail.setForeground(new java.awt.Color(204, 204, 204));
        mail.setText("Enter E-Mail");
        mail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mailMouseClicked(evt);
            }
        });

        git.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        git.setForeground(new java.awt.Color(204, 204, 204));
        git.setText("Enter url");
        git.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(contact, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(git)
                            .addComponent(mail))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contact, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mail)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(git)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 210, 230));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton2.setText("Choose Color");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(526, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null, null, null, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N

        pro1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pro1.setForeground(new java.awt.Color(204, 204, 204));
        pro1.setText("Java Intern - CodeClause (1 month)");
        pro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pro1MouseClicked(evt);
            }
        });

        pro2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pro2.setForeground(new java.awt.Color(204, 204, 204));
        pro2.setText("Java Intern - LetsGrowMore (1 month)");
        pro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pro2MouseClicked(evt);
            }
        });

        pro3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pro3.setForeground(new java.awt.Color(204, 204, 204));
        pro3.setText("Full Stack Web Intern - Bharat Intern (1 month)");
        pro3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pro3MouseClicked(evt);
            }
        });

        pro4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pro4.setForeground(new java.awt.Color(204, 204, 204));
        pro4.setText("Java Intern - TechnoHacks (1 month)");
        pro4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pro4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pro1)
                    .addComponent(pro2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(pro3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pro4))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pro1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(pro2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pro3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pro4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 340, 240));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 810, 800));

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setText("Resume Builder");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String text = profiletarea.getText();
        text = "<html>" + text.replaceAll("\n", "<br>") + "</html>";
        String n = jTextField1.getText();
        String year1 = syear.getText();
        String year2 = dyear.getText();
        String contact1 = contact.getText();
        String mail1 = mail.getText();
        String git1 = git.getText();
        String ed1 = education1.getText();
        String ed2 = education2.getText();
        String c1 = cer1.getText();
        String c2 = cer2.getText();
        String c3 = cer3.getText();
        String c4 = cer4.getText();
        String s1 = skill1.getText();
        String s2 = skill2.getText();
        String s3 = skill3.getText();
        String s4 = skill4.getText();
        String p1 = pro1.getText();
        String p2 = pro2.getText();
        String p3 = pro3.getText();
        String p4 = pro4.getText();

        ed1 = "<html>" + ed1.replaceAll("\n", "<br>") + "</html>";
        ed2 = "<html>" + ed2.replaceAll("\n", "<br>") + "</html>";
        String t1 = "<html><ul><li>" + c1 + "</li><li>" + c2 + "</li><li>" + c3 + "</li><li>" + c4 + "</li></ul></html>";
        String t2 = "<html><ul><li>" + s1 + "</li><li>" + s2 + "</li><li>" + s3 + "</li><li>" + s4 + "</li></ul></html>";
        String t3 = "<html><ul><li>" + p1 + "</li><li>" + p2 + "</li><li>" + p3 + "</li><li>" + p4 + "</li></ul></html>";

        PrintFrame obj = new PrintFrame();
        obj.profile.setText(text);
        obj.name.setText(n);
        obj.schoolinfo.setText(ed1);
        obj.degreeinfo.setText(ed2);
        obj.numb.setText(contact1);
        obj.giturl.setText(git1);
        obj.email.setText(mail1);
        obj.schoolyear.setText(year1);
        obj.degreeyear.setText(year2);
        obj.certificates.setText(t1);
        obj.skill.setText(t2);
        obj.experience.setText(t3);
        obj.ColorPanel.setBackground(jPanel1.getBackground());
        obj.setVisible(true);
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void profiletareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profiletareaMouseClicked
        profiletarea.setText("");
        profiletarea.setForeground(Color.black);
        Font customFont = new Font("Times New Roman", Font.PLAIN, 18);
        profiletarea.setFont(customFont);
// TODO add your handling code here:
    }//GEN-LAST:event_profiletareaMouseClicked

    private void syearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_syearMouseClicked

    private void dyearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dyearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dyearMouseClicked

    private void skill1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skill1MouseClicked
        skill1.setForeground(Color.black);
    }//GEN-LAST:event_skill1MouseClicked

    private void skill2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skill2MouseClicked
        skill2.setForeground(Color.black);
    }//GEN-LAST:event_skill2MouseClicked

    private void skill3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skill3MouseClicked
        skill3.setForeground(Color.black);
    }//GEN-LAST:event_skill3MouseClicked

    private void skill4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skill4MouseClicked
        skill4.setForeground(Color.black);
    }//GEN-LAST:event_skill4MouseClicked

    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked
        contact.setText("");
        contact.setForeground(Color.black);

    }//GEN-LAST:event_contactMouseClicked

    private void mailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailMouseClicked
        mail.setText("");
        mail.setForeground(Color.black);
        // TODO add your handling code here:
    }//GEN-LAST:event_mailMouseClicked

    private void gitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gitMouseClicked
        git.setText("");
        git.setForeground(Color.black);
        // TODO add your handling code here:
    }//GEN-LAST:event_gitMouseClicked

    private void syearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_syearActionPerformed

    private void pro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pro1MouseClicked
        pro1.setForeground(Color.black);
        // TODO add your handling code here:
    }//GEN-LAST:event_pro1MouseClicked

    private void pro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pro2MouseClicked
        pro2.setForeground(Color.black);
        // TODO add your handling code here:
    }//GEN-LAST:event_pro2MouseClicked

    private void pro3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pro3MouseClicked
        pro3.setForeground(Color.black);
        // TODO add your handling code here:
    }//GEN-LAST:event_pro3MouseClicked

    private void pro4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pro4MouseClicked
        pro4.setForeground(Color.black);
        // TODO add your handling code here:
    }//GEN-LAST:event_pro4MouseClicked

    private void cer3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cer3MouseClicked
        cer3.setForeground(Color.black);
        // TODO add your handling code here:
    }//GEN-LAST:event_cer3MouseClicked

    private void cer2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cer2MouseClicked
        cer2.setForeground(Color.black);
        // TODO add your handling code here:
    }//GEN-LAST:event_cer2MouseClicked

    private void cer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cer1MouseClicked
        cer1.setForeground(Color.black);
        // TODO add your handling code here:
    }//GEN-LAST:event_cer1MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1MouseClicked

    private void cer4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cer4MouseClicked
        cer4.setForeground(Color.black);
        // TODO add your handling code here:
    }//GEN-LAST:event_cer4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PrintFrame obj = new PrintFrame();
        Color initialColor = jPanel1.getBackground();

        Color selectedColor = jColorChooser.showDialog(this, "Choose Color", initialColor);

        if (selectedColor != null) {
            jPanel1.setBackground(selectedColor);
            jButton1.setBackground(selectedColor);
            jButton2.setBackground(selectedColor);
            jButton2.setBackground(selectedColor);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cer1;
    private javax.swing.JTextField cer2;
    private javax.swing.JTextField cer3;
    private javax.swing.JTextField cer4;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField dyear;
    private javax.swing.JTextArea education1;
    private javax.swing.JTextArea education2;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JTextField git;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JColorChooser jColorChooser;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField pro1;
    private javax.swing.JTextField pro2;
    private javax.swing.JTextField pro3;
    private javax.swing.JTextField pro4;
    private javax.swing.JTextArea profiletarea;
    private javax.swing.JTextField skill1;
    private javax.swing.JTextField skill2;
    private javax.swing.JTextField skill3;
    private javax.swing.JTextField skill4;
    private javax.swing.JTextField syear;
    // End of variables declaration//GEN-END:variables
}
