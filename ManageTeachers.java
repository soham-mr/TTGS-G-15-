package TimeTable;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManageTeachers extends javax.swing.JFrame {
     DatabaseConnection db = new DatabaseConnection();
     
    public ManageTeachers() {
        initComponents();
        initInput();
    }
    
    public void initInput(){
        assignSubjectName.removeAllItems();
        assignTeacherName.removeAllItems();
        deleteTeacher.removeAllItems();
        ResultSet td = db.executeQuery("SELECT * FROM Teacher");
        assignTeacherName.addItem("SELECT ITEM");
        deleteTeacher.addItem("SELECT ITEM");
        try {
            while(td.next()){
                if(td.getString("TeacherName").equals("NO_ALLOCATION")){
                    
                }
                else{
                    assignTeacherName.addItem(td.getString("TeacherId")+" : "+td.getString("TeacherName"));
                    deleteTeacher.addItem(td.getString("TeacherId")+" : "+td.getString("TeacherName"));
                }
            }
            td.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManageTeachers.class.getName()).log(Level.SEVERE, null, ex);
        }
        assignTeacherName.setSelectedIndex(0);
        deleteTeacher.setSelectedIndex(0);
        
        
        
        ResultSet sd = db.executeQuery("SELECT * FROM Subject");
        assignSubjectName.addItem("SELECT ITEM");
        try {
            while(sd.next()){
                if(sd.getString("SubName").equals("Free")){
                    
                }else{
                   assignSubjectName.addItem(sd.getString("SubId")+" : "+sd.getString("SubName")); 
                }
                
            }
            sd.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManageTeachers.class.getName()).log(Level.SEVERE, null, ex);
        }
        assignSubjectName.setSelectedIndex(0);
         
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        addTeacherName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        assignTeacherName = new javax.swing.JComboBox<>();
        assignSubjectName = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        assignButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        deleteTeacher = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 48));
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText(" Manage Teacher's");

        backButton.setBackground(new java.awt.Color(204, 255, 255));
        backButton.setFont(new java.awt.Font("Dialog", 1, 48)); 
        backButton.setText("<-");
        backButton.setBorder(null);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 5, true));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel6.setText("Add Teacher");

        addTeacherName.setText("Teacher Name");
        addTeacherName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        addTeacherName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addTeacherNameFocusGained(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); 
        jLabel3.setText("Name :");

        addButton.setBackground(new java.awt.Color(102, 102, 255));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Submit");
        addButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(114, 114, 114)
                        .addComponent(addTeacherName))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246)))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTeacherName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 5, true));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel5.setText("Assign Subject");

        assignTeacherName.setBackground(new java.awt.Color(255, 255, 255));
        assignTeacherName.setMaximumRowCount(50);
        assignTeacherName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        assignTeacherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignTeacherNameActionPerformed(evt);
            }
        });

        assignSubjectName.setBackground(new java.awt.Color(255, 255, 255));
        assignSubjectName.setMaximumRowCount(50);
        assignSubjectName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel8.setText("Name   : ");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel9.setText("Subject :");

        assignButton.setBackground(new java.awt.Color(102, 102, 255));
        assignButton.setForeground(new java.awt.Color(255, 255, 255));
        assignButton.setText("Submit");
        assignButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)))
                .addGap(121, 121, 121)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignTeacherName, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignTeacherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 5, true));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel4.setText("Delete Teacher");

        deleteTeacher.setBackground(new java.awt.Color(255, 255, 255));
        deleteTeacher.setMaximumRowCount(50);
        deleteTeacher.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel10.setText("ID :");

        deleteButton.setBackground(new java.awt.Color(102, 102, 255));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Submit");
        deleteButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(311, 311, 311))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backButton))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1243, 850));
        setLocationRelativeTo(null);
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void assignTeacherNameActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void addTeacherNameFocusGained(java.awt.event.FocusEvent evt) {
        addTeacherName.setText("");
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
            java.util.logging.Logger.getLogger(ManageTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageTeachers().setVisible(true);
            }
        });
    }

    public javax.swing.JButton addButton;
    public javax.swing.JTextField addTeacherName;
    public javax.swing.JButton assignButton;
    public javax.swing.JComboBox<String> assignSubjectName;
    public javax.swing.JComboBox<String> assignTeacherName;
    public javax.swing.JButton backButton;
    public javax.swing.JButton deleteButton;
    public javax.swing.JComboBox<String> deleteTeacher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
}