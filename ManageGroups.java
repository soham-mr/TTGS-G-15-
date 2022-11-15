package TimeTable;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.swing.*;

public class ManageGroups extends javax.swing.JFrame {
    DatabaseConnection db = new DatabaseConnection();
    public ArrayList<JPanel> jp = new ArrayList<>();
    public ArrayList<JComboBox<String>> sub = new ArrayList<>();
    public ArrayList<JComboBox<String>> hr = new ArrayList<>();
    public ArrayList<JButton> add = new ArrayList<>();
    public ArrayList<String> subList = new ArrayList<>();

    public ManageGroups() {
        initComponents();
        
        jp.add(pan1);
        jp.add(pan2);
        jp.add(pan3);
        jp.add(pan4);
        jp.add(pan5);
        jp.add(pan6);
        jp.add(pan7);
        jp.add(pan8);
        jp.add(pan9);
        jp.add(pan10);
        sub.add(sub1);
        sub.add(sub2);
        sub.add(sub3);
        sub.add(sub4);
        sub.add(sub5);
        sub.add(sub6);
        sub.add(sub7);
        sub.add(sub8);
        sub.add(sub9);
        sub.add(sub10);
        hr.add(hr1);
        hr.add(hr2);
        hr.add(hr3);
        hr.add(hr4);
        hr.add(hr5);
        hr.add(hr6);
        hr.add(hr7);
        hr.add(hr8);
        hr.add(hr9);
        hr.add(hr10);
        add.add(add1);
        add.add(add2);
        add.add(add3);
        add.add(add4);
        add.add(add5);
        add.add(add6);
        add.add(add7);
        add.add(add8);
        add.add(add9);
        add.add(add10);
        
       initInput();       
        initSH();     
    }
    
    public void initInput(){
        noOfSubjects.removeAllItems();
        deleteGroupName.removeAllItems();
        ashGroup.removeAllItems();   
        noOfSubjects.addItem("Select no of subjects");
        for(int i = 1; i<=10 ; i++){
            noOfSubjects.addItem(Integer.toString(i));
        }
        noOfSubjects.setSelectedIndex(0);
        ResultSet sg = db.executeQuery("SELECT * FROM StudentGroup");
        deleteGroupName.addItem("Select Group Name");
        ashGroup.addItem("Select Group Name");
        try {
            while(sg.next()){
                deleteGroupName.addItem(sg.getString("GrpName"));
                ashGroup.addItem(sg.getString("GrpName"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageGroups.class.getName()).log(Level.SEVERE, null, ex);
        }
        deleteGroupName.setSelectedIndex(0);
        ashGroup.setSelectedIndex(0);
    }
    
    public void initSH(){
        for(int i=0; i<hr.size();i++){
                hr.get(i).removeAllItems();
        }
        
        for(int i = 0; i<hr.size();i++){
            hr.get(i).addItem("Hours");
            for(int j = 1 ;j<= 4;j++){
                hr.get(i).addItem(Integer.toString(j));
            }
            hr.get(i).setSelectedIndex(0);
        }
        
        for(int i = 0; i<add.size();i++){
            add.get(i).setOpaque(true);
            add.get(i).setVisible(true);
        }
        
        for(int i = 0; i<jp.size();i++){
            jp.get(i).setVisible(false);
        }
        
        for(int i=0; i<sub.size();i++){
                sub.get(i).removeAllItems();
        }
        for(int i=0; i<sub.size();i++){
                sub.get(i).addItem("Select Subject");
        }
        ResultSet rs = db.executeQuery("SELECT * FROM Subject");
        try {
            while(rs.next()){
                if(!rs.getString("SubName").equals("Free")){
                    for(int i=0; i<sub.size();i++){
                        sub.get(i).addItem(rs.getString("SubName"));
                    }
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageGroups.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0; i<sub.size();i++){
                sub.get(i).setSelectedIndex(0);
        }    
    }
    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        addGroupName = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        noOfSubjects = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        deleteGroup = new javax.swing.JButton();
        deleteGroupName = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pan1 = new javax.swing.JPanel();
        sub1 = new javax.swing.JComboBox<>();
        hr1 = new javax.swing.JComboBox<>();
        add1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pan2 = new javax.swing.JPanel();
        sub2 = new javax.swing.JComboBox<>();
        hr2 = new javax.swing.JComboBox<>();
        add2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pan3 = new javax.swing.JPanel();
        sub3 = new javax.swing.JComboBox<>();
        hr3 = new javax.swing.JComboBox<>();
        add3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pan4 = new javax.swing.JPanel();
        sub4 = new javax.swing.JComboBox<>();
        hr4 = new javax.swing.JComboBox<>();
        add4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        pan5 = new javax.swing.JPanel();
        sub5 = new javax.swing.JComboBox<>();
        hr5 = new javax.swing.JComboBox<>();
        add5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        pan6 = new javax.swing.JPanel();
        sub6 = new javax.swing.JComboBox<>();
        hr6 = new javax.swing.JComboBox<>();
        add6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        pan7 = new javax.swing.JPanel();
        sub7 = new javax.swing.JComboBox<>();
        hr7 = new javax.swing.JComboBox<>();
        add7 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        pan8 = new javax.swing.JPanel();
        sub8 = new javax.swing.JComboBox<>();
        hr8 = new javax.swing.JComboBox<>();
        add8 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        pan9 = new javax.swing.JPanel();
        sub9 = new javax.swing.JComboBox<>();
        hr9 = new javax.swing.JComboBox<>();
        add9 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        pan10 = new javax.swing.JPanel();
        sub10 = new javax.swing.JComboBox<>();
        hr10 = new javax.swing.JComboBox<>();
        add10 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        ashGroup = new javax.swing.JComboBox<>();
        show = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 48));
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Group Manager");

        backButton.setBackground(new java.awt.Color(204, 255, 255));
        backButton.setFont(new java.awt.Font("Dialog", 1, 48));
        backButton.setText("<-");
        backButton.setBorder(null);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 5, true));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); 
        jLabel6.setText("Add Group     :");

        addGroupName.setText("Group Name");
        addGroupName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        addGroupName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addGroupNameFocusGained(evt);
            }
        });
        addGroupName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupNameActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(102, 102, 255));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));

        noOfSubjects.setBackground(new java.awt.Color(255, 255, 255));
        noOfSubjects.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        noOfSubjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfSubjectsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(addGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(noOfSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(noOfSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 5, true));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel7.setText("Delete Group :");

        deleteGroup.setBackground(new java.awt.Color(102, 102, 255));
        deleteGroup.setForeground(new java.awt.Color(255, 255, 255));
        deleteGroup.setText("Delete");
        deleteGroup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        deleteGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteGroupActionPerformed(evt);
            }
        });

        deleteGroupName.setBackground(new java.awt.Color(255, 255, 255));
        deleteGroupName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        deleteGroupName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteGroupNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(deleteGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 5, true));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel8.setText("Assign Subject & Hours:");

        sub1.setBackground(new java.awt.Color(255, 255, 255));
        sub1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub1ActionPerformed(evt);
            }
        });

        hr1.setBackground(new java.awt.Color(255, 255, 255));
        hr1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        hr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hr1ActionPerformed(evt);
            }
        });

        add1.setBackground(new java.awt.Color(102, 102, 255));
        add1.setForeground(new java.awt.Color(255, 255, 255));
        add1.setText("Add");
        add1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        jLabel3.setText("1.");

        sub2.setBackground(new java.awt.Color(255, 255, 255));
        sub2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        sub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub2ActionPerformed(evt);
            }
        });

        hr2.setBackground(new java.awt.Color(255, 255, 255));
        hr2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        hr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hr2ActionPerformed(evt);
            }
        });

        add2.setBackground(new java.awt.Color(102, 102, 255));
        add2.setForeground(new java.awt.Color(255, 255, 255));
        add2.setText("Add");
        add2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });

        jLabel4.setText("2.");

        sub3.setBackground(new java.awt.Color(255, 255, 255));
        sub3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        sub3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub3ActionPerformed(evt);
            }
        });

        hr3.setBackground(new java.awt.Color(255, 255, 255));
        hr3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        hr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hr3ActionPerformed(evt);
            }
        });

        add3.setBackground(new java.awt.Color(102, 102, 255));
        add3.setForeground(new java.awt.Color(255, 255, 255));
        add3.setText("Add");
        add3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });

        jLabel5.setText("3.");

        sub4.setBackground(new java.awt.Color(255, 255, 255));
        sub4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        sub4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub4ActionPerformed(evt);
            }
        });

        hr4.setBackground(new java.awt.Color(255, 255, 255));
        hr4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        hr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hr4ActionPerformed(evt);
            }
        });

        add4.setBackground(new java.awt.Color(102, 102, 255));
        add4.setForeground(new java.awt.Color(255, 255, 255));
        add4.setText("Add");
        add4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        add4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add4ActionPerformed(evt);
            }
        });

        jLabel9.setText("4.");

        sub5.setBackground(new java.awt.Color(255, 255, 255));
        sub5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        sub5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub5ActionPerformed(evt);
            }
        });

        hr5.setBackground(new java.awt.Color(255, 255, 255));
        hr5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        hr5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hr5ActionPerformed(evt);
            }
        });

        add5.setBackground(new java.awt.Color(102, 102, 255));
        add5.setForeground(new java.awt.Color(255, 255, 255));
        add5.setText("Add");
        add5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        add5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add5ActionPerformed(evt);
            }
        });

        jLabel10.setText("5.");

        sub6.setBackground(new java.awt.Color(255, 255, 255));
        sub6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        sub6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub6ActionPerformed(evt);
            }
        });

        hr6.setBackground(new java.awt.Color(255, 255, 255));
        hr6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        hr6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hr6ActionPerformed(evt);
            }
        });

        add6.setBackground(new java.awt.Color(102, 102, 255));
        add6.setForeground(new java.awt.Color(255, 255, 255));
        add6.setText("Add");
        add6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        add6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add6ActionPerformed(evt);
            }
        });

        jLabel11.setText("6.");

        sub7.setBackground(new java.awt.Color(255, 255, 255));
        sub7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        sub7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub7ActionPerformed(evt);
            }
        });

        hr7.setBackground(new java.awt.Color(255, 255, 255));
        hr7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        hr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hr7ActionPerformed(evt);
            }
        });

        add7.setBackground(new java.awt.Color(102, 102, 255));
        add7.setForeground(new java.awt.Color(255, 255, 255));
        add7.setText("Add");
        add7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        add7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add7ActionPerformed(evt);
            }
        });

        jLabel12.setText("7.");

        sub8.setBackground(new java.awt.Color(255, 255, 255));
        sub8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        sub8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub8ActionPerformed(evt);
            }
        });

        hr8.setBackground(new java.awt.Color(255, 255, 255));
        hr8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        hr8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hr8ActionPerformed(evt);
            }
        });

        add8.setBackground(new java.awt.Color(102, 102, 255));
        add8.setForeground(new java.awt.Color(255, 255, 255));
        add8.setText("Add");
        add8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        add8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add8ActionPerformed(evt);
            }
        });

        jLabel13.setText("8.");

        sub9.setBackground(new java.awt.Color(255, 255, 255));
        sub9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        sub9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub9ActionPerformed(evt);
            }
        });

        hr9.setBackground(new java.awt.Color(255, 255, 255));
        hr9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        hr9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hr9ActionPerformed(evt);
            }
        });

        add9.setBackground(new java.awt.Color(102, 102, 255));
        add9.setForeground(new java.awt.Color(255, 255, 255));
        add9.setText("Add");
        add9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        add9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add9ActionPerformed(evt);
            }
        });

        jLabel14.setText("9.");

        javax.swing.GroupLayout pan9Layout = new javax.swing.GroupLayout(pan9);
        pan9.setLayout(pan9Layout);
        pan9Layout.setHorizontalGroup(
            pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan9Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel14)
                .addGap(48, 48, 48)
                .addComponent(sub9, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hr9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pan9Layout.setVerticalGroup(
            pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(sub9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(hr9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(add9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel14))
        );

        javax.swing.GroupLayout pan8Layout = new javax.swing.GroupLayout(pan8);
        pan8.setLayout(pan8Layout);
        pan8Layout.setHorizontalGroup(
            pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan8Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel13)
                .addGap(48, 48, 48)
                .addComponent(sub8, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hr8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pan9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pan8Layout.setVerticalGroup(
            pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan8Layout.createSequentialGroup()
                .addGroup(pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hr8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pan7Layout = new javax.swing.GroupLayout(pan7);
        pan7.setLayout(pan7Layout);
        pan7Layout.setHorizontalGroup(
            pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan7Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel12)
                .addGap(48, 48, 48)
                .addComponent(sub7, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hr7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pan8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pan7Layout.setVerticalGroup(
            pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan7Layout.createSequentialGroup()
                .addGroup(pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hr7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pan6Layout = new javax.swing.GroupLayout(pan6);
        pan6.setLayout(pan6Layout);
        pan6Layout.setHorizontalGroup(
            pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan6Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel11)
                .addGap(48, 48, 48)
                .addComponent(sub6, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hr6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pan7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pan6Layout.setVerticalGroup(
            pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan6Layout.createSequentialGroup()
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hr6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pan5Layout = new javax.swing.GroupLayout(pan5);
        pan5.setLayout(pan5Layout);
        pan5Layout.setHorizontalGroup(
            pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan5Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel10)
                .addGap(48, 48, 48)
                .addComponent(sub5, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hr5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pan6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pan5Layout.setVerticalGroup(
            pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan5Layout.createSequentialGroup()
                .addGroup(pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hr5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pan4Layout = new javax.swing.GroupLayout(pan4);
        pan4.setLayout(pan4Layout);
        pan4Layout.setHorizontalGroup(
            pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan4Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel9)
                .addGap(48, 48, 48)
                .addComponent(sub4, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hr4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pan5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pan4Layout.setVerticalGroup(
            pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan4Layout.createSequentialGroup()
                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hr4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pan3Layout = new javax.swing.GroupLayout(pan3);
        pan3.setLayout(pan3Layout);
        pan3Layout.setHorizontalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel5)
                .addGap(48, 48, 48)
                .addComponent(sub3, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hr3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pan4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pan3Layout.setVerticalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan3Layout.createSequentialGroup()
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hr3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pan2Layout = new javax.swing.GroupLayout(pan2);
        pan2.setLayout(pan2Layout);
        pan2Layout.setHorizontalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addComponent(sub2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hr2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pan3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pan2Layout.setVerticalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan2Layout.createSequentialGroup()
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hr2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pan1Layout = new javax.swing.GroupLayout(pan1);
        pan1.setLayout(pan1Layout);
        pan1Layout.setHorizontalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel3)
                .addGap(48, 48, 48)
                .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hr1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pan1Layout.setVerticalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan1Layout.createSequentialGroup()
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hr1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sub10.setBackground(new java.awt.Color(255, 255, 255));
        sub10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        sub10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub10ActionPerformed(evt);
            }
        });

        hr10.setBackground(new java.awt.Color(255, 255, 255));
        hr10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        hr10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hr10ActionPerformed(evt);
            }
        });

        add10.setBackground(new java.awt.Color(102, 102, 255));
        add10.setForeground(new java.awt.Color(255, 255, 255));
        add10.setText("Add");
        add10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        add10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add10ActionPerformed(evt);
            }
        });

        jLabel15.setText("10.");

        javax.swing.GroupLayout pan10Layout = new javax.swing.GroupLayout(pan10);
        pan10.setLayout(pan10Layout);
        pan10Layout.setHorizontalGroup(
            pan10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan10Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel15)
                .addGap(41, 41, 41)
                .addComponent(sub10, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hr10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pan10Layout.setVerticalGroup(
            pan10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan10Layout.createSequentialGroup()
                .addGroup(pan10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hr10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(37, 37, 37))
        );

        ashGroup.setBackground(new java.awt.Color(255, 255, 255));
        ashGroup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        ashGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ashGroupActionPerformed(evt);
            }
        });

        show.setBackground(new java.awt.Color(102, 102, 255));
        show.setForeground(new java.awt.Color(255, 255, 255));
        show.setText("Show");
        show.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pan10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ashGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ashGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(pan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(0, 736, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backButton))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1200, 822));
        setLocationRelativeTo(null);
    }

    private void addGroupNameFocusGained(java.awt.event.FocusEvent evt) {
        addGroupName.setText("");
    }
    private void addGroupNameActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void noOfSubjectsActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void deleteGroupActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void deleteGroupNameActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void sub1ActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void hr1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void sub2ActionPerformed(java.awt.event.ActionEvent evt) {
    }
    
    private void hr2ActionPerformed(java.awt.event.ActionEvent evt) {
    }
    
    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void sub3ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void hr3ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void sub4ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void hr4ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void add4ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void sub5ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void hr5ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void add5ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void sub6ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void hr6ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void add6ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void sub7ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void hr7ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void add7ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void sub8ActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void hr8ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void add8ActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void sub9ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void hr9ActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void add9ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void sub10ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void hr10ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void add10ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void ashGroupActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void showActionPerformed(java.awt.event.ActionEvent evt) {
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageGroups().setVisible(true);
            }
        });
    }
    
    public javax.swing.JButton add1;
    public javax.swing.JButton add10;
    public javax.swing.JButton add2;
    public javax.swing.JButton add3;
    public javax.swing.JButton add4;
    public javax.swing.JButton add5;
    public javax.swing.JButton add6;
    public javax.swing.JButton add7;
    public javax.swing.JButton add8;
    public javax.swing.JButton add9;
    public javax.swing.JButton addButton;
    public javax.swing.JTextField addGroupName;
    public javax.swing.JComboBox<String> ashGroup;
    public javax.swing.JButton backButton;
    public javax.swing.JButton deleteGroup;
    public javax.swing.JComboBox<String> deleteGroupName;
    public javax.swing.JComboBox<String> hr1;
    public javax.swing.JComboBox<String> hr10;
    public javax.swing.JComboBox<String> hr2;
    public javax.swing.JComboBox<String> hr3;
    public javax.swing.JComboBox<String> hr4;
    public javax.swing.JComboBox<String> hr5;
    public javax.swing.JComboBox<String> hr6;
    public javax.swing.JComboBox<String> hr7;
    public javax.swing.JComboBox<String> hr8;
    public javax.swing.JComboBox<String> hr9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JComboBox<String> noOfSubjects;
    public javax.swing.JPanel pan1;
    public javax.swing.JPanel pan10;
    public javax.swing.JPanel pan2;
    public javax.swing.JPanel pan3;
    public javax.swing.JPanel pan4;
    public javax.swing.JPanel pan5;
    public javax.swing.JPanel pan6;
    public javax.swing.JPanel pan7;
    public javax.swing.JPanel pan8;
    public javax.swing.JPanel pan9;
    public javax.swing.JButton show;
    public javax.swing.JComboBox<String> sub1;
    public javax.swing.JComboBox<String> sub10;
    public javax.swing.JComboBox<String> sub2;
    public javax.swing.JComboBox<String> sub3;
    public javax.swing.JComboBox<String> sub4;
    public javax.swing.JComboBox<String> sub5;
    public javax.swing.JComboBox<String> sub6;
    public javax.swing.JComboBox<String> sub7;
    public javax.swing.JComboBox<String> sub8;
    public javax.swing.JComboBox<String> sub9;
}